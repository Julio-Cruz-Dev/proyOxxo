
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

    private final static QName _PagoRefrendo_QNAME = new QName("http://refrendo/", "Pago_Refrendo");
    private final static QName _SaldoRefrendoResponse_QNAME = new QName("http://refrendo/", "SaldoRefrendoResponse");
    private final static QName _SaldoRefrendo_QNAME = new QName("http://refrendo/", "SaldoRefrendo");
    private final static QName _PagoRefrendoResponse_QNAME = new QName("http://refrendo/", "Pago_RefrendoResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: refrendo
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SaldoRefrendo }
     * 
     */
    public SaldoRefrendo createSaldoRefrendo() {
        return new SaldoRefrendo();
    }

    /**
     * Create an instance of {@link PagoRefrendo }
     * 
     */
    public PagoRefrendo createPagoRefrendo() {
        return new PagoRefrendo();
    }

    /**
     * Create an instance of {@link SaldoRefrendoResponse }
     * 
     */
    public SaldoRefrendoResponse createSaldoRefrendoResponse() {
        return new SaldoRefrendoResponse();
    }

    /**
     * Create an instance of {@link PagoRefrendoResponse }
     * 
     */
    public PagoRefrendoResponse createPagoRefrendoResponse() {
        return new PagoRefrendoResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PagoRefrendo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://refrendo/", name = "Pago_Refrendo")
    public JAXBElement<PagoRefrendo> createPagoRefrendo(PagoRefrendo value) {
        return new JAXBElement<PagoRefrendo>(_PagoRefrendo_QNAME, PagoRefrendo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaldoRefrendoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://refrendo/", name = "SaldoRefrendoResponse")
    public JAXBElement<SaldoRefrendoResponse> createSaldoRefrendoResponse(SaldoRefrendoResponse value) {
        return new JAXBElement<SaldoRefrendoResponse>(_SaldoRefrendoResponse_QNAME, SaldoRefrendoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaldoRefrendo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://refrendo/", name = "SaldoRefrendo")
    public JAXBElement<SaldoRefrendo> createSaldoRefrendo(SaldoRefrendo value) {
        return new JAXBElement<SaldoRefrendo>(_SaldoRefrendo_QNAME, SaldoRefrendo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PagoRefrendoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://refrendo/", name = "Pago_RefrendoResponse")
    public JAXBElement<PagoRefrendoResponse> createPagoRefrendoResponse(PagoRefrendoResponse value) {
        return new JAXBElement<PagoRefrendoResponse>(_PagoRefrendoResponse_QNAME, PagoRefrendoResponse.class, null, value);
    }

}
