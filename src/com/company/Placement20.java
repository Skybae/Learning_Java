package com.company;

//Write a program to print Fibonacci series of n terms where n is input by user :
  //      0 1 1 2 3 5 8 13 21 .....
    //    In the Fibonacci series, a number is the sum of the previous 2 numbers that came before it.

import java.util.Scanner;

public class Placement20 {
    public static void fib(int n){
        int f1=0, f2=1;
        System.out.println(f1);
        System.out.println(f2);
        for(int i=1;i<=n;i++){
           int f3=f2+f1;
            f2=f3;
            f1=f2;
            System.out.println(f3);
        }

    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
fib(n);
    }
}
