package com.sadik.practice.java8.striversA2ZDSAcourse.Basic.Patterns;

public class Pattern2 {
    public static void main(String[] args) {
        int n = 5;
        pattern2(n);
    }

    public static void pattern2(int n) {
        for(int i = 0; i < n; i++){
            for(int j = n - i; j <=n; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
