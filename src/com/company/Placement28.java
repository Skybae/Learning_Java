package com.company;

//Searching for an element x in a matrix.

import java.util.Scanner;

public class Placement28 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int arr[][]= new int[3][3];
        for(int i=0; i<arr.length;i++){
            for(int j=0; j<arr.length;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter the element you want to search for in the 2D array:");
        int x=sc.nextInt();
        for(int i=0;i<arr.length; i++){
            for(int j=0; j<arr.length; j++){
                if(arr[i][j]==x){
                    System.out.println("X is found at "+i+" "+j+" place.");
                }
            }
        }
    }
}
