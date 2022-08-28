package com.company;

//Take an array of numbers as input and check if it is an array sorted in ascending order.

import java.util.Scanner;

public class Placement26 {
    public static void main(String[]args){
        int arr[]=new int[4];
        Scanner sc=new Scanner(System.in);
        for(int i=0; i< arr.length;i++){
            arr[i]=sc.nextInt();
        }

//        for(int i=0; i<arr.length; i++){
//            System.out.print(arr[i]+" ");
//        }

        boolean isAscending=true;
        for(int i=0;i<arr.length-1; i++){
            if(arr[i]>arr[i+1]){
                isAscending=false;
            }
        }
        if(isAscending){
            System.out.println("Array is sorted in ascending order.");
        }
        else{
            System.out.println("Array is not sorted in ascending order.");
        }
    }
}
