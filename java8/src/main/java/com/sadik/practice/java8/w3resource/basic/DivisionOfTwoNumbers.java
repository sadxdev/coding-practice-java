package com.sadik.practice.java8.w3resource.basic;

/*Write a Java program to divide two numbers and print them on the screen.
*Test Data :
*50/3
*Expected Output :
16*/

public class DivisionOfTwoNumbers {
    public static void main(String[] args) {
        int a = 3;
        int b = 50;
        System.out.println(DivisionOfTwoNumbers(a, b));
    }

    public static int DivisionOfTwoNumbers(int a, int b){
        int division = b / a;
        return division;
    }
}
