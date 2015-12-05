
package ro.pub.cs.aipi.lab07.businesslogic;

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
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "BookPresentationManager", targetNamespace = "http://businesslogic.lab07.aipi.cs.pub.ro/", wsdlLocation = "http://localhost:8081/bookstore/BookPresentationManager?wsdl")
public class BookPresentationManager_Service
    extends Service
{

    private final static URL BOOKPRESENTATIONMANAGER_WSDL_LOCATION;
    private final static WebServiceException BOOKPRESENTATIONMANAGER_EXCEPTION;
    private final static QName BOOKPRESENTATIONMANAGER_QNAME = new QName("http://businesslogic.lab07.aipi.cs.pub.ro/", "BookPresentationManager");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8081/bookstore/BookPresentationManager?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        BOOKPRESENTATIONMANAGER_WSDL_LOCATION = url;
        BOOKPRESENTATIONMANAGER_EXCEPTION = e;
    }

    public BookPresentationManager_Service() {
        super(__getWsdlLocation(), BOOKPRESENTATIONMANAGER_QNAME);
    }

    public BookPresentationManager_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), BOOKPRESENTATIONMANAGER_QNAME, features);
    }

    public BookPresentationManager_Service(URL wsdlLocation) {
        super(wsdlLocation, BOOKPRESENTATIONMANAGER_QNAME);
    }

    public BookPresentationManager_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, BOOKPRESENTATIONMANAGER_QNAME, features);
    }

    public BookPresentationManager_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public BookPresentationManager_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns BookPresentationManager
     */
    @WebEndpoint(name = "BookPresentationManagerPort")
    public BookPresentationManager getBookPresentationManagerPort() {
        return super.getPort(new QName("http://businesslogic.lab07.aipi.cs.pub.ro/", "BookPresentationManagerPort"), BookPresentationManager.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns BookPresentationManager
     */
    @WebEndpoint(name = "BookPresentationManagerPort")
    public BookPresentationManager getBookPresentationManagerPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://businesslogic.lab07.aipi.cs.pub.ro/", "BookPresentationManagerPort"), BookPresentationManager.class, features);
    }

    private static URL __getWsdlLocation() {
        if (BOOKPRESENTATIONMANAGER_EXCEPTION!= null) {
            throw BOOKPRESENTATIONMANAGER_EXCEPTION;
        }
        return BOOKPRESENTATIONMANAGER_WSDL_LOCATION;
    }

}
