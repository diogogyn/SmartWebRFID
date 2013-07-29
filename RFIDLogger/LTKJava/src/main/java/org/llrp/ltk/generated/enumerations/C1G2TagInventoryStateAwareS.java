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
import org.llrp.ltk.types.Bit;
import org.llrp.ltk.types.Bit;
import org.llrp.ltk.types.LLRPBitList;
import org.llrp.ltk.types.LLRPEnumeration;

import java.lang.IllegalArgumentException;

import java.math.BigInteger;

import java.util.LinkedList;
import java.util.List;


/**
 * C1G2TagInventoryStateAwareS is Enumeration of Type Bit
 */
public class C1G2TagInventoryStateAwareS extends Bit implements LLRPEnumeration {
    public static final int SL = 0;
    public static final int Not_SL = 1;
    Logger logger = Logger.getLogger(C1G2TagInventoryStateAwareS.class);

    public C1G2TagInventoryStateAwareS() {
        super(0);
    }

    /**
     * Create new C1G2TagInventoryStateAwareS by passing integer value.
     *
     * @throws IllegalArgumentException
     * if the value is not allowed for this enumeration
     * @param value an Integer value allowed - might check first
     * with isValidValue it it is an allowed value
     */
    public C1G2TagInventoryStateAwareS(int value) {
        super(value);

        if (!isValidValue(value)) {
            throw new IllegalArgumentException("Value not allowed");
        }
    }

    /**
    * Create new C1G2TagInventoryStateAwareS by passing jdom element.
    *
    * @throws IllegalArgumentException
    * if the value found in element is not allowed
    * for this enumeration.
    * @param element - jdom element where the child is a string
    * that is the name for a value of the enumeration.
    */
    public C1G2TagInventoryStateAwareS(final Element element) {
        this(element.getText());
    }

    /**
    * Create new C1G2TagInventoryStateAwareS by passing a string.
    *
    * @throws IllegalArgumentException
    * if the string does not stand for a valid value.
    */
    public C1G2TagInventoryStateAwareS(final String name) {
        if (!isValidName(name)) {
            throw new IllegalArgumentException("Name not allowed");
        }

        this.value = getValue(name);
        signed = false;
    }

    /**
     * Create new C1G2TagInventoryStateAwareS by passing LLRPBitList.
     *
     * @throws IllegalArgumentException
     * if the value found in the BitList is not allowed
     * for this enumeration.
     * @param list - LLRPBitList
     */
    public C1G2TagInventoryStateAwareS(final LLRPBitList list) {
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

        case 1:
            return true;

        default:
            return false;
        }
    }

    /**
            * {@inheritDoc}
     */
    public final int getValue(final String name) {
        if (name.equalsIgnoreCase("SL")) {
            return 0;
        }

        if (name.equalsIgnoreCase("Not_SL")) {
            return 1;
        }

        return -1;
    }

    /**
             * {@inheritDoc}
     */
    public final String getName(final int value) {
        if (0 == value) {
            return "SL";
        }

        if (1 == value) {
            return "Not_SL";
        }

        return "";
    }

    /**
             * {@inheritDoc}
     */
    public boolean isValidName(final String name) {
        if (name.equals("SL")) {
            return true;
        }

        if (name.equals("Not_SL")) {
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
        return Bit.length();
    }

    /**
          * wrapper method for UnsignedIntegers that use BigIntegers to store value
    *
    */
    private final String getName(final BigInteger value) {
        logger.warn("C1G2TagInventoryStateAwareS must convert BigInteger " +
            value + " to Integer value " + value.intValue());

        return getName(value.intValue());
    }

    /**
    * wrapper method for UnsignedIntegers that use BigIntegers to store value
    *
    */
    private final boolean isValidValue(final BigInteger value) {
        logger.warn("C1G2TagInventoryStateAwareS must convert BigInteger " +
            value + " to Integer value " + value.intValue());

        return isValidValue(value.intValue());
    }
}
