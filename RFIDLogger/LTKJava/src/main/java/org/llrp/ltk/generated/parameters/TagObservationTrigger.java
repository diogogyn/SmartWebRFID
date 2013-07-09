/*
 *
 * This file was generated by LLRP Code Generator
 * see http://llrp-toolkit.cvs.sourceforge.net/llrp-toolkit/
 * for more information
 * Generated on: Wed Jun 26 17:35:18 PDT 2013;
 *
 */

/*
 * Copyright 2007 ETH Zurich
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 *
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions
 * and limitations under the License.
 *
 */
package org.llrp.ltk.generated.parameters;

import org.apache.log4j.Logger;

import org.jdom.Content;
import org.jdom.Document;
import org.jdom.Element;
import org.jdom.Namespace;

import org.llrp.ltk.exceptions.InvalidLLRPMessageException;
import org.llrp.ltk.exceptions.MissingParameterException;
import org.llrp.ltk.generated.LLRPConstants;
import org.llrp.ltk.generated.enumerations.TagObservationTriggerType;
import org.llrp.ltk.types.BitList;
import org.llrp.ltk.types.LLRPBitList;
import org.llrp.ltk.types.LLRPMessage;
import org.llrp.ltk.types.SignedShort;
import org.llrp.ltk.types.TLVParameter;
import org.llrp.ltk.types.TVParameter;
import org.llrp.ltk.types.UnsignedInteger;
import org.llrp.ltk.types.UnsignedShort;

import java.util.LinkedList;
import java.util.List;


/**
 * Describes the boundary (stop) condition that is based on tag observations.

See also {@link <a href="http://www.epcglobalinc.org/standards/llrp/llrp_1_0_1-standard-20070813.pdf#page=58&view=fit">LLRP Specification Section 10.2.2.1.1</a>}
 and {@link <a href="http://www.epcglobalinc.org/standards/llrp/llrp_1_0_1-standard-20070813.pdf#page=137&view=fit">LLRP Specification Section 16.2.4.2.1.1</a>}


 */

/**
 * Describes the boundary (stop) condition that is based on tag observations.

See also {@link <a href="http://www.epcglobalinc.org/standards/llrp/llrp_1_0_1-standard-20070813.pdf#page=58&view=fit">LLRP Specification Section 10.2.2.1.1</a>}
 and {@link <a href="http://www.epcglobalinc.org/standards/llrp/llrp_1_0_1-standard-20070813.pdf#page=137&view=fit">LLRP Specification Section 16.2.4.2.1.1</a>}

      .
 */
public class TagObservationTrigger extends TLVParameter {
    public static final SignedShort TYPENUM = new SignedShort(185);
    private static final Logger LOGGER = Logger.getLogger(TagObservationTrigger.class);
    protected TagObservationTriggerType triggerType;
    protected BitList reserved0 = new BitList(8);
    protected UnsignedShort numberOfTags;
    protected UnsignedShort numberOfAttempts;
    protected UnsignedShort t;
    protected UnsignedInteger timeout;

    /**
     * empty constructor to create new parameter.
     */
    public TagObservationTrigger() {
    }

    /**
     * Constructor to create parameter from binary encoded parameter
     * calls decodeBinary to decode parameter.
     * @param list to be decoded
     */
    public TagObservationTrigger(LLRPBitList list) {
        decodeBinary(list);
    }

    /**
    * Constructor to create parameter from xml encoded parameter
    * calls decodeXML to decode parameter.
    * @param element to be decoded
    */
    public TagObservationTrigger(Element element)
        throws InvalidLLRPMessageException {
        decodeXML(element);
    }

    /**
    * {@inheritDoc}
    */
    public LLRPBitList encodeBinarySpecific() {
        LLRPBitList resultBits = new LLRPBitList();

        if (triggerType == null) {
            LOGGER.warn(" triggerType not set");
            throw new MissingParameterException(
                " triggerType not set  for Parameter of Type TagObservationTrigger");
        }

        resultBits.append(triggerType.encodeBinary());
        resultBits.append(reserved0.encodeBinary());

        if (numberOfTags == null) {
            LOGGER.warn(" numberOfTags not set");
            throw new MissingParameterException(
                " numberOfTags not set  for Parameter of Type TagObservationTrigger");
        }

        resultBits.append(numberOfTags.encodeBinary());

        if (numberOfAttempts == null) {
            LOGGER.warn(" numberOfAttempts not set");
            throw new MissingParameterException(
                " numberOfAttempts not set  for Parameter of Type TagObservationTrigger");
        }

        resultBits.append(numberOfAttempts.encodeBinary());

        if (t == null) {
            LOGGER.warn(" t not set");
            throw new MissingParameterException(
                " t not set  for Parameter of Type TagObservationTrigger");
        }

        resultBits.append(t.encodeBinary());

        if (timeout == null) {
            LOGGER.warn(" timeout not set");
            throw new MissingParameterException(
                " timeout not set  for Parameter of Type TagObservationTrigger");
        }

        resultBits.append(timeout.encodeBinary());

        return resultBits;
    }

    /**
    * {@inheritDoc}
    */
    public Content encodeXML(String name, Namespace ns) {
        // element in namespace defined by parent element
        Element element = new Element(name, ns);
        // child element are always in default LLRP namespace
        ns = Namespace.getNamespace("llrp", LLRPConstants.LLRPNAMESPACE);

        if (triggerType == null) {
            LOGGER.warn(" triggerType not set");
            throw new MissingParameterException(" triggerType not set");
        } else {
            element.addContent(triggerType.encodeXML("TriggerType", ns));
        }

        //element.addContent(reserved0.encodeXML("reserved",ns));
        if (numberOfTags == null) {
            LOGGER.warn(" numberOfTags not set");
            throw new MissingParameterException(" numberOfTags not set");
        } else {
            element.addContent(numberOfTags.encodeXML("NumberOfTags", ns));
        }

        if (numberOfAttempts == null) {
            LOGGER.warn(" numberOfAttempts not set");
            throw new MissingParameterException(" numberOfAttempts not set");
        } else {
            element.addContent(numberOfAttempts.encodeXML("NumberOfAttempts", ns));
        }

        if (t == null) {
            LOGGER.warn(" t not set");
            throw new MissingParameterException(" t not set");
        } else {
            element.addContent(t.encodeXML("T", ns));
        }

        if (timeout == null) {
            LOGGER.warn(" timeout not set");
            throw new MissingParameterException(" timeout not set");
        } else {
            element.addContent(timeout.encodeXML("Timeout", ns));
        }

        //parameters
        return element;
    }

    /**
    * {@inheritDoc}
    */
    protected void decodeBinarySpecific(LLRPBitList binary) {
        int position = 0;
        int tempByteLength;
        int tempLength = 0;
        int count;
        SignedShort type;
        int fieldCount;
        Custom custom;
        triggerType = new TagObservationTriggerType(binary.subList(position,
                    TagObservationTriggerType.length()));
        position += TagObservationTriggerType.length();
        position += reserved0.length();
        numberOfTags = new UnsignedShort(binary.subList(position,
                    UnsignedShort.length()));
        position += UnsignedShort.length();
        numberOfAttempts = new UnsignedShort(binary.subList(position,
                    UnsignedShort.length()));
        position += UnsignedShort.length();
        t = new UnsignedShort(binary.subList(position, UnsignedShort.length()));
        position += UnsignedShort.length();
        timeout = new UnsignedInteger(binary.subList(position,
                    UnsignedInteger.length()));
        position += UnsignedInteger.length();
    }

    /**
    * {@inheritDoc}
    */
    public void decodeXML(Element element) throws InvalidLLRPMessageException {
        List<Element> tempList = null;
        boolean atLeastOnce = false;
        Custom custom;

        Element temp = null;

        // child element are always in default LLRP namespace
        Namespace ns = Namespace.getNamespace(LLRPConstants.LLRPNAMESPACE);

        temp = element.getChild("TriggerType", ns);

        if (temp != null) {
            triggerType = new TagObservationTriggerType(temp);
        }

        element.removeChild("TriggerType", ns);
        temp = element.getChild("NumberOfTags", ns);

        if (temp != null) {
            numberOfTags = new UnsignedShort(temp);
        }

        element.removeChild("NumberOfTags", ns);
        temp = element.getChild("NumberOfAttempts", ns);

        if (temp != null) {
            numberOfAttempts = new UnsignedShort(temp);
        }

        element.removeChild("NumberOfAttempts", ns);
        temp = element.getChild("T", ns);

        if (temp != null) {
            t = new UnsignedShort(temp);
        }

        element.removeChild("T", ns);
        temp = element.getChild("Timeout", ns);

        if (temp != null) {
            timeout = new UnsignedInteger(temp);
        }

        element.removeChild("Timeout", ns);

        if (element.getChildren().size() > 0) {
            String message = "TagObservationTrigger has unknown element " +
                ((Element) element.getChildren().get(0)).getName();
            throw new InvalidLLRPMessageException(message);
        }
    }

    //setters
    /**
    * set triggerType of type TagObservationTriggerType .
    * @param  triggerType to be set
    */
    public void setTriggerType(final TagObservationTriggerType triggerType) {
        this.triggerType = triggerType;
    }

    /**
    * set   numberOfTags of type UnsignedShort .
    * @param   numberOfTags to be set
    */
    public void setNumberOfTags(final UnsignedShort numberOfTags) {
        this.numberOfTags = numberOfTags;
    }

    /**
    * set   numberOfAttempts of type UnsignedShort .
    * @param   numberOfAttempts to be set
    */
    public void setNumberOfAttempts(final UnsignedShort numberOfAttempts) {
        this.numberOfAttempts = numberOfAttempts;
    }

    /**
    * set   t of type UnsignedShort .
    * @param   t to be set
    */
    public void setT(final UnsignedShort t) {
        this.t = t;
    }

    /**
    * set   timeout of type UnsignedInteger .
    * @param   timeout to be set
    */
    public void setTimeout(final UnsignedInteger timeout) {
        this.timeout = timeout;
    }

    // end setter

    //getters
    /**
    * get triggerType of type TagObservationTriggerType.
    * @return  TagObservationTriggerType
    */
    public TagObservationTriggerType getTriggerType() {
        return triggerType;
    }

    /**
    * get   numberOfTags of type UnsignedShort.
    * @return   type UnsignedShort to be set
    */
    public UnsignedShort getNumberOfTags() {
        return this.numberOfTags;
    }

    /**
    * get   numberOfAttempts of type UnsignedShort.
    * @return   type UnsignedShort to be set
    */
    public UnsignedShort getNumberOfAttempts() {
        return this.numberOfAttempts;
    }

    /**
    * get   t of type UnsignedShort.
    * @return   type UnsignedShort to be set
    */
    public UnsignedShort getT() {
        return this.t;
    }

    /**
    * get   timeout of type UnsignedInteger.
    * @return   type UnsignedInteger to be set
    */
    public UnsignedInteger getTimeout() {
        return this.timeout;
    }

    // end getters

    //add methods

    // end add

    /**
    * For TLV Parameter length can not be determined at compile time. This method therefore always returns 0.
    * @return Integer always zero
    */
    public static Integer length() {
        return 0;
    }

    /**
    * {@inheritDoc}
    */
    public SignedShort getTypeNum() {
        return TYPENUM;
    }

    /**
    * {@inheritDoc}
    */
    public String getName() {
        return "TagObservationTrigger";
    }

    /**
    * return string representation. All field values but no parameters are included
    * @return String
    */
    public String toString() {
        String result = "TagObservationTrigger: ";
        result += ", triggerType: ";
        result += triggerType;

        result += ", numberOfTags: ";
        result += numberOfTags;
        result += ", numberOfAttempts: ";
        result += numberOfAttempts;
        result += ", t: ";
        result += t;
        result += ", timeout: ";
        result += timeout;
        result = result.replaceFirst(", ", "");

        return result;
    }
}
