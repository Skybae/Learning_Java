package com.company;

//count the no of one's in binary representation of number n

public class Placement37 {
    public static void main(String[]args){
        int n=5;
        int count=0;
        while(n>0) {
            if ((n & 1) == 1) {
                count++;
            }
            n=n>>1;
        }
        System.out.println(count);
    }
}
