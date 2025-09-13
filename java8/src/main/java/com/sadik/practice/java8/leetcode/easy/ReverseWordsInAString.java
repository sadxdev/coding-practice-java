package com.sadik.practice.java8.leetcode.easy;
//LC - 151
public class ReverseWordsInAString {
    public static void main(String[] args) {
        String str = "the sky is blue";
        System.out.println(reverseWords(str));
    }

    private static String reverseWords(String str) {
        String[] words = str.trim().split("\\s+");
        int left = 0;
        int right = words.length - 1;
        while(left < right){
            String temp = words[left];
            words[left] = words[right];
            words[right] = temp;
            left++;
            right--;
        }
        return String.join(" ", words);
    }
}
