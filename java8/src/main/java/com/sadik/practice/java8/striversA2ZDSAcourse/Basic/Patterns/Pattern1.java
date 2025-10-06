package com.sadik.practice.java8.striversA2ZDSAcourse.Basic.Patterns;

public class Pattern1 {
    public static void main(String[] args) {
        int n = 5;
        pattern1(5);
    }
    public static void pattern1(int n) {
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
