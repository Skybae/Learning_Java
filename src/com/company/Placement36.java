package com.company;

//Write a program to toggle a bit a position = “pos” in a number “n”.
//For toggle operation we use xor logic(^)

public class Placement36 {
    public static void main(String[]args){
        int n=5; //101
        int pos=2;          //pos=2       pos=1
        int bitMask=1<<pos; //001<< 100 001<<010
        int newNum=n^bitMask;//101^100  101^010
        System.out.println(newNum);
    }
}
