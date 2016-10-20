//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.06.12 at 10:05:10 PM BST 
//


package generated.com.trowbridge.chess;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
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
 *         &lt;element ref="{}opponents"/>
 *         &lt;element ref="{}result"/>
 *       &lt;/sequence>
 *       &lt;attribute name="board" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="round" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="graded" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "opponents",
    "result"
})
@XmlRootElement(name = "gameinfo")
public class Gameinfo {

    @XmlElement(required = true)
    protected Opponents opponents;
    @XmlElement(required = true)
    protected Result result;
    @XmlAttribute
    protected BigInteger board;
    @XmlAttribute
    protected BigInteger round;
    @XmlAttribute
    protected String graded;

    /**
     * Gets the value of the opponents property.
     * 
     * @return
     *     possible object is
     *     {@link Opponents }
     *     
     */
    public Opponents getOpponents() {
        return opponents;
    }

    /**
     * Sets the value of the opponents property.
     * 
     * @param value
     *     allowed object is
     *     {@link Opponents }
     *     
     */
    public void setOpponents(Opponents value) {
        this.opponents = value;
    }

    /**
     * Gets the value of the result property.
     * 
     * @return
     *     possible object is
     *     {@link Result }
     *     
     */
    public Result getResult() {
        return result;
    }

    /**
     * Sets the value of the result property.
     * 
     * @param value
     *     allowed object is
     *     {@link Result }
     *     
     */
    public void setResult(Result value) {
        this.result = value;
    }

    /**
     * Gets the value of the board property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getBoard() {
        return board;
    }

    /**
     * Sets the value of the board property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setBoard(BigInteger value) {
        this.board = value;
    }

    /**
     * Gets the value of the round property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRound() {
        return round;
    }

    /**
     * Sets the value of the round property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRound(BigInteger value) {
        this.round = value;
    }

    /**
     * Gets the value of the graded property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGraded() {
        return graded;
    }

    /**
     * Sets the value of the graded property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGraded(String value) {
        this.graded = value;
    }

}