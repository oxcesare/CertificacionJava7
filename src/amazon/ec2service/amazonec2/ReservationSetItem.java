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
 * <p>Clase Java para reservationSetItem complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="reservationSetItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="reservationId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ownerId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="groupSet">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="item" type="{http://ec2.amazonaws.com/doc/2007-01-19/}groupSetItem" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="instancesSet">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="item" type="{http://ec2.amazonaws.com/doc/2007-01-19/}instancesSetItem" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "reservationSetItem", propOrder = {
    "reservationId",
    "ownerId",
    "groupSet",
    "instancesSet"
})
public class ReservationSetItem {

    @XmlElement(required = true)
    protected String reservationId;
    @XmlElement(required = true)
    protected String ownerId;
    @XmlElement(required = true)
    protected ReservationSetItem.GroupSet groupSet;
    @XmlElement(required = true)
    protected ReservationSetItem.InstancesSet instancesSet;

    /**
     * Obtiene el valor de la propiedad reservationId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReservationId() {
        return reservationId;
    }

    /**
     * Define el valor de la propiedad reservationId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReservationId(String value) {
        this.reservationId = value;
    }

    /**
     * Obtiene el valor de la propiedad ownerId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwnerId() {
        return ownerId;
    }

    /**
     * Define el valor de la propiedad ownerId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwnerId(String value) {
        this.ownerId = value;
    }

    /**
     * Obtiene el valor de la propiedad groupSet.
     * 
     * @return
     *     possible object is
     *     {@link ReservationSetItem.GroupSet }
     *     
     */
    public ReservationSetItem.GroupSet getGroupSet() {
        return groupSet;
    }

    /**
     * Define el valor de la propiedad groupSet.
     * 
     * @param value
     *     allowed object is
     *     {@link ReservationSetItem.GroupSet }
     *     
     */
    public void setGroupSet(ReservationSetItem.GroupSet value) {
        this.groupSet = value;
    }

    /**
     * Obtiene el valor de la propiedad instancesSet.
     * 
     * @return
     *     possible object is
     *     {@link ReservationSetItem.InstancesSet }
     *     
     */
    public ReservationSetItem.InstancesSet getInstancesSet() {
        return instancesSet;
    }

    /**
     * Define el valor de la propiedad instancesSet.
     * 
     * @param value
     *     allowed object is
     *     {@link ReservationSetItem.InstancesSet }
     *     
     */
    public void setInstancesSet(ReservationSetItem.InstancesSet value) {
        this.instancesSet = value;
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
     *         &lt;element name="item" type="{http://ec2.amazonaws.com/doc/2007-01-19/}groupSetItem" maxOccurs="unbounded" minOccurs="0"/>
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
    public static class GroupSet {

        protected List<GroupSetItem> item;

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
         * {@link GroupSetItem }
         * 
         * 
         */
        public List<GroupSetItem> getItem() {
            if (item == null) {
                item = new ArrayList<GroupSetItem>();
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
     *         &lt;element name="item" type="{http://ec2.amazonaws.com/doc/2007-01-19/}instancesSetItem" maxOccurs="unbounded" minOccurs="0"/>
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

        protected List<InstancesSetItem> item;

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
         * {@link InstancesSetItem }
         * 
         * 
         */
        public List<InstancesSetItem> getItem() {
            if (item == null) {
                item = new ArrayList<InstancesSetItem>();
            }
            return this.item;
        }

    }

}
