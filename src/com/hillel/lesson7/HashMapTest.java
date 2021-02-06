package com.hillel.lesson7;

import java.util.HashMap;
import java.util.Map;

public class HashMapTest {

    public static void main(String[] args) {


        Map<String, Person> personMap = new HashMap<>();

        personMap.put("manager", new Person("Ivan Ivanov", 48));

        Person mariaPetrovna = new Person("Maria Petrovna", 60);
        personMap.put("cleaner", mariaPetrovna);

        System.out.println(personMap.containsKey("manager"));
        System.out.println(personMap.containsKey("director"));
        System.out.println(personMap.containsKey("cleaner"));
        for (Map.Entry<String, Person> personEntry: personMap.entrySet()){
            System.out.println("Key: " + personEntry.getKey());
            System.out.println("Value: " + personEntry.getValue());
        }
        if (personMap.containsKey("manager")) {
            System.out.println(personMap.get("manager"));
        }

        if (personMap.containsKey("director")) {
            System.out.println(personMap.get("director"));
        } else {
            System.out.println("No director");
        }

        System.out.println(personMap.toString());

        personMap.remove("manager");

        System.out.println(personMap.toString());




    }
}