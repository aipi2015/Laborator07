
package ro.pub.cs.aipi.lab07.businesslogic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getWritersBibliography complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getWritersBibliography">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="numberOfBooksTotal" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="numberOfBooksAlone" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="numberOfBooksCollaboration" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getWritersBibliography", propOrder = {
    "numberOfBooksTotal",
    "numberOfBooksAlone",
    "numberOfBooksCollaboration"
})
public class GetWritersBibliography {

    protected int numberOfBooksTotal;
    protected int numberOfBooksAlone;
    protected int numberOfBooksCollaboration;

    /**
     * Gets the value of the numberOfBooksTotal property.
     * 
     */
    public int getNumberOfBooksTotal() {
        return numberOfBooksTotal;
    }

    /**
     * Sets the value of the numberOfBooksTotal property.
     * 
     */
    public void setNumberOfBooksTotal(int value) {
        this.numberOfBooksTotal = value;
    }

    /**
     * Gets the value of the numberOfBooksAlone property.
     * 
     */
    public int getNumberOfBooksAlone() {
        return numberOfBooksAlone;
    }

    /**
     * Sets the value of the numberOfBooksAlone property.
     * 
     */
    public void setNumberOfBooksAlone(int value) {
        this.numberOfBooksAlone = value;
    }

    /**
     * Gets the value of the numberOfBooksCollaboration property.
     * 
     */
    public int getNumberOfBooksCollaboration() {
        return numberOfBooksCollaboration;
    }

    /**
     * Sets the value of the numberOfBooksCollaboration property.
     * 
     */
    public void setNumberOfBooksCollaboration(int value) {
        this.numberOfBooksCollaboration = value;
    }

}
