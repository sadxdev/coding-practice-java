package com.sadik.practice.java8.leetcode.easy;
//LC- 724
public class FindPivotIndex {
    public static void main(String[] args) {
        int[] nums = {1,7,3,6,5,6};
        System.out.println(pivotIndex(nums));
    }
    public static int pivotIndex(int[] nums) {
        int totalSum = 0;
        for (int num : nums) {
            totalSum += num;
        }

        int leftSum = 0;
        for (int i = 0; i < nums.length; i++) {
            int rightSum = totalSum - leftSum - nums[i];
            if (leftSum == rightSum) {
                return i;  // Found pivot index
            }
            leftSum += nums[i];
        }

        return -1;  // No pivot index found
    }
}
