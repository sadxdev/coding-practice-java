package com.sadik.practice.java8.leetcode.easy;

// Leetcode - 796
public class StringRotations {
    public static void main(String[] args) {
        String s = "abcde";
        String goal = "cdeab";

        System.out.println(areRotations(s, goal));
    }

    private static boolean areRotations(String s, String goal) {
        if(s.length() != goal.length()) return false;

        String doubled = s + s;

        if(doubled.contains(goal)){
            return true;
        } else {
            return false;
        }

//        return s.length() == goal.length() && (s + s).contains(goal);
    }
}
