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
import org.llrp.ltk.generated.interfaces.AccessCommandOpSpec;
import org.llrp.ltk.types.BitList;
import org.llrp.ltk.types.LLRPBitList;
import org.llrp.ltk.types.LLRPMessage;
import org.llrp.ltk.types.SignedShort;
import org.llrp.ltk.types.TLVParameter;
import org.llrp.ltk.types.TVParameter;
import org.llrp.ltk.types.TwoBitField;
import org.llrp.ltk.types.UnsignedInteger;
import org.llrp.ltk.types.UnsignedShort;
import org.llrp.ltk.types.UnsignedShortArray_HEX;

import java.util.LinkedList;
import java.util.List;


/**
 * MB is the memory bank to use. WordPtr is the starting word address. Word Count is the number of 16-bit words to be written. Depending on the word count, the Reader may have to execute multiple C1G2 air protocol block write commands. Write Data is the data to be written to the tag. Access Password is the password used by the Reader to transition the tag to the secure state so that it can write to protected tag memory regions.Readers that do not support C1G2BlockWrite SHALL set CanSupportBlockWrite to false in C1G2LLRPCapabilities. If such a Reader receives an ADD_ACCESSSPEC with an AccessSpec that contained this OpSpec parameter, the Reader SHALL return an error for that message and not add the AccessSpec.

See also {@link <a href="http://www.epcglobalinc.org/standards/llrp/llrp_1_0_1-standard-20070813.pdf#page=110&view=fit">LLRP Specification Section 15.2.1.3.2.6</a>}
 and {@link <a href="http://www.epcglobalinc.org/standards/llrp/llrp_1_0_1-standard-20070813.pdf#page=158&view=fit">LLRP Specification Section 16.3.1.3.2.6</a>}


 */

/**
 * MB is the memory bank to use. WordPtr is the starting word address. Word Count is the number of 16-bit words to be written. Depending on the word count, the Reader may have to execute multiple C1G2 air protocol block write commands. Write Data is the data to be written to the tag. Access Password is the password used by the Reader to transition the tag to the secure state so that it can write to protected tag memory regions.Readers that do not support C1G2BlockWrite SHALL set CanSupportBlockWrite to false in C1G2LLRPCapabilities. If such a Reader receives an ADD_ACCESSSPEC with an AccessSpec that contained this OpSpec parameter, the Reader SHALL return an error for that message and not add the AccessSpec.

See also {@link <a href="http://www.epcglobalinc.org/standards/llrp/llrp_1_0_1-standard-20070813.pdf#page=110&view=fit">LLRP Specification Section 15.2.1.3.2.6</a>}
 and {@link <a href="http://www.epcglobalinc.org/standards/llrp/llrp_1_0_1-standard-20070813.pdf#page=158&view=fit">LLRP Specification Section 16.3.1.3.2.6</a>}

      .
 */
public class C1G2BlockWrite extends TLVParameter implements AccessCommandOpSpec {
    public static final SignedShort TYPENUM = new SignedShort(347);
    private static final Logger LOGGER = Logger.getLogger(C1G2BlockWrite.class);
    protected UnsignedShort opSpecID;
    protected UnsignedInteger accessPassword;
    protected TwoBitField mB;
    protected BitList reserved0 = new BitList(6);
    protected UnsignedShort wordPointer;
    protected UnsignedShortArray_HEX writeData;

    /**
     * empty constructor to create new parameter.
     */
    public C1G2BlockWrite() {
    }

    /**
     * Constructor to create parameter from binary encoded parameter
     * calls decodeBinary to decode parameter.
     * @param list to be decoded
     */
    public C1G2BlockWrite(LLRPBitList list) {
        decodeBinary(list);
    }

    /**
    * Constructor to create parameter from xml encoded parameter
    * calls decodeXML to decode parameter.
    * @param element to be decoded
    */
    public C1G2BlockWrite(Element element) throws InvalidLLRPMessageException {
        decodeXML(element);
    }

    /**
    * {@inheritDoc}
    */
    public LLRPBitList encodeBinarySpecific() {
        LLRPBitList resultBits = new LLRPBitList();

        if (opSpecID == null) {
            LOGGER.warn(" opSpecID not set");
            throw new MissingParameterException(
                " opSpecID not set  for Parameter of Type C1G2BlockWrite");
        }

        resultBits.append(opSpecID.encodeBinary());

        if (accessPassword == null) {
            LOGGER.warn(" accessPassword not set");
            throw new MissingParameterException(
                " accessPassword not set  for Parameter of Type C1G2BlockWrite");
        }

        resultBits.append(accessPassword.encodeBinary());

        if (mB == null) {
            LOGGER.warn(" mB not set");
            throw new MissingParameterException(
                " mB not set  for Parameter of Type C1G2BlockWrite");
        }

        resultBits.append(mB.encodeBinary());
        resultBits.append(reserved0.encodeBinary());

        if (wordPointer == null) {
            LOGGER.warn(" wordPointer not set");
            throw new MissingParameterException(
                " wordPointer not set  for Parameter of Type C1G2BlockWrite");
        }

        resultBits.append(wordPointer.encodeBinary());

        if (writeData == null) {
            LOGGER.warn(" writeData not set");
            throw new MissingParameterException(
                " writeData not set  for Parameter of Type C1G2BlockWrite");
        }

        resultBits.append(writeData.encodeBinary());

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

        if (opSpecID == null) {
            LOGGER.warn(" opSpecID not set");
            throw new MissingParameterException(" opSpecID not set");
        } else {
            element.addContent(opSpecID.encodeXML("OpSpecID", ns));
        }

        if (accessPassword == null) {
            LOGGER.warn(" accessPassword not set");
            throw new MissingParameterException(" accessPassword not set");
        } else {
            element.addContent(accessPassword.encodeXML("AccessPassword", ns));
        }

        if (mB == null) {
            LOGGER.warn(" mB not set");
            throw new MissingParameterException(" mB not set");
        } else {
            element.addContent(mB.encodeXML("MB", ns));
        }

        //element.addContent(reserved0.encodeXML("reserved",ns));
        if (wordPointer == null) {
            LOGGER.warn(" wordPointer not set");
            throw new MissingParameterException(" wordPointer not set");
        } else {
            element.addContent(wordPointer.encodeXML("WordPointer", ns));
        }

        if (writeData == null) {
            LOGGER.warn(" writeData not set");
            throw new MissingParameterException(" writeData not set");
        } else {
            element.addContent(writeData.encodeXML("WriteData", ns));
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
        opSpecID = new UnsignedShort(binary.subList(position,
                    UnsignedShort.length()));
        position += UnsignedShort.length();
        accessPassword = new UnsignedInteger(binary.subList(position,
                    UnsignedInteger.length()));
        position += UnsignedInteger.length();
        mB = new TwoBitField(binary.subList(position, TwoBitField.length()));
        position += TwoBitField.length();
        position += reserved0.length();
        wordPointer = new UnsignedShort(binary.subList(position,
                    UnsignedShort.length()));
        position += UnsignedShort.length();
        // array. first 16 bits indicate length of array
        fieldCount = new UnsignedShort(binary.subList(position,
                    UnsignedShort.length())).toShort();
        tempLength = (UnsignedShortArray_HEX.length() * fieldCount) +
            UnsignedShort.length();
        writeData = new UnsignedShortArray_HEX(binary.subList(position,
                    tempLength));
        position += tempLength;
        LOGGER.debug("decoding array of type: UnsignedShortArray_HEX with " +
            tempLength + " length");

        //might need padding
        // must always be blocks of 8 bites, if it is a bitlist, this might not be automatically the case
        if ((tempLength % 8) > 0) {
            position += (8 - (tempLength % 8));
            LOGGER.info("padding needed for writeData ");
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

        temp = element.getChild("OpSpecID", ns);

        if (temp != null) {
            opSpecID = new UnsignedShort(temp);
        }

        element.removeChild("OpSpecID", ns);
        temp = element.getChild("AccessPassword", ns);

        if (temp != null) {
            accessPassword = new UnsignedInteger(temp);
        }

        element.removeChild("AccessPassword", ns);
        temp = element.getChild("MB", ns);

        if (temp != null) {
            mB = new TwoBitField(temp);
        }

        element.removeChild("MB", ns);
        temp = element.getChild("WordPointer", ns);

        if (temp != null) {
            wordPointer = new UnsignedShort(temp);
        }

        element.removeChild("WordPointer", ns);
        temp = element.getChild("WriteData", ns);

        if (temp != null) {
            writeData = new UnsignedShortArray_HEX(temp);
        }

        element.removeChild("WriteData", ns);

        if (element.getChildren().size() > 0) {
            String message = "C1G2BlockWrite has unknown element " +
                ((Element) element.getChildren().get(0)).getName();
            throw new InvalidLLRPMessageException(message);
        }
    }

    //setters
    /**
    * set   opSpecID of type UnsignedShort .
    * @param   opSpecID to be set
    */
    public void setOpSpecID(final UnsignedShort opSpecID) {
        this.opSpecID = opSpecID;
    }

    /**
    * set   accessPassword of type UnsignedInteger .
    * @param   accessPassword to be set
    */
    public void setAccessPassword(final UnsignedInteger accessPassword) {
        this.accessPassword = accessPassword;
    }

    /**
    * set   mB of type TwoBitField .
    * @param   mB to be set
    */
    public void setMB(final TwoBitField mB) {
        this.mB = mB;
    }

    /**
    * set   wordPointer of type UnsignedShort .
    * @param   wordPointer to be set
    */
    public void setWordPointer(final UnsignedShort wordPointer) {
        this.wordPointer = wordPointer;
    }

    /**
    * set writeData of type UnsignedShortArray_HEX .
    * @param  writeData to be set
    */
    public void setWriteData(final UnsignedShortArray_HEX writeData) {
        this.writeData = writeData;
    }

    // end setter

    //getters
    /**
    * get   opSpecID of type UnsignedShort.
    * @return   type UnsignedShort to be set
    */
    public UnsignedShort getOpSpecID() {
        return this.opSpecID;
    }

    /**
    * get   accessPassword of type UnsignedInteger.
    * @return   type UnsignedInteger to be set
    */
    public UnsignedInteger getAccessPassword() {
        return this.accessPassword;
    }

    /**
    * get   mB of type TwoBitField.
    * @return   type TwoBitField to be set
    */
    public TwoBitField getMB() {
        return this.mB;
    }

    /**
    * get   wordPointer of type UnsignedShort.
    * @return   type UnsignedShort to be set
    */
    public UnsignedShort getWordPointer() {
        return this.wordPointer;
    }

    /**
    * get writeData of type  UnsignedShortArray_HEX.
    * @return  UnsignedShortArray_HEX
    */
    public UnsignedShortArray_HEX getWriteData() {
        return writeData;
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
        return "C1G2BlockWrite";
    }

    /**
    * return string representation. All field values but no parameters are included
    * @return String
    */
    public String toString() {
        String result = "C1G2BlockWrite: ";
        result += ", opSpecID: ";
        result += opSpecID;
        result += ", accessPassword: ";
        result += accessPassword;
        result += ", mB: ";
        result += mB;

        result += ", wordPointer: ";
        result += wordPointer;
        result += ", writeData: ";
        result += writeData;
        result = result.replaceFirst(", ", "");

        return result;
    }
}
