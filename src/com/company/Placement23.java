package com.company;

//Insertion sort
//Time Complexity=O(n^2)

//Idea: Take an element from the unsorted array,
//place it in its corresponding position in the sorted part, and shift the elements accordingly.

public class Placement23 {
   public static void printArray(int[]arr){
   for(int i=0;i< arr.length;i++){
       System.out.println(arr[i]);
   }
   }
   public static void main(String[]args){
       int[]arr={34,45,56,57};
       for(int i=0;i<arr.length;i++){
           int current=arr[i];
           int j=i-1;
           while(j>=0&& arr[j]>current){
               arr[j+1]=arr[j];
               j--;
           }
arr[j+1]=current;
       }
       printArray(arr);
   }
}