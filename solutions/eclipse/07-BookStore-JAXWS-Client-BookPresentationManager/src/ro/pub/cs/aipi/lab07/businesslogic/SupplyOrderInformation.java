
package ro.pub.cs.aipi.lab07.businesslogic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SupplyOrderInformation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SupplyOrderInformation">
 *   &lt;complexContent>
 *     &lt;extension base="{http://businesslogic.lab07.aipi.cs.pub.ro/}persistentEntity">
 *       &lt;sequence>
 *         &lt;element name="bookPresentationId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="publishingHouseId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="quantity" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SupplyOrderInformation", propOrder = {
    "bookPresentationId",
    "publishingHouseId",
    "quantity"
})
public class SupplyOrderInformation
    extends PersistentEntity
{

    protected Long bookPresentationId;
    protected Long publishingHouseId;
    protected Long quantity;

    /**
     * Gets the value of the bookPresentationId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getBookPresentationId() {
        return bookPresentationId;
    }

    /**
     * Sets the value of the bookPresentationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setBookPresentationId(Long value) {
        this.bookPresentationId = value;
    }

    /**
     * Gets the value of the publishingHouseId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPublishingHouseId() {
        return publishingHouseId;
    }

    /**
     * Sets the value of the publishingHouseId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPublishingHouseId(Long value) {
        this.publishingHouseId = value;
    }

    /**
     * Gets the value of the quantity property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getQuantity() {
        return quantity;
    }

    /**
     * Sets the value of the quantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setQuantity(Long value) {
        this.quantity = value;
    }

}
