package com.company;

// the number is power of 2 or not

/* we can check that the number is power of 2 or not, by two methods
using while loop or using bit manipulation

logic of using bit manipulation

if the number is power of 2 it's first bit would be one only
while its before number will have all the others bits 1
so we can use  bitwise and operation between the number(n) and (n-1) to check if the result is 0 than it is power of 2 else it is not
 */
import java.util.Scanner;

public class Placement35 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=sc.nextInt();
        if((n&n-1)==0){
            System.out.println("Entered number is power of two.");
        }
        else{
            System.out.println("Entered number is not power of two.");
        }
    }
}
