//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.5-2 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: AM.09.24 a las 09:30:55 AM CDT 
//


package amazon.ec2service.amazonec2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="keyName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="keyFingerprint" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="keyMaterial" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "keyName",
    "keyFingerprint",
    "keyMaterial"
})
@XmlRootElement(name = "CreateKeyPairResponse")
public class CreateKeyPairResponse {

    @XmlElement(required = true)
    protected String keyName;
    @XmlElement(required = true)
    protected String keyFingerprint;
    @XmlElement(required = true)
    protected String keyMaterial;

    /**
     * Obtiene el valor de la propiedad keyName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKeyName() {
        return keyName;
    }

    /**
     * Define el valor de la propiedad keyName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKeyName(String value) {
        this.keyName = value;
    }

    /**
     * Obtiene el valor de la propiedad keyFingerprint.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKeyFingerprint() {
        return keyFingerprint;
    }

    /**
     * Define el valor de la propiedad keyFingerprint.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKeyFingerprint(String value) {
        this.keyFingerprint = value;
    }

    /**
     * Obtiene el valor de la propiedad keyMaterial.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKeyMaterial() {
        return keyMaterial;
    }

    /**
     * Define el valor de la propiedad keyMaterial.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKeyMaterial(String value) {
        this.keyMaterial = value;
    }

}
