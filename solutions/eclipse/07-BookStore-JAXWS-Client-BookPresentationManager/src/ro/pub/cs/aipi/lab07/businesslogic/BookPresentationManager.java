
package ro.pub.cs.aipi.lab07.businesslogic;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "BookPresentationManager", targetNamespace = "http://businesslogic.lab07.aipi.cs.pub.ro/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface BookPresentationManager {


    /**
     * 
     * @param stockpile
     * @return
     *     returns java.util.List<ro.pub.cs.aipi.lab07.businesslogic.SupplyOrderInformation>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "makeSupplyOrderBasedOnStockpile", targetNamespace = "http://businesslogic.lab07.aipi.cs.pub.ro/", className = "ro.pub.cs.aipi.lab07.businesslogic.MakeSupplyOrderBasedOnStockpile")
    @ResponseWrapper(localName = "makeSupplyOrderBasedOnStockpileResponse", targetNamespace = "http://businesslogic.lab07.aipi.cs.pub.ro/", className = "ro.pub.cs.aipi.lab07.businesslogic.MakeSupplyOrderBasedOnStockpileResponse")
    @Action(input = "http://businesslogic.lab07.aipi.cs.pub.ro/BookPresentationManager/makeSupplyOrderBasedOnStockpileRequest", output = "http://businesslogic.lab07.aipi.cs.pub.ro/BookPresentationManager/makeSupplyOrderBasedOnStockpileResponse")
    public List<SupplyOrderInformation> makeSupplyOrderBasedOnStockpile(
        @WebParam(name = "stockpile", targetNamespace = "")
        int stockpile);

    /**
     * 
     * @param numberOfFormats
     * @param amount
     * @return
     *     returns java.util.List<ro.pub.cs.aipi.lab07.businesslogic.BookPresentationInformation>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "updateBookPresentationPriceForBooksWithMultipleFormats", targetNamespace = "http://businesslogic.lab07.aipi.cs.pub.ro/", className = "ro.pub.cs.aipi.lab07.businesslogic.UpdateBookPresentationPriceForBooksWithMultipleFormats")
    @ResponseWrapper(localName = "updateBookPresentationPriceForBooksWithMultipleFormatsResponse", targetNamespace = "http://businesslogic.lab07.aipi.cs.pub.ro/", className = "ro.pub.cs.aipi.lab07.businesslogic.UpdateBookPresentationPriceForBooksWithMultipleFormatsResponse")
    @Action(input = "http://businesslogic.lab07.aipi.cs.pub.ro/BookPresentationManager/updateBookPresentationPriceForBooksWithMultipleFormatsRequest", output = "http://businesslogic.lab07.aipi.cs.pub.ro/BookPresentationManager/updateBookPresentationPriceForBooksWithMultipleFormatsResponse")
    public List<BookPresentationInformation> updateBookPresentationPriceForBooksWithMultipleFormats(
        @WebParam(name = "numberOfFormats", targetNamespace = "")
        int numberOfFormats,
        @WebParam(name = "amount", targetNamespace = "")
        double amount);

}
