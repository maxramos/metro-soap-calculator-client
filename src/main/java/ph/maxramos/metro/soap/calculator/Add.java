
package ph.maxramos.metro.soap.calculator;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for add complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="add">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="addend1" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="addend2" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "add", propOrder = {
    "addend1",
    "addend2"
})
public class Add {

    protected int addend1;
    protected int addend2;

    /**
     * Gets the value of the addend1 property.
     * 
     */
    public int getAddend1() {
        return addend1;
    }

    /**
     * Sets the value of the addend1 property.
     * 
     */
    public void setAddend1(int value) {
        this.addend1 = value;
    }

    /**
     * Gets the value of the addend2 property.
     * 
     */
    public int getAddend2() {
        return addend2;
    }

    /**
     * Sets the value of the addend2 property.
     * 
     */
    public void setAddend2(int value) {
        this.addend2 = value;
    }

}
