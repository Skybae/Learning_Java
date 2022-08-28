package com.company;

//a positive number to continue or a negative number to stop the iteration

import java.util.Scanner;

public class Dowhile {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        int num=0;

        do {
            System.out.println("Enter a positive number to continue or a negative number to stop the iteration:");

            num = sc.nextByte();
            System.out.println(num);

        } while (num >= 0);
        System.out.println("the end");
    }

}
