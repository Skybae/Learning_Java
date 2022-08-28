package com.company;

//grading of marks

import java.util.Scanner;

public class Placement3 {


    public static void fun(int num){

        if (num != 0) {
            int i = 0;
          do {
              Scanner sc = new Scanner(System.in);
                int marks = sc.nextByte();
                if (marks >= 90) {
                    System.out.println("This is good.");
                 }
                 else if (89 >= marks && marks >= 60) {
                     System.out.println("This is also good.");
                    }
                 else if (59 >= marks && marks >= 0){
                     System.out.println("This is good as well./n because marks doesn't matter...efforts matter.");
                 }
                 else{
                    System.out.println("invalid");}
              System.out.println("Want to continue: enter 1 if yes or 0 if no");
                  num=sc.nextByte();
                  i++;} while(i<=100);

        }
    }


    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextByte();
        switch (num){
            case 1:fun(num);
        break;
        case 0:
                System.out.println("no input");
        break;
            default:
                System.out.println("invalid input");

    }}}

