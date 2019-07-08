package com.codingbat;

public class String1 {

    public String helloName(String name) {
        return "Hello " + name + "!";
    }

    public String makeAbba(String a, String b) {
        return a + b + b + a;
    }

    public String makeTags(String tag, String word) {
        return "<" + tag + ">" + word + "</" + tag + ">";
    }

    public String makeOutWord(String out, String word) {
        return out.substring(0,2) + word + out.substring(2);
    }

    public String extraEnd(String str) {
        String lastTwoChars = str.substring(str.length()-2);
        return lastTwoChars + lastTwoChars + lastTwoChars;
    }

    public String firstTwo(String str) {
        return str.length() > 2 ? str.substring(0,2) : str;
    }

    public String firstHalf(String str) {
        return str.substring(0, str.length() / 2);
    }

    public String withoutEnd(String str) {
        return str.substring(1, str.length()-1);
    }

    public String comboString(String a, String b) {
        return a.length() > b.length() ? b + a + b : a + b + a;
    }

    public String nonStart(String a, String b) {
        return a.substring(1) + b.substring(1);
    }

    public String left2(String str) {
        return str.length() > 2 ? str.substring(2) + str.substring(0,2) : str;
    }

    public String right2(String str) {
        return str.substring(str.length()-2) + str.substring(0, str.length()-2);
    }

    public String theEnd(String str, boolean front) {
        return front ? str.substring(0,1) : str.substring(str.length()-1);
    }

    public String withouEnd2(String str) {
        return str.length() > 2 ? str.substring(1, str.length()-1) : "";
    }
}
