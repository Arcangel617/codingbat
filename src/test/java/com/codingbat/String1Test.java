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

}