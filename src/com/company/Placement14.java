package com.company;

//Pattern problem
//butterfly problem
//Hollow Butterfly Problem

public class Placement14 {
    public static void main(String[]args){
        int n=4;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print("*");

                //for hollow butterfly
//                if(i==1||j==1||j==i)
//                System.out.print("*");
//                else
//                    System.out.print(" ");
            }
            for(int j=1; j<=2*(n-i); j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("*");

                //For hollow butterfly
//                if(i==1||j==1||j==i)
//                    System.out.print("*");
//                else
//                    System.out.print(" ");
            }
            System.out.println();
        }
        for(int i=n; i>=1; i--){
            for(int j=1; j<=i; j++){
                System.out.print("*");

                //For hollow butterfly
//                if(i==1||j==1||j==i)
//                    System.out.print("*");
//                else
//                    System.out.print(" ");
            }
            for(int j=1; j<=2*(n-i); j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("*");

//                For hollow butterfly

//                if(i==1||j==1||j==i)
//                    System.out.print("*");
//                else
//                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
