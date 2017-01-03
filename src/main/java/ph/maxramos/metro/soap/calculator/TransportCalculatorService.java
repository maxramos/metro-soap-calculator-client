
package ph.maxramos.metro.soap.calculator;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.8
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "TransportCalculatorService", targetNamespace = "http://calculator.soap.metro.maxramos.ph/", wsdlLocation = "https://localhost:8443/metro-soap-calculator/TransportCalculator?wsdl")
public class TransportCalculatorService
    extends Service
{

    private final static URL TRANSPORTCALCULATORSERVICE_WSDL_LOCATION;
    private final static WebServiceException TRANSPORTCALCULATORSERVICE_EXCEPTION;
    private final static QName TRANSPORTCALCULATORSERVICE_QNAME = new QName("http://calculator.soap.metro.maxramos.ph/", "TransportCalculatorService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("https://localhost:8443/metro-soap-calculator/TransportCalculator?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        TRANSPORTCALCULATORSERVICE_WSDL_LOCATION = url;
        TRANSPORTCALCULATORSERVICE_EXCEPTION = e;
    }

    public TransportCalculatorService() {
        super(__getWsdlLocation(), TRANSPORTCALCULATORSERVICE_QNAME);
    }

    public TransportCalculatorService(WebServiceFeature... features) {
        super(__getWsdlLocation(), TRANSPORTCALCULATORSERVICE_QNAME, features);
    }

    public TransportCalculatorService(URL wsdlLocation) {
        super(wsdlLocation, TRANSPORTCALCULATORSERVICE_QNAME);
    }

    public TransportCalculatorService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, TRANSPORTCALCULATORSERVICE_QNAME, features);
    }

    public TransportCalculatorService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public TransportCalculatorService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns TransportCalculator
     */
    @WebEndpoint(name = "TransportCalculatorPort")
    public TransportCalculator getTransportCalculatorPort() {
        return super.getPort(new QName("http://calculator.soap.metro.maxramos.ph/", "TransportCalculatorPort"), TransportCalculator.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns TransportCalculator
     */
    @WebEndpoint(name = "TransportCalculatorPort")
    public TransportCalculator getTransportCalculatorPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://calculator.soap.metro.maxramos.ph/", "TransportCalculatorPort"), TransportCalculator.class, features);
    }

    private static URL __getWsdlLocation() {
        if (TRANSPORTCALCULATORSERVICE_EXCEPTION!= null) {
            throw TRANSPORTCALCULATORSERVICE_EXCEPTION;
        }
        return TRANSPORTCALCULATORSERVICE_WSDL_LOCATION;
    }

}