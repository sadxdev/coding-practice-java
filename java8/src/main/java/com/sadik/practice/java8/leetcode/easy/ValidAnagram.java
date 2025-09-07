package com.sadik.practice.java8.leetcode.easy;

import java.util.Arrays;

// #242
public class ValidAnagram {
    public static void main(String[] args) {
        String str1 = "alert";
        String str2 = "later";
        System.out.println(areAnagrams(str1, str2));
    }

    public static boolean areAnagrams(String str1, String str2){
       if(str1.length() != str2.length()){
           return false;
       }

       char[] arr1 = str1.toCharArray();
       char[] arr2 = str2.toCharArray();

       Arrays.sort(arr1);
       Arrays.sort(arr2);

       return Arrays.equals(arr1, arr2);
    }
}
