package com.hillel.lesson12;

import java.util.HashMap;
import java.util.Map;

public class MapTest {
    public static void main(String[] args) {

        Map<Integer, String> strings = new HashMap<>(Map.of(
                1, "val1",
                2, "val2",
                3, "val3",
                4, "val4"
        ));

       /* for(Map.Entry<Integer, String> entry: strings.entrySet()){
            System.out.println("key: " +entry.getKey() + " value: " + entry.getValue());
        }*/

        System.out.println("---------------------------------------");
        strings.forEach((key, value) -> System.out.println("key: " + key + " value: " + value));
        System.out.println("---------------------------------------");
        strings.putIfAbsent(3, "new val3");
        strings.forEach((key, value) -> System.out.println("key: " + key + " value: " + value));
       /* System.out.println("---------------------------------------");
        strings.put(3, "new val3");
        strings.forEach((key, value) -> System.out.println("key: " + key + " value: " + value));*/
        System.out.println("---------------------------------------");
        String string = strings.computeIfPresent(3, (key, value) -> value + key);
        System.out.println(string);
        strings.forEach((key, value) -> System.out.println("key: " + key + " value: " + value));
        System.out.println("---------------------------------------");
        String string2 = strings.computeIfAbsent(666, key -> "val" + key);
        System.out.println(string2);
        strings.forEach((key, value) -> System.out.println("key: " + key + " value: " + value));

        strings.remove(666, "val666");
        System.out.println("---------------------------------------");
        strings.forEach((key, value) -> System.out.println("key: " + key + " value: " + value));


        strings.merge(1, "new value", (oldValue, newValue) -> oldValue + newValue);
        System.out.println("---------------------------------------");
        strings.forEach((key, value) -> System.out.println("key: " + key + " value: " + value));
        strings.merge(100, "new value", (oldValue, newValue) -> oldValue + newValue);
        System.out.println("---------------------------------------");
        strings.forEach((key, value) -> System.out.println("key: " + key + " value: " + value));

        String string3 = strings.getOrDefault(3, "def Value");
        System.out.println(string3);
        String string4 = strings.getOrDefault(33, "def Value");
        System.out.println(string4);
    }
}
