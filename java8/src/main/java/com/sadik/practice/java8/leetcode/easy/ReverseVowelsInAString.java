package com.sadik.practice.java8.leetcode.easy;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
//LC - 345
public class ReverseVowelsInAString {
    public static void main(String[] args) {
        System.out.println(reverseVowels("hello"));
    }

    private static String reverseVowels(String s) {

        if(s == null || s.length() <= 1) return s;

        Set<Character> vowels = new HashSet<>(
                Arrays.asList('a','e','i','o','u','A','E','I','O','U')
        );

        char[] chars = s.toCharArray();
        int left = 0;
        int right = chars.length - 1;

        while(left < right){
            while(left < right && !vowels.contains(chars[left])){
                left++;
            }
            while(left < right && !vowels.contains(chars[left])){
                right--;
            }

            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
            left++;
            right--;
        }
        return new String(chars);
    }
}
