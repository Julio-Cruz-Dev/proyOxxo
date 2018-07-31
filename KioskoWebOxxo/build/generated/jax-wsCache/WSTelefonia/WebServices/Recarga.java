
package WebServices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Recarga complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Recarga">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="noCel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="idTelefonia" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="monto" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Recarga", propOrder = {
    "noCel",
    "idTelefonia",
    "monto"
})
public class Recarga {

    protected String noCel;
    protected int idTelefonia;
    protected float monto;

    /**
     * Obtiene el valor de la propiedad noCel.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNoCel() {
        return noCel;
    }

    /**
     * Define el valor de la propiedad noCel.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNoCel(String value) {
        this.noCel = value;
    }

    /**
     * Obtiene el valor de la propiedad idTelefonia.
     * 
     */
    public int getIdTelefonia() {
        return idTelefonia;
    }

    /**
     * Define el valor de la propiedad idTelefonia.
     * 
     */
    public void setIdTelefonia(int value) {
        this.idTelefonia = value;
    }

    /**
     * Obtiene el valor de la propiedad monto.
     * 
     */
    public float getMonto() {
        return monto;
    }

    /**
     * Define el valor de la propiedad monto.
     * 
     */
    public void setMonto(float value) {
        this.monto = value;
    }

}
