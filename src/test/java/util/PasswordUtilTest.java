package util;

import org.junit.Test;
import static org.junit.Assert.*;
import static util.PasswordUtil.SecurityLevel.*;

public class PasswordUtilTest {

     @Test
    public void weak_when_has_less_than_8_letters(){
         assertEquals(WEAK, PasswordUtil.accessPassword("123ASD"));
     }
     @Test
    public void weak_when_has_only_letters(){

         assertEquals(WEAK, PasswordUtil.accessPassword("ASDasdASDasd"));
     }
     @Test
    public void medium_when_has_letters_and_numbers(){
         assertEquals(MEDIUM, PasswordUtil.accessPassword("ASD123asd"));
     }
     @Test
    public void strong_when_has_letters_numbers_and_symbols(){
         assertEquals(STRONG, PasswordUtil.accessPassword("1234ASD!()"));
     }
}