
package service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the service package. 
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

    private final static QName _GetTiposMovimientoResponse_QNAME = new QName("http://service/", "GetTiposMovimientoResponse");
    private final static QName _Recarga_QNAME = new QName("http://service/", "Recarga");
    private final static QName _InsertaCliente_QNAME = new QName("http://service/", "InsertaCliente");
    private final static QName _InsertaTipoMovimientoResponse_QNAME = new QName("http://service/", "InsertaTipoMovimientoResponse");
    private final static QName _GetTiposMovimiento_QNAME = new QName("http://service/", "GetTiposMovimiento");
    private final static QName _InsertaProveedor_QNAME = new QName("http://service/", "InsertaProveedor");
    private final static QName _InsertaTipoMovimiento_QNAME = new QName("http://service/", "InsertaTipoMovimiento");
    private final static QName _GetProveedoresTelefoniaResponse_QNAME = new QName("http://service/", "GetProveedoresTelefoniaResponse");
    private final static QName _Saldo_QNAME = new QName("http://service/", "Saldo");
    private final static QName _UsoTelefonoResponse_QNAME = new QName("http://service/", "UsoTelefonoResponse");
    private final static QName _InsertaProveedorResponse_QNAME = new QName("http://service/", "InsertaProveedorResponse");
    private final static QName _GetProveedoresTelefonia_QNAME = new QName("http://service/", "GetProveedoresTelefonia");
    private final static QName _RecargaResponse_QNAME = new QName("http://service/", "RecargaResponse");
    private final static QName _SaldoResponse_QNAME = new QName("http://service/", "SaldoResponse");
    private final static QName _UsoTelefono_QNAME = new QName("http://service/", "UsoTelefono");
    private final static QName _InsertaClienteResponse_QNAME = new QName("http://service/", "InsertaClienteResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Recarga }
     * 
     */
    public Recarga createRecarga() {
        return new Recarga();
    }

    /**
     * Create an instance of {@link GetTiposMovimientoResponse }
     * 
     */
    public GetTiposMovimientoResponse createGetTiposMovimientoResponse() {
        return new GetTiposMovimientoResponse();
    }

    /**
     * Create an instance of {@link GetProveedoresTelefoniaResponse }
     * 
     */
    public GetProveedoresTelefoniaResponse createGetProveedoresTelefoniaResponse() {
        return new GetProveedoresTelefoniaResponse();
    }

    /**
     * Create an instance of {@link InsertaTipoMovimiento }
     * 
     */
    public InsertaTipoMovimiento createInsertaTipoMovimiento() {
        return new InsertaTipoMovimiento();
    }

    /**
     * Create an instance of {@link GetTiposMovimiento }
     * 
     */
    public GetTiposMovimiento createGetTiposMovimiento() {
        return new GetTiposMovimiento();
    }

    /**
     * Create an instance of {@link InsertaProveedor }
     * 
     */
    public InsertaProveedor createInsertaProveedor() {
        return new InsertaProveedor();
    }

    /**
     * Create an instance of {@link InsertaCliente }
     * 
     */
    public InsertaCliente createInsertaCliente() {
        return new InsertaCliente();
    }

    /**
     * Create an instance of {@link InsertaTipoMovimientoResponse }
     * 
     */
    public InsertaTipoMovimientoResponse createInsertaTipoMovimientoResponse() {
        return new InsertaTipoMovimientoResponse();
    }

    /**
     * Create an instance of {@link GetProveedoresTelefonia }
     * 
     */
    public GetProveedoresTelefonia createGetProveedoresTelefonia() {
        return new GetProveedoresTelefonia();
    }

    /**
     * Create an instance of {@link InsertaProveedorResponse }
     * 
     */
    public InsertaProveedorResponse createInsertaProveedorResponse() {
        return new InsertaProveedorResponse();
    }

    /**
     * Create an instance of {@link Saldo }
     * 
     */
    public Saldo createSaldo() {
        return new Saldo();
    }

    /**
     * Create an instance of {@link UsoTelefonoResponse }
     * 
     */
    public UsoTelefonoResponse createUsoTelefonoResponse() {
        return new UsoTelefonoResponse();
    }

    /**
     * Create an instance of {@link InsertaClienteResponse }
     * 
     */
    public InsertaClienteResponse createInsertaClienteResponse() {
        return new InsertaClienteResponse();
    }

    /**
     * Create an instance of {@link SaldoResponse }
     * 
     */
    public SaldoResponse createSaldoResponse() {
        return new SaldoResponse();
    }

    /**
     * Create an instance of {@link UsoTelefono }
     * 
     */
    public UsoTelefono createUsoTelefono() {
        return new UsoTelefono();
    }

    /**
     * Create an instance of {@link RecargaResponse }
     * 
     */
    public RecargaResponse createRecargaResponse() {
        return new RecargaResponse();
    }

    /**
     * Create an instance of {@link RespuestaTiposMovimiento }
     * 
     */
    public RespuestaTiposMovimiento createRespuestaTiposMovimiento() {
        return new RespuestaTiposMovimiento();
    }

    /**
     * Create an instance of {@link RespuestaSaldo }
     * 
     */
    public RespuestaSaldo createRespuestaSaldo() {
        return new RespuestaSaldo();
    }

    /**
     * Create an instance of {@link Cliente }
     * 
     */
    public Cliente createCliente() {
        return new Cliente();
    }

    /**
     * Create an instance of {@link ProveedoresTelefonia }
     * 
     */
    public ProveedoresTelefonia createProveedoresTelefonia() {
        return new ProveedoresTelefonia();
    }

    /**
     * Create an instance of {@link RespuestaGetProveedoresTelefonia }
     * 
     */
    public RespuestaGetProveedoresTelefonia createRespuestaGetProveedoresTelefonia() {
        return new RespuestaGetProveedoresTelefonia();
    }

    /**
     * Create an instance of {@link TiposMovimiento }
     * 
     */
    public TiposMovimiento createTiposMovimiento() {
        return new TiposMovimiento();
    }

    /**
     * Create an instance of {@link Respuesta }
     * 
     */
    public Respuesta createRespuesta() {
        return new Respuesta();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTiposMovimientoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "GetTiposMovimientoResponse")
    public JAXBElement<GetTiposMovimientoResponse> createGetTiposMovimientoResponse(GetTiposMovimientoResponse value) {
        return new JAXBElement<GetTiposMovimientoResponse>(_GetTiposMovimientoResponse_QNAME, GetTiposMovimientoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Recarga }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "Recarga")
    public JAXBElement<Recarga> createRecarga(Recarga value) {
        return new JAXBElement<Recarga>(_Recarga_QNAME, Recarga.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertaCliente }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "InsertaCliente")
    public JAXBElement<InsertaCliente> createInsertaCliente(InsertaCliente value) {
        return new JAXBElement<InsertaCliente>(_InsertaCliente_QNAME, InsertaCliente.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertaTipoMovimientoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "InsertaTipoMovimientoResponse")
    public JAXBElement<InsertaTipoMovimientoResponse> createInsertaTipoMovimientoResponse(InsertaTipoMovimientoResponse value) {
        return new JAXBElement<InsertaTipoMovimientoResponse>(_InsertaTipoMovimientoResponse_QNAME, InsertaTipoMovimientoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTiposMovimiento }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "GetTiposMovimiento")
    public JAXBElement<GetTiposMovimiento> createGetTiposMovimiento(GetTiposMovimiento value) {
        return new JAXBElement<GetTiposMovimiento>(_GetTiposMovimiento_QNAME, GetTiposMovimiento.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertaProveedor }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "InsertaProveedor")
    public JAXBElement<InsertaProveedor> createInsertaProveedor(InsertaProveedor value) {
        return new JAXBElement<InsertaProveedor>(_InsertaProveedor_QNAME, InsertaProveedor.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertaTipoMovimiento }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "InsertaTipoMovimiento")
    public JAXBElement<InsertaTipoMovimiento> createInsertaTipoMovimiento(InsertaTipoMovimiento value) {
        return new JAXBElement<InsertaTipoMovimiento>(_InsertaTipoMovimiento_QNAME, InsertaTipoMovimiento.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetProveedoresTelefoniaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "GetProveedoresTelefoniaResponse")
    public JAXBElement<GetProveedoresTelefoniaResponse> createGetProveedoresTelefoniaResponse(GetProveedoresTelefoniaResponse value) {
        return new JAXBElement<GetProveedoresTelefoniaResponse>(_GetProveedoresTelefoniaResponse_QNAME, GetProveedoresTelefoniaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Saldo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "Saldo")
    public JAXBElement<Saldo> createSaldo(Saldo value) {
        return new JAXBElement<Saldo>(_Saldo_QNAME, Saldo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UsoTelefonoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "UsoTelefonoResponse")
    public JAXBElement<UsoTelefonoResponse> createUsoTelefonoResponse(UsoTelefonoResponse value) {
        return new JAXBElement<UsoTelefonoResponse>(_UsoTelefonoResponse_QNAME, UsoTelefonoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertaProveedorResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "InsertaProveedorResponse")
    public JAXBElement<InsertaProveedorResponse> createInsertaProveedorResponse(InsertaProveedorResponse value) {
        return new JAXBElement<InsertaProveedorResponse>(_InsertaProveedorResponse_QNAME, InsertaProveedorResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetProveedoresTelefonia }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "GetProveedoresTelefonia")
    public JAXBElement<GetProveedoresTelefonia> createGetProveedoresTelefonia(GetProveedoresTelefonia value) {
        return new JAXBElement<GetProveedoresTelefonia>(_GetProveedoresTelefonia_QNAME, GetProveedoresTelefonia.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RecargaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "RecargaResponse")
    public JAXBElement<RecargaResponse> createRecargaResponse(RecargaResponse value) {
        return new JAXBElement<RecargaResponse>(_RecargaResponse_QNAME, RecargaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaldoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "SaldoResponse")
    public JAXBElement<SaldoResponse> createSaldoResponse(SaldoResponse value) {
        return new JAXBElement<SaldoResponse>(_SaldoResponse_QNAME, SaldoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UsoTelefono }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "UsoTelefono")
    public JAXBElement<UsoTelefono> createUsoTelefono(UsoTelefono value) {
        return new JAXBElement<UsoTelefono>(_UsoTelefono_QNAME, UsoTelefono.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertaClienteResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "InsertaClienteResponse")
    public JAXBElement<InsertaClienteResponse> createInsertaClienteResponse(InsertaClienteResponse value) {
        return new JAXBElement<InsertaClienteResponse>(_InsertaClienteResponse_QNAME, InsertaClienteResponse.class, null, value);
    }

}
