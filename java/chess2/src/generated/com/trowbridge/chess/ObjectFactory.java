//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.06.12 at 10:05:10 PM BST 
//


package generated.com.trowbridge.chess;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the generated.com.trowbridge.chess package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Site_QNAME = new QName("", "site");
    private final static QName _Club_QNAME = new QName("", "club");
    private final static QName _Report_QNAME = new QName("", "report");
    private final static QName _White_QNAME = new QName("", "white");
    private final static QName _Score_QNAME = new QName("", "score");
    private final static QName _Team_QNAME = new QName("", "team");
    private final static QName _Black_QNAME = new QName("", "black");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: generated.com.trowbridge.chess
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Gameinfo }
     * 
     */
    public Gameinfo createGameinfo() {
        return new Gameinfo();
    }

    /**
     * Create an instance of {@link DateType }
     * 
     */
    public DateType createDateType() {
        return new DateType();
    }

    /**
     * Create an instance of {@link PlayerRef }
     * 
     */
    public PlayerRef createPlayerRef() {
        return new PlayerRef();
    }

    /**
     * Create an instance of {@link PlayerReftype }
     * 
     */
    public PlayerReftype createPlayerReftype() {
        return new PlayerReftype();
    }

    /**
     * Create an instance of {@link Away }
     * 
     */
    public Away createAway() {
        return new Away();
    }

    /**
     * Create an instance of {@link Value }
     * 
     */
    public Value createValue() {
        return new Value();
    }

    /**
     * Create an instance of {@link Players }
     * 
     */
    public Players createPlayers() {
        return new Players();
    }

    /**
     * Create an instance of {@link Opponents }
     * 
     */
    public Opponents createOpponents() {
        return new Opponents();
    }

    /**
     * Create an instance of {@link Match }
     * 
     */
    public Match createMatch() {
        return new Match();
    }

    /**
     * Create an instance of {@link Competition }
     * 
     */
    public Competition createCompetition() {
        return new Competition();
    }

    /**
     * Create an instance of {@link Home }
     * 
     */
    public Home createHome() {
        return new Home();
    }

    /**
     * Create an instance of {@link Result }
     * 
     */
    public Result createResult() {
        return new Result();
    }

    /**
     * Create an instance of {@link Grade }
     * 
     */
    public Grade createGrade() {
        return new Grade();
    }

    /**
     * Create an instance of {@link Chess }
     * 
     */
    public Chess createChess() {
        return new Chess();
    }

    /**
     * Create an instance of {@link Date }
     * 
     */
    public Date createDate() {
        return new Date();
    }

    /**
     * Create an instance of {@link Player }
     * 
     */
    public Player createPlayer() {
        return new Player();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "site")
    public JAXBElement<String> createSite(String value) {
        return new JAXBElement<String>(_Site_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "club")
    public JAXBElement<String> createClub(String value) {
        return new JAXBElement<String>(_Club_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "report")
    public JAXBElement<String> createReport(String value) {
        return new JAXBElement<String>(_Report_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PlayerReftype }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "white")
    public JAXBElement<PlayerReftype> createWhite(PlayerReftype value) {
        return new JAXBElement<PlayerReftype>(_White_QNAME, PlayerReftype.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "score")
    public JAXBElement<String> createScore(String value) {
        return new JAXBElement<String>(_Score_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "team")
    public JAXBElement<String> createTeam(String value) {
        return new JAXBElement<String>(_Team_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PlayerReftype }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "black")
    public JAXBElement<PlayerReftype> createBlack(PlayerReftype value) {
        return new JAXBElement<PlayerReftype>(_Black_QNAME, PlayerReftype.class, null, value);
    }

}
