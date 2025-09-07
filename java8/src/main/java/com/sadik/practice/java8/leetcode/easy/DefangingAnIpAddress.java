package com.sadik.practice.java8.leetcode.easy;

public class DefangingAnIpAddress {
    public static void main(String[] args) {
        String address = "1.1.1.1";
        System.out.println(ipdefang(address));
    }

    public static String ipdefang(String address){

        StringBuilder sb = new StringBuilder(address.length() + 6);

        for(int i = 0; i < address.length(); i++){
            char c = address.charAt(i);

            if(c == '.'){
                sb.append('[').append('.').append(']');
            }else{
                sb.append(c);
            }
        }
        return sb.toString();
    }

}
