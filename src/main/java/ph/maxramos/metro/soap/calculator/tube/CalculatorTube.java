package ph.maxramos.metro.soap.calculator.tube;

import com.sun.xml.ws.api.message.Packet;
import com.sun.xml.ws.api.pipe.NextAction;
import com.sun.xml.ws.api.pipe.Tube;
import com.sun.xml.ws.api.pipe.TubeCloner;
import com.sun.xml.ws.api.pipe.helper.AbstractFilterTubeImpl;
import com.sun.xml.ws.api.pipe.helper.AbstractTubeImpl;
import com.sun.xml.ws.commons.xmlutil.Converter;

public class CalculatorTube extends AbstractFilterTubeImpl {

	protected CalculatorTube(Tube next) {
		super(next);
	}

	@Override
	public NextAction processRequest(Packet request) {
		System.out.println("CLIENT TUBE REQUEST");
		System.out.println(Converter.toString(request));
		return super.processRequest(request);
	}

	@Override
	public NextAction processResponse(Packet response) {
		System.out.println("CLIENT TUBE RESPONSE");
		System.out.println(Converter.toString(response));
		return super.processResponse(response);
	}

	@Override
	public AbstractTubeImpl copy(TubeCloner cloner) {
		return null;
	}

}
