
package ro.pub.cs.aipi.lab07.businesslogic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BookInformation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BookInformation">
 *   &lt;complexContent>
 *     &lt;extension base="{http://businesslogic.lab07.aipi.cs.pub.ro/}persistentEntity">
 *       &lt;sequence>
 *         &lt;element name="collection" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="country" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="edition" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="printingYear" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="publishingHouse" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="writers" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BookInformation", propOrder = {
    "collection",
    "country",
    "edition",
    "printingYear",
    "publishingHouse",
    "title",
    "writers"
})
public class BookInformation
    extends PersistentEntity
{

    protected String collection;
    protected String country;
    protected Long edition;
    protected Long printingYear;
    protected String publishingHouse;
    protected String title;
    protected String writers;

    /**
     * Gets the value of the collection property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCollection() {
        return collection;
    }

    /**
     * Sets the value of the collection property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCollection(String value) {
        this.collection = value;
    }

    /**
     * Gets the value of the country property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountry() {
        return country;
    }

    /**
     * Sets the value of the country property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountry(String value) {
        this.country = value;
    }

    /**
     * Gets the value of the edition property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getEdition() {
        return edition;
    }

    /**
     * Sets the value of the edition property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setEdition(Long value) {
        this.edition = value;
    }

    /**
     * Gets the value of the printingYear property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPrintingYear() {
        return printingYear;
    }

    /**
     * Sets the value of the printingYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPrintingYear(Long value) {
        this.printingYear = value;
    }

    /**
     * Gets the value of the publishingHouse property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPublishingHouse() {
        return publishingHouse;
    }

    /**
     * Sets the value of the publishingHouse property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPublishingHouse(String value) {
        this.publishingHouse = value;
    }

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * Gets the value of the writers property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWriters() {
        return writers;
    }

    /**
     * Sets the value of the writers property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWriters(String value) {
        this.writers = value;
    }

}
