package com.company;

//Take an array of Strings inputs from the user & find the cumulative (combined) length of all those strings.

import java.util.Scanner;

public class Placement30 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String str[]=new String[3];
        int totLength=0;
        for(int i=0; i< str.length; i++){
            str[i]=sc.next();
        totLength+=str[i].length();
        }
        System.out.println(totLength);
    }
}
