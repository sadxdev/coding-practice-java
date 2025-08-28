package com.sadik.practice.java8.w3resource.basic;

/*Write a Java program that takes two numbers as input and displays the product of two numbers.
*Test Data:
*Input first number: 25
*Input second number: 5
*Expected Output :
        25 x 5 = 125*/
public class ProductOfTwoNumbers {
    public static void main(String[] args) {
        int a = 25, b =5;
        System.out.println(product(a,b));
    }

    public static int product(int a, int b){
        return a * b;
    }
}
