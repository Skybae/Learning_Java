package com.company;
//pattern problem
//half pyramid
//inverted half pyramid

public class Placement6 {
    public static void main(String[]args){
        for(int i=1; i<=4;i++){
     //   to create a inverted half pyramid
            //       for(int j=4; j>=i; j--)
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
