package stringChallenge;

import org.junit.Test;
import static org.junit.Assert.*;

public class StringUtlTest {
    @Test
    public void is_not_empty(){
        String str = "Is not empty";
        assertTrue(StringUtl.isEmpty(str));
    }
    @Test
    public void is_empty(){
        String str = "";
        assertFalse(StringUtl.isEmpty(str));
    }
    @Test
    public void is_null() {
        String str = null;
        assertFalse(StringUtl.isEmpty(str));
    }
    @Test
    public void is_empty_with_spaces() {
        String str = "  ";
        assertFalse(StringUtl.isEmpty(str));
    }
}