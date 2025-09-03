package com.tp2.roman;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class RomanNumeralsTest {

    // TODO: Replace these lines with your tests
    @Test
    void testOne() {
        RomanNumerals converter = new RomanNumerals();
        assertEquals("I", converter.convert(1));
    }

    @Test
    void testFive() {
        RomanNumerals converter = new RomanNumerals();
        assertEquals("V", converter.convert(5));
    }

    @Test
    void testTen() {
        RomanNumerals converter = new RomanNumerals();
        assertEquals("X", converter.convert(10));
    }


    @Test
    void testFour() {
        RomanNumerals converter = new RomanNumerals();
        assertEquals("IV", converter.convert(4));
    }

    @Test
    void testNine() {
        RomanNumerals converter = new RomanNumerals();
        assertEquals("IX", converter.convert(9));
    }


    @Test
    void testForty() {
        RomanNumerals converter = new RomanNumerals();
        assertEquals("XL", converter.convert(40));
    }

    @Test
    void testFifty() {
        RomanNumerals converter = new RomanNumerals();
        assertEquals("L", converter.convert(50));
    }

    @Test
    void testNinety() {
        RomanNumerals converter = new RomanNumerals();
        assertEquals("XC", converter.convert(90));
    }

    @Test
    void testHundred() {
        RomanNumerals converter = new RomanNumerals();
        assertEquals("C", converter.convert(100));
    }


    @Test
    void testFourHundred() {
        RomanNumerals converter = new RomanNumerals();
        assertEquals("CD", converter.convert(400));
    }

    @Test
    void testFiveHundred() {
        RomanNumerals converter = new RomanNumerals();
        assertEquals("D", converter.convert(500));
    }

    @Test
    void testNineHundred() {
        RomanNumerals converter = new RomanNumerals();
        assertEquals("CM", converter.convert(900));
    }

    @Test
    void testThousand() {
        RomanNumerals converter = new RomanNumerals();
        assertEquals("M", converter.convert(1000));
    }


    @Test
    void testComplex1994() {
        RomanNumerals converter = new RomanNumerals();
        assertEquals("MCMXCIV", converter.convert(1994));
    }

    @Test
    void testComplex2023() {
        RomanNumerals converter = new RomanNumerals();
        assertEquals("MMXXIII", converter.convert(2023));
    }

    @Test
    void testComplex27() {
        RomanNumerals converter = new RomanNumerals();
        assertEquals("XXVII", converter.convert(27));
    }
}
//    Missing tests:
//
//- Convert 1 to "I"
//- Convert 5 to "V"
//- Convert 10 to "X"
//- Convert 4 to "IV" (subtraction case)
//- Convert 9 to "IX" (subtraction case)
//- Convert 40 to "XL"
//- Convert 50 to "L"
//- Convert 90 to "XC"
//- Convert 100 to "C"
//- Convert 400 to "CD"
//- Convert 500 to "D"
//- Convert 900 to "CM"
//- Convert 1000 to "M"
//- Convert complex numbers like 1994 to "MCMXCIV"

