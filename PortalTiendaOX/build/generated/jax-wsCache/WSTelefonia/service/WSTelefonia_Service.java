
package service;

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
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "WSTelefonia", targetNamespace = "http://service/", wsdlLocation = "http://127.0.0.1:8090/WSTelefonia/WSTelefonia?wsdl")
public class WSTelefonia_Service
    extends Service
{

    private final static URL WSTELEFONIA_WSDL_LOCATION;
    private final static WebServiceException WSTELEFONIA_EXCEPTION;
    private final static QName WSTELEFONIA_QNAME = new QName("http://service/", "WSTelefonia");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://127.0.0.1:8090/WSTelefonia/WSTelefonia?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        WSTELEFONIA_WSDL_LOCATION = url;
        WSTELEFONIA_EXCEPTION = e;
    }

    public WSTelefonia_Service() {
        super(__getWsdlLocation(), WSTELEFONIA_QNAME);
    }

    public WSTelefonia_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), WSTELEFONIA_QNAME, features);
    }

    public WSTelefonia_Service(URL wsdlLocation) {
        super(wsdlLocation, WSTELEFONIA_QNAME);
    }

    public WSTelefonia_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, WSTELEFONIA_QNAME, features);
    }

    public WSTelefonia_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public WSTelefonia_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns WSTelefonia
     */
    @WebEndpoint(name = "WSTelefoniaPort")
    public WSTelefonia getWSTelefoniaPort() {
        return super.getPort(new QName("http://service/", "WSTelefoniaPort"), WSTelefonia.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns WSTelefonia
     */
    @WebEndpoint(name = "WSTelefoniaPort")
    public WSTelefonia getWSTelefoniaPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://service/", "WSTelefoniaPort"), WSTelefonia.class, features);
    }

    private static URL __getWsdlLocation() {
        if (WSTELEFONIA_EXCEPTION!= null) {
            throw WSTELEFONIA_EXCEPTION;
        }
        return WSTELEFONIA_WSDL_LOCATION;
    }

}
