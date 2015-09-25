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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para keySetItem complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="keySetItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="keyName" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *         &lt;element name="keyFingerprint" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "keySetItem", propOrder = {
    "keyName",
    "keyFingerprint"
})
public class KeySetItem {

    @XmlElement(required = true)
    protected Object keyName;
    @XmlElement(required = true)
    protected Object keyFingerprint;

    /**
     * Obtiene el valor de la propiedad keyName.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getKeyName() {
        return keyName;
    }

    /**
     * Define el valor de la propiedad keyName.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setKeyName(Object value) {
        this.keyName = value;
    }

    /**
     * Obtiene el valor de la propiedad keyFingerprint.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getKeyFingerprint() {
        return keyFingerprint;
    }

    /**
     * Define el valor de la propiedad keyFingerprint.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setKeyFingerprint(Object value) {
        this.keyFingerprint = value;
    }

}
