package util;

//import static org.junit.Assert.*;

public class StringUtilTest {

    public static void main(String[] args) {

        String result = StringUtil.repeat("Hello", 5);
        if (!result.equals("HelloHelloHelloHelloHello")){
            System.out.println("Error");
        }

        String result2 = StringUtil.repeat("Hello", 1);
        if (!result2.equals("Hello")){
            System.out.println("Error");
        }
    }
}