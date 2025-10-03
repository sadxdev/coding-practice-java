package com.sadik.practice.java8.striversA2ZDSAcourse.Basic;

public class PrintXNNumbersOfTimes {
    public static void main(String[] args) {
        int X = 7;
        int N = 5;
        printXNnumberofTimes(X, N);
    }

    public static void printXNnumberofTimes(int X, int N) {
        if(N < 0){
            System.out.println("Invalid number of times");
            return;
        }

        for(int i = 0; i < N; i++){
            System.out.print(X);

            if(i < N - 1){
                System.out.print(" ");
            }
        }

        System.out.println();
    }
}
