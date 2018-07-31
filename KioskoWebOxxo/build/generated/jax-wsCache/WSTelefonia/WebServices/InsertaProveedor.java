
package WebServices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para InsertaProveedor complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="InsertaProveedor">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="proveedor" type="{http://service/}proveedoresTelefonia" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InsertaProveedor", propOrder = {
    "proveedor"
})
public class InsertaProveedor {

    protected ProveedoresTelefonia proveedor;

    /**
     * Obtiene el valor de la propiedad proveedor.
     * 
     * @return
     *     possible object is
     *     {@link ProveedoresTelefonia }
     *     
     */
    public ProveedoresTelefonia getProveedor() {
        return proveedor;
    }

    /**
     * Define el valor de la propiedad proveedor.
     * 
     * @param value
     *     allowed object is
     *     {@link ProveedoresTelefonia }
     *     
     */
    public void setProveedor(ProveedoresTelefonia value) {
        this.proveedor = value;
    }

}
