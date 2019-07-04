package com.codingbat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class String1ParameterizedTest {

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
                {"<<>>", "Yay", "<<Yay>>"},
                {"<<>>", "WooHoo", "<<WooHoo>>"},
                {"[[]]", "word", "[[word]]"}
        });
    }

    @Parameter
    public String out;
    @Parameter(1)
    public String word;
    @Parameter(2)
    public String expected;

    private String1 string1 = new String1();

    @Test
    public void shouldMakeOutWord() {
        String result = string1.makeOutWord(out, word);
        assertEquals(expected, result);
    }
}