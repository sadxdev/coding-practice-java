package com.sadik.practice.java8.leetcode.easy;

// Leetcode - 1768
public class MergeStringsAlternately {
    public static void main(String[] args) {
        String word1 = "abc";
        String word2 = "pqr";
        System.out.println(mergeStrings(word1, word2));
    }

    private static String mergeStrings(String word1, String word2) {

        StringBuilder result = new StringBuilder();
        int n1 = word1.length();
        int n2 = word2.length();
        int maxLength = Math.max(n1, n2);

        for(int i = 0; i < maxLength; i++){
            if(i < n1){
                result.append(word1.charAt(i));
            }
            if(i < n2){
                result.append(word2.charAt(i));
            }
        }

        return result.toString();
    }


}

