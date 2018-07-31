
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

    private final static QName _AltaRefrendoResponse_QNAME = new QName("http://refrendo/", "AltaRefrendoResponse");
    private final static QName _AltaRefrendo_QNAME = new QName("http://refrendo/", "AltaRefrendo");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: refrendo
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AltaRefrendoResponse }
     * 
     */
    public AltaRefrendoResponse createAltaRefrendoResponse() {
        return new AltaRefrendoResponse();
    }

    /**
     * Create an instance of {@link AltaRefrendo }
     * 
     */
    public AltaRefrendo createAltaRefrendo() {
        return new AltaRefrendo();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AltaRefrendoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://refrendo/", name = "AltaRefrendoResponse")
    public JAXBElement<AltaRefrendoResponse> createAltaRefrendoResponse(AltaRefrendoResponse value) {
        return new JAXBElement<AltaRefrendoResponse>(_AltaRefrendoResponse_QNAME, AltaRefrendoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AltaRefrendo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://refrendo/", name = "AltaRefrendo")
    public JAXBElement<AltaRefrendo> createAltaRefrendo(AltaRefrendo value) {
        return new JAXBElement<AltaRefrendo>(_AltaRefrendo_QNAME, AltaRefrendo.class, null, value);
    }

}
