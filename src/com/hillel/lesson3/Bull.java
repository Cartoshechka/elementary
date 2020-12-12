package com.hillel.lesson3;

public class Bull {
    public static final String BULL_CREATED = "Bull created";
    public static final String BULL_CREATED_WITH_NAME = "Bull created with name";
    public static int COUNT;

    String name;
    int strength;

    public Bull() {
        COUNT++;
        System.out.println(BULL_CREATED);
    }

    public String getName() {
        return name;
    }

    public String setName() {
        return this.name = name;
    }

    public Bull(String name, int strength) {
        COUNT++;
        this.strength = strength;
        this.name = name;
        System.out.println(BULL_CREATED_WITH_NAME);


    }

    public String toString() {
        return "Bull " + name + " strength " + strength;
    }

    public static String fight(int strength, int strength2){

        if (strength > strength2){
           return "Bull1 won";
        }else {
            return "Bull2 won";
        }

    }

    public boolean fight1(Bull bull){
        return this.strength > bull.strength;

    }

    public static int getCount() {
        return COUNT;
    }

}
