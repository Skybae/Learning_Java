package com.company;

// diamond with user input

import java.util.Scanner;

public class Placement44 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
         int n=sc.nextInt();
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            for(int j=1; j<i; j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
        for(int i=n; i>=1; i--){
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            for(int j=1; j<i; j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }

    }
}
