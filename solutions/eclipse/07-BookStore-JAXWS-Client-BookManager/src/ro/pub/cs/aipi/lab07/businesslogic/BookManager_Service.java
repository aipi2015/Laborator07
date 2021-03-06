
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
@WebServiceClient(name = "BookManager", targetNamespace = "http://businesslogic.lab07.aipi.cs.pub.ro/", wsdlLocation = "http://localhost:8080/bookstore/BookManager?wsdl")
public class BookManager_Service
    extends Service
{

    private final static URL BOOKMANAGER_WSDL_LOCATION;
    private final static WebServiceException BOOKMANAGER_EXCEPTION;
    private final static QName BOOKMANAGER_QNAME = new QName("http://businesslogic.lab07.aipi.cs.pub.ro/", "BookManager");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/bookstore/BookManager?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        BOOKMANAGER_WSDL_LOCATION = url;
        BOOKMANAGER_EXCEPTION = e;
    }

    public BookManager_Service() {
        super(__getWsdlLocation(), BOOKMANAGER_QNAME);
    }

    public BookManager_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), BOOKMANAGER_QNAME, features);
    }

    public BookManager_Service(URL wsdlLocation) {
        super(wsdlLocation, BOOKMANAGER_QNAME);
    }

    public BookManager_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, BOOKMANAGER_QNAME, features);
    }

    public BookManager_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public BookManager_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns BookManager
     */
    @WebEndpoint(name = "BookManagerPort")
    public BookManager getBookManagerPort() {
        return super.getPort(new QName("http://businesslogic.lab07.aipi.cs.pub.ro/", "BookManagerPort"), BookManager.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns BookManager
     */
    @WebEndpoint(name = "BookManagerPort")
    public BookManager getBookManagerPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://businesslogic.lab07.aipi.cs.pub.ro/", "BookManagerPort"), BookManager.class, features);
    }

    private static URL __getWsdlLocation() {
        if (BOOKMANAGER_EXCEPTION!= null) {
            throw BOOKMANAGER_EXCEPTION;
        }
        return BOOKMANAGER_WSDL_LOCATION;
    }

}
