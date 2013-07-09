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
import org.llrp.ltk.generated.enumerations.RFSurveySpecStopTriggerType;
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
 * This parameter defines the stop trigger for RF Survey operations.

See also {@link <a href="http://www.epcglobalinc.org/standards/llrp/llrp_1_0_1-standard-20070813.pdf#page=60&view=fit">LLRP Specification Section 10.2.3.1</a>}
 and {@link <a href="http://www.epcglobalinc.org/standards/llrp/llrp_1_0_1-standard-20070813.pdf#page=138&view=fit">LLRP Specification Section 16.2.4.3.1</a>}


 */

/**
 * This parameter defines the stop trigger for RF Survey operations.

See also {@link <a href="http://www.epcglobalinc.org/standards/llrp/llrp_1_0_1-standard-20070813.pdf#page=60&view=fit">LLRP Specification Section 10.2.3.1</a>}
 and {@link <a href="http://www.epcglobalinc.org/standards/llrp/llrp_1_0_1-standard-20070813.pdf#page=138&view=fit">LLRP Specification Section 16.2.4.3.1</a>}

      .
 */
public class RFSurveySpecStopTrigger extends TLVParameter {
    public static final SignedShort TYPENUM = new SignedShort(188);
    private static final Logger LOGGER = Logger.getLogger(RFSurveySpecStopTrigger.class);
    protected RFSurveySpecStopTriggerType stopTriggerType;
    protected UnsignedInteger durationPeriod;
    protected UnsignedInteger n;

    /**
     * empty constructor to create new parameter.
     */
    public RFSurveySpecStopTrigger() {
    }

    /**
     * Constructor to create parameter from binary encoded parameter
     * calls decodeBinary to decode parameter.
     * @param list to be decoded
     */
    public RFSurveySpecStopTrigger(LLRPBitList list) {
        decodeBinary(list);
    }

    /**
    * Constructor to create parameter from xml encoded parameter
    * calls decodeXML to decode parameter.
    * @param element to be decoded
    */
    public RFSurveySpecStopTrigger(Element element)
        throws InvalidLLRPMessageException {
        decodeXML(element);
    }

    /**
    * {@inheritDoc}
    */
    public LLRPBitList encodeBinarySpecific() {
        LLRPBitList resultBits = new LLRPBitList();

        if (stopTriggerType == null) {
            LOGGER.warn(" stopTriggerType not set");
            throw new MissingParameterException(
                " stopTriggerType not set  for Parameter of Type RFSurveySpecStopTrigger");
        }

        resultBits.append(stopTriggerType.encodeBinary());

        if (durationPeriod == null) {
            LOGGER.warn(" durationPeriod not set");
            throw new MissingParameterException(
                " durationPeriod not set  for Parameter of Type RFSurveySpecStopTrigger");
        }

        resultBits.append(durationPeriod.encodeBinary());

        if (n == null) {
            LOGGER.warn(" n not set");
            throw new MissingParameterException(
                " n not set  for Parameter of Type RFSurveySpecStopTrigger");
        }

        resultBits.append(n.encodeBinary());

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

        if (stopTriggerType == null) {
            LOGGER.warn(" stopTriggerType not set");
            throw new MissingParameterException(" stopTriggerType not set");
        } else {
            element.addContent(stopTriggerType.encodeXML("StopTriggerType", ns));
        }

        if (durationPeriod == null) {
            LOGGER.warn(" durationPeriod not set");
            throw new MissingParameterException(" durationPeriod not set");
        } else {
            element.addContent(durationPeriod.encodeXML("DurationPeriod", ns));
        }

        if (n == null) {
            LOGGER.warn(" n not set");
            throw new MissingParameterException(" n not set");
        } else {
            element.addContent(n.encodeXML("N", ns));
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
        stopTriggerType = new RFSurveySpecStopTriggerType(binary.subList(
                    position, RFSurveySpecStopTriggerType.length()));
        position += RFSurveySpecStopTriggerType.length();
        durationPeriod = new UnsignedInteger(binary.subList(position,
                    UnsignedInteger.length()));
        position += UnsignedInteger.length();
        n = new UnsignedInteger(binary.subList(position,
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

        temp = element.getChild("StopTriggerType", ns);

        if (temp != null) {
            stopTriggerType = new RFSurveySpecStopTriggerType(temp);
        }

        element.removeChild("StopTriggerType", ns);
        temp = element.getChild("DurationPeriod", ns);

        if (temp != null) {
            durationPeriod = new UnsignedInteger(temp);
        }

        element.removeChild("DurationPeriod", ns);
        temp = element.getChild("N", ns);

        if (temp != null) {
            n = new UnsignedInteger(temp);
        }

        element.removeChild("N", ns);

        if (element.getChildren().size() > 0) {
            String message = "RFSurveySpecStopTrigger has unknown element " +
                ((Element) element.getChildren().get(0)).getName();
            throw new InvalidLLRPMessageException(message);
        }
    }

    //setters
    /**
    * set stopTriggerType of type RFSurveySpecStopTriggerType .
    * @param  stopTriggerType to be set
    */
    public void setStopTriggerType(
        final RFSurveySpecStopTriggerType stopTriggerType) {
        this.stopTriggerType = stopTriggerType;
    }

    /**
    * set   durationPeriod of type UnsignedInteger .
    * @param   durationPeriod to be set
    */
    public void setDurationPeriod(final UnsignedInteger durationPeriod) {
        this.durationPeriod = durationPeriod;
    }

    /**
    * set   n of type UnsignedInteger .
    * @param   n to be set
    */
    public void setN(final UnsignedInteger n) {
        this.n = n;
    }

    // end setter

    //getters
    /**
    * get stopTriggerType of type RFSurveySpecStopTriggerType.
    * @return  RFSurveySpecStopTriggerType
    */
    public RFSurveySpecStopTriggerType getStopTriggerType() {
        return stopTriggerType;
    }

    /**
    * get   durationPeriod of type UnsignedInteger.
    * @return   type UnsignedInteger to be set
    */
    public UnsignedInteger getDurationPeriod() {
        return this.durationPeriod;
    }

    /**
    * get   n of type UnsignedInteger.
    * @return   type UnsignedInteger to be set
    */
    public UnsignedInteger getN() {
        return this.n;
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
        return "RFSurveySpecStopTrigger";
    }

    /**
    * return string representation. All field values but no parameters are included
    * @return String
    */
    public String toString() {
        String result = "RFSurveySpecStopTrigger: ";
        result += ", stopTriggerType: ";
        result += stopTriggerType;
        result += ", durationPeriod: ";
        result += durationPeriod;
        result += ", n: ";
        result += n;
        result = result.replaceFirst(", ", "");

        return result;
    }
}
