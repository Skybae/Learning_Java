package com.company;
//Selection sort
//time complexity=O(n^2)

//Idea: The inner loop selects the minimum element in the unsorted array
// and places the elements in increasing order.

public class Placement22 {
    public static void printArray(int[]arr){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    public static void main(String[]args){
        int[]arr={21,34,32,56,43,67};
        for(int i=0; i<arr.length-2;i++){
            int min=i;
            for(int j=i+1;j<arr.length-1;j++){
                if(arr[j]<arr[min]){
                  min=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[min];
            arr[min]=temp;
        }
        printArray(arr);
    }
}
