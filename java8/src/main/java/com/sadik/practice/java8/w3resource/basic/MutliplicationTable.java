package com.sadik.practice.java8.w3resource.basic;

/*Write a Java program that takes a number as input and prints its multiplication table up to 10.
Test Data:
Input a number: 8
Expected Output :
        8 x 1 = 8
        8 x 2 = 16
        8 x 3 = 24
        ...
        8 x 10 = 80*/

import java.util.Scanner;

public class MutliplicationTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input the Number: ");

        int n = input.nextInt();

        for(int i = 1; i <= 10 ; i++){
            System.out.println(n + " x " + i + " = " + product(n, i));
        }

        input.close();
    }

    public static int product(int a, int b){
        return a * b;
    }
}
