package com.hillel.lesson2;

public class ClassTest {
    public static void main(String[] args) {
        Dog dogNull = null;
        Dog dog = new Dog();
        Dog anotherDog = dog;
        Dog dog3 = new Dog();
        Dog dog4 = anotherDog;


        System.out.println(dogNull);
        System.out.println(dog);
        System.out.println(dog.toString());

        System.out.println("Another dog: " + anotherDog);
        System.out.println("dog3: " + dog3);
        System.out.println("dog4: " + dog4);

        dog = null;




    }

}

