package com.sadik.practice.java8.w3resource.basic;

/*Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers.
Test Data:
Input first number: 125
Input second number: 24
Expected Output :
        125 + 24 = 149
        125 - 24 = 101
        125 x 24 = 3000
        125 / 24 = 5
        125 mod 24 = 5*/

public class BasicArithmeticOperations {
    public static void main(String[] args) {
        int a = 125, b = 24;
        System.out.println(a + " + " + b + " = " + add(a, b));
        System.out.println(a + " - " + b + " = " + sub(a, b));
        System.out.println(a + " x " + b + " = " + product(a, b));
        System.out.println(a + " / " + b + " = " + division(a, b));
        System.out.println(a + " mod " + b + " = " + mod(a, b));
    }

    public static int add(int a, int b){ return a+b;}

    public static int sub(int a, int b){ return a - b;}

    public static int product(int a , int b){return a * b;}

    public static int division(int a, int b){return a / b;}

    public static int mod(int a, int b){return a % b;}
}
