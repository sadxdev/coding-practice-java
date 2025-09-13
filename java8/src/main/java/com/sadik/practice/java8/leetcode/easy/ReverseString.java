package com.sadik.practice.java8.leetcode.easy;

public class ReverseString {
    public static void main(String[] args) {
        String s = "hello";
        System.out.println(reverseString(s));
    }

    private static String reverseString(String s) {
        char[] c = s.toCharArray();
        int left = 0;
        int right = s.length() - 1;
        while(left < right){
            char temp = c[left];//temp = 'h'
            c[left] = c[right];//0th index = 'o'
            c[right] = temp;//4th index = 'h'
            left++;
            right--;
        }
        String str = new String(c);
        return str;
    }
}
