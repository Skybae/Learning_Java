package com.company;

//Wap to enter the numbers till the user wants and at the end it should display the count of positive, negative and zeros entered.


import java.util.Scanner;

public class Placement43 {

    public static void count(){
        int positive=0, negative=0, zero=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1 to continue or 0 to stop.");
        int input=sc.nextInt();

        while(input==1){
            int number=sc.nextInt();
            if(number==0){
                zero++;
            }
            else if(number>0){
                positive++;
            }
            else{
                negative++;
            }
            System.out.println("Do you want to continue? if yes type 1 if no type 0...");
            input=sc.nextInt();
        }
        System.out.println("Positives:"+ positive);
        System.out.println("Negatives:"+ negative);
        System.out.println("Zeros:"+ zero);
    }
    public static void main(String[]args){
        count();

    }
}
