package com.company;

public class Placement33 {
    public static void main(String[]args){

      //  declaration and initialization of a string
        StringBuilder sb= new StringBuilder("heel");
        System.out.println(sb);

    //    get the char of some index
        System.out.println(sb.charAt(0));

      //set char at some index i.e. replace
        sb.setCharAt(0,'n');
        System.out.println(sb);

        //add or insert a char at some index
        sb.insert(0,'S');
        System.out.println(sb);

        //delete a char at some index
        sb.delete(1,2);
        System.out.println(sb);

        //append a char at some index
        //append means inserting a char at last of the string
        sb.append('y');
        System.out.println(sb);
        System.out.println(sb.length());

        //reversing the string using string builder
        for(int i=0; i<sb.length()/2; i++){
            int front =i;
            int back= sb.length()-1-i;

            char frontChar= sb.charAt(front);
            char backChar=sb.charAt(back);

            sb.setCharAt(front, backChar);
            sb.setCharAt(back, frontChar);
        }
        System.out.println(sb);
    }

}
