package com.sadik.practice.java8.leetcode.easy;

public class RemoveTrailingZerosFromAString {
    public static void main(String[] args) {
        String num = "504801000000";
        System.out.println("Output: " + removeTrailingZeros(num));
    }

    private static String removeTrailingZeros(String num) {
        int len = num.length();
        for(int i = len - 1; i >= 0; i--){
            if(num.charAt(i) != '0'){
                return num.substring(0, i + 1);
            }
        }
        return "";
    }
}
