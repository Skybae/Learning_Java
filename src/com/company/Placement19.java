package com.company;

//Write a function that calculates the Greatest Common Divisor of 2 numbers.

import java.util.Scanner;

public class Placement19 {
    public static void gcd(int a, int b) {
        int gcd=1;
        for (int i = 1; i <= a && i <= b; i++) {
            if (a % i == 0 && b % i == 0) {
                gcd = i;
            }
        }
            System.out.println(gcd + "is the gcd");

    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int a= sc.nextInt();
        int b=sc.nextInt();
        gcd(a,b);
    }
}
