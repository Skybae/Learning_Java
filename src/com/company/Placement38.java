package com.company;

//Write 2 functions => decimalToBinary() & binaryToDecimal() to convert a number from one number system to another.

import java.util.Scanner;

public class Placement38 {
    public static String decimalToBinary(int num){
        String str="";
        while(num>0){
            if((num&1)==1)
                str+='1';
            else
                str+='0';
            num>>=1;
        }
        return str;
    }
    public static void reverse(String str){
        for(int i=str.length()-1; i>=0; i--)
            System.out.print(str.charAt(i));
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number=");
       int n= sc.nextInt();
        System.out.println("Binary of num "+ n + " is:");
        reverse(decimalToBinary(n));
    }
}
