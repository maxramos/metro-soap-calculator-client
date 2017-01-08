package ph.maxramos.metro.soap.calculator.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import com.sun.xml.ws.transport.http.client.HttpTransportPipe;

@WebListener
public class StartUpListener implements ServletContextListener {

	@Override
	public void contextInitialized(ServletContextEvent sce) {
		HttpTransportPipe.dump = false;
	}

	@Override
	public void contextDestroyed(ServletContextEvent sce) {
	}

}
