
package WebServices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para GetProveedoresTelefoniaResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="GetProveedoresTelefoniaResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="return" type="{http://service/}respuestaGetProveedoresTelefonia" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetProveedoresTelefoniaResponse", propOrder = {
    "_return"
})
public class GetProveedoresTelefoniaResponse {

    @XmlElement(name = "return")
    protected RespuestaGetProveedoresTelefonia _return;

    /**
     * Obtiene el valor de la propiedad return.
     * 
     * @return
     *     possible object is
     *     {@link RespuestaGetProveedoresTelefonia }
     *     
     */
    public RespuestaGetProveedoresTelefonia getReturn() {
        return _return;
    }

    /**
     * Define el valor de la propiedad return.
     * 
     * @param value
     *     allowed object is
     *     {@link RespuestaGetProveedoresTelefonia }
     *     
     */
    public void setReturn(RespuestaGetProveedoresTelefonia value) {
        this._return = value;
    }

}
