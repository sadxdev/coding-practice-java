package com.sadik.practice.java8.w3resource.basic;

/*Write a Java program that takes three numbers as input to calculate and print the average of the numbers.*/

import java.util.Scanner;

public class AverageOfThreeNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input first number : ");
        int num1 = in.nextInt();

        System.out.println("Input second number : ");
        int num2 = in.nextInt();

        System.out.println("Input third number : ");
        int num3 = in.nextInt();

        in.close();

        System.out.println("Average of three numbers : " + (num1 + num2 + num3)/3);
    }

}
