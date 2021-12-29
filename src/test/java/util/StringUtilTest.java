package util;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class StringUtilTest {

    @Test
    public void repeat_string_once() {
        Assert.assertEquals("Hello", StringUtil.repeat("Hello", 1) );
    }
    @Test
    public void repeat_sting_multiple_times() {
        Assert.assertEquals("HelloHelloHelloHelloHello", StringUtil.repeat("Hello", 5) );
    }
    @Test
    public void repeat_sting_zero_times() {
        Assert.assertEquals("", StringUtil.repeat("Hello", 0) );
    }
    @Test(expected = IllegalArgumentException.class)
    public void repeat_sting_negative_times() {
        StringUtil.repeat("Hello", -1);

    }
}