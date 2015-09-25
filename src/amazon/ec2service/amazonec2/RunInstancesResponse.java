//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.5-2 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: AM.09.24 a las 09:30:55 AM CDT 
//


package amazon.ec2service.amazonec2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
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
 *         &lt;element name="instancesSet">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="item" type="{http://ec2.amazonaws.com/doc/2007-01-19/}runInstancesSetItem" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="userData">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="data" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="version" type="{http://www.w3.org/2001/XMLSchema}string" default="1.0" />
 *                 &lt;attribute name="encoding" type="{http://www.w3.org/2001/XMLSchema}string" default="base64" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="addressingType" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
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
    "instancesSet",
    "userData",
    "addressingType"
})
@XmlRootElement(name = "RunInstancesResponse")
public class RunInstancesResponse {

    @XmlElement(required = true)
    protected RunInstancesResponse.InstancesSet instancesSet;
    @XmlElement(required = true)
    protected RunInstancesResponse.UserData userData;
    @XmlElement(required = true)
    protected Object addressingType;

    /**
     * Obtiene el valor de la propiedad instancesSet.
     * 
     * @return
     *     possible object is
     *     {@link RunInstancesResponse.InstancesSet }
     *     
     */
    public RunInstancesResponse.InstancesSet getInstancesSet() {
        return instancesSet;
    }

    /**
     * Define el valor de la propiedad instancesSet.
     * 
     * @param value
     *     allowed object is
     *     {@link RunInstancesResponse.InstancesSet }
     *     
     */
    public void setInstancesSet(RunInstancesResponse.InstancesSet value) {
        this.instancesSet = value;
    }

    /**
     * Obtiene el valor de la propiedad userData.
     * 
     * @return
     *     possible object is
     *     {@link RunInstancesResponse.UserData }
     *     
     */
    public RunInstancesResponse.UserData getUserData() {
        return userData;
    }

    /**
     * Define el valor de la propiedad userData.
     * 
     * @param value
     *     allowed object is
     *     {@link RunInstancesResponse.UserData }
     *     
     */
    public void setUserData(RunInstancesResponse.UserData value) {
        this.userData = value;
    }

    /**
     * Obtiene el valor de la propiedad addressingType.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getAddressingType() {
        return addressingType;
    }

    /**
     * Define el valor de la propiedad addressingType.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setAddressingType(Object value) {
        this.addressingType = value;
    }


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
     *         &lt;element name="item" type="{http://ec2.amazonaws.com/doc/2007-01-19/}runInstancesSetItem" maxOccurs="unbounded" minOccurs="0"/>
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
        "item"
    })
    public static class InstancesSet {

        protected List<RunInstancesSetItem> item;

        /**
         * Gets the value of the item property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the item property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getItem().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link RunInstancesSetItem }
         * 
         * 
         */
        public List<RunInstancesSetItem> getItem() {
            if (item == null) {
                item = new ArrayList<RunInstancesSetItem>();
            }
            return this.item;
        }

    }


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
     *         &lt;element name="data" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
     *       &lt;/sequence>
     *       &lt;attribute name="version" type="{http://www.w3.org/2001/XMLSchema}string" default="1.0" />
     *       &lt;attribute name="encoding" type="{http://www.w3.org/2001/XMLSchema}string" default="base64" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "data"
    })
    public static class UserData {

        @XmlElement(required = true)
        protected Object data;
        @XmlAttribute(name = "version")
        protected String version;
        @XmlAttribute(name = "encoding")
        protected String encoding;

        /**
         * Obtiene el valor de la propiedad data.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getData() {
            return data;
        }

        /**
         * Define el valor de la propiedad data.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setData(Object value) {
            this.data = value;
        }

        /**
         * Obtiene el valor de la propiedad version.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getVersion() {
            if (version == null) {
                return "1.0";
            } else {
                return version;
            }
        }

        /**
         * Define el valor de la propiedad version.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setVersion(String value) {
            this.version = value;
        }

        /**
         * Obtiene el valor de la propiedad encoding.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEncoding() {
            if (encoding == null) {
                return "base64";
            } else {
                return encoding;
            }
        }

        /**
         * Define el valor de la propiedad encoding.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEncoding(String value) {
            this.encoding = value;
        }

    }

}
