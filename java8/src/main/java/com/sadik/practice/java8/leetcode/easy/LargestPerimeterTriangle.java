package com.sadik.practice.java8.leetcode.easy;

import java.util.Arrays;
//LC - #976
public class LargestPerimeterTriangle {
    public static void main(String[] args) {
        int[] nums1 = {2, 1, 2};
        System.out.println(largestPerimeter(nums1));

        int[] nums2 = {1, 2, 1, 10};
        System.out.println(largestPerimeter(nums2));
    }
    public static int largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        for (int i = nums.length - 1; i >= 2; i--) {
            if (nums[i - 2] + nums[i - 1] > nums[i]) {
                return nums[i] + nums[i - 1] + nums[i - 2];
            }
        }
        return 0;
    }
}
