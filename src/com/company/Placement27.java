package com.company;

//Taking a matrix as an input and printing its elements.

import java.util.Scanner;

public class Placement27 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int[][]arr=new int[3][3];
        for(int i=0; i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                System.out.println("Enter "+i+"x"+j+" element of array");
                arr[i][j]=sc.nextInt();
            }
        }
        for(int i=0; i<arr.length;i++){
            for(int j=0; j<arr.length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
