package com.company;

//Pattern Problem
//SolidRhombus
//Hollow rhombus

public class Placement11 {
    public static void main(String[]args){
        int n=5;
        for(int i=1; i<=n; i++) {
            for (int j = 1; j <=n-i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= n; j++) {
                System.out.print("*");

                //For hollow rhombus

//                if(i==1||j==1||i==n||j==n)
//                    System.out.print("*");
//                else
//                    System.out.print(" ");
            }
            System.out.println();
        }
    }}


