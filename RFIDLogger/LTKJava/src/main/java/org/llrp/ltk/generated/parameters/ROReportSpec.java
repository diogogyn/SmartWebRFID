/*
 *
 * This file was generated by LLRP Code Generator
 * see http://llrp-toolkit.cvs.sourceforge.net/llrp-toolkit/
 * for more information
 * Generated on: Sat Jul 13 14:03:11 PDT 2013;
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
import org.llrp.ltk.generated.enumerations.ROReportTriggerType;
import org.llrp.ltk.generated.parameters.Custom;
import org.llrp.ltk.generated.parameters.TagReportContentSelector;
import org.llrp.ltk.types.LLRPBitList;
import org.llrp.ltk.types.LLRPMessage;
import org.llrp.ltk.types.SignedShort;
import org.llrp.ltk.types.TLVParameter;
import org.llrp.ltk.types.TVParameter;
import org.llrp.ltk.types.UnsignedShort;

import java.util.LinkedList;
import java.util.List;


/**
 * This Parameter carries the Reader inventory and RF survey reporting definition for the antenna. This parameter describes the contents of the report sent by the Reader and defines the events that cause the report to be sent.The ROReportTrigger field defines the events that cause the report to be sent.The TagReportContentSelector parameter defines the desired contents of the report. The ROReportTrigger defines the event that causes the report to be sent by the Reader to the Client.See section 13.2.6.1 for details about the order that reports are to be sent with respect to Reader event notifications.

See also {@link <a href="http://www.epcglobalinc.org/standards/llrp/llrp_1_0_1-standard-20070813.pdf#page=78&view=fit">LLRP Specification Section 13.2.1</a>}
 and {@link <a href="http://www.epcglobalinc.org/standards/llrp/llrp_1_0_1-standard-20070813.pdf#page=142&view=fit">LLRP Specification Section 16.2.7.1</a>}


 */

/**
 * This Parameter carries the Reader inventory and RF survey reporting definition for the antenna. This parameter describes the contents of the report sent by the Reader and defines the events that cause the report to be sent.The ROReportTrigger field defines the events that cause the report to be sent.The TagReportContentSelector parameter defines the desired contents of the report. The ROReportTrigger defines the event that causes the report to be sent by the Reader to the Client.See section 13.2.6.1 for details about the order that reports are to be sent with respect to Reader event notifications.

See also {@link <a href="http://www.epcglobalinc.org/standards/llrp/llrp_1_0_1-standard-20070813.pdf#page=78&view=fit">LLRP Specification Section 13.2.1</a>}
 and {@link <a href="http://www.epcglobalinc.org/standards/llrp/llrp_1_0_1-standard-20070813.pdf#page=142&view=fit">LLRP Specification Section 16.2.7.1</a>}

      .
 */
public class ROReportSpec extends TLVParameter {
    public static final SignedShort TYPENUM = new SignedShort(237);
    private static final Logger LOGGER = Logger.getLogger(ROReportSpec.class);
    protected ROReportTriggerType rOReportTrigger;
    protected UnsignedShort n;
    protected TagReportContentSelector tagReportContentSelector;
    protected List<Custom> customList = new LinkedList<Custom>();

    /**
     * empty constructor to create new parameter.
     */
    public ROReportSpec() {
    }

    /**
     * Constructor to create parameter from binary encoded parameter
     * calls decodeBinary to decode parameter.
     * @param list to be decoded
     */
    public ROReportSpec(LLRPBitList list) {
        decodeBinary(list);
    }

    /**
    * Constructor to create parameter from xml encoded parameter
    * calls decodeXML to decode parameter.
    * @param element to be decoded
    */
    public ROReportSpec(Element element) throws InvalidLLRPMessageException {
        decodeXML(element);
    }

    /**
    * {@inheritDoc}
    */
    public LLRPBitList encodeBinarySpecific() {
        LLRPBitList resultBits = new LLRPBitList();

        if (rOReportTrigger == null) {
            LOGGER.warn(" rOReportTrigger not set");
            throw new MissingParameterException(
                " rOReportTrigger not set  for Parameter of Type ROReportSpec");
        }

        resultBits.append(rOReportTrigger.encodeBinary());

        if (n == null) {
            LOGGER.warn(" n not set");
            throw new MissingParameterException(
                " n not set  for Parameter of Type ROReportSpec");
        }

        resultBits.append(n.encodeBinary());

        if (tagReportContentSelector == null) {
            // single parameter, may not be null
            LOGGER.warn(" tagReportContentSelector not set");
            throw new MissingParameterException(
                " tagReportContentSelector not set");
        } else {
            resultBits.append(tagReportContentSelector.encodeBinary());
        }

        if (customList == null) {
            //just warn - it is optional 
            LOGGER.info(" customList not set");
        } else {
            for (Custom field : customList) {
                resultBits.append(field.encodeBinary());
            }
        }

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

        if (rOReportTrigger == null) {
            LOGGER.warn(" rOReportTrigger not set");
            throw new MissingParameterException(" rOReportTrigger not set");
        } else {
            element.addContent(rOReportTrigger.encodeXML("ROReportTrigger", ns));
        }

        if (n == null) {
            LOGGER.warn(" n not set");
            throw new MissingParameterException(" n not set");
        } else {
            element.addContent(n.encodeXML("N", ns));
        }

        //parameters
        if (tagReportContentSelector == null) {
            LOGGER.info("tagReportContentSelector not set");
            throw new MissingParameterException(
                "tagReportContentSelector not set");
        } else {
            element.addContent(tagReportContentSelector.encodeXML(
                    tagReportContentSelector.getClass().getSimpleName(), ns));
        }

        if (customList == null) {
            LOGGER.info("customList not set");
        } else {
            for (Custom field : customList) {
                element.addContent(field.encodeXML(field.getClass().getName()
                                                        .replaceAll(field.getClass()
                                                                         .getPackage()
                                                                         .getName() +
                            ".", ""), ns));
            }
        }

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
        rOReportTrigger = new ROReportTriggerType(binary.subList(position,
                    ROReportTriggerType.length()));
        position += ROReportTriggerType.length();
        n = new UnsignedShort(binary.subList(position, UnsignedShort.length()));
        position += UnsignedShort.length();

        // look ahead to see type
        // may be optional or exactly once
        type = null;
        tempByteLength = 0;
        tempLength = 0;

        try {
            // if first bit is one it is a TV Parameter
            if (binary.get(position)) {
                // do not take the first bit as it is always 1
                type = new SignedShort(binary.subList(position + 1, 7));
            } else {
                type = new SignedShort(binary.subList(position +
                            RESERVEDLENGTH, TYPENUMBERLENGTH));
                tempByteLength = new UnsignedShort(binary.subList(position +
                            RESERVEDLENGTH + TYPENUMBERLENGTH,
                            UnsignedShort.length())).toShort();
                tempLength = 8 * tempByteLength;
            }
        } catch (IllegalArgumentException le) {
            // if an IllegalArgumentException is thrown, list was not long enough so the parameter is missing
            LOGGER.warn(
                "ROReportSpec misses non optional parameter of type TagReportContentSelector");
            throw new MissingParameterException(
                "ROReportSpec misses non optional parameter of type TagReportContentSelector");
        }

        if (binary.get(position)) {
            // length can statically be determined for TV Parameters
            tempLength = tagReportContentSelector.length();
        }

        if ((type != null) && type.equals(TagReportContentSelector.TYPENUM)) {
            tagReportContentSelector = new TagReportContentSelector(binary.subList(
                        position, tempLength));
            position += tempLength;
            LOGGER.debug(
                " tagReportContentSelector is instantiated with TagReportContentSelector with length" +
                tempLength);
        } else {
            LOGGER.warn(
                "ROReportSpec misses non optional parameter of type TagReportContentSelector");
            throw new MissingParameterException(
                "ROReportSpec misses non optional parameter of type TagReportContentSelector");
        }

        // list of parameters
        customList = new LinkedList<Custom>();
        LOGGER.debug("decoding parameter customList ");

        while (position < binary.length()) {
            // store if one parameter matched
            boolean atLeastOnce = false;

            // look ahead to see type
            if (binary.get(position)) {
                // do not take the first bit as it is always 1
                type = new SignedShort(binary.subList(position + 1, 7));
            } else {
                type = new SignedShort(binary.subList(position +
                            RESERVEDLENGTH, TYPENUMBERLENGTH));
                tempByteLength = new UnsignedShort(binary.subList(position +
                            RESERVEDLENGTH + TYPENUMBERLENGTH,
                            UnsignedShort.length())).toShort();
                tempLength = 8 * tempByteLength;
            }

            // custom
            if ((type != null) && type.equals(Custom.TYPENUM)) {
                Custom cus = new Custom(binary.subList(position, tempLength));
                // custom parameters for this parameter	
                // ROReportSpec
                //end  parameters
                //if none matched continue wasn't called and we add just cus as we found no specific vendor implementation
                customList.add(cus);
                position += tempLength;
                atLeastOnce = true;
            }

            if (!atLeastOnce) {
                //no parameter matched therefore we jump out of the loop
                break;
            }
        }

        //if list is still empty no parameter matched
        if (customList.isEmpty()) {
            LOGGER.info(
                "encoded message does not contain parameter for optional customList");
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

        temp = element.getChild("ROReportTrigger", ns);

        if (temp != null) {
            rOReportTrigger = new ROReportTriggerType(temp);
        }

        element.removeChild("ROReportTrigger", ns);
        temp = element.getChild("N", ns);

        if (temp != null) {
            n = new UnsignedShort(temp);
        }

        element.removeChild("N", ns);

        //parameter - not choices - no special actions needed
        temp = element.getChild("TagReportContentSelector", ns);

        if (temp != null) {
            tagReportContentSelector = new TagReportContentSelector(temp);
            LOGGER.info(
                "setting parameter tagReportContentSelector for parameter ROReportSpec");
        }

        if (temp == null) {
            LOGGER.warn(
                "ROReportSpec misses non optional parameter of type tagReportContentSelector");
            throw new MissingParameterException(
                "ROReportSpec misses non optional parameter of type tagReportContentSelector");
        }

        element.removeChild("TagReportContentSelector", ns);
        //parameter - not choices - no special actions needed
        //we expect a list of parameters
        customList = new LinkedList<Custom>();
        tempList = element.getChildren("Custom", ns);

        if ((tempList == null) || tempList.isEmpty()) {
            LOGGER.info(
                "ROReportSpec misses optional parameter of type customList");
        } else {
            for (Element e : tempList) {
                customList.add(new Custom(e));
                LOGGER.debug("adding Custom to customList ");
            }
        }

        element.removeChildren("Custom", ns);
        //custom parameter
        tempList = element.getChildren("Custom", ns);

        for (Element e : tempList) {
            customList.add(new Custom(e));
            atLeastOnce = true;
            LOGGER.debug("adding custom parameter");
        }

        element.removeChildren("Custom", ns);

        //end custom
        if (element.getChildren().size() > 0) {
            String message = "ROReportSpec has unknown element " +
                ((Element) element.getChildren().get(0)).getName();
            throw new InvalidLLRPMessageException(message);
        }
    }

    //setters
    /**
    * set rOReportTrigger of type ROReportTriggerType .
    * @param  rOReportTrigger to be set
    */
    public void setROReportTrigger(final ROReportTriggerType rOReportTrigger) {
        this.rOReportTrigger = rOReportTrigger;
    }

    /**
    * set   n of type UnsignedShort .
    * @param   n to be set
    */
    public void setN(final UnsignedShort n) {
        this.n = n;
    }

    /**
    * set tagReportContentSelector of type TagReportContentSelector.
    * @param  tagReportContentSelector to be set
    */
    public void setTagReportContentSelector(
        final TagReportContentSelector tagReportContentSelector) {
        this.tagReportContentSelector = tagReportContentSelector;
    }

    /**
    * set customList of type  List &lt;Custom>.
    * @param  customList to be set
    */
    public void setCustomList(final List<Custom> customList) {
        this.customList = customList;
    }

    // end setter

    //getters
    /**
    * get rOReportTrigger of type ROReportTriggerType.
    * @return  ROReportTriggerType
    */
    public ROReportTriggerType getROReportTrigger() {
        return rOReportTrigger;
    }

    /**
    * get   n of type UnsignedShort.
    * @return   type UnsignedShort to be set
    */
    public UnsignedShort getN() {
        return this.n;
    }

    /**
    * get tagReportContentSelector of type TagReportContentSelector .
    * @return  TagReportContentSelector
    */
    public TagReportContentSelector getTagReportContentSelector() {
        return tagReportContentSelector;
    }

    /**
    * get customList of type List &lt;Custom> .
    * @return  List &lt;Custom>
    */
    public List<Custom> getCustomList() {
        return customList;
    }

    // end getters

    //add methods

    /**
    * add element custom of type Custom .
    * @param  custom of type Custom
    */
    public void addToCustomList(Custom custom) {
        if (this.customList == null) {
            this.customList = new LinkedList<Custom>();
        }

        this.customList.add(custom);
    }

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
        return "ROReportSpec";
    }

    /**
    * return string representation. All field values but no parameters are included
    * @return String
    */
    public String toString() {
        String result = "ROReportSpec: ";
        result += ", rOReportTrigger: ";
        result += rOReportTrigger;
        result += ", n: ";
        result += n;
        result = result.replaceFirst(", ", "");

        return result;
    }
}
