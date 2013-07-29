/*
 *
 * This file was generated by LLRP Code Generator
 * see http://llrp-toolkit.cvs.sourceforge.net/llrp-toolkit/
 * for more information
 * Generated on: Sat Jul 13 14:03:12 PDT 2013;
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
import org.llrp.ltk.types.LLRPBitList;
import org.llrp.ltk.types.LLRPMessage;
import org.llrp.ltk.types.SignedShort;
import org.llrp.ltk.types.TLVParameter;
import org.llrp.ltk.types.TVParameter;
import org.llrp.ltk.types.UnsignedLong;
import org.llrp.ltk.types.UnsignedShort;

import java.util.LinkedList;
import java.util.List;


/**
 * This parameter carries the LastSeenTimestamp information in UTC.This is the time elapsed since the Epoch (00:00:00 UTC, January 1, 1970) measured in microseconds.

See also {@link <a href="http://www.epcglobalinc.org/standards/llrp/llrp_1_0_1-standard-20070813.pdf#page=84&view=fit">LLRP Specification Section 13.2.3.12</a>}
 and {@link <a href="http://www.epcglobalinc.org/standards/llrp/llrp_1_0_1-standard-20070813.pdf#page=146&view=fit">LLRP Specification Section 16.2.7.3.12</a>}


 */

/**
 * This parameter carries the LastSeenTimestamp information in UTC.This is the time elapsed since the Epoch (00:00:00 UTC, January 1, 1970) measured in microseconds.

See also {@link <a href="http://www.epcglobalinc.org/standards/llrp/llrp_1_0_1-standard-20070813.pdf#page=84&view=fit">LLRP Specification Section 13.2.3.12</a>}
 and {@link <a href="http://www.epcglobalinc.org/standards/llrp/llrp_1_0_1-standard-20070813.pdf#page=146&view=fit">LLRP Specification Section 16.2.7.3.12</a>}

      .
 */
public class LastSeenTimestampUptime extends TVParameter {
    public static final SignedShort TYPENUM = new SignedShort(5);
    private static final Logger LOGGER = Logger.getLogger(LastSeenTimestampUptime.class);
    protected UnsignedLong microseconds;

    /**
     * empty constructor to create new parameter.
     */
    public LastSeenTimestampUptime() {
    }

    /**
     * Constructor to create parameter from binary encoded parameter
     * calls decodeBinary to decode parameter.
     * @param list to be decoded
     */
    public LastSeenTimestampUptime(LLRPBitList list) {
        decodeBinary(list);
    }

    /**
    * Constructor to create parameter from xml encoded parameter
    * calls decodeXML to decode parameter.
    * @param element to be decoded
    */
    public LastSeenTimestampUptime(Element element)
        throws InvalidLLRPMessageException {
        decodeXML(element);
    }

    /**
    * {@inheritDoc}
    */
    public LLRPBitList encodeBinarySpecific() {
        LLRPBitList resultBits = new LLRPBitList();

        if (microseconds == null) {
            LOGGER.warn(" microseconds not set");
            throw new MissingParameterException(
                " microseconds not set  for Parameter of Type LastSeenTimestampUptime");
        }

        resultBits.append(microseconds.encodeBinary());

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

        if (microseconds == null) {
            LOGGER.warn(" microseconds not set");
            throw new MissingParameterException(" microseconds not set");
        } else {
            element.addContent(microseconds.encodeXML("Microseconds", ns));
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
        microseconds = new UnsignedLong(binary.subList(position,
                    UnsignedLong.length()));
        position += UnsignedLong.length();
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

        temp = element.getChild("Microseconds", ns);

        if (temp != null) {
            microseconds = new UnsignedLong(temp);
        }

        element.removeChild("Microseconds", ns);

        if (element.getChildren().size() > 0) {
            String message = "LastSeenTimestampUptime has unknown element " +
                ((Element) element.getChildren().get(0)).getName();
            throw new InvalidLLRPMessageException(message);
        }
    }

    //setters
    /**
    * set   microseconds of type UnsignedLong .
    * @param   microseconds to be set
    */
    public void setMicroseconds(final UnsignedLong microseconds) {
        this.microseconds = microseconds;
    }

    // end setter

    //getters
    /**
    * get   microseconds of type UnsignedLong.
    * @return   type UnsignedLong to be set
    */
    public UnsignedLong getMicroseconds() {
        return this.microseconds;
    }

    // end getters

    //add methods

    // end add

    /**
    * return length of parameter. For TV Parameter it is always length of its field plus 8 bits for type.
    * @return Integer giving length
    */
    public static Integer length() {
        int tempLength = PARAMETERTYPELENGTH;
        // the length of a TV parameter in bits is always the type 
        tempLength += UnsignedLong.length();

        return tempLength;
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
        return "LastSeenTimestampUptime";
    }

    /**
    * return string representation. All field values but no parameters are included
    * @return String
    */
    public String toString() {
        String result = "LastSeenTimestampUptime: ";
        result += ", microseconds: ";
        result += microseconds;
        result = result.replaceFirst(", ", "");

        return result;
    }
}
