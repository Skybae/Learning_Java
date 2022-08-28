package com.company;

//Guess the randomly generated number

import java.util.*;

public class MiniProject {
    public static void main(String[]args) {
        int num = (int) (Math.random() * 100);

        for(int i=0; i<=100; i++){

        System.out.println("Guess the number betweeen 1 to 100- ");

        Scanner sc = new Scanner(System.in);
        int userGuess = sc.nextByte();

        if(userGuess<0){
            break;
        }
        if(userGuess>num){
            System.out.println("Your guess is greater than the generated number.");
        }
        else if(userGuess<num){
            System.out.println("Your guess is lesser than the generated number.");
        }
        else
        { System.out.println("Guessed number is correct!!!!");
        break;}

    }
        System.out.println("Randomly generated number is " + num);
}}
