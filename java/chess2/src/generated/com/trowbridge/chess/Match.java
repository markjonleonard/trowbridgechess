//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.06.12 at 10:05:10 PM BST 
//


package generated.com.trowbridge.chess;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;sequence minOccurs="0">
 *           &lt;element ref="{}home"/>
 *           &lt;element ref="{}away"/>
 *         &lt;/sequence>
 *         &lt;element name="date" type="{}date-type"/>
 *         &lt;element name="ecfdate" type="{}date-type" minOccurs="0"/>
 *         &lt;element ref="{}report" minOccurs="0"/>
 *         &lt;element ref="{}site" minOccurs="0"/>
 *         &lt;element ref="{}gameinfo" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "home",
    "away",
    "date",
    "ecfdate",
    "report",
    "site",
    "gameinfo"
})
@XmlRootElement(name = "match")
public class Match {

    protected Home home;
    protected Away away;
    @XmlElement(required = true)
    protected DateType date;
    protected DateType ecfdate;
    protected String report;
    protected String site;
    protected List<Gameinfo> gameinfo;

    /**
     * Gets the value of the home property.
     * 
     * @return
     *     possible object is
     *     {@link Home }
     *     
     */
    public Home getHome() {
        return home;
    }

    /**
     * Sets the value of the home property.
     * 
     * @param value
     *     allowed object is
     *     {@link Home }
     *     
     */
    public void setHome(Home value) {
        this.home = value;
    }

    /**
     * Gets the value of the away property.
     * 
     * @return
     *     possible object is
     *     {@link Away }
     *     
     */
    public Away getAway() {
        return away;
    }

    /**
     * Sets the value of the away property.
     * 
     * @param value
     *     allowed object is
     *     {@link Away }
     *     
     */
    public void setAway(Away value) {
        this.away = value;
    }

    /**
     * Gets the value of the date property.
     * 
     * @return
     *     possible object is
     *     {@link DateType }
     *     
     */
    public DateType getDate() {
        return date;
    }

    /**
     * Sets the value of the date property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateType }
     *     
     */
    public void setDate(DateType value) {
        this.date = value;
    }

    /**
     * Gets the value of the ecfdate property.
     * 
     * @return
     *     possible object is
     *     {@link DateType }
     *     
     */
    public DateType getEcfdate() {
        return ecfdate;
    }

    /**
     * Sets the value of the ecfdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateType }
     *     
     */
    public void setEcfdate(DateType value) {
        this.ecfdate = value;
    }

    /**
     * Gets the value of the report property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReport() {
        return report;
    }

    /**
     * Sets the value of the report property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReport(String value) {
        this.report = value;
    }

    /**
     * Gets the value of the site property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSite() {
        return site;
    }

    /**
     * Sets the value of the site property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSite(String value) {
        this.site = value;
    }

    /**
     * Individual chess games Gets the value of the gameinfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the gameinfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGameinfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Gameinfo }
     * 
     * 
     */
    public List<Gameinfo> getGameinfo() {
        if (gameinfo == null) {
            gameinfo = new ArrayList<Gameinfo>();
        }
        return this.gameinfo;
    }

}
