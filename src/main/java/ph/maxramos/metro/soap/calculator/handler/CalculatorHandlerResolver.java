package ph.maxramos.metro.soap.calculator.handler;

import java.util.ArrayList;
import java.util.List;

import javax.xml.ws.handler.Handler;
import javax.xml.ws.handler.HandlerResolver;
import javax.xml.ws.handler.PortInfo;

public class CalculatorHandlerResolver implements HandlerResolver {

	@Override
	@SuppressWarnings("rawtypes")
	public List<Handler> getHandlerChain(PortInfo portInfo) {
		List<Handler> handlers = new ArrayList<>();
		handlers.add(new CalculatorHandler());
		return handlers;
	}

}
