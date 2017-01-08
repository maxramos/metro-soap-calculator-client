package ph.maxramos.metro.soap.calculator.handler;

import java.util.Set;

import javax.xml.namespace.QName;
import javax.xml.ws.handler.MessageContext;
import javax.xml.ws.handler.soap.SOAPHandler;
import javax.xml.ws.handler.soap.SOAPMessageContext;

public class CalculatorHandler implements SOAPHandler<SOAPMessageContext> {

	@Override
	public boolean handleMessage(SOAPMessageContext context) {
		boolean outbound = (boolean) context.get(MessageContext.MESSAGE_OUTBOUND_PROPERTY);

		if (outbound) {
			System.out.println("CLIENT OUTBOUND MESSAGE");
		} else {
			System.out.println("CLIENT INBOUND MESSAGE");
		}

		return true;
	}

	@Override
	public boolean handleFault(SOAPMessageContext context) {
		return true;
	}

	@Override
	public void close(MessageContext context) {
	}

	@Override
	public Set<QName> getHeaders() {
		return null;
	}

}
