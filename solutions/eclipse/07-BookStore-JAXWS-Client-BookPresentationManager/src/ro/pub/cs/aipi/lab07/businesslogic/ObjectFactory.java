
package ro.pub.cs.aipi.lab07.businesslogic;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ro.pub.cs.aipi.lab07.businesslogic package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _MakeSupplyOrderBasedOnStockpile_QNAME = new QName("http://businesslogic.lab07.aipi.cs.pub.ro/", "makeSupplyOrderBasedOnStockpile");
    private final static QName _UpdateBookPresentationPriceForBooksWithMultipleFormatsResponse_QNAME = new QName("http://businesslogic.lab07.aipi.cs.pub.ro/", "updateBookPresentationPriceForBooksWithMultipleFormatsResponse");
    private final static QName _MakeSupplyOrderBasedOnStockpileResponse_QNAME = new QName("http://businesslogic.lab07.aipi.cs.pub.ro/", "makeSupplyOrderBasedOnStockpileResponse");
    private final static QName _UpdateBookPresentationPriceForBooksWithMultipleFormats_QNAME = new QName("http://businesslogic.lab07.aipi.cs.pub.ro/", "updateBookPresentationPriceForBooksWithMultipleFormats");
    private final static QName _BookPresentationInformation_QNAME = new QName("http://businesslogic.lab07.aipi.cs.pub.ro/", "bookPresentationInformation");
    private final static QName _SupplyOrderInformation_QNAME = new QName("http://businesslogic.lab07.aipi.cs.pub.ro/", "supplyOrderInformation");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ro.pub.cs.aipi.lab07.businesslogic
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link MakeSupplyOrderBasedOnStockpile }
     * 
     */
    public MakeSupplyOrderBasedOnStockpile createMakeSupplyOrderBasedOnStockpile() {
        return new MakeSupplyOrderBasedOnStockpile();
    }

    /**
     * Create an instance of {@link UpdateBookPresentationPriceForBooksWithMultipleFormatsResponse }
     * 
     */
    public UpdateBookPresentationPriceForBooksWithMultipleFormatsResponse createUpdateBookPresentationPriceForBooksWithMultipleFormatsResponse() {
        return new UpdateBookPresentationPriceForBooksWithMultipleFormatsResponse();
    }

    /**
     * Create an instance of {@link MakeSupplyOrderBasedOnStockpileResponse }
     * 
     */
    public MakeSupplyOrderBasedOnStockpileResponse createMakeSupplyOrderBasedOnStockpileResponse() {
        return new MakeSupplyOrderBasedOnStockpileResponse();
    }

    /**
     * Create an instance of {@link UpdateBookPresentationPriceForBooksWithMultipleFormats }
     * 
     */
    public UpdateBookPresentationPriceForBooksWithMultipleFormats createUpdateBookPresentationPriceForBooksWithMultipleFormats() {
        return new UpdateBookPresentationPriceForBooksWithMultipleFormats();
    }

    /**
     * Create an instance of {@link BookPresentationInformation }
     * 
     */
    public BookPresentationInformation createBookPresentationInformation() {
        return new BookPresentationInformation();
    }

    /**
     * Create an instance of {@link SupplyOrderInformation }
     * 
     */
    public SupplyOrderInformation createSupplyOrderInformation() {
        return new SupplyOrderInformation();
    }

    /**
     * Create an instance of {@link PersistentEntity }
     * 
     */
    public PersistentEntity createPersistentEntity() {
        return new PersistentEntity();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MakeSupplyOrderBasedOnStockpile }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://businesslogic.lab07.aipi.cs.pub.ro/", name = "makeSupplyOrderBasedOnStockpile")
    public JAXBElement<MakeSupplyOrderBasedOnStockpile> createMakeSupplyOrderBasedOnStockpile(MakeSupplyOrderBasedOnStockpile value) {
        return new JAXBElement<MakeSupplyOrderBasedOnStockpile>(_MakeSupplyOrderBasedOnStockpile_QNAME, MakeSupplyOrderBasedOnStockpile.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateBookPresentationPriceForBooksWithMultipleFormatsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://businesslogic.lab07.aipi.cs.pub.ro/", name = "updateBookPresentationPriceForBooksWithMultipleFormatsResponse")
    public JAXBElement<UpdateBookPresentationPriceForBooksWithMultipleFormatsResponse> createUpdateBookPresentationPriceForBooksWithMultipleFormatsResponse(UpdateBookPresentationPriceForBooksWithMultipleFormatsResponse value) {
        return new JAXBElement<UpdateBookPresentationPriceForBooksWithMultipleFormatsResponse>(_UpdateBookPresentationPriceForBooksWithMultipleFormatsResponse_QNAME, UpdateBookPresentationPriceForBooksWithMultipleFormatsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MakeSupplyOrderBasedOnStockpileResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://businesslogic.lab07.aipi.cs.pub.ro/", name = "makeSupplyOrderBasedOnStockpileResponse")
    public JAXBElement<MakeSupplyOrderBasedOnStockpileResponse> createMakeSupplyOrderBasedOnStockpileResponse(MakeSupplyOrderBasedOnStockpileResponse value) {
        return new JAXBElement<MakeSupplyOrderBasedOnStockpileResponse>(_MakeSupplyOrderBasedOnStockpileResponse_QNAME, MakeSupplyOrderBasedOnStockpileResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateBookPresentationPriceForBooksWithMultipleFormats }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://businesslogic.lab07.aipi.cs.pub.ro/", name = "updateBookPresentationPriceForBooksWithMultipleFormats")
    public JAXBElement<UpdateBookPresentationPriceForBooksWithMultipleFormats> createUpdateBookPresentationPriceForBooksWithMultipleFormats(UpdateBookPresentationPriceForBooksWithMultipleFormats value) {
        return new JAXBElement<UpdateBookPresentationPriceForBooksWithMultipleFormats>(_UpdateBookPresentationPriceForBooksWithMultipleFormats_QNAME, UpdateBookPresentationPriceForBooksWithMultipleFormats.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BookPresentationInformation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://businesslogic.lab07.aipi.cs.pub.ro/", name = "bookPresentationInformation")
    public JAXBElement<BookPresentationInformation> createBookPresentationInformation(BookPresentationInformation value) {
        return new JAXBElement<BookPresentationInformation>(_BookPresentationInformation_QNAME, BookPresentationInformation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SupplyOrderInformation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://businesslogic.lab07.aipi.cs.pub.ro/", name = "supplyOrderInformation")
    public JAXBElement<SupplyOrderInformation> createSupplyOrderInformation(SupplyOrderInformation value) {
        return new JAXBElement<SupplyOrderInformation>(_SupplyOrderInformation_QNAME, SupplyOrderInformation.class, null, value);
    }

}
