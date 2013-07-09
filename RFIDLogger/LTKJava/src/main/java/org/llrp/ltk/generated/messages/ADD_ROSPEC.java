/*
*
* This file was generated by LLRP Code Generator
* see http://llrp-toolkit.cvs.sourceforge.net/llrp-toolkit/
* for more information
* Generated on: Wed Jun 26 17:35:16 PDT 2013;
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
package org.llrp.ltk.generated.messages;

import org.apache.log4j.Logger;

import org.jdom.Document;
import org.jdom.Element;
import org.jdom.Namespace;

import org.llrp.ltk.exceptions.InvalidLLRPMessageException;
import org.llrp.ltk.exceptions.MissingParameterException;
import org.llrp.ltk.generated.LLRPConstants;
import org.llrp.ltk.generated.parameters.Custom;
import org.llrp.ltk.generated.parameters.ROSpec;
import org.llrp.ltk.types.BitList;
import org.llrp.ltk.types.LLRPBitList;
import org.llrp.ltk.types.LLRPMessage;
import org.llrp.ltk.types.SignedShort;
import org.llrp.ltk.types.UnsignedInteger;
import org.llrp.ltk.types.UnsignedShort;

import java.util.LinkedList;
import java.util.List;


/**
 * An ADD_ROSPEC message communicates the information of a ROSpec to the Reader. LLRP supports configuration of multiple ROSpecs. Each ROSpec is uniquely identified using a ROSpecID, generated by the Client. The ROSpec starts at the Disabled state waiting for the ENABLE_ROSPEC message for the ROSpec from the Client, upon which it transitions to the Inactive state.The Client SHALL add a ROSpec in a Disabled State - i.e., CurrentState field in the ROSpec Parameter (section 10.2.1) SHALL be set to disabled. If the CurrentState value is different than disabled, an error SHALL be returned in the ADD_ROSPEC_RESPONSE (e.g. P_FieldError).

See also {@link <a href="http://www.epcglobalinc.org/standards/llrp/llrp_1_0_1-standard-20070813.pdf#page=51&view=fit">LLRP Specification Section 10.1.1</a>}
 and {@link <a href="http://www.epcglobalinc.org/standards/llrp/llrp_1_0_1-standard-20070813.pdf#page=117&view=fit">LLRP Specification Section 16.1.3</a>}


 */
public class ADD_ROSPEC extends LLRPMessage {
    public static final SignedShort TYPENUM = new SignedShort(20);
    private static final Logger LOGGER = Logger.getLogger(ADD_ROSPEC.class);
    public static final String RESPONSETYPE = "ADD_ROSPEC_RESPONSE";
    protected ROSpec rOSpec;

    /**
     * empty constructor to create new message
     * with LLRP version set to 1.0 (0x1).
     */
    public ADD_ROSPEC() {
        setVersion(new BitList(0, 0, 1));
    }

    /**
     * Constructor to create message from binary encoded message
     * calls decodeBinary to decode message.
     * @param list to be decoded
     */
    public ADD_ROSPEC(final LLRPBitList list)
        throws InvalidLLRPMessageException {
        decodeBinary(list.toByteArray());
    }

    /**
     * Constructor to create message from binary encoded message
     * calls decodeBinary to decode message.
     * @param byteArray representing message
     */
    public ADD_ROSPEC(final byte[] byteArray)
        throws InvalidLLRPMessageException {
        decodeBinary(byteArray);
    }

    /**
    * Constructor to create message from xml encoded message
    * calls decodeXML to decode message.
    * @param document to be decoded
    */
    public ADD_ROSPEC(final Document document)
        throws InvalidLLRPMessageException {
        decodeXML(document);
    }

    /**
    * {@inheritDoc}
    */
    protected LLRPBitList encodeBinarySpecific()
        throws InvalidLLRPMessageException {
        LLRPBitList resultBits = new LLRPBitList();

        if (rOSpec == null) {
            // single parameter, may not be null
            LOGGER.warn(" rOSpec not set");
            throw new InvalidLLRPMessageException(" rOSpec not set");
        } else {
            resultBits.append(rOSpec.encodeBinary());
        }

        return resultBits;
    }

    /**
    * {@inheritDoc}
    */
    public Document encodeXML() throws InvalidLLRPMessageException {
        try {
            Namespace ns = Namespace.getNamespace("llrp",
                    LLRPConstants.LLRPNAMESPACE);

            Element root = new Element("ADD_ROSPEC", ns);
            //	Element root = new Element("ADD_ROSPEC");
            root.addNamespaceDeclaration(Namespace.getNamespace("llrp",
                    LLRPConstants.LLRPNAMESPACE));

            if (version == null) {
                throw new InvalidLLRPMessageException("Version not set");
            } else {
                root.setAttribute("Version", version.toInteger().toString());
            }

            if (messageID == null) {
                throw new InvalidLLRPMessageException("MessageID not set");
            } else {
                root.setAttribute("MessageID", messageID.toString(10));
            }

            //parameters
            if (rOSpec == null) {
                LOGGER.info("rOSpec not set");
                throw new MissingParameterException("rOSpec not set");
            } else {
                root.addContent(rOSpec.encodeXML(rOSpec.getClass()
                                                       .getSimpleName(), ns));
            }

            Document doc = new Document(root);

            if (isValidXMLMessage(doc, LLRPConstants.LLRPMESSAGESCHEMAPATH)) {
                return doc;
            } else {
                return null;
            }
        } catch (IllegalArgumentException e) {
            throw new InvalidLLRPMessageException(e.getMessage());
        } catch (MissingParameterException e) {
            throw new InvalidLLRPMessageException(e.getMessage());
        }
    }

    /**
    * {@inheritDoc}
    */
    protected void decodeBinarySpecific(LLRPBitList binary)
        throws InvalidLLRPMessageException {
        int position = 0;
        int tempByteLength;
        int tempLength = 0;
        int count;
        SignedShort type;
        int fieldCount;
        Custom custom;

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
                "ADD_ROSPEC misses non optional parameter of type ROSpec");
            throw new InvalidLLRPMessageException(
                "ADD_ROSPEC misses non optional parameter of type ROSpec");
        }

        if (binary.get(position)) {
            // length can statically be determined for TV Parameters
            tempLength = rOSpec.length();
        }

        if ((type != null) && type.equals(ROSpec.TYPENUM)) {
            rOSpec = new ROSpec(binary.subList(position, tempLength));
            position += tempLength;
            LOGGER.debug(" rOSpec is instantiated with ROSpec with length" +
                tempLength);
        } else {
            LOGGER.warn(
                "ADD_ROSPEC misses non optional parameter of type ROSpec");
            throw new InvalidLLRPMessageException(
                "ADD_ROSPEC misses non optional parameter of type ROSpec");
        }
    }

    /**
    * {@inheritDoc}
    */
    public void decodeXML(final Document document)
        throws InvalidLLRPMessageException {
        Element temp = null;
        Custom custom;

        // child element are always in default LLRP namespace
        Namespace ns = Namespace.getNamespace(LLRPConstants.LLRPNAMESPACE);

        try {
            isValidXMLMessage(document, LLRPConstants.LLRPMESSAGESCHEMAPATH);

            Element root = (Element) document.getRootElement().clone();
            List<Element> tempList = null;

            // the version field is always 3 bit long 
            // if the version attribute is not set in the LTK-XML message,
            // it is set to version 001
            String versionAttribute = root.getAttributeValue("Version");

            if (versionAttribute != null) {
                version = new BitList(3);
                version.setValue(new Integer(versionAttribute));
            } else {
                version = new BitList(0, 0, 1);
            }

            messageID = new UnsignedInteger(root.getAttributeValue("MessageID"));

            //parameter - not choices - no special actions needed
            temp = root.getChild("ROSpec", ns);

            if (temp != null) {
                rOSpec = new ROSpec(temp);
                LOGGER.info("setting parameter rOSpec for parameter ADD_ROSPEC");
            } else {
                LOGGER.warn(
                    "ADD_ROSPEC misses non optional parameter of type rOSpec");
                throw new MissingParameterException(
                    "ADD_ROSPEC misses non optional parameter of type rOSpec");
            }

            root.removeChild("ROSpec", ns);

            if (root.getChildren().size() > 0) {
                String message = "ADD_ROSPEC has unknown element " +
                    ((Element) root.getChildren().get(0)).getName();
                throw new InvalidLLRPMessageException(message);
            }
        } catch (IllegalArgumentException e) {
            throw new InvalidLLRPMessageException(e.getMessage());
        } catch (MissingParameterException e) {
            throw new InvalidLLRPMessageException(e.getMessage());
        }
    }

    //setters

    /**
    * set rOSpec of type ROSpec.
    * @param  rOSpec to be set
    */
    public void setROSpec(final ROSpec rOSpec) {
        this.rOSpec = rOSpec;
    }

    // end setter

    //getters

    /**
    * get rOSpec of type ROSpec .
    * @return  ROSpec
    */
    public ROSpec getROSpec() {
        return rOSpec;
    }

    // end getters

    //add methods

    // end add
    @Override
    public String getResponseType() {
        return RESPONSETYPE;
    }

    @Override
    public String getName() {
        return "ADD_ROSPEC";
    }

    /**
    * return uniuque type number.
    * @return SignedShort holding unique type number
    */
    public SignedShort getTypeNum() {
        return TYPENUM;
    }
}
