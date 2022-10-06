package com.company;

import java.util.Scanner;

//Wap to print the sum of all odd numbers from 1 to n
public class Placement39 {
    // sum of odd numbers
    public static void sumOdd(int n){
        int sum=0;
        for(int i=1; i<=n ; i++){
            if (i%2!=0){
                sum=sum +i;
            }
        }
        System.out.println("The sum of all odd numbers upto "+ n+ " is :");
        System.out.println(sum);
    }

    public static void main (String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n=sc.nextInt();

        sumOdd(n);
    }

}
