package com.company;

//HashMap in java have key and value pairs
//it is similar to dictionaries in python
//it is a collection framework

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Placement47 {
    public static void main(String[]args){
        HashMap <String, Integer> map=new HashMap<>();
        map.put("Sheetal",19);
        map.put("Kuldeep",41);
        System.out.println(map);

        if(map.containsKey("Sheetal")){
            System.out.println("key exists in map");
        }
        else{
                System.out.println("key doesn't exist in map");
    }


        for(Map.Entry<String,Integer> e:map.entrySet()){
            System.out.println(e);
            System.out.println(e.getKey()+" "+e.getValue());
        }


        Set<String> keys=map.keySet();
        for(String key:keys){
            System.out.println(key+" "+map.get(key));
        }


        map.remove("Sheetal");
        System.out.println(map);
    }
}
