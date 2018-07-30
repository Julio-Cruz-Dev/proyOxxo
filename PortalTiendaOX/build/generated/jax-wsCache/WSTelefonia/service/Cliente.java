
package service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para cliente complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="cliente">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="apematerno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="apepaterno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="idproveedor" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="nombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="telefono" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cliente", propOrder = {
    "apematerno",
    "apepaterno",
    "idproveedor",
    "nombre",
    "telefono"
})
public class Cliente {

    protected String apematerno;
    protected String apepaterno;
    protected int idproveedor;
    protected String nombre;
    protected String telefono;

    /**
     * Obtiene el valor de la propiedad apematerno.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApematerno() {
        return apematerno;
    }

    /**
     * Define el valor de la propiedad apematerno.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApematerno(String value) {
        this.apematerno = value;
    }

    /**
     * Obtiene el valor de la propiedad apepaterno.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApepaterno() {
        return apepaterno;
    }

    /**
     * Define el valor de la propiedad apepaterno.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApepaterno(String value) {
        this.apepaterno = value;
    }

    /**
     * Obtiene el valor de la propiedad idproveedor.
     * 
     */
    public int getIdproveedor() {
        return idproveedor;
    }

    /**
     * Define el valor de la propiedad idproveedor.
     * 
     */
    public void setIdproveedor(int value) {
        this.idproveedor = value;
    }

    /**
     * Obtiene el valor de la propiedad nombre.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Define el valor de la propiedad nombre.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombre(String value) {
        this.nombre = value;
    }

    /**
     * Obtiene el valor de la propiedad telefono.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * Define el valor de la propiedad telefono.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelefono(String value) {
        this.telefono = value;
    }

}
