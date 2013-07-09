/*
*
* This file was generated by LLRP Code Generator
* see http://llrp-toolkit.cvs.sourceforge.net/llrp-toolkit/
* for more information
* Generated on: Wed Jun 26 17:35:17 PDT 2013;
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
import org.llrp.ltk.generated.parameters.LLRPStatus;
import org.llrp.ltk.types.BitList;
import org.llrp.ltk.types.LLRPBitList;
import org.llrp.ltk.types.LLRPMessage;
import org.llrp.ltk.types.SignedShort;
import org.llrp.ltk.types.UnsignedInteger;
import org.llrp.ltk.types.UnsignedShort;

import java.util.LinkedList;
import java.util.List;


/**
 * The Reader SHALL discard the message if there is at least one error in the message, or cannot be fully processed. In addition, no portion of the message containing an error SHALL be executed by the Reader. In case the message has one or more errors, the Reader SHALL return at least one error parameter for one of the errors. The Reader MAY return more than one error parameter, one for each error. The errors are conveyed using a combination of "generic error codes", a pointer to the culprit parameter/field, and a description of the error encoded as a string of UTF-8 characters.Typically the errors in the LLRP defined messages are conveyed inside of the responses from the Reader. However, in cases where the message received by the Reader contains an unsupported message type, or a CUSTOM_MESSAGE with unsupported parameters or fields, the Reader SHALL respond with the ERROR_MESSAGE.When a Reader or Client receives a command or notification with a version that is not supported, the receiver SHALL send an ERROR_MESSAGE in reply consisting of:  A version that is the same as the received message, the message ID that matches the received message, and an LLRPStatusParameter with the ErrorCode set to M_UnsupportedVersion. This message SHALL contain no sub-parameters (such as Field Error, Parameter Error).Readers and Clients SHALL not respond to an ERROR_MESSAGE. This message is issued by the Reader to the Client, and it contains the LLRPStatus parameter that describes the error in the message.

See also {@link <a href="http://www.epcglobalinc.org/standards/llrp/llrp_1_0_1-standard-20070813.pdf#page=93&view=fit">LLRP Specification Section 14.1.1</a>}
 and {@link <a href="http://www.epcglobalinc.org/standards/llrp/llrp_1_0_1-standard-20070813.pdf#page=126&view=fit">LLRP Specification Section 16.1.35</a>}


 */
public class ERROR_MESSAGE extends LLRPMessage {
    public static final SignedShort TYPENUM = new SignedShort(100);
    private static final Logger LOGGER = Logger.getLogger(ERROR_MESSAGE.class);
    public static final String RESPONSETYPE = "";
    protected LLRPStatus lLRPStatus;

    /**
     * empty constructor to create new message
     * with LLRP version set to 1.0 (0x1).
     */
    public ERROR_MESSAGE() {
        setVersion(new BitList(0, 0, 1));
    }

    /**
     * Constructor to create message from binary encoded message
     * calls decodeBinary to decode message.
     * @param list to be decoded
     */
    public ERROR_MESSAGE(final LLRPBitList list)
        throws InvalidLLRPMessageException {
        decodeBinary(list.toByteArray());
    }

    /**
     * Constructor to create message from binary encoded message
     * calls decodeBinary to decode message.
     * @param byteArray representing message
     */
    public ERROR_MESSAGE(final byte[] byteArray)
        throws InvalidLLRPMessageException {
        decodeBinary(byteArray);
    }

    /**
    * Constructor to create message from xml encoded message
    * calls decodeXML to decode message.
    * @param document to be decoded
    */
    public ERROR_MESSAGE(final Document document)
        throws InvalidLLRPMessageException {
        decodeXML(document);
    }

    /**
    * {@inheritDoc}
    */
    protected LLRPBitList encodeBinarySpecific()
        throws InvalidLLRPMessageException {
        LLRPBitList resultBits = new LLRPBitList();

        if (lLRPStatus == null) {
            // single parameter, may not be null
            LOGGER.warn(" lLRPStatus not set");
            throw new InvalidLLRPMessageException(" lLRPStatus not set");
        } else {
            resultBits.append(lLRPStatus.encodeBinary());
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

            Element root = new Element("ERROR_MESSAGE", ns);
            //	Element root = new Element("ERROR_MESSAGE");
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
            if (lLRPStatus == null) {
                LOGGER.info("lLRPStatus not set");
                throw new MissingParameterException("lLRPStatus not set");
            } else {
                root.addContent(lLRPStatus.encodeXML(lLRPStatus.getClass()
                                                               .getSimpleName(),
                        ns));
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
                "ERROR_MESSAGE misses non optional parameter of type LLRPStatus");
            throw new InvalidLLRPMessageException(
                "ERROR_MESSAGE misses non optional parameter of type LLRPStatus");
        }

        if (binary.get(position)) {
            // length can statically be determined for TV Parameters
            tempLength = lLRPStatus.length();
        }

        if ((type != null) && type.equals(LLRPStatus.TYPENUM)) {
            lLRPStatus = new LLRPStatus(binary.subList(position, tempLength));
            position += tempLength;
            LOGGER.debug(
                " lLRPStatus is instantiated with LLRPStatus with length" +
                tempLength);
        } else {
            LOGGER.warn(
                "ERROR_MESSAGE misses non optional parameter of type LLRPStatus");
            throw new InvalidLLRPMessageException(
                "ERROR_MESSAGE misses non optional parameter of type LLRPStatus");
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
            temp = root.getChild("LLRPStatus", ns);

            if (temp != null) {
                lLRPStatus = new LLRPStatus(temp);
                LOGGER.info(
                    "setting parameter lLRPStatus for parameter ERROR_MESSAGE");
            } else {
                LOGGER.warn(
                    "ERROR_MESSAGE misses non optional parameter of type lLRPStatus");
                throw new MissingParameterException(
                    "ERROR_MESSAGE misses non optional parameter of type lLRPStatus");
            }

            root.removeChild("LLRPStatus", ns);

            if (root.getChildren().size() > 0) {
                String message = "ERROR_MESSAGE has unknown element " +
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
    * set lLRPStatus of type LLRPStatus.
    * @param  lLRPStatus to be set
    */
    public void setLLRPStatus(final LLRPStatus lLRPStatus) {
        this.lLRPStatus = lLRPStatus;
    }

    // end setter

    //getters

    /**
    * get lLRPStatus of type LLRPStatus .
    * @return  LLRPStatus
    */
    public LLRPStatus getLLRPStatus() {
        return lLRPStatus;
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
        return "ERROR_MESSAGE";
    }

    /**
    * return uniuque type number.
    * @return SignedShort holding unique type number
    */
    public SignedShort getTypeNum() {
        return TYPENUM;
    }
}
