package com.hillel.lesson8;

import java.util.HashMap;

public class HashMapTest {
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<>();

        map.put(null,3);
        map.put(null,4);

        System.out.println(map);

        map.put("Apples",3);
        map.put("PineApples",4);
        map.put("Grapes",6);
        map.put("Banana",9);
        map.put("Apricots",11);

        System.out.println(map);

        System.out.println(map.get("Banana"));

        if (map.containsKey("Apples")){
            System.out.println("Yes!");
        }


    }
}
