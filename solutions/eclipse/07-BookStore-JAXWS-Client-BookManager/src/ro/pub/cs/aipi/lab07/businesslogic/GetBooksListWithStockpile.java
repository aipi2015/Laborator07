
package ro.pub.cs.aipi.lab07.businesslogic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getBooksListWithStockpile complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getBooksListWithStockpile">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="stockpile" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getBooksListWithStockpile", propOrder = {
    "stockpile"
})
public class GetBooksListWithStockpile {

    protected int stockpile;

    /**
     * Gets the value of the stockpile property.
     * 
     */
    public int getStockpile() {
        return stockpile;
    }

    /**
     * Sets the value of the stockpile property.
     * 
     */
    public void setStockpile(int value) {
        this.stockpile = value;
    }

}
