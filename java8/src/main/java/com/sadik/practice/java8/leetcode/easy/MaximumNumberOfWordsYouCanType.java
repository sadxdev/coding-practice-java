package com.sadik.practice.java8.leetcode.easy;

import java.util.HashSet;
import java.util.Set;
//Lc - 1935
public class MaximumNumberOfWordsYouCanType {
    public static void main(String[] args) {
        String text = "leet code";
        String brokenLetters = "lc";

        System.out.println(MaxNumberOfWords(text, brokenLetters));
    }

    private static int MaxNumberOfWords(String text, String brokenLetters) {
        Set<Character> brokenSet = new HashSet<>();
        for(char c : brokenLetters.toCharArray()){
            brokenSet.add(c);
        }

        String[] words = text.split(" ");
        int count = 0;

        for(String word : words){
            boolean canType = true;
            for(int i = 0; i < words.length; i++){
                if(brokenSet.contains(word.charAt(i))){
                    canType = false;
                    break;
                }
            }
            if(canType) count++;
        }
        return count;
    }
}
