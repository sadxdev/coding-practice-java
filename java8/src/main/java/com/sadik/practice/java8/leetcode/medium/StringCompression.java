package com.sadik.practice.java8.leetcode.medium;
//LC - 443
public class StringCompression {
    public static void main(String[] args) {
        char[] chars = {'a','a','b','b','c','c','c'};
        int newLength = compress(chars);

        System.out.println("New Length: " + newLength);
        System.out.print("Compressed Array: ");
        for (int i = 0; i < newLength; i++) {
            System.out.print(chars[i] + " ");
        }
    }

    public static int compress(char[] chars) {
        int write = 0;
        int read = 0;

        while (read < chars.length) {
            char currentChar = chars[read];
            int count = 0;

            while (read < chars.length && chars[read] == currentChar) {
                read++;
                count++;
            }

            chars[write++] = currentChar;

            if (count > 1) {
                for (char c : Integer.toString(count).toCharArray()) {
                    chars[write++] = c;
                }
            }
        }

        return write;
    }

}
