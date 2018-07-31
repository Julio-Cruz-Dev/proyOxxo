
package refrendo;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the refrendo package. 
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

    private final static QName _AbonoRefrendoResponse_QNAME = new QName("http://refrendo/", "Abono_refrendoResponse");
    private final static QName _AbonoRefrendo_QNAME = new QName("http://refrendo/", "Abono_refrendo");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: refrendo
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AbonoRefrendoResponse }
     * 
     */
    public AbonoRefrendoResponse createAbonoRefrendoResponse() {
        return new AbonoRefrendoResponse();
    }

    /**
     * Create an instance of {@link AbonoRefrendo }
     * 
     */
    public AbonoRefrendo createAbonoRefrendo() {
        return new AbonoRefrendo();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AbonoRefrendoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://refrendo/", name = "Abono_refrendoResponse")
    public JAXBElement<AbonoRefrendoResponse> createAbonoRefrendoResponse(AbonoRefrendoResponse value) {
        return new JAXBElement<AbonoRefrendoResponse>(_AbonoRefrendoResponse_QNAME, AbonoRefrendoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AbonoRefrendo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://refrendo/", name = "Abono_refrendo")
    public JAXBElement<AbonoRefrendo> createAbonoRefrendo(AbonoRefrendo value) {
        return new JAXBElement<AbonoRefrendo>(_AbonoRefrendo_QNAME, AbonoRefrendo.class, null, value);
    }

}
