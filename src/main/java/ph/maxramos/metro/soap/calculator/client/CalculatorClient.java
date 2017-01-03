package ph.maxramos.metro.soap.calculator.client;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ph.maxramos.metro.soap.calculator.Calculator;
import ph.maxramos.metro.soap.calculator.CalculatorService;

@WebServlet(urlPatterns = "/calculator", loadOnStartup = 1)
public class CalculatorClient extends HttpServlet {

	private static final long serialVersionUID = 1240896911038041221L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html;charset=UTF-8");

		try (PrintWriter out = resp.getWriter()) {
			out.println("<h2>Calculator Client</h2><br />");

			int i = Integer.parseInt(req.getParameter("value1"));
			int j = Integer.parseInt(req.getParameter("value2"));

			CalculatorService service = new CalculatorService();
			Calculator calculator = service.getCalculatorPort();
			int sum = calculator.add(i, j);

			out.println(String.format("Sum: %d + %d = %d", i, j, sum));
			// ((Closeable) calculator).close();
		}
	}

}
