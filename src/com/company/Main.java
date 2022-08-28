package com.company;

//Buy pen or pencil

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //let x is the price of pen=10rs
        //let y is the price of notebook=40rs
        int x = 10;
        int y = 40;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the amount of money you have:");
        int amount = sc.nextByte();

        if (amount < 10) {
            System.out.println("Get more money bro!!");
        } else {
            if (amount < 40) {
                System.out.println("You can buy pen only.");
            } else {
                if (amount < 50) {
                    System.out.println("you can buy notebook or pen");
                } else
                    System.out.println("you can buy both.");
            }
        }
    }
}

