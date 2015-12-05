
package ro.pub.cs.aipi.lab07.businesslogic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for updateBookPresentationPriceForBooksWithMultipleFormats complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="updateBookPresentationPriceForBooksWithMultipleFormats">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="numberOfFormats" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="amount" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "updateBookPresentationPriceForBooksWithMultipleFormats", propOrder = {
    "numberOfFormats",
    "amount"
})
public class UpdateBookPresentationPriceForBooksWithMultipleFormats {

    protected int numberOfFormats;
    protected double amount;

    /**
     * Gets the value of the numberOfFormats property.
     * 
     */
    public int getNumberOfFormats() {
        return numberOfFormats;
    }

    /**
     * Sets the value of the numberOfFormats property.
     * 
     */
    public void setNumberOfFormats(int value) {
        this.numberOfFormats = value;
    }

    /**
     * Gets the value of the amount property.
     * 
     */
    public double getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     */
    public void setAmount(double value) {
        this.amount = value;
    }

}
