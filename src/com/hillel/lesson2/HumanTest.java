package com.hillel.lesson2;

public class HumanTest {

    public static void main(String[] args) {
        Human human1 = new Human();
        Human human2 = human1;
        human1.setName("Vasya");
        human1.setAge(21);
        System.out.println("Before change: ");

        System.out.println("Person1");
        printPerson(human1);
        System.out.println("Person2");
        printPerson(human2);
        changePerson(human2);
        System.out.println("After change: ");

        System.out.println("Person1: ");
        printPerson(human1);
        System.out.println("Person2: ");

        printPerson(human2);





    }

    public static void printPerson(Human human1){
        System.out.println(human1.getName());
        System.out.println(human1.getAge());
    }

    public static void changePerson(Human human){

        //human.name = human.name + " Changed";
        //human.age  = human.age + 100;
        human.setName(human.getName() + " Changed");
        human.setAge(human.getAge() + 100);

    }


}
