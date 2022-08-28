package com.company;

//Two numbers are entered by the user, x and n.
// Write a function to find the value of one number raised to the power of another i.e. x^n.

import java.util.Scanner;

public class Placement18 {
    public static void power(int x,int n){
        int result=1;
        for(int i=1; i<=n; i++) {
            result = result* x;
        }
        System.out.println(result);

    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int n=sc.nextInt();
        power(x,n);
    }
}
