package com.sadik.practice.java8.striversA2ZDSAcourse.Basic;

public class PrintLastCharacterOfString {
    public static void main(String[] args) {
        String str = "akldsfja";
        System.out.println("Print Last Character Of String: " + printLastCharacterOfString(str));
    }

    public static char printLastCharacterOfString(String str) {
        return str.charAt(str.length() - 1);
    }
}
