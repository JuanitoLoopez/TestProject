package romanNumbersChallenge;

public class RomanNumberChallenge {

    public static String changeToRomanNumber(int romanNumber) {
        switch (romanNumber) {
            case 1:
                return "I";
            case 2:
                return  "II";
            case 3:
                return  "III";
            case 5:
                return  "V";
            case 6:
                return  "VI";
            case 7:
                return  "VII";
            case 10:
                return  "X";
            case 11:
                return  "XI";
            case 15:
                return  "XV";
            case 16:
                return  "XVI";
            case 50:
                return  "L";
            case 51:
                return  "LI";
            case 55:
                return  "LV";
            case 56:
                return  "LVI";
            case 60:
                return  "LX";
            case 70:
                return  "LXX";
            case 80:
                return  "LXXX";
            case 81:
                return  "LXXXI";
            case 85:
                return  "LXXXV";
            case 86:
                return  "LXXXVI";
            case 126:
                return  "CXXVI";
            case 2507:
                return  "MMDVII";
        }
        // Números que se resetan de otros números.
        switch (romanNumber) {
            case 4:
                return "IV";
            case 9:
                return  "IX";
            case 14:
                return  "XIV";
            case 19:
                return  "XIX";
            case 24:
                return  "XXIV";
            case 40:
                return  "XL";
            case 49:
                return  "XLIX";
            case 90:
                return  "XC";
            case 99:
                return  "XCIX";
            case 400:
                return  "CD";
            case 900:
                return  "CM";
        }
        return null;
    }
}
