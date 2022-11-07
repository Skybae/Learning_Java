package com.company;

import java.util.ArrayList;
import java.util.Scanner;

//Array List of names

public class Placement45 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        ArrayList<String> list=new ArrayList<>();
        String arr[]=new String[3];

        for(int i=0; i<3; i++){
            arr[i]=sc.next();
        }

        for(int i=0; i<3; i++){
            list.add(arr[i]);
        }
        System.out.println(list);

    }
}
