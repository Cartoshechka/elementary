package com.hillel.lesson2;

public class PrimitiveTest {

    public static void main(String[] args) {

        int age = 21;

        System.out.println("Age before change: " + age);

        changeAge(age);

        System.out.println("Age after change in method main: " + age);


    }

    private static void changeAge(int age) {
        System.out.println("Age before change in method ChangeAge: " + age);
        age += 100;
        System.out.println("Age after chaneg in methon changeAge: " + age);
    }


}
