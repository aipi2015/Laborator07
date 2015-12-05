
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
@WebServiceClient(name = "WriterManager", targetNamespace = "http://businesslogic.lab07.aipi.cs.pub.ro/", wsdlLocation = "http://localhost:8082/bookstore/WriterManager?wsdl")
public class WriterManager_Service
    extends Service
{

    private final static URL WRITERMANAGER_WSDL_LOCATION;
    private final static WebServiceException WRITERMANAGER_EXCEPTION;
    private final static QName WRITERMANAGER_QNAME = new QName("http://businesslogic.lab07.aipi.cs.pub.ro/", "WriterManager");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8082/bookstore/WriterManager?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        WRITERMANAGER_WSDL_LOCATION = url;
        WRITERMANAGER_EXCEPTION = e;
    }

    public WriterManager_Service() {
        super(__getWsdlLocation(), WRITERMANAGER_QNAME);
    }

    public WriterManager_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), WRITERMANAGER_QNAME, features);
    }

    public WriterManager_Service(URL wsdlLocation) {
        super(wsdlLocation, WRITERMANAGER_QNAME);
    }

    public WriterManager_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, WRITERMANAGER_QNAME, features);
    }

    public WriterManager_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public WriterManager_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns WriterManager
     */
    @WebEndpoint(name = "WriterManagerPort")
    public WriterManager getWriterManagerPort() {
        return super.getPort(new QName("http://businesslogic.lab07.aipi.cs.pub.ro/", "WriterManagerPort"), WriterManager.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns WriterManager
     */
    @WebEndpoint(name = "WriterManagerPort")
    public WriterManager getWriterManagerPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://businesslogic.lab07.aipi.cs.pub.ro/", "WriterManagerPort"), WriterManager.class, features);
    }

    private static URL __getWsdlLocation() {
        if (WRITERMANAGER_EXCEPTION!= null) {
            throw WRITERMANAGER_EXCEPTION;
        }
        return WRITERMANAGER_WSDL_LOCATION;
    }

}
