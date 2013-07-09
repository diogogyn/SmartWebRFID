/*
 *
 * This file was generated by LLRP Code Generator
 * see http://llrp-toolkit.cvs.sourceforge.net/llrp-toolkit/
 * for more information
 * Generated on: Wed Jun 26 17:35:19 PDT 2013;
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
import org.llrp.ltk.types.BitArray_HEX;
import org.llrp.ltk.types.BitList;
import org.llrp.ltk.types.LLRPBitList;
import org.llrp.ltk.types.LLRPMessage;
import org.llrp.ltk.types.SignedShort;
import org.llrp.ltk.types.TLVParameter;
import org.llrp.ltk.types.TVParameter;
import org.llrp.ltk.types.TwoBitField;
import org.llrp.ltk.types.UnsignedShort;

import java.util.LinkedList;
import java.util.List;


/**
 * See also {@link <a href="http://www.epcglobalinc.org/standards/llrp/llrp_1_0_1-standard-20070813.pdf#page=102&view=fit">LLRP Specification Section 15.2.1.2.1.1.1</a>}
 and {@link <a href="http://www.epcglobalinc.org/standards/llrp/llrp_1_0_1-standard-20070813.pdf#page=154&view=fit">LLRP Specification Section 16.3.1.2.1.1.1</a>}


 */

/**
 * See also {@link <a href="http://www.epcglobalinc.org/standards/llrp/llrp_1_0_1-standard-20070813.pdf#page=102&view=fit">LLRP Specification Section 15.2.1.2.1.1.1</a>}
 and {@link <a href="http://www.epcglobalinc.org/standards/llrp/llrp_1_0_1-standard-20070813.pdf#page=154&view=fit">LLRP Specification Section 16.3.1.2.1.1.1</a>}

      .
 */
public class C1G2TagInventoryMask extends TLVParameter {
    public static final SignedShort TYPENUM = new SignedShort(332);
    private static final Logger LOGGER = Logger.getLogger(C1G2TagInventoryMask.class);
    protected TwoBitField mB;
    protected BitList reserved0 = new BitList(6);
    protected UnsignedShort pointer;
    protected BitArray_HEX tagMask;

    /**
     * empty constructor to create new parameter.
     */
    public C1G2TagInventoryMask() {
    }

    /**
     * Constructor to create parameter from binary encoded parameter
     * calls decodeBinary to decode parameter.
     * @param list to be decoded
     */
    public C1G2TagInventoryMask(LLRPBitList list) {
        decodeBinary(list);
    }

    /**
    * Constructor to create parameter from xml encoded parameter
    * calls decodeXML to decode parameter.
    * @param element to be decoded
    */
    public C1G2TagInventoryMask(Element element)
        throws InvalidLLRPMessageException {
        decodeXML(element);
    }

    /**
    * {@inheritDoc}
    */
    public LLRPBitList encodeBinarySpecific() {
        LLRPBitList resultBits = new LLRPBitList();

        if (mB == null) {
            LOGGER.warn(" mB not set");
            throw new MissingParameterException(
                " mB not set  for Parameter of Type C1G2TagInventoryMask");
        }

        resultBits.append(mB.encodeBinary());
        resultBits.append(reserved0.encodeBinary());

        if (pointer == null) {
            LOGGER.warn(" pointer not set");
            throw new MissingParameterException(
                " pointer not set  for Parameter of Type C1G2TagInventoryMask");
        }

        resultBits.append(pointer.encodeBinary());

        if (tagMask == null) {
            LOGGER.warn(" tagMask not set");
            throw new MissingParameterException(
                " tagMask not set  for Parameter of Type C1G2TagInventoryMask");
        }

        resultBits.append(tagMask.encodeBinary());

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

        if (mB == null) {
            LOGGER.warn(" mB not set");
            throw new MissingParameterException(" mB not set");
        } else {
            element.addContent(mB.encodeXML("MB", ns));
        }

        //element.addContent(reserved0.encodeXML("reserved",ns));
        if (pointer == null) {
            LOGGER.warn(" pointer not set");
            throw new MissingParameterException(" pointer not set");
        } else {
            element.addContent(pointer.encodeXML("Pointer", ns));
        }

        if (tagMask == null) {
            LOGGER.warn(" tagMask not set");
            throw new MissingParameterException(" tagMask not set");
        } else {
            element.addContent(tagMask.encodeXML("TagMask", ns));
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
        mB = new TwoBitField(binary.subList(position, TwoBitField.length()));
        position += TwoBitField.length();
        position += reserved0.length();
        pointer = new UnsignedShort(binary.subList(position,
                    UnsignedShort.length()));
        position += UnsignedShort.length();
        // array. first 16 bits indicate length of array
        fieldCount = new UnsignedShort(binary.subList(position,
                    UnsignedShort.length())).toShort();
        tempLength = (BitArray_HEX.length() * fieldCount) +
            UnsignedShort.length();
        tagMask = new BitArray_HEX(binary.subList(position, tempLength));
        position += tempLength;
        LOGGER.debug("decoding array of type: BitArray_HEX with " + tempLength +
            " length");

        //might need padding
        // must always be blocks of 8 bites, if it is a bitlist, this might not be automatically the case
        if ((tempLength % 8) > 0) {
            position += (8 - (tempLength % 8));
            LOGGER.info("padding needed for tagMask ");
        }
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

        temp = element.getChild("MB", ns);

        if (temp != null) {
            mB = new TwoBitField(temp);
        }

        element.removeChild("MB", ns);
        temp = element.getChild("Pointer", ns);

        if (temp != null) {
            pointer = new UnsignedShort(temp);
        }

        element.removeChild("Pointer", ns);
        temp = element.getChild("TagMask", ns);

        if (temp != null) {
            tagMask = new BitArray_HEX(temp);
        }

        element.removeChild("TagMask", ns);

        if (element.getChildren().size() > 0) {
            String message = "C1G2TagInventoryMask has unknown element " +
                ((Element) element.getChildren().get(0)).getName();
            throw new InvalidLLRPMessageException(message);
        }
    }

    //setters
    /**
    * set   mB of type TwoBitField .
    * @param   mB to be set
    */
    public void setMB(final TwoBitField mB) {
        this.mB = mB;
    }

    /**
    * set   pointer of type UnsignedShort .
    * @param   pointer to be set
    */
    public void setPointer(final UnsignedShort pointer) {
        this.pointer = pointer;
    }

    /**
    * set tagMask of type BitArray_HEX .
    * @param  tagMask to be set
    */
    public void setTagMask(final BitArray_HEX tagMask) {
        this.tagMask = tagMask;
    }

    // end setter

    //getters
    /**
    * get   mB of type TwoBitField.
    * @return   type TwoBitField to be set
    */
    public TwoBitField getMB() {
        return this.mB;
    }

    /**
    * get   pointer of type UnsignedShort.
    * @return   type UnsignedShort to be set
    */
    public UnsignedShort getPointer() {
        return this.pointer;
    }

    /**
    * get tagMask of type  BitArray_HEX.
    * @return  BitArray_HEX
    */
    public BitArray_HEX getTagMask() {
        return tagMask;
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
        return "C1G2TagInventoryMask";
    }

    /**
    * return string representation. All field values but no parameters are included
    * @return String
    */
    public String toString() {
        String result = "C1G2TagInventoryMask: ";
        result += ", mB: ";
        result += mB;

        result += ", pointer: ";
        result += pointer;
        result += ", tagMask: ";
        result += tagMask;
        result = result.replaceFirst(", ", "");

        return result;
    }
}
