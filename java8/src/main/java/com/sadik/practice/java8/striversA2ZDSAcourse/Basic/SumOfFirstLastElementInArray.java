package com.sadik.practice.java8.striversA2ZDSAcourse.Basic;

public class SumOfFirstLastElementInArray {
    public static void main(String[] args) {
        int[] nums = {2, 3, 4, 5, 6};
        System.out.println("Sum of First and Last elements of Array : " + sumOfFirstAndLast(nums));
    }

    public static int sumOfFirstAndLast(int[] nums){
        if(nums.length == 0) return 0;

        int sum = 0;

        sum = nums[0] + nums[nums.length - 1];
        return sum;
    }
}
