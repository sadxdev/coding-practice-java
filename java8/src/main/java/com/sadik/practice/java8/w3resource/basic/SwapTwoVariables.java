package com.sadik.practice.java8.w3resource.basic;

/*Write a Java program to swap two variables.*/

public class SwapTwoVariables {
    public static void main(String[] args) {
        int a, b, temp;

        a = 15;
        b = 16;

        System.out.println("Before swapping : a, b = " + a + ", " + b);

        temp = a;
        a = b;
        b = temp;

        System.out.println("After swapping : a, b = " + a + ", " + b);
    }
}
