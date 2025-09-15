package com.sadik.practice.java8.leetcode.easy;
//LC - 283
public class MoveZeros {
    public static void main(String[] args) {
        int[] nums = {0,1,0,3,12};
        moveZeros(nums);
        for(int i = 0; i < nums.length; i++){
            System.out.print(nums[i]);
            if(i < nums.length - 1) System.out.print(",");
        };
    }

    private static void moveZeros(int[] nums) {
        int write = 0;

        for(int read = 0; read < nums.length; read++){
            if(nums[read] != 0){
                nums[write++] = nums[read];
            }
        }

        while(write < nums.length){
            nums[write++] = 0;
        }
    }
}
