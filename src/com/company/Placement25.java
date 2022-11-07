package com.company;

//Find the maximum & minimum number in an array of integers.

import java.util.*;

public class Placement25 {
    public static void main(String[]args){
        int arr[]={98,34,45,24,1};
        int max= Integer.MIN_VALUE;  //opposite are taken max for min and vice versa.
        int min= Integer.MAX_VALUE;

        for(int i=0; i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("mininum no: "+min);
        System.out.println("maximum no: "+max);
    }
}
