package com.sadik.practice.java8.w3resource.basic;

/*
Write a Java program to print the sum of two numbers.
Test Data:
74 + 36
Expected Output :
110
*/

public class SumOfTwoNumbers {
    public static void main(String[] args) {
        int a = 74, b = 36;
        System.out.println(add(a, b));
    }

    public static int add(int a, int b){
        return a + b;
    }
}
