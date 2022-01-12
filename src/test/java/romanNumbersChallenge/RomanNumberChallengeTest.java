package romanNumbersChallenge;

import org.junit.Test;

import static org.junit.Assert.*;

public class RomanNumberChallengeTest {

    @Test
    public void number_1_to_roman() {
        RomanNumberChallenge romanNumberChallenge = new RomanNumberChallenge();

        assertTrue("I", romanNumberChallenge.changeToRomanNumber(1) == "I");
        assertTrue("II", romanNumberChallenge.changeToRomanNumber(2) == "II");
        assertTrue("III", romanNumberChallenge.changeToRomanNumber(3) == "III");
        assertTrue("V", romanNumberChallenge.changeToRomanNumber(5) == "V");
        assertTrue("VI", romanNumberChallenge.changeToRomanNumber(6) == "VI");
        assertTrue("VII", romanNumberChallenge.changeToRomanNumber(7) == "VII");
        assertTrue("X", romanNumberChallenge.changeToRomanNumber(10) == "X");
        assertTrue("XI", romanNumberChallenge.changeToRomanNumber(11) == "XI");
        assertTrue("XV", romanNumberChallenge.changeToRomanNumber(15) == "XV");
        assertTrue("XVI", romanNumberChallenge.changeToRomanNumber(16) == "XVI");
        assertTrue("L", romanNumberChallenge.changeToRomanNumber(50) == "L");
        assertTrue("LI", romanNumberChallenge.changeToRomanNumber(51) == "LI");
        assertTrue("LV", romanNumberChallenge.changeToRomanNumber(55) == "LV");
        assertTrue("LVI", romanNumberChallenge.changeToRomanNumber(56) == "LVI");
        assertTrue("LX", romanNumberChallenge.changeToRomanNumber(60) == "LX");
        assertTrue("LXX", romanNumberChallenge.changeToRomanNumber(70) == "LXX");
        assertTrue("LXXX", romanNumberChallenge.changeToRomanNumber(80) == "LXXX");
        assertTrue("LXXXI", romanNumberChallenge.changeToRomanNumber(81) == "LXXXI");
        assertTrue("LXXXV", romanNumberChallenge.changeToRomanNumber(85) == "LXXXV");
        assertTrue("LXXXVI", romanNumberChallenge.changeToRomanNumber(86) == "LXXXVI");
        assertTrue("CXXVI", romanNumberChallenge.changeToRomanNumber(126) == "CXXVI");
        assertTrue("MMDVII", romanNumberChallenge.changeToRomanNumber(2507) == "MMDVII");

        // Números que se restan de otros números.
        assertTrue("IV", romanNumberChallenge.changeToRomanNumber(4) == "IV");
        assertTrue("IX", romanNumberChallenge.changeToRomanNumber(9) == "IX");
        assertTrue("XIV", romanNumberChallenge.changeToRomanNumber(14) == "XIV");
        assertTrue("XIX", romanNumberChallenge.changeToRomanNumber(19) == "XIX");
        assertTrue("XXIV", romanNumberChallenge.changeToRomanNumber(24) == "XXIV");
        assertTrue("XL", romanNumberChallenge.changeToRomanNumber(40) == "XL");
        assertTrue("XLIX", romanNumberChallenge.changeToRomanNumber(49) == "XLIX");
        assertTrue("XC", romanNumberChallenge.changeToRomanNumber(90) == "XC");
        assertTrue("XCIX", romanNumberChallenge.changeToRomanNumber(99) == "XCIX");
        assertTrue("CD", romanNumberChallenge.changeToRomanNumber(400) == "CD");
        assertTrue("CM", romanNumberChallenge.changeToRomanNumber(900) == "CM");

    }
}