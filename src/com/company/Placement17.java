package com.company;

import java.util.Scanner;
//Write a program to enter the numbers till the user wants
// and at the end it should display the count of positive, negative and zeros entered.

public class Placement17 {
    public static void shortlist(){
        int positive=0, negative=0, zero=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1 to continue & Enter 0 to stop");
        int input=sc.nextInt();
        while(input==1){
            int number=sc.nextInt();
            if(number>0){
                positive++;
            }
            else if(number<0){
                negative++;
            }
            else{
                zero++;
            }
            System.out.println("Enter 1 to continue & Enter 0 to stop");
            input=sc.nextInt();
        }
        System.out.println("postives:"+ positive);
        System.out.println("negatives:"+ negative);
        System.out.println("zero:"+ zero);
    }
    public static void main(String[]args){
       Scanner sc=new Scanner(System.in);
       shortlist();

    }
}
