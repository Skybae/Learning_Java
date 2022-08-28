package com.company;

//Array of names

import java.util.Scanner;

public class Placement24 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of your array:");
        int size=sc.nextInt();
        String arr[]=new String[size];
        for(int i=0; i<=arr.length-1; i++){
            System.out.println("Enter name:");
            String name=sc.next();
            arr[i]=name;
        }
        for(int i=0; i<=arr.length-1; i++){
            System.out.println(arr[i]);
        }
    }
}
