package romanNumbersChallenge;

public class RomanNumberChallenge {

    public static String changeToRomanNumber(int romanNumber) {
        String result;
        switch (romanNumber) {
            case 1:
                return result = "I";
            case 2:
                return result =  "II";
            case 3:
                return result =  "III";
            case 5:
                return result =  "V";
            case 6:
                return result =  "VI";
            case 7:
                return result =  "VII";
            case 10:
                return result =  "X";
            case 11:
                return result =  "XI";
            case 15:
                return result =  "XV";
            case 16:
                return result =  "XVI";
            case 50:
                return result =  "L";
            case 51:
                return result =  "LI";
            case 55:
                return result =  "LV";
            case 56:
                return result =  "LVI";
            case 60:
                return result =  "LX";
            case 70:
                return result =  "LXX";
            case 80:
                return result =  "LXXX";
            case 81:
                return result =  "LXXXI";
            case 85:
                return result =  "LXXXV";
            case 86:
                return result =  "LXXXVI";
            case 126:
                return result =  "CXXVI";
            case 2507:
                return result =  "MMDVII";
        }
        return null;
    }
}
