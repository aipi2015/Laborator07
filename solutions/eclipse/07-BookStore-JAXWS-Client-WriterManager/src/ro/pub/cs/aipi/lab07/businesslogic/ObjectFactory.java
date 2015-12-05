
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

    private final static QName _DeleteWritersWithoutBooksResponse_QNAME = new QName("http://businesslogic.lab07.aipi.cs.pub.ro/", "deleteWritersWithoutBooksResponse");
    private final static QName _GetWritersBibliographyResponse_QNAME = new QName("http://businesslogic.lab07.aipi.cs.pub.ro/", "getWritersBibliographyResponse");
    private final static QName _GetWritersBibliography_QNAME = new QName("http://businesslogic.lab07.aipi.cs.pub.ro/", "getWritersBibliography");
    private final static QName _DeleteWritersWithoutBooks_QNAME = new QName("http://businesslogic.lab07.aipi.cs.pub.ro/", "deleteWritersWithoutBooks");
    private final static QName _WriterInformation_QNAME = new QName("http://businesslogic.lab07.aipi.cs.pub.ro/", "writerInformation");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ro.pub.cs.aipi.lab07.businesslogic
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DeleteWritersWithoutBooksResponse }
     * 
     */
    public DeleteWritersWithoutBooksResponse createDeleteWritersWithoutBooksResponse() {
        return new DeleteWritersWithoutBooksResponse();
    }

    /**
     * Create an instance of {@link GetWritersBibliographyResponse }
     * 
     */
    public GetWritersBibliographyResponse createGetWritersBibliographyResponse() {
        return new GetWritersBibliographyResponse();
    }

    /**
     * Create an instance of {@link GetWritersBibliography }
     * 
     */
    public GetWritersBibliography createGetWritersBibliography() {
        return new GetWritersBibliography();
    }

    /**
     * Create an instance of {@link DeleteWritersWithoutBooks }
     * 
     */
    public DeleteWritersWithoutBooks createDeleteWritersWithoutBooks() {
        return new DeleteWritersWithoutBooks();
    }

    /**
     * Create an instance of {@link WriterInformation }
     * 
     */
    public WriterInformation createWriterInformation() {
        return new WriterInformation();
    }

    /**
     * Create an instance of {@link PersistentEntity }
     * 
     */
    public PersistentEntity createPersistentEntity() {
        return new PersistentEntity();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteWritersWithoutBooksResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://businesslogic.lab07.aipi.cs.pub.ro/", name = "deleteWritersWithoutBooksResponse")
    public JAXBElement<DeleteWritersWithoutBooksResponse> createDeleteWritersWithoutBooksResponse(DeleteWritersWithoutBooksResponse value) {
        return new JAXBElement<DeleteWritersWithoutBooksResponse>(_DeleteWritersWithoutBooksResponse_QNAME, DeleteWritersWithoutBooksResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetWritersBibliographyResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://businesslogic.lab07.aipi.cs.pub.ro/", name = "getWritersBibliographyResponse")
    public JAXBElement<GetWritersBibliographyResponse> createGetWritersBibliographyResponse(GetWritersBibliographyResponse value) {
        return new JAXBElement<GetWritersBibliographyResponse>(_GetWritersBibliographyResponse_QNAME, GetWritersBibliographyResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetWritersBibliography }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://businesslogic.lab07.aipi.cs.pub.ro/", name = "getWritersBibliography")
    public JAXBElement<GetWritersBibliography> createGetWritersBibliography(GetWritersBibliography value) {
        return new JAXBElement<GetWritersBibliography>(_GetWritersBibliography_QNAME, GetWritersBibliography.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteWritersWithoutBooks }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://businesslogic.lab07.aipi.cs.pub.ro/", name = "deleteWritersWithoutBooks")
    public JAXBElement<DeleteWritersWithoutBooks> createDeleteWritersWithoutBooks(DeleteWritersWithoutBooks value) {
        return new JAXBElement<DeleteWritersWithoutBooks>(_DeleteWritersWithoutBooks_QNAME, DeleteWritersWithoutBooks.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WriterInformation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://businesslogic.lab07.aipi.cs.pub.ro/", name = "writerInformation")
    public JAXBElement<WriterInformation> createWriterInformation(WriterInformation value) {
        return new JAXBElement<WriterInformation>(_WriterInformation_QNAME, WriterInformation.class, null, value);
    }

}
