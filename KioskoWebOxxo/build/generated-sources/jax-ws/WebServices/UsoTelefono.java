
package WebServices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para UsoTelefono complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="UsoTelefono">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idTipoMovimiento" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="idTelefonia" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="tiempo" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="noCel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UsoTelefono", propOrder = {
    "idTipoMovimiento",
    "idTelefonia",
    "tiempo",
    "noCel"
})
public class UsoTelefono {

    protected int idTipoMovimiento;
    protected int idTelefonia;
    protected float tiempo;
    protected String noCel;

    /**
     * Obtiene el valor de la propiedad idTipoMovimiento.
     * 
     */
    public int getIdTipoMovimiento() {
        return idTipoMovimiento;
    }

    /**
     * Define el valor de la propiedad idTipoMovimiento.
     * 
     */
    public void setIdTipoMovimiento(int value) {
        this.idTipoMovimiento = value;
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
     * Obtiene el valor de la propiedad tiempo.
     * 
     */
    public float getTiempo() {
        return tiempo;
    }

    /**
     * Define el valor de la propiedad tiempo.
     * 
     */
    public void setTiempo(float value) {
        this.tiempo = value;
    }

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

}
