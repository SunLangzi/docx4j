//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.1.5-b01-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2007.12.19 at 05:17:01 PM GMT+10:00 
//


package org.docx4j.jaxb.document;

import javax.xml.bind.Unmarshaller;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;
import org.jvnet.jaxb2_commons.ppp.Child;


/**
 * <p>Java class for CT_TblPrBase complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CT_TblPrBase">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://schemas.openxmlformats.org/wordprocessingml/2006/main}tblW" minOccurs="0"/>
 *         &lt;element ref="{http://schemas.openxmlformats.org/wordprocessingml/2006/main}tblBorders" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CT_TblPrBase", propOrder = {
    "tblW",
    "tblBorders"
})
@XmlSeeAlso({
    TblPr.class
})
public class TblPrBase
    implements Child
{

    protected TblW tblW;
    protected TblBorders tblBorders;
    @XmlTransient
    private Object parent;

    /**
     * Gets the value of the tblW property.
     * 
     * @return
     *     possible object is
     *     {@link TblW }
     *     
     */
    public TblW getTblW() {
        return tblW;
    }

    /**
     * Sets the value of the tblW property.
     * 
     * @param value
     *     allowed object is
     *     {@link TblW }
     *     
     */
    public void setTblW(TblW value) {
        this.tblW = value;
    }

    /**
     * Gets the value of the tblBorders property.
     * 
     * @return
     *     possible object is
     *     {@link TblBorders }
     *     
     */
    public TblBorders getTblBorders() {
        return tblBorders;
    }

    /**
     * Sets the value of the tblBorders property.
     * 
     * @param value
     *     allowed object is
     *     {@link TblBorders }
     *     
     */
    public void setTblBorders(TblBorders value) {
        this.tblBorders = value;
    }

    /**
     * Gets the parent object in the object tree representing the unmarshalled xml document.
     * 
     * @return
     *     The parent object.
     */
    public Object getParent() {
        return this.parent;
    }

    public void setParent(Object parent) {
        this.parent = parent;
    }

    /**
     * This method is invoked by the JAXB implementation on each instance when unmarshalling completes.
     * 
     * @param parent
     *     The parent object in the object tree.
     * @param unmarshaller
     *     The unmarshaller that generated the instance.
     */
    public void afterUnmarshal(Unmarshaller unmarshaller, Object parent) {
        setParent(parent);
    }

}
