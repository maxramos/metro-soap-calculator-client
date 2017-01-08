package ph.maxramos.metro.soap.calculator.tube;

import javax.xml.ws.WebServiceException;

import com.sun.xml.ws.api.pipe.Tube;
import com.sun.xml.ws.assembler.dev.ClientTubelineAssemblyContext;
import com.sun.xml.ws.assembler.dev.ServerTubelineAssemblyContext;
import com.sun.xml.ws.assembler.dev.TubeFactory;

public class CalculatorTubeFactory implements TubeFactory {

	@Override
	public Tube createTube(ClientTubelineAssemblyContext context) throws WebServiceException {
		return new CalculatorTube(context.getTubelineHead());
	}

	@Override
	public Tube createTube(ServerTubelineAssemblyContext context) throws WebServiceException {
		return new CalculatorTube(context.getTubelineHead());
	}

}
