package com.sadik.practice.java8.leetcode.easy;
//LC - 9
public class PalindromeNumber {
    public static void main(String[] args) {
        int x = 22;
        System.out.println(isPalindrome(x));
    }
    public static boolean isPalindrome(int x){
       if(x < 0 || (x % 10 == 0)) return false;

       int original = x;
       int reversed = 0;

       while(x != 0){
        int digit = x % 10;

        if(reversed > (Integer.MAX_VALUE - digit) / 10) return false;

        reversed = reversed * 10 + digit;
        x /= 10;

       }

       return original == reversed;
    }
}
