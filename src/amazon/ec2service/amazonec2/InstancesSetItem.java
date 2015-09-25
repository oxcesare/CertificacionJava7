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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para instancesSetItem complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="instancesSetItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="instanceId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="imageId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="instanceState" type="{http://ec2.amazonaws.com/doc/2007-01-19/}State"/>
 *         &lt;element name="privateDnsName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="dnsName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="keyName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="productCodesSet">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="item" type="{http://ec2.amazonaws.com/doc/2007-01-19/}productCodesSetItem" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="InstanceType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="launchTime" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="placement">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="availabilityZone" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="kernelId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ramdiskId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "instancesSetItem", propOrder = {
    "instanceId",
    "imageId",
    "instanceState",
    "privateDnsName",
    "dnsName",
    "keyName",
    "productCodesSet",
    "instanceType",
    "launchTime",
    "placement",
    "kernelId",
    "ramdiskId"
})
public class InstancesSetItem {

    @XmlElement(required = true)
    protected String instanceId;
    @XmlElement(required = true)
    protected String imageId;
    @XmlElement(required = true)
    protected State instanceState;
    @XmlElement(required = true)
    protected String privateDnsName;
    @XmlElement(required = true)
    protected String dnsName;
    @XmlElement(required = true)
    protected String keyName;
    @XmlElement(required = true)
    protected InstancesSetItem.ProductCodesSet productCodesSet;
    @XmlElement(name = "InstanceType", required = true)
    protected String instanceType;
    @XmlElement(required = true)
    protected String launchTime;
    @XmlElement(required = true)
    protected InstancesSetItem.Placement placement;
    @XmlElement(required = true)
    protected String kernelId;
    @XmlElement(required = true)
    protected String ramdiskId;

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
     * Obtiene el valor de la propiedad imageId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImageId() {
        return imageId;
    }

    /**
     * Define el valor de la propiedad imageId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImageId(String value) {
        this.imageId = value;
    }

    /**
     * Obtiene el valor de la propiedad instanceState.
     * 
     * @return
     *     possible object is
     *     {@link State }
     *     
     */
    public State getInstanceState() {
        return instanceState;
    }

    /**
     * Define el valor de la propiedad instanceState.
     * 
     * @param value
     *     allowed object is
     *     {@link State }
     *     
     */
    public void setInstanceState(State value) {
        this.instanceState = value;
    }

    /**
     * Obtiene el valor de la propiedad privateDnsName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrivateDnsName() {
        return privateDnsName;
    }

    /**
     * Define el valor de la propiedad privateDnsName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrivateDnsName(String value) {
        this.privateDnsName = value;
    }

    /**
     * Obtiene el valor de la propiedad dnsName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDnsName() {
        return dnsName;
    }

    /**
     * Define el valor de la propiedad dnsName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDnsName(String value) {
        this.dnsName = value;
    }

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
     * Obtiene el valor de la propiedad productCodesSet.
     * 
     * @return
     *     possible object is
     *     {@link InstancesSetItem.ProductCodesSet }
     *     
     */
    public InstancesSetItem.ProductCodesSet getProductCodesSet() {
        return productCodesSet;
    }

    /**
     * Define el valor de la propiedad productCodesSet.
     * 
     * @param value
     *     allowed object is
     *     {@link InstancesSetItem.ProductCodesSet }
     *     
     */
    public void setProductCodesSet(InstancesSetItem.ProductCodesSet value) {
        this.productCodesSet = value;
    }

    /**
     * Obtiene el valor de la propiedad instanceType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstanceType() {
        return instanceType;
    }

    /**
     * Define el valor de la propiedad instanceType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstanceType(String value) {
        this.instanceType = value;
    }

    /**
     * Obtiene el valor de la propiedad launchTime.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLaunchTime() {
        return launchTime;
    }

    /**
     * Define el valor de la propiedad launchTime.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLaunchTime(String value) {
        this.launchTime = value;
    }

    /**
     * Obtiene el valor de la propiedad placement.
     * 
     * @return
     *     possible object is
     *     {@link InstancesSetItem.Placement }
     *     
     */
    public InstancesSetItem.Placement getPlacement() {
        return placement;
    }

    /**
     * Define el valor de la propiedad placement.
     * 
     * @param value
     *     allowed object is
     *     {@link InstancesSetItem.Placement }
     *     
     */
    public void setPlacement(InstancesSetItem.Placement value) {
        this.placement = value;
    }

    /**
     * Obtiene el valor de la propiedad kernelId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKernelId() {
        return kernelId;
    }

    /**
     * Define el valor de la propiedad kernelId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKernelId(String value) {
        this.kernelId = value;
    }

    /**
     * Obtiene el valor de la propiedad ramdiskId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRamdiskId() {
        return ramdiskId;
    }

    /**
     * Define el valor de la propiedad ramdiskId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRamdiskId(String value) {
        this.ramdiskId = value;
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
     *         &lt;element name="availabilityZone" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
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
        "availabilityZone"
    })
    public static class Placement {

        @XmlElement(required = true)
        protected Object availabilityZone;

        /**
         * Obtiene el valor de la propiedad availabilityZone.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getAvailabilityZone() {
            return availabilityZone;
        }

        /**
         * Define el valor de la propiedad availabilityZone.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setAvailabilityZone(Object value) {
            this.availabilityZone = value;
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
     *         &lt;element name="item" type="{http://ec2.amazonaws.com/doc/2007-01-19/}productCodesSetItem" maxOccurs="unbounded" minOccurs="0"/>
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
    public static class ProductCodesSet {

        protected List<ProductCodesSetItem> item;

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
         * {@link ProductCodesSetItem }
         * 
         * 
         */
        public List<ProductCodesSetItem> getItem() {
            if (item == null) {
                item = new ArrayList<ProductCodesSetItem>();
            }
            return this.item;
        }

    }

}
