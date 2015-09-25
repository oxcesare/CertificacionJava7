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
 * <p>Clase Java para imagesSetItem complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="imagesSetItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="imageId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="imageLocation" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="imageState" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="imageOwnerId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="isPublic" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "imagesSetItem", propOrder = {
    "imageId",
    "imageLocation",
    "imageState",
    "imageOwnerId",
    "isPublic"
})
public class ImagesSetItem {

    @XmlElement(required = true)
    protected String imageId;
    @XmlElement(required = true)
    protected String imageLocation;
    @XmlElement(required = true)
    protected String imageState;
    @XmlElement(required = true)
    protected String imageOwnerId;
    @XmlElement(required = true)
    protected String isPublic;

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
     * Obtiene el valor de la propiedad imageLocation.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImageLocation() {
        return imageLocation;
    }

    /**
     * Define el valor de la propiedad imageLocation.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImageLocation(String value) {
        this.imageLocation = value;
    }

    /**
     * Obtiene el valor de la propiedad imageState.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImageState() {
        return imageState;
    }

    /**
     * Define el valor de la propiedad imageState.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImageState(String value) {
        this.imageState = value;
    }

    /**
     * Obtiene el valor de la propiedad imageOwnerId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImageOwnerId() {
        return imageOwnerId;
    }

    /**
     * Define el valor de la propiedad imageOwnerId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImageOwnerId(String value) {
        this.imageOwnerId = value;
    }

    /**
     * Obtiene el valor de la propiedad isPublic.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsPublic() {
        return isPublic;
    }

    /**
     * Define el valor de la propiedad isPublic.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsPublic(String value) {
        this.isPublic = value;
    }

}
