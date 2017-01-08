package ph.maxramos.metro.soap.calculator.client;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.Binding;
import javax.xml.ws.BindingProvider;
import javax.xml.ws.handler.Handler;

import ph.maxramos.metro.soap.calculator.Calculator;
import ph.maxramos.metro.soap.calculator.CalculatorService;
import ph.maxramos.metro.soap.calculator.handler.CalculatorHandler;
import ph.maxramos.metro.soap.calculator.handler.CalculatorHandlerResolver;

@WebServlet(urlPatterns = "/calculator", loadOnStartup = 1)
public class CalculatorClient extends HttpServlet {

	private static final long serialVersionUID = 1240896911038041221L;

	private CalculatorService service;

	@Override
	public void init() throws ServletException {
		service = new CalculatorService();
		service.setHandlerResolver(new CalculatorHandlerResolver());
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html;charset=UTF-8");

		try (PrintWriter out = resp.getWriter()) {
			out.println("<h2>Calculator Client</h2><br />");

			int i = Integer.parseInt(req.getParameter("value1"));
			int j = Integer.parseInt(req.getParameter("value2"));

			Calculator calculator = service.getCalculatorPort();
			// addHandlers(calculator);
			int sum = calculator.add(i, j);

			out.println(String.format("Sum: %d + %d = %d", i, j, sum));
			// ((Closeable) calculator).close();
		}
	}

	@SuppressWarnings("unused")
	private void addHandlers(Calculator port) {
		Binding binding = ((BindingProvider) port).getBinding();
		@SuppressWarnings("rawtypes")
		List<Handler> handlers = binding.getHandlerChain();
		handlers.add(new CalculatorHandler());
		binding.setHandlerChain(handlers);
	}

}
