//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.06.12 at 10:05:10 PM BST 
//


package generated.com.trowbridge.chess;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for player-reftype complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="player-reftype">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}player-ref"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "player-reftype", propOrder = {
    "playerRef"
})
public class PlayerReftype {

    @XmlElement(name = "player-ref", required = true)
    protected PlayerRef playerRef;

    /**
     * Gets the value of the playerRef property.
     * 
     * @return
     *     possible object is
     *     {@link PlayerRef }
     *     
     */
    public PlayerRef getPlayerRef() {
        return playerRef;
    }

    /**
     * Sets the value of the playerRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link PlayerRef }
     *     
     */
    public void setPlayerRef(PlayerRef value) {
        this.playerRef = value;
    }

}
