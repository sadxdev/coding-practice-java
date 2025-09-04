package com.sadik.practice.java8.leetcode.easy;

import java.util.HashSet;
/*You're given strings jewels representing the types of stones that are jewels, and stones representing the stones you have. Each character in stones is a type of stone you have. You want to know how many of the stones you have are also jewels.

Letters are case sensitive, so "a" is considered a different type of stone from "A".



Example 1:

Input: jewels = "aA", stones = "aAAbbbb"
Output: 3
Example 2:

Input: jewels = "z", stones = "ZZ"
Output: 0*/

public class JewelsAndStones {
    public static void main(String[] args) {
        String jewels = "aA";
        String stones = "aAAbbbbb";
        System.out.println("Input: jewels = " + jewels + ", stones = " + stones);
        System.out.println("Output: " + numJewelsInStones(jewels, stones));
    }

    public static int numJewelsInStones(String jewels, String stones) {

        HashSet<Character> jewelHashSet = new HashSet<>();

        for (char j : jewels.toCharArray()){
            jewelHashSet.add(j);
        }

        int count = 0;

        for (char s : stones.toCharArray()){
            if(jewelHashSet.contains(s)){
                count++;
            }
        }

        return count;
    }
}
