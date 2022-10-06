package com.company;

// return the greatest of two given numbers

import java.util.Scanner;

public class Placement40 {
    //greatest of two numbers
    public static int greatest(int a, int b){
        System.out.println("The greatest no is:");
        if (a > b)
            return a;
        else return b;
    }

    public static void main (String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1st number:");
        int a=sc.nextInt();
        System.out.println("Enter 2nd number:");
        int b=sc.nextInt();

        System.out.println(greatest(a,b));
    }
}
