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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for parameterDefinition complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="parameterDefinition">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="annotation" type="{http://www.llrp.org/ltk/schema/core/encoding/binary/1.0}annotation" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;choice maxOccurs="unbounded" minOccurs="0">
 *           &lt;element name="field" type="{http://www.llrp.org/ltk/schema/core/encoding/binary/1.0}fieldDefinition"/>
 *           &lt;element name="reserved" type="{http://www.llrp.org/ltk/schema/core/encoding/binary/1.0}reservedDefinition"/>
 *         &lt;/choice>
 *         &lt;choice maxOccurs="unbounded" minOccurs="0">
 *           &lt;element name="parameter" type="{http://www.llrp.org/ltk/schema/core/encoding/binary/1.0}parameterReference"/>
 *           &lt;element name="choice" type="{http://www.llrp.org/ltk/schema/core/encoding/binary/1.0}choiceReference"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *       &lt;attribute name="name" use="required" type="{http://www.llrp.org/ltk/schema/core/encoding/binary/1.0}name" />
 *       &lt;attribute name="typeNum" use="required" type="{http://www.llrp.org/ltk/schema/core/encoding/binary/1.0}typeNum" />
 *       &lt;attribute name="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "parameterDefinition", propOrder = {
    "annotation",
    "fieldOrReserved",
    "parameterOrChoice"
})
public class ParameterDefinition {

    protected List<Annotation> annotation;
    @XmlElements({
        @XmlElement(name = "field", type = FieldDefinition.class),
        @XmlElement(name = "reserved", type = ReservedDefinition.class)
    })
    protected List<Object> fieldOrReserved;
    @XmlElements({
        @XmlElement(name = "choice", type = ChoiceReference.class),
        @XmlElement(name = "parameter", type = ParameterReference.class)
    })
    protected List<Object> parameterOrChoice;
    @XmlAttribute(required = true)
    protected String name;
    @XmlAttribute(required = true)
    protected int typeNum;
    @XmlAttribute
    protected Boolean required;

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
     * Gets the value of the fieldOrReserved property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fieldOrReserved property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFieldOrReserved().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FieldDefinition }
     * {@link ReservedDefinition }
     * 
     * 
     */
    public List<Object> getFieldOrReserved() {
        if (fieldOrReserved == null) {
            fieldOrReserved = new ArrayList<Object>();
        }
        return this.fieldOrReserved;
    }

    /**
     * Gets the value of the parameterOrChoice property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the parameterOrChoice property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParameterOrChoice().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ChoiceReference }
     * {@link ParameterReference }
     * 
     * 
     */
    public List<Object> getParameterOrChoice() {
        if (parameterOrChoice == null) {
            parameterOrChoice = new ArrayList<Object>();
        }
        return this.parameterOrChoice;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the typeNum property.
     * 
     */
    public int getTypeNum() {
        return typeNum;
    }

    /**
     * Sets the value of the typeNum property.
     * 
     */
    public void setTypeNum(int value) {
        this.typeNum = value;
    }

    /**
     * Gets the value of the required property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRequired() {
        return required;
    }

    /**
     * Sets the value of the required property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRequired(Boolean value) {
        this.required = value;
    }

}
