//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.06.12 at 10:05:10 PM BST 
//


package generated.com.trowbridge.chess;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}white"/>
 *         &lt;element ref="{}black"/>
 *       &lt;/sequence>
 *       &lt;attribute name="ecf" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "white",
    "black"
})
@XmlRootElement(name = "opponents")
public class Opponents {

    @XmlElement(required = true)
    protected PlayerReftype white;
    @XmlElement(required = true)
    protected PlayerReftype black;
    @XmlAttribute
    @XmlSchemaType(name = "anySimpleType")
    protected String ecf;

    /**
     * Gets the value of the white property.
     * 
     * @return
     *     possible object is
     *     {@link PlayerReftype }
     *     
     */
    public PlayerReftype getWhite() {
        return white;
    }

    /**
     * Sets the value of the white property.
     * 
     * @param value
     *     allowed object is
     *     {@link PlayerReftype }
     *     
     */
    public void setWhite(PlayerReftype value) {
        this.white = value;
    }

    /**
     * Gets the value of the black property.
     * 
     * @return
     *     possible object is
     *     {@link PlayerReftype }
     *     
     */
    public PlayerReftype getBlack() {
        return black;
    }

    /**
     * Sets the value of the black property.
     * 
     * @param value
     *     allowed object is
     *     {@link PlayerReftype }
     *     
     */
    public void setBlack(PlayerReftype value) {
        this.black = value;
    }

    /**
     * Gets the value of the ecf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEcf() {
        return ecf;
    }

    /**
     * Sets the value of the ecf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEcf(String value) {
        this.ecf = value;
    }

}
