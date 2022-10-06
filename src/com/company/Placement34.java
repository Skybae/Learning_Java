package com.company;

//bit manipulation operation-- get, set, clear, update


//import java.util.Scanner;

import java.util.Scanner;

//get bit operation
//use and logic(&)
public class Placement34 {
//    public static void main(String[]args){
//int n=5;
//int pos=3;
//int bitMask=1<<pos;
//if((bitMask&n)==0){
//    System.out.println("Bit is 0.");
//}
//else{
//    System.out.println("Bit is 1.");
//}
//    }

    //set bit operation
    //use or logic

//    public static void main(String[]args){
//        int n=5;
//        int pos=1;
//        int bitmask=1<<pos;
//        int newNum=bitmask | n;
//        System.out.println(newNum);
//    }


    //clear bit opertion
    //first use not then and

//    public static void main(String[]args){
//        int n=5;
//        int pos=2;
//        int bitmask=1<<pos;
//        int notBitmask= ~(bitmask);
//        int newNumber=notBitmask & n;
//        System.out.println(newNumber);
//    }

//update bit operation
    //first clear then set bit
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int oper=sc.nextInt();
        int n=5;
        int pos=1;
        int bitMask=1<<pos;
        if(oper==1){
            //set operation
            int newNum=bitMask|n;
            System.out.println(newNum);
        }
        else{
            //clear operation
            int notbitMast=~bitMask;
            int newNum=notbitMast&n;
            System.out.println(newNum);
        }
    }
}
