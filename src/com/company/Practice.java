package com.company;

import java.util.Scanner;

//WAP to print avg of 3 no
public class Practice{
    //average
    public static int avg(int a, int b, int c){
        int avg=(a+b+c)/3;
        System.out.println("The average of given three numbers is:");
        return avg;
    }

    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number 1:");
        int a=sc.nextInt();
        System.out.println("Enter number 2:");
        int b=sc.nextInt();
        System.out.println("Enter number 3:");
        int c=sc.nextInt();

       System.out.println( avg(a,b,c));
    }

}