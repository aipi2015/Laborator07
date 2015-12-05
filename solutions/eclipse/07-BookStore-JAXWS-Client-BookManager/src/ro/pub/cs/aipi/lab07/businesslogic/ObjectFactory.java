
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

    private final static QName _BookInformationDetailed_QNAME = new QName("http://businesslogic.lab07.aipi.cs.pub.ro/", "bookInformationDetailed");
    private final static QName _GetBooksList_QNAME = new QName("http://businesslogic.lab07.aipi.cs.pub.ro/", "getBooksList");
    private final static QName _GetBooksListWithStockpileResponse_QNAME = new QName("http://businesslogic.lab07.aipi.cs.pub.ro/", "getBooksListWithStockpileResponse");
    private final static QName _GetBooksListResponse_QNAME = new QName("http://businesslogic.lab07.aipi.cs.pub.ro/", "getBooksListResponse");
    private final static QName _BookInformation_QNAME = new QName("http://businesslogic.lab07.aipi.cs.pub.ro/", "bookInformation");
    private final static QName _GetBooksListWithStockpile_QNAME = new QName("http://businesslogic.lab07.aipi.cs.pub.ro/", "getBooksListWithStockpile");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ro.pub.cs.aipi.lab07.businesslogic
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link BookInformationDetailed }
     * 
     */
    public BookInformationDetailed createBookInformationDetailed() {
        return new BookInformationDetailed();
    }

    /**
     * Create an instance of {@link GetBooksList }
     * 
     */
    public GetBooksList createGetBooksList() {
        return new GetBooksList();
    }

    /**
     * Create an instance of {@link GetBooksListWithStockpileResponse }
     * 
     */
    public GetBooksListWithStockpileResponse createGetBooksListWithStockpileResponse() {
        return new GetBooksListWithStockpileResponse();
    }

    /**
     * Create an instance of {@link BookInformation }
     * 
     */
    public BookInformation createBookInformation() {
        return new BookInformation();
    }

    /**
     * Create an instance of {@link GetBooksListResponse }
     * 
     */
    public GetBooksListResponse createGetBooksListResponse() {
        return new GetBooksListResponse();
    }

    /**
     * Create an instance of {@link GetBooksListWithStockpile }
     * 
     */
    public GetBooksListWithStockpile createGetBooksListWithStockpile() {
        return new GetBooksListWithStockpile();
    }

    /**
     * Create an instance of {@link PersistentEntity }
     * 
     */
    public PersistentEntity createPersistentEntity() {
        return new PersistentEntity();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BookInformationDetailed }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://businesslogic.lab07.aipi.cs.pub.ro/", name = "bookInformationDetailed")
    public JAXBElement<BookInformationDetailed> createBookInformationDetailed(BookInformationDetailed value) {
        return new JAXBElement<BookInformationDetailed>(_BookInformationDetailed_QNAME, BookInformationDetailed.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBooksList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://businesslogic.lab07.aipi.cs.pub.ro/", name = "getBooksList")
    public JAXBElement<GetBooksList> createGetBooksList(GetBooksList value) {
        return new JAXBElement<GetBooksList>(_GetBooksList_QNAME, GetBooksList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBooksListWithStockpileResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://businesslogic.lab07.aipi.cs.pub.ro/", name = "getBooksListWithStockpileResponse")
    public JAXBElement<GetBooksListWithStockpileResponse> createGetBooksListWithStockpileResponse(GetBooksListWithStockpileResponse value) {
        return new JAXBElement<GetBooksListWithStockpileResponse>(_GetBooksListWithStockpileResponse_QNAME, GetBooksListWithStockpileResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBooksListResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://businesslogic.lab07.aipi.cs.pub.ro/", name = "getBooksListResponse")
    public JAXBElement<GetBooksListResponse> createGetBooksListResponse(GetBooksListResponse value) {
        return new JAXBElement<GetBooksListResponse>(_GetBooksListResponse_QNAME, GetBooksListResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BookInformation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://businesslogic.lab07.aipi.cs.pub.ro/", name = "bookInformation")
    public JAXBElement<BookInformation> createBookInformation(BookInformation value) {
        return new JAXBElement<BookInformation>(_BookInformation_QNAME, BookInformation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBooksListWithStockpile }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://businesslogic.lab07.aipi.cs.pub.ro/", name = "getBooksListWithStockpile")
    public JAXBElement<GetBooksListWithStockpile> createGetBooksListWithStockpile(GetBooksListWithStockpile value) {
        return new JAXBElement<GetBooksListWithStockpile>(_GetBooksListWithStockpile_QNAME, GetBooksListWithStockpile.class, null, value);
    }

}
