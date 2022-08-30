package com.company;

//Print the spiral order matrix as output for a given matrix of numbers.

import java.util.Scanner;

public class Placement29 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int arr[][]=new int[n][m];

        for(int i=0; i<n;i++){
            for(int j=0; j<m;j++){
                arr[i][j]=sc.nextInt();
            }
        }


        System.out.println("The Spiral Order Matrix is : ");
        int rowStart = 0;
        int rowEnd = n-1;
        int colStart = 0;
        int colEnd = m-1;

        //To print spiral order matrix
        while(rowStart <= rowEnd && colStart <= colEnd) {
            //1
            for(int col=colStart; col<=colEnd; col++) {
                System.out.print(arr[rowStart][col] + " ");
            }
            rowStart++;

            //2
            for(int row=rowStart; row<=rowEnd; row++) {
                System.out.print(arr[row][colEnd] +" ");
            }
            colEnd--;

            //3
            for(int col=colEnd; col>=colStart; col--) {
                System.out.print(arr[rowEnd][col] + " ");
            }
            rowEnd--;

            //4
            for(int row=rowEnd; row>=rowStart; row--) {
                System.out.print(arr[row][colStart] + " ");
            }
            colStart++;

            System.out.println();
        }
    }
}

