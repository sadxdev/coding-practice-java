package com.sadik.practice.java8.leetcode.easy;

// #1967
public class SubstringsInAWord {
    public static void main(String[] args) {
        String[] patterns = { "a", "abc", "bc", "d"};
        String word = "abc";

        System.out.println("Number of Substrings in a word : " + CountStrings(patterns, word));
    }

    public static int CountStrings(String[] patterns, String word){

       int count = 0;

       for(String pattern : patterns){
           if(word.contains(pattern)){
               count++;
           }
       }

       return count;
    }
}
