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
 * <p>Clase Java para blockDeviceMappingItem complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="blockDeviceMappingItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="virtualName" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *         &lt;element name="deviceName" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "blockDeviceMappingItem", propOrder = {
    "virtualName",
    "deviceName"
})
public class BlockDeviceMappingItem {

    @XmlElement(required = true)
    protected Object virtualName;
    @XmlElement(required = true)
    protected Object deviceName;

    /**
     * Obtiene el valor de la propiedad virtualName.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getVirtualName() {
        return virtualName;
    }

    /**
     * Define el valor de la propiedad virtualName.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setVirtualName(Object value) {
        this.virtualName = value;
    }

    /**
     * Obtiene el valor de la propiedad deviceName.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getDeviceName() {
        return deviceName;
    }

    /**
     * Define el valor de la propiedad deviceName.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setDeviceName(Object value) {
        this.deviceName = value;
    }

}
