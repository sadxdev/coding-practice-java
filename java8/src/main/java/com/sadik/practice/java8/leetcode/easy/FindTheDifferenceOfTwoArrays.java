package com.sadik.practice.java8.leetcode.easy;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindTheDifferenceOfTwoArrays {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3};
        int[] nums2 = {4, 5, 6};
    }

    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        // Convert arrays to sets
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        for (int n : nums1) set1.add(n);
        for (int n : nums2) set2.add(n);

        // Create copies so we don't lose original data
        Set<Integer> diff1 = new HashSet<>(set1);
        Set<Integer> diff2 = new HashSet<>(set2);

        // Remove common elements
        diff1.removeAll(set2); // nums1 not in nums2
        diff2.removeAll(set1); // nums2 not in nums1

        // Build result
        List<List<Integer>> answer = new ArrayList<>();
        answer.add(new ArrayList<>(diff1));
        answer.add(new ArrayList<>(diff2));

        return answer;
    }
}
