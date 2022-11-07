package com.company;

import java.util.ArrayList;
import java.util.Collections;

////find max and min no. from the arraylist
public class Placement46 {
    public static void main(String[]args){
        ArrayList <Integer> arrayList=new ArrayList<>();
        arrayList.add(23);
        arrayList.add(45);
        arrayList.add(47);
        arrayList.add(89);
        arrayList.add(21);
        arrayList.add(2,42);
        arrayList.set(0, 12);
        System.out.println(arrayList);

        //to sort the ArrayList in ascending order
        //Collections.sort(arrayList);
        //System.out.println(arrayList);


        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;

        int size=arrayList.size();
        for(int i=0; i<size;i++){
            if(arrayList.get(i)<min){
                min=arrayList.get(i);
            }
            if(arrayList.get(i)>max){
                max=arrayList.get(i);
            }
        }
        System.out.println(min);
        System.out.println(max);
    }
}

