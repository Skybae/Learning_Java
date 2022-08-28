package com.company;

//Pattern Problem
//pascal's triangle

public class Placement16 {
    public static void main(String[]args) {
        int n = 5;

        for (int i = 1; i <= n; i++) {
            for (int j=1;j<=n-i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++) {
                if(j==1)
                    System.out.print("1 ");
                else
                System.out.print(nCr(i, j) + " ");
            }
            System.out.println();
        }
    }
    static int factorial(int n){
        int i;
        int fact=1;
        for(i=1; i<=n; i++){
             fact=fact*i;
        }
        return fact;
    }
    static int nCr(int i, int j){
        return factorial(i)/(factorial(i-j)*factorial(j));

    }
}
