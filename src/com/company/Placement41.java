package com.company;

//take radius and return circumference

import java.util.Scanner;

public class Placement41 {

    //circumference
    public static float circum(float r){
        float circumference=2*3.14f*r;
        System.out.println("The circumference of the given circle is:");
        return circumference;
    }

    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of radius :");
        float r=sc.nextFloat();

        System.out.println(circum(r));
    }
}
