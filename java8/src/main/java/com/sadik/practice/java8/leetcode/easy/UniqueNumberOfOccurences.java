package com.sadik.practice.java8.leetcode.easy;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
//LC - #1207
public class UniqueNumberOfOccurences {

    public static void main(String[] args) {
        int[] arr1 = {1,2,2,1,1,3};
        int[] arr2 = {1,2};

        System.out.println(uniqueOccurrences(arr1));
        System.out.println(uniqueOccurrences(arr2));
    }

    public static boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> countMap = new HashMap<>();
        for (int num : arr) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        Set<Integer> freqSet = new HashSet<>(countMap.values());

        return countMap.size() == freqSet.size();
    }
}
