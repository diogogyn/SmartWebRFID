//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.1.5-b01-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.06.25 at 04:21:01 PM PDT 
//


package org.llrp.ltkGenerator.generated;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for reservedDefinition complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="reservedDefinition">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="annotation" type="{http://www.llrp.org/ltk/schema/core/encoding/binary/1.0}annotation" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="bitCount" use="required" type="{http://www.llrp.org/ltk/schema/core/encoding/binary/1.0}reservedBitCount" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "reservedDefinition", propOrder = {
    "annotation"
})
public class ReservedDefinition {

    protected List<Annotation> annotation;
    @XmlAttribute(required = true)
    protected int bitCount;

    /**
     * Gets the value of the annotation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the annotation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAnnotation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Annotation }
     * 
     * 
     */
    public List<Annotation> getAnnotation() {
        if (annotation == null) {
            annotation = new ArrayList<Annotation>();
        }
        return this.annotation;
    }

    /**
     * Gets the value of the bitCount property.
     * 
     */
    public int getBitCount() {
        return bitCount;
    }

    /**
     * Sets the value of the bitCount property.
     * 
     */
    public void setBitCount(int value) {
        this.bitCount = value;
    }

}
