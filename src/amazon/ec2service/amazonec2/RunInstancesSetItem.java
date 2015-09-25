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
 * <p>Clase Java para runInstancesSetItem complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="runInstancesSetItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="imageId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="minCount" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="maxCount" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *         &lt;element name="keyName" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
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
 *         &lt;element name="kernelId" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *         &lt;element name="ramDiskId" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *         &lt;element name="blockDeviceMapping">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="item" type="{http://ec2.amazonaws.com/doc/2007-01-19/}blockDeviceMappingItem" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "runInstancesSetItem", propOrder = {
    "imageId",
    "minCount",
    "maxCount",
    "keyName",
    "placement",
    "kernelId",
    "ramDiskId",
    "blockDeviceMapping"
})
public class RunInstancesSetItem {

    @XmlElement(required = true)
    protected String imageId;
    @XmlElement(required = true)
    protected String minCount;
    @XmlElement(required = true)
    protected Object maxCount;
    @XmlElement(required = true)
    protected Object keyName;
    @XmlElement(required = true)
    protected RunInstancesSetItem.Placement placement;
    @XmlElement(required = true)
    protected Object kernelId;
    @XmlElement(required = true)
    protected Object ramDiskId;
    @XmlElement(required = true)
    protected RunInstancesSetItem.BlockDeviceMapping blockDeviceMapping;

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
     * Obtiene el valor de la propiedad minCount.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMinCount() {
        return minCount;
    }

    /**
     * Define el valor de la propiedad minCount.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMinCount(String value) {
        this.minCount = value;
    }

    /**
     * Obtiene el valor de la propiedad maxCount.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getMaxCount() {
        return maxCount;
    }

    /**
     * Define el valor de la propiedad maxCount.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setMaxCount(Object value) {
        this.maxCount = value;
    }

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
     * Obtiene el valor de la propiedad placement.
     * 
     * @return
     *     possible object is
     *     {@link RunInstancesSetItem.Placement }
     *     
     */
    public RunInstancesSetItem.Placement getPlacement() {
        return placement;
    }

    /**
     * Define el valor de la propiedad placement.
     * 
     * @param value
     *     allowed object is
     *     {@link RunInstancesSetItem.Placement }
     *     
     */
    public void setPlacement(RunInstancesSetItem.Placement value) {
        this.placement = value;
    }

    /**
     * Obtiene el valor de la propiedad kernelId.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getKernelId() {
        return kernelId;
    }

    /**
     * Define el valor de la propiedad kernelId.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setKernelId(Object value) {
        this.kernelId = value;
    }

    /**
     * Obtiene el valor de la propiedad ramDiskId.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getRamDiskId() {
        return ramDiskId;
    }

    /**
     * Define el valor de la propiedad ramDiskId.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setRamDiskId(Object value) {
        this.ramDiskId = value;
    }

    /**
     * Obtiene el valor de la propiedad blockDeviceMapping.
     * 
     * @return
     *     possible object is
     *     {@link RunInstancesSetItem.BlockDeviceMapping }
     *     
     */
    public RunInstancesSetItem.BlockDeviceMapping getBlockDeviceMapping() {
        return blockDeviceMapping;
    }

    /**
     * Define el valor de la propiedad blockDeviceMapping.
     * 
     * @param value
     *     allowed object is
     *     {@link RunInstancesSetItem.BlockDeviceMapping }
     *     
     */
    public void setBlockDeviceMapping(RunInstancesSetItem.BlockDeviceMapping value) {
        this.blockDeviceMapping = value;
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
     *         &lt;element name="item" type="{http://ec2.amazonaws.com/doc/2007-01-19/}blockDeviceMappingItem" maxOccurs="unbounded" minOccurs="0"/>
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
    public static class BlockDeviceMapping {

        protected List<BlockDeviceMappingItem> item;

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
         * {@link BlockDeviceMappingItem }
         * 
         * 
         */
        public List<BlockDeviceMappingItem> getItem() {
            if (item == null) {
                item = new ArrayList<BlockDeviceMappingItem>();
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

}
