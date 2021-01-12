package org.itstep;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringUtilsTest {

    @Test
    public void countSpaces() {
        String input = "one two three four";
        int actual = StringUtils.countSpaces(input);
        Assert.assertEquals("Пробелов должно быть 3", 3, actual);
    }

    @Test
    public void countSpace2() {
        Assert.assertEquals(4, StringUtils.countSpaces("    "));
    }
}