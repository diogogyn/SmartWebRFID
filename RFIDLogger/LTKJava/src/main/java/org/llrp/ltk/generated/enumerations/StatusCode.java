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
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */
package org.llrp.ltk.generated.enumerations;

import org.apache.log4j.Logger;

import org.jdom.Content;
import org.jdom.Element;
import org.jdom.Namespace;
import org.jdom.Text;

import org.llrp.ltk.generated.LLRPConstants;
import org.llrp.ltk.types.LLRPBitList;
import org.llrp.ltk.types.LLRPEnumeration;
import org.llrp.ltk.types.UnsignedShort;
import org.llrp.ltk.types.UnsignedShort;

import java.lang.IllegalArgumentException;

import java.math.BigInteger;

import java.util.LinkedList;
import java.util.List;


/**
 * StatusCode is Enumeration of Type UnsignedShort
 */
public class StatusCode extends UnsignedShort implements LLRPEnumeration {
    public static final int M_Success = 0;
    public static final int M_ParameterError = 100;
    public static final int M_FieldError = 101;
    public static final int M_UnexpectedParameter = 102;
    public static final int M_MissingParameter = 103;
    public static final int M_DuplicateParameter = 104;
    public static final int M_OverflowParameter = 105;
    public static final int M_OverflowField = 106;
    public static final int M_UnknownParameter = 107;
    public static final int M_UnknownField = 108;
    public static final int M_UnsupportedMessage = 109;
    public static final int M_UnsupportedVersion = 110;
    public static final int M_UnsupportedParameter = 111;
    public static final int P_ParameterError = 200;
    public static final int P_FieldError = 201;
    public static final int P_UnexpectedParameter = 202;
    public static final int P_MissingParameter = 203;
    public static final int P_DuplicateParameter = 204;
    public static final int P_OverflowParameter = 205;
    public static final int P_OverflowField = 206;
    public static final int P_UnknownParameter = 207;
    public static final int P_UnknownField = 208;
    public static final int P_UnsupportedParameter = 209;
    public static final int A_Invalid = 300;
    public static final int A_OutOfRange = 301;
    public static final int R_DeviceError = 401;
    Logger logger = Logger.getLogger(StatusCode.class);

    public StatusCode() {
        super(0);
    }

    /**
     * Create new StatusCode by passing integer value.
     *
     * @throws IllegalArgumentException
     * if the value is not allowed for this enumeration
     * @param value an Integer value allowed - might check first
     * with isValidValue it it is an allowed value
     */
    public StatusCode(int value) {
        super(value);

        if (!isValidValue(value)) {
            throw new IllegalArgumentException("Value not allowed");
        }
    }

    /**
    * Create new StatusCode by passing jdom element.
    *
    * @throws IllegalArgumentException
    * if the value found in element is not allowed
    * for this enumeration.
    * @param element - jdom element where the child is a string
    * that is the name for a value of the enumeration.
    */
    public StatusCode(final Element element) {
        this(element.getText());
    }

    /**
    * Create new StatusCode by passing a string.
    *
    * @throws IllegalArgumentException
    * if the string does not stand for a valid value.
    */
    public StatusCode(final String name) {
        if (!isValidName(name)) {
            throw new IllegalArgumentException("Name not allowed");
        }

        this.value = getValue(name);
        signed = false;
    }

    /**
     * Create new StatusCode by passing LLRPBitList.
     *
     * @throws IllegalArgumentException
     * if the value found in the BitList is not allowed
     * for this enumeration.
     * @param list - LLRPBitList
     */
    public StatusCode(final LLRPBitList list) {
        decodeBinary(list);

        if (!isValidValue(new Integer(toInteger()))) {
            throw new IllegalArgumentException("Value not allowed");
        }
    }

    /**
    * set the current value of this enumeration to the
    * value identified by given string.
    *
    * @throws IllegalArgumentException
    * if the value found for given String is not allowed
    * for this enumeration.
    * @param name set this enumeration to hold one of the allowed values
    */
    public final void set(final String name) {
        if (!isValidName(name)) {
            throw new IllegalArgumentException("name not allowed");
        }

        this.value = getValue(name);
    }

    /**
    * set the current value of this enumeration to the
    * value given.
    *
    * @throws IllegalArgumentException
    * if the value is not allowed
    * for this enumeration.
    * @param value to be set
    */
    public final void set(final int value) {
        if (!isValidValue(value)) {
            throw new IllegalArgumentException("value not allowed");
        }

        this.value = value;
    }

    /**
            * {@inheritDoc}
     */
    public Content encodeXML(final String name, Namespace ns) {
        Element element = new Element(name, ns);
        //Element element = new Element(name, Namespace.getNamespace("llrp",LLRPConstants.LLRPNAMESPACE));
        element.setContent(new Text(toString()));

        return element;
    }

    /**
    * {@inheritDoc}
    */
    public String toString() {
        return getName(toInteger());
    }

    /**
            * {@inheritDoc}
     */
    public boolean isValidValue(final int value) {
        switch (value) {
        case 0:
            return true;

        case 100:
            return true;

        case 101:
            return true;

        case 102:
            return true;

        case 103:
            return true;

        case 104:
            return true;

        case 105:
            return true;

        case 106:
            return true;

        case 107:
            return true;

        case 108:
            return true;

        case 109:
            return true;

        case 110:
            return true;

        case 111:
            return true;

        case 200:
            return true;

        case 201:
            return true;

        case 202:
            return true;

        case 203:
            return true;

        case 204:
            return true;

        case 205:
            return true;

        case 206:
            return true;

        case 207:
            return true;

        case 208:
            return true;

        case 209:
            return true;

        case 300:
            return true;

        case 301:
            return true;

        case 401:
            return true;

        default:
            return false;
        }
    }

    /**
            * {@inheritDoc}
     */
    public final int getValue(final String name) {
        if (name.equalsIgnoreCase("M_Success")) {
            return 0;
        }

        if (name.equalsIgnoreCase("M_ParameterError")) {
            return 100;
        }

        if (name.equalsIgnoreCase("M_FieldError")) {
            return 101;
        }

        if (name.equalsIgnoreCase("M_UnexpectedParameter")) {
            return 102;
        }

        if (name.equalsIgnoreCase("M_MissingParameter")) {
            return 103;
        }

        if (name.equalsIgnoreCase("M_DuplicateParameter")) {
            return 104;
        }

        if (name.equalsIgnoreCase("M_OverflowParameter")) {
            return 105;
        }

        if (name.equalsIgnoreCase("M_OverflowField")) {
            return 106;
        }

        if (name.equalsIgnoreCase("M_UnknownParameter")) {
            return 107;
        }

        if (name.equalsIgnoreCase("M_UnknownField")) {
            return 108;
        }

        if (name.equalsIgnoreCase("M_UnsupportedMessage")) {
            return 109;
        }

        if (name.equalsIgnoreCase("M_UnsupportedVersion")) {
            return 110;
        }

        if (name.equalsIgnoreCase("M_UnsupportedParameter")) {
            return 111;
        }

        if (name.equalsIgnoreCase("P_ParameterError")) {
            return 200;
        }

        if (name.equalsIgnoreCase("P_FieldError")) {
            return 201;
        }

        if (name.equalsIgnoreCase("P_UnexpectedParameter")) {
            return 202;
        }

        if (name.equalsIgnoreCase("P_MissingParameter")) {
            return 203;
        }

        if (name.equalsIgnoreCase("P_DuplicateParameter")) {
            return 204;
        }

        if (name.equalsIgnoreCase("P_OverflowParameter")) {
            return 205;
        }

        if (name.equalsIgnoreCase("P_OverflowField")) {
            return 206;
        }

        if (name.equalsIgnoreCase("P_UnknownParameter")) {
            return 207;
        }

        if (name.equalsIgnoreCase("P_UnknownField")) {
            return 208;
        }

        if (name.equalsIgnoreCase("P_UnsupportedParameter")) {
            return 209;
        }

        if (name.equalsIgnoreCase("A_Invalid")) {
            return 300;
        }

        if (name.equalsIgnoreCase("A_OutOfRange")) {
            return 301;
        }

        if (name.equalsIgnoreCase("R_DeviceError")) {
            return 401;
        }

        return -1;
    }

    /**
             * {@inheritDoc}
     */
    public final String getName(final int value) {
        if (0 == value) {
            return "M_Success";
        }

        if (100 == value) {
            return "M_ParameterError";
        }

        if (101 == value) {
            return "M_FieldError";
        }

        if (102 == value) {
            return "M_UnexpectedParameter";
        }

        if (103 == value) {
            return "M_MissingParameter";
        }

        if (104 == value) {
            return "M_DuplicateParameter";
        }

        if (105 == value) {
            return "M_OverflowParameter";
        }

        if (106 == value) {
            return "M_OverflowField";
        }

        if (107 == value) {
            return "M_UnknownParameter";
        }

        if (108 == value) {
            return "M_UnknownField";
        }

        if (109 == value) {
            return "M_UnsupportedMessage";
        }

        if (110 == value) {
            return "M_UnsupportedVersion";
        }

        if (111 == value) {
            return "M_UnsupportedParameter";
        }

        if (200 == value) {
            return "P_ParameterError";
        }

        if (201 == value) {
            return "P_FieldError";
        }

        if (202 == value) {
            return "P_UnexpectedParameter";
        }

        if (203 == value) {
            return "P_MissingParameter";
        }

        if (204 == value) {
            return "P_DuplicateParameter";
        }

        if (205 == value) {
            return "P_OverflowParameter";
        }

        if (206 == value) {
            return "P_OverflowField";
        }

        if (207 == value) {
            return "P_UnknownParameter";
        }

        if (208 == value) {
            return "P_UnknownField";
        }

        if (209 == value) {
            return "P_UnsupportedParameter";
        }

        if (300 == value) {
            return "A_Invalid";
        }

        if (301 == value) {
            return "A_OutOfRange";
        }

        if (401 == value) {
            return "R_DeviceError";
        }

        return "";
    }

    /**
             * {@inheritDoc}
     */
    public boolean isValidName(final String name) {
        if (name.equals("M_Success")) {
            return true;
        }

        if (name.equals("M_ParameterError")) {
            return true;
        }

        if (name.equals("M_FieldError")) {
            return true;
        }

        if (name.equals("M_UnexpectedParameter")) {
            return true;
        }

        if (name.equals("M_MissingParameter")) {
            return true;
        }

        if (name.equals("M_DuplicateParameter")) {
            return true;
        }

        if (name.equals("M_OverflowParameter")) {
            return true;
        }

        if (name.equals("M_OverflowField")) {
            return true;
        }

        if (name.equals("M_UnknownParameter")) {
            return true;
        }

        if (name.equals("M_UnknownField")) {
            return true;
        }

        if (name.equals("M_UnsupportedMessage")) {
            return true;
        }

        if (name.equals("M_UnsupportedVersion")) {
            return true;
        }

        if (name.equals("M_UnsupportedParameter")) {
            return true;
        }

        if (name.equals("P_ParameterError")) {
            return true;
        }

        if (name.equals("P_FieldError")) {
            return true;
        }

        if (name.equals("P_UnexpectedParameter")) {
            return true;
        }

        if (name.equals("P_MissingParameter")) {
            return true;
        }

        if (name.equals("P_DuplicateParameter")) {
            return true;
        }

        if (name.equals("P_OverflowParameter")) {
            return true;
        }

        if (name.equals("P_OverflowField")) {
            return true;
        }

        if (name.equals("P_UnknownParameter")) {
            return true;
        }

        if (name.equals("P_UnknownField")) {
            return true;
        }

        if (name.equals("P_UnsupportedParameter")) {
            return true;
        }

        if (name.equals("A_Invalid")) {
            return true;
        }

        if (name.equals("A_OutOfRange")) {
            return true;
        }

        if (name.equals("R_DeviceError")) {
            return true;
        }

        return false;
    }

    /**
    * number of bits used to represent this type.
    *
    * @return Integer
    */
    public static int length() {
        return UnsignedShort.length();
    }

    /**
          * wrapper method for UnsignedIntegers that use BigIntegers to store value
    *
    */
    private final String getName(final BigInteger value) {
        logger.warn("StatusCode must convert BigInteger " + value +
            " to Integer value " + value.intValue());

        return getName(value.intValue());
    }

    /**
    * wrapper method for UnsignedIntegers that use BigIntegers to store value
    *
    */
    private final boolean isValidValue(final BigInteger value) {
        logger.warn("StatusCode must convert BigInteger " + value +
            " to Integer value " + value.intValue());

        return isValidValue(value.intValue());
    }
}
