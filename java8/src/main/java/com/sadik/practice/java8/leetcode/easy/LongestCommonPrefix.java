package com.sadik.practice.java8.leetcode.easy;
//LC - 14
public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] test1 = {"flower", "flow", "flight"};
        System.out.println("Input: [flower, flow, flight]");
        System.out.println("Output: " + longestCommonPrefix(test1));
    }

    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }

        String prefix = strs[0];

        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }
        return prefix;
    }
}
