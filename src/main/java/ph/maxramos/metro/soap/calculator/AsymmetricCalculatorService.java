
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
@WebServiceClient(name = "AsymmetricCalculatorService", targetNamespace = "http://calculator.soap.metro.maxramos.ph/", wsdlLocation = "http://localhost:8080/metro-soap-calculator/AsymmetricCalculator?wsdl")
public class AsymmetricCalculatorService
    extends Service
{

    private final static URL ASYMMETRICCALCULATORSERVICE_WSDL_LOCATION;
    private final static WebServiceException ASYMMETRICCALCULATORSERVICE_EXCEPTION;
    private final static QName ASYMMETRICCALCULATORSERVICE_QNAME = new QName("http://calculator.soap.metro.maxramos.ph/", "AsymmetricCalculatorService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/metro-soap-calculator/AsymmetricCalculator?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        ASYMMETRICCALCULATORSERVICE_WSDL_LOCATION = url;
        ASYMMETRICCALCULATORSERVICE_EXCEPTION = e;
    }

    public AsymmetricCalculatorService() {
        super(__getWsdlLocation(), ASYMMETRICCALCULATORSERVICE_QNAME);
    }

    public AsymmetricCalculatorService(WebServiceFeature... features) {
        super(__getWsdlLocation(), ASYMMETRICCALCULATORSERVICE_QNAME, features);
    }

    public AsymmetricCalculatorService(URL wsdlLocation) {
        super(wsdlLocation, ASYMMETRICCALCULATORSERVICE_QNAME);
    }

    public AsymmetricCalculatorService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, ASYMMETRICCALCULATORSERVICE_QNAME, features);
    }

    public AsymmetricCalculatorService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public AsymmetricCalculatorService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns AsymmetricCalculator
     */
    @WebEndpoint(name = "AsymmetricCalculatorPort")
    public AsymmetricCalculator getAsymmetricCalculatorPort() {
        return super.getPort(new QName("http://calculator.soap.metro.maxramos.ph/", "AsymmetricCalculatorPort"), AsymmetricCalculator.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns AsymmetricCalculator
     */
    @WebEndpoint(name = "AsymmetricCalculatorPort")
    public AsymmetricCalculator getAsymmetricCalculatorPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://calculator.soap.metro.maxramos.ph/", "AsymmetricCalculatorPort"), AsymmetricCalculator.class, features);
    }

    private static URL __getWsdlLocation() {
        if (ASYMMETRICCALCULATORSERVICE_EXCEPTION!= null) {
            throw ASYMMETRICCALCULATORSERVICE_EXCEPTION;
        }
        return ASYMMETRICCALCULATORSERVICE_WSDL_LOCATION;
    }

}
