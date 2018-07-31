
package WebServices;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para respuestaGetProveedoresTelefonia complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="respuestaGetProveedoresTelefonia">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="proveedores" type="{http://service/}proveedoresTelefonia" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="respuesta" type="{http://service/}respuesta" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "respuestaGetProveedoresTelefonia", propOrder = {
    "proveedores",
    "respuesta"
})
public class RespuestaGetProveedoresTelefonia {

    @XmlElement(nillable = true)
    protected List<ProveedoresTelefonia> proveedores;
    protected Respuesta respuesta;

    /**
     * Gets the value of the proveedores property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the proveedores property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProveedores().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProveedoresTelefonia }
     * 
     * 
     */
    public List<ProveedoresTelefonia> getProveedores() {
        if (proveedores == null) {
            proveedores = new ArrayList<ProveedoresTelefonia>();
        }
        return this.proveedores;
    }

    /**
     * Obtiene el valor de la propiedad respuesta.
     * 
     * @return
     *     possible object is
     *     {@link Respuesta }
     *     
     */
    public Respuesta getRespuesta() {
        return respuesta;
    }

    /**
     * Define el valor de la propiedad respuesta.
     * 
     * @param value
     *     allowed object is
     *     {@link Respuesta }
     *     
     */
    public void setRespuesta(Respuesta value) {
        this.respuesta = value;
    }

}
