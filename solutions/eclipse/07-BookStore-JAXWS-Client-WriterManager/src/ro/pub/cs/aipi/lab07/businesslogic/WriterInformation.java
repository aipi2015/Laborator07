
package ro.pub.cs.aipi.lab07.businesslogic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WriterInformation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WriterInformation">
 *   &lt;complexContent>
 *     &lt;extension base="{http://businesslogic.lab07.aipi.cs.pub.ro/}persistentEntity">
 *       &lt;sequence>
 *         &lt;element name="books" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numberOfBooksAlone" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="numberOfBooksCollaboration" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="numberOfBooksTotal" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="writer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WriterInformation", propOrder = {
    "books",
    "numberOfBooksAlone",
    "numberOfBooksCollaboration",
    "numberOfBooksTotal",
    "writer"
})
public class WriterInformation
    extends PersistentEntity
{

    protected String books;
    protected Long numberOfBooksAlone;
    protected Long numberOfBooksCollaboration;
    protected Long numberOfBooksTotal;
    protected String writer;

    /**
     * Gets the value of the books property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBooks() {
        return books;
    }

    /**
     * Sets the value of the books property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBooks(String value) {
        this.books = value;
    }

    /**
     * Gets the value of the numberOfBooksAlone property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNumberOfBooksAlone() {
        return numberOfBooksAlone;
    }

    /**
     * Sets the value of the numberOfBooksAlone property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNumberOfBooksAlone(Long value) {
        this.numberOfBooksAlone = value;
    }

    /**
     * Gets the value of the numberOfBooksCollaboration property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNumberOfBooksCollaboration() {
        return numberOfBooksCollaboration;
    }

    /**
     * Sets the value of the numberOfBooksCollaboration property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNumberOfBooksCollaboration(Long value) {
        this.numberOfBooksCollaboration = value;
    }

    /**
     * Gets the value of the numberOfBooksTotal property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNumberOfBooksTotal() {
        return numberOfBooksTotal;
    }

    /**
     * Sets the value of the numberOfBooksTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNumberOfBooksTotal(Long value) {
        this.numberOfBooksTotal = value;
    }

    /**
     * Gets the value of the writer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWriter() {
        return writer;
    }

    /**
     * Sets the value of the writer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWriter(String value) {
        this.writer = value;
    }

}
