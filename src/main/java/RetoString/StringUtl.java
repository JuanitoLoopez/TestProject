package RetoString;

public class StringUtl {
    public static boolean isEmpty(String str) {
        if (str == "" || str == null || str.trim().length() == 0) {
            return false;
        } else {
            return true;
        }
    }
}
