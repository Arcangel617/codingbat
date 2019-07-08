package com.codingbat;

import com.googlecode.zohhak.api.TestWith;
import com.googlecode.zohhak.api.runners.ZohhakRunner;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;

@RunWith(ZohhakRunner.class)
public class String1Test {

    private String1 string1 = new String1();

    @TestWith({
            "Bob  , Hello Bob!",
            "Alice, Hello Alice!",
            "X    , Hello X!"
    })
    public void shouldReturnHelloName(String name, String expected) {
        String result = string1.helloName(name);
        assertEquals(expected, result);
    }

    @TestWith({
            "Hi  , Bye  , HiByeByeHi",
            "Yo  , Alice, YoAliceAliceYo",
            "What, Up   , WhatUpUpWhat"
    })
    public void shouldReturnMakeAbba(String a, String b, String expected) {
        String result = string1.makeAbba(a, b);
        assertEquals(expected, result);
    }

    @TestWith({
            "i   , Yay  , <i>Yay</i>",
            "i   , Hello, <i>Hello</i>",
            "cite, Yay  , <cite>Yay</cite>"
    })
    public void shouldReturnMakeTags(String tag, String word, String expected) {
        String result = string1.makeTags(tag, word);
        assertEquals(expected, result);
    }

    @TestWith({
            "Hello, lololo",
            "ab   , ababab",
            "Hi   , HiHiHi"
    })
    public void shouldReturnExtraEnd(String str, String expected) {
        String result = string1.extraEnd(str);
        assertEquals(expected, result);
    }

    @TestWith({
            "Hello  , He",
            "abcdefg, ab",
            "ab     ,ab",
            "a      , a"
    })
    public void shouldReturnFirstTwo(String str, String expected) {
        String result = string1.firstTwo(str);
        assertEquals(expected, result);
    }

    @TestWith({
            "WooHoo    , Woo",
            "HelloThere, Hello",
            "abcdef    , abc"
    })
    public void shouldReturnFirstHalf(String str, String expected) {
        String result = string1.firstHalf(str);
        assertEquals(expected, result);
    }

    @TestWith({
            "Hello , ell",
            "java  , av",
            "coding, odin"
    })
    public void shouldReturnWithoutEnd(String str, String expected) {
        String result = string1.withoutEnd(str);
        assertEquals(expected, result);
    }

    @TestWith({
            "Hello, hi   , hiHellohi",
            "hi   , Hello, hiHellohi",
            "aaa  , b    , baaab"
    })
    public void shouldReturnComboString(String a, String b, String expected) {
        String result = string1.comboString(a, b);
        assertEquals(expected, result);
    }

    @TestWith({
            "Hello, There, ellohere",
            "java , code , avaode",
            "shotl, java , hotlava"
    })
    public void shouldReturnNonStart(String a, String b, String expected) {
        String result = string1.nonStart(a, b);
        assertEquals(expected, result);
    }

    @TestWith({
            "Hello, lloHe",
            "java , vaja",
            "Hi   , Hi"
    })
    public void shouldReturnLeft2(String str, String expected) {
        String result = string1.left2(str);
        assertEquals(expected, result);
    }

    @TestWith({
            "Hello, loHel",
            "java , vaja",
            "Hi   , Hi"
    })
    public void shouldRight2(String str, String expected) {
        String result = string1.right2(str);
        assertEquals(expected, result);
    }

    @TestWith({
            "Hello, true , H",
            "Hello, false, o",
            "ohn  , true , o"
    })
    public void shouldReturnTheEnd(String str, boolean front, String expected) {
        String result = string1.theEnd(str, front);
        assertEquals(expected, result);
    }

    @TestWith({
            "Hello, ell",
            "abc  , b",
            "ab   , "
    })
    public void shouldReturnTheEnd2(String str, String expected) {
        String result = string1.withouEnd2(str);
        assertEquals(expected, result);
    }
}