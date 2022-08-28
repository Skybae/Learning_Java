package com.company;

//bubble sort
//time complexity=O(n^2)

//Idea: if arr[i] > arr[i+1] swap them.
// To place the element in their respective position, we have to do the following operation N-1 times.

public class Placement21 {
    public static void printArray(int[] arr){
        for(int i=0; i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    public static void main(String[]args){
        int arr[]={21,10,15,42,35};
        for(int i=0; i<arr.length-1; i++){
            for(int j=0; j<arr.length-1-i; j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;

                }
            }
        }
        printArray(arr);
    }
}
