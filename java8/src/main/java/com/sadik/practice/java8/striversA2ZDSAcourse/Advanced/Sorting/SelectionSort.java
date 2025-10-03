package com.sadik.practice.java8.striversA2ZDSAcourse.Advanced.Sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] nums = {9,34,21,17,8};
        System.out.println("Input: " + Arrays.toString(nums));

        int[] sortedArray = selectionSort(nums);
        System.out.println("Output: " + Arrays.toString(sortedArray));
    }

    private static int[] selectionSort(int[] nums) {
        int n = nums.length;
        for(int i = 0; i < n - 1; i++){
            int minIndex = i;
            for(int j = i + 1; j < n; j++){
                if(nums[j] < nums[minIndex]){
                    minIndex = j;
                }
            }
            int temp = nums[minIndex];
            nums[minIndex] = nums[i];
            nums[i] = temp;
        }
        return nums;
    }
}
