package util;

import static util.PasswordUtil.SecurityLevel.*;

public class PasswordUtil {

    public enum SecurityLevel{
        WEAK, MEDIUM, STRONG
    }
    public static SecurityLevel accessPassword(String password) {
        if(password.length() < 8){
            return WEAK;
        }
        if (password.matches("[a-zA-Z]+")) {
            return WEAK;
        }
        if (password.matches("[a-zA-Z0-9]+")) {
            return MEDIUM;
        }
        return STRONG;
    }
}
