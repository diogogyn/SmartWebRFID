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
import org.llrp.ltk.types.LLRPBitList;
import org.llrp.ltk.types.LLRPMessage;
import org.llrp.ltk.types.SignedShort;
import org.llrp.ltk.types.TLVParameter;
import org.llrp.ltk.types.TVParameter;
import org.llrp.ltk.types.UnsignedShort;

import java.util.LinkedList;
import java.util.List;


/**
 * For a particular antenna, this parameter specifies the Reader's valid index range in the Receive Sensitivity Table.  A Reader should report this parameter if the Reader allows control of receive sensitivity (i.e., the Reader reports a Receive Sensitivity Table with more than one entry) and the Reader supports multiple antennas where the antennas can have different receive sensitivity values.If this parameter is omitted, then the Client SHALL assume that for all of the Reader's antennas the index range is the same as in the Receive Sensitivity Table.

See also {@link <a href="http://www.epcglobalinc.org/standards/llrp/llrp_1_0_1-standard-20070813.pdf#page=46&view=fit">LLRP Specification Section 9.2.1.2</a>}
 and {@link <a href="http://www.epcglobalinc.org/standards/llrp/llrp_1_0_1-standard-20070813.pdf#page=132&view=fit">LLRP Specification Section 16.2.3.1.2</a>}


 */

/**
 * For a particular antenna, this parameter specifies the Reader's valid index range in the Receive Sensitivity Table.  A Reader should report this parameter if the Reader allows control of receive sensitivity (i.e., the Reader reports a Receive Sensitivity Table with more than one entry) and the Reader supports multiple antennas where the antennas can have different receive sensitivity values.If this parameter is omitted, then the Client SHALL assume that for all of the Reader's antennas the index range is the same as in the Receive Sensitivity Table.

See also {@link <a href="http://www.epcglobalinc.org/standards/llrp/llrp_1_0_1-standard-20070813.pdf#page=46&view=fit">LLRP Specification Section 9.2.1.2</a>}
 and {@link <a href="http://www.epcglobalinc.org/standards/llrp/llrp_1_0_1-standard-20070813.pdf#page=132&view=fit">LLRP Specification Section 16.2.3.1.2</a>}

      .
 */
public class PerAntennaReceiveSensitivityRange extends TLVParameter {
    public static final SignedShort TYPENUM = new SignedShort(149);
    private static final Logger LOGGER = Logger.getLogger(PerAntennaReceiveSensitivityRange.class);
    protected UnsignedShort antennaID;
    protected UnsignedShort receiveSensitivityIndexMin;
    protected UnsignedShort receiveSensitivityIndexMax;

    /**
     * empty constructor to create new parameter.
     */
    public PerAntennaReceiveSensitivityRange() {
    }

    /**
     * Constructor to create parameter from binary encoded parameter
     * calls decodeBinary to decode parameter.
     * @param list to be decoded
     */
    public PerAntennaReceiveSensitivityRange(LLRPBitList list) {
        decodeBinary(list);
    }

    /**
    * Constructor to create parameter from xml encoded parameter
    * calls decodeXML to decode parameter.
    * @param element to be decoded
    */
    public PerAntennaReceiveSensitivityRange(Element element)
        throws InvalidLLRPMessageException {
        decodeXML(element);
    }

    /**
    * {@inheritDoc}
    */
    public LLRPBitList encodeBinarySpecific() {
        LLRPBitList resultBits = new LLRPBitList();

        if (antennaID == null) {
            LOGGER.warn(" antennaID not set");
            throw new MissingParameterException(
                " antennaID not set  for Parameter of Type PerAntennaReceiveSensitivityRange");
        }

        resultBits.append(antennaID.encodeBinary());

        if (receiveSensitivityIndexMin == null) {
            LOGGER.warn(" receiveSensitivityIndexMin not set");
            throw new MissingParameterException(
                " receiveSensitivityIndexMin not set  for Parameter of Type PerAntennaReceiveSensitivityRange");
        }

        resultBits.append(receiveSensitivityIndexMin.encodeBinary());

        if (receiveSensitivityIndexMax == null) {
            LOGGER.warn(" receiveSensitivityIndexMax not set");
            throw new MissingParameterException(
                " receiveSensitivityIndexMax not set  for Parameter of Type PerAntennaReceiveSensitivityRange");
        }

        resultBits.append(receiveSensitivityIndexMax.encodeBinary());

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

        if (antennaID == null) {
            LOGGER.warn(" antennaID not set");
            throw new MissingParameterException(" antennaID not set");
        } else {
            element.addContent(antennaID.encodeXML("AntennaID", ns));
        }

        if (receiveSensitivityIndexMin == null) {
            LOGGER.warn(" receiveSensitivityIndexMin not set");
            throw new MissingParameterException(
                " receiveSensitivityIndexMin not set");
        } else {
            element.addContent(receiveSensitivityIndexMin.encodeXML(
                    "ReceiveSensitivityIndexMin", ns));
        }

        if (receiveSensitivityIndexMax == null) {
            LOGGER.warn(" receiveSensitivityIndexMax not set");
            throw new MissingParameterException(
                " receiveSensitivityIndexMax not set");
        } else {
            element.addContent(receiveSensitivityIndexMax.encodeXML(
                    "ReceiveSensitivityIndexMax", ns));
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
        antennaID = new UnsignedShort(binary.subList(position,
                    UnsignedShort.length()));
        position += UnsignedShort.length();
        receiveSensitivityIndexMin = new UnsignedShort(binary.subList(
                    position, UnsignedShort.length()));
        position += UnsignedShort.length();
        receiveSensitivityIndexMax = new UnsignedShort(binary.subList(
                    position, UnsignedShort.length()));
        position += UnsignedShort.length();
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

        temp = element.getChild("AntennaID", ns);

        if (temp != null) {
            antennaID = new UnsignedShort(temp);
        }

        element.removeChild("AntennaID", ns);
        temp = element.getChild("ReceiveSensitivityIndexMin", ns);

        if (temp != null) {
            receiveSensitivityIndexMin = new UnsignedShort(temp);
        }

        element.removeChild("ReceiveSensitivityIndexMin", ns);
        temp = element.getChild("ReceiveSensitivityIndexMax", ns);

        if (temp != null) {
            receiveSensitivityIndexMax = new UnsignedShort(temp);
        }

        element.removeChild("ReceiveSensitivityIndexMax", ns);

        if (element.getChildren().size() > 0) {
            String message = "PerAntennaReceiveSensitivityRange has unknown element " +
                ((Element) element.getChildren().get(0)).getName();
            throw new InvalidLLRPMessageException(message);
        }
    }

    //setters
    /**
    * set   antennaID of type UnsignedShort .
    * @param   antennaID to be set
    */
    public void setAntennaID(final UnsignedShort antennaID) {
        this.antennaID = antennaID;
    }

    /**
    * set   receiveSensitivityIndexMin of type UnsignedShort .
    * @param   receiveSensitivityIndexMin to be set
    */
    public void setReceiveSensitivityIndexMin(
        final UnsignedShort receiveSensitivityIndexMin) {
        this.receiveSensitivityIndexMin = receiveSensitivityIndexMin;
    }

    /**
    * set   receiveSensitivityIndexMax of type UnsignedShort .
    * @param   receiveSensitivityIndexMax to be set
    */
    public void setReceiveSensitivityIndexMax(
        final UnsignedShort receiveSensitivityIndexMax) {
        this.receiveSensitivityIndexMax = receiveSensitivityIndexMax;
    }

    // end setter

    //getters
    /**
    * get   antennaID of type UnsignedShort.
    * @return   type UnsignedShort to be set
    */
    public UnsignedShort getAntennaID() {
        return this.antennaID;
    }

    /**
    * get   receiveSensitivityIndexMin of type UnsignedShort.
    * @return   type UnsignedShort to be set
    */
    public UnsignedShort getReceiveSensitivityIndexMin() {
        return this.receiveSensitivityIndexMin;
    }

    /**
    * get   receiveSensitivityIndexMax of type UnsignedShort.
    * @return   type UnsignedShort to be set
    */
    public UnsignedShort getReceiveSensitivityIndexMax() {
        return this.receiveSensitivityIndexMax;
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
        return "PerAntennaReceiveSensitivityRange";
    }

    /**
    * return string representation. All field values but no parameters are included
    * @return String
    */
    public String toString() {
        String result = "PerAntennaReceiveSensitivityRange: ";
        result += ", antennaID: ";
        result += antennaID;
        result += ", receiveSensitivityIndexMin: ";
        result += receiveSensitivityIndexMin;
        result += ", receiveSensitivityIndexMax: ";
        result += receiveSensitivityIndexMax;
        result = result.replaceFirst(", ", "");

        return result;
    }
}
