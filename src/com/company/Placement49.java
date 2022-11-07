package com.company;

//LinkedList using collection framework

import java.util.LinkedList;
import java.util.Scanner;

public class Placement49 {
    public static void main(String[]args){
        LinkedList<Integer> list=new LinkedList<Integer>();
//        list.add(1);
//        list.add(5);
//        list.add(7);
//        list.add(3);
//        list.add(8);
//        list.add(2);
//        list.add(3);
//
//        System.out.println(list);
//        for(int i=0; i<list.size();i++){
//            if(list.get(i)==7){
//                System.out.println(i);
//            }
//        }

        Scanner sc=new Scanner(System.in);
        //int num=sc.nextInt();
        for(int i=0; i<3; i++){
            list.add(sc.nextInt());
        }
       // System.out.println(list.size());
        for(int i=0; i<list.size(); i++){
            if(list.get(i)>25){
                list.remove(i);
            }
        }
        System.out.println(list);
    }
}
