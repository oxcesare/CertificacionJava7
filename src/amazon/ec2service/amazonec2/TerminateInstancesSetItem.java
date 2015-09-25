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
 * <p>Clase Java para terminateInstancesSetItem complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="terminateInstancesSetItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="instanceId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="shutdownState" type="{http://ec2.amazonaws.com/doc/2007-01-19/}State"/>
 *         &lt;element name="previousState" type="{http://ec2.amazonaws.com/doc/2007-01-19/}State"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "terminateInstancesSetItem", propOrder = {
    "instanceId",
    "shutdownState",
    "previousState"
})
public class TerminateInstancesSetItem {

    @XmlElement(required = true)
    protected String instanceId;
    @XmlElement(required = true)
    protected State shutdownState;
    @XmlElement(required = true)
    protected State previousState;

    /**
     * Obtiene el valor de la propiedad instanceId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstanceId() {
        return instanceId;
    }

    /**
     * Define el valor de la propiedad instanceId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstanceId(String value) {
        this.instanceId = value;
    }

    /**
     * Obtiene el valor de la propiedad shutdownState.
     * 
     * @return
     *     possible object is
     *     {@link State }
     *     
     */
    public State getShutdownState() {
        return shutdownState;
    }

    /**
     * Define el valor de la propiedad shutdownState.
     * 
     * @param value
     *     allowed object is
     *     {@link State }
     *     
     */
    public void setShutdownState(State value) {
        this.shutdownState = value;
    }

    /**
     * Obtiene el valor de la propiedad previousState.
     * 
     * @return
     *     possible object is
     *     {@link State }
     *     
     */
    public State getPreviousState() {
        return previousState;
    }

    /**
     * Define el valor de la propiedad previousState.
     * 
     * @param value
     *     allowed object is
     *     {@link State }
     *     
     */
    public void setPreviousState(State value) {
        this.previousState = value;
    }

}
