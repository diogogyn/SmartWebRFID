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
 * This is the response by the Reader to an ENABLE_ACCESSSPEC command. If there was an AccessSpec corresponding to the AccessSpecID, and the Reader was able to move that AccessSpec from the disabled to the active state, then the success code is returned in the LLRPStatus parameter. If there is an error, the appropriate error code is returned in the LLRPStatus parameter.

See also {@link <a href="http://www.epcglobalinc.org/standards/llrp/llrp_1_0_1-standard-20070813.pdf#page=62&view=fit">LLRP Specification Section 11.1.6</a>}
 and {@link <a href="http://www.epcglobalinc.org/standards/llrp/llrp_1_0_1-standard-20070813.pdf#page=122&view=fit">LLRP Specification Section 16.1.22</a>}


 */
public class ENABLE_ACCESSSPEC_RESPONSE extends LLRPMessage {
    public static final SignedShort TYPENUM = new SignedShort(52);
    private static final Logger LOGGER = Logger.getLogger(ENABLE_ACCESSSPEC_RESPONSE.class);
    public static final String RESPONSETYPE = "";
    protected LLRPStatus lLRPStatus;

    /**
     * empty constructor to create new message
     * with LLRP version set to 1.0 (0x1).
     */
    public ENABLE_ACCESSSPEC_RESPONSE() {
        setVersion(new BitList(0, 0, 1));
    }

    /**
     * Constructor to create message from binary encoded message
     * calls decodeBinary to decode message.
     * @param list to be decoded
     */
    public ENABLE_ACCESSSPEC_RESPONSE(final LLRPBitList list)
        throws InvalidLLRPMessageException {
        decodeBinary(list.toByteArray());
    }

    /**
     * Constructor to create message from binary encoded message
     * calls decodeBinary to decode message.
     * @param byteArray representing message
     */
    public ENABLE_ACCESSSPEC_RESPONSE(final byte[] byteArray)
        throws InvalidLLRPMessageException {
        decodeBinary(byteArray);
    }

    /**
    * Constructor to create message from xml encoded message
    * calls decodeXML to decode message.
    * @param document to be decoded
    */
    public ENABLE_ACCESSSPEC_RESPONSE(final Document document)
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

            Element root = new Element("ENABLE_ACCESSSPEC_RESPONSE", ns);
            //	Element root = new Element("ENABLE_ACCESSSPEC_RESPONSE");
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
                "ENABLE_ACCESSSPEC_RESPONSE misses non optional parameter of type LLRPStatus");
            throw new InvalidLLRPMessageException(
                "ENABLE_ACCESSSPEC_RESPONSE misses non optional parameter of type LLRPStatus");
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
                "ENABLE_ACCESSSPEC_RESPONSE misses non optional parameter of type LLRPStatus");
            throw new InvalidLLRPMessageException(
                "ENABLE_ACCESSSPEC_RESPONSE misses non optional parameter of type LLRPStatus");
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
                    "setting parameter lLRPStatus for parameter ENABLE_ACCESSSPEC_RESPONSE");
            } else {
                LOGGER.warn(
                    "ENABLE_ACCESSSPEC_RESPONSE misses non optional parameter of type lLRPStatus");
                throw new MissingParameterException(
                    "ENABLE_ACCESSSPEC_RESPONSE misses non optional parameter of type lLRPStatus");
            }

            root.removeChild("LLRPStatus", ns);

            if (root.getChildren().size() > 0) {
                String message = "ENABLE_ACCESSSPEC_RESPONSE has unknown element " +
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
        return "ENABLE_ACCESSSPEC_RESPONSE";
    }

    /**
    * return uniuque type number.
    * @return SignedShort holding unique type number
    */
    public SignedShort getTypeNum() {
        return TYPENUM;
    }
}
