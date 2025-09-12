package com.sadik.practice.java8.leetcode.easy;

//Leetcode - 1480
public class RunningSumOf1DArray{
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        int[] output = runningSum(nums);
        for(int i = 0; i < nums.length; i++) {
            System.out.println(output[i]);
        }
    }

    private static int[] runningSum(int[] nums) {
        int[] result = new int[nums.length];
        result[0] = nums[0];

        for(int i = 1; i < nums.length; i++){
            result[i] = result[i - 1] + nums[i];
        }

        return result;
    }
}
