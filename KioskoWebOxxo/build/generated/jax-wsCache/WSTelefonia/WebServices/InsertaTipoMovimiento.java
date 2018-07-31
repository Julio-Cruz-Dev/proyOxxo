
package WebServices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para InsertaTipoMovimiento complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="InsertaTipoMovimiento">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tiposMovimiento" type="{http://service/}tiposMovimiento" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InsertaTipoMovimiento", propOrder = {
    "tiposMovimiento"
})
public class InsertaTipoMovimiento {

    protected TiposMovimiento tiposMovimiento;

    /**
     * Obtiene el valor de la propiedad tiposMovimiento.
     * 
     * @return
     *     possible object is
     *     {@link TiposMovimiento }
     *     
     */
    public TiposMovimiento getTiposMovimiento() {
        return tiposMovimiento;
    }

    /**
     * Define el valor de la propiedad tiposMovimiento.
     * 
     * @param value
     *     allowed object is
     *     {@link TiposMovimiento }
     *     
     */
    public void setTiposMovimiento(TiposMovimiento value) {
        this.tiposMovimiento = value;
    }

}
