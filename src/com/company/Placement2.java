package com.company;

//prime or not

import java.util.Scanner;

public class Placement2 {
 public static void main(String[]args) {
     Scanner sc = new Scanner(System.in);
     int n=sc.nextInt();
     boolean isPrime=true;
     for(int i=2; i<=n; i++){
        if(n%i==0){
            isPrime=false;
            break;
        }
     }
     if(isPrime){
         if(n==1){
             System.out.println("neither prime nor composite");
          }
          else
          { System.out.println("prime");}

     }
     else
         System.out.println("not prime");
 }
}