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
 * This parameter carries the SpecIndex information. The SpecIndex indicates the item within the ROSpec that was being executed at the time the tag was observed.

See also {@link <a href="http://www.epcglobalinc.org/standards/llrp/llrp_1_0_1-standard-20070813.pdf#page=82&view=fit">LLRP Specification Section 13.2.3.4</a>}
 and {@link <a href="http://www.epcglobalinc.org/standards/llrp/llrp_1_0_1-standard-20070813.pdf#page=145&view=fit">LLRP Specification Section 16.2.7.3.4</a>}


 */

/**
 * This parameter carries the SpecIndex information. The SpecIndex indicates the item within the ROSpec that was being executed at the time the tag was observed.

See also {@link <a href="http://www.epcglobalinc.org/standards/llrp/llrp_1_0_1-standard-20070813.pdf#page=82&view=fit">LLRP Specification Section 13.2.3.4</a>}
 and {@link <a href="http://www.epcglobalinc.org/standards/llrp/llrp_1_0_1-standard-20070813.pdf#page=145&view=fit">LLRP Specification Section 16.2.7.3.4</a>}

      .
 */
public class SpecIndex extends TVParameter {
    public static final SignedShort TYPENUM = new SignedShort(14);
    private static final Logger LOGGER = Logger.getLogger(SpecIndex.class);
    protected UnsignedShort specIndex;

    /**
     * empty constructor to create new parameter.
     */
    public SpecIndex() {
    }

    /**
     * Constructor to create parameter from binary encoded parameter
     * calls decodeBinary to decode parameter.
     * @param list to be decoded
     */
    public SpecIndex(LLRPBitList list) {
        decodeBinary(list);
    }

    /**
    * Constructor to create parameter from xml encoded parameter
    * calls decodeXML to decode parameter.
    * @param element to be decoded
    */
    public SpecIndex(Element element) throws InvalidLLRPMessageException {
        decodeXML(element);
    }

    /**
    * {@inheritDoc}
    */
    public LLRPBitList encodeBinarySpecific() {
        LLRPBitList resultBits = new LLRPBitList();

        if (specIndex == null) {
            LOGGER.warn(" specIndex not set");
            throw new MissingParameterException(
                " specIndex not set  for Parameter of Type SpecIndex");
        }

        resultBits.append(specIndex.encodeBinary());

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

        if (specIndex == null) {
            LOGGER.warn(" specIndex not set");
            throw new MissingParameterException(" specIndex not set");
        } else {
            element.addContent(specIndex.encodeXML("SpecIndex", ns));
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
        specIndex = new UnsignedShort(binary.subList(position,
                    UnsignedShort.length()));
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

        temp = element.getChild("SpecIndex", ns);

        if (temp != null) {
            specIndex = new UnsignedShort(temp);
        }

        element.removeChild("SpecIndex", ns);

        if (element.getChildren().size() > 0) {
            String message = "SpecIndex has unknown element " +
                ((Element) element.getChildren().get(0)).getName();
            throw new InvalidLLRPMessageException(message);
        }
    }

    //setters
    /**
    * set   specIndex of type UnsignedShort .
    * @param   specIndex to be set
    */
    public void setSpecIndex(final UnsignedShort specIndex) {
        this.specIndex = specIndex;
    }

    // end setter

    //getters
    /**
    * get   specIndex of type UnsignedShort.
    * @return   type UnsignedShort to be set
    */
    public UnsignedShort getSpecIndex() {
        return this.specIndex;
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
        tempLength += UnsignedShort.length();

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
        return "SpecIndex";
    }

    /**
    * return string representation. All field values but no parameters are included
    * @return String
    */
    public String toString() {
        String result = "SpecIndex: ";
        result += ", specIndex: ";
        result += specIndex;
        result = result.replaceFirst(", ", "");

        return result;
    }
}
