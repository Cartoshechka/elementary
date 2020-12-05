package com.hillel.lesson2;

public class CompareTest {

    public static void main(String[] args) {

        /*int num1 = 0;
        int num2 = 0;

        if (num1 == num2){
            System.out.println("equal");
        } else {
            System.out.println("not equal");
        }*/

       /* java.lang.String string1 = new String("one");
        java.lang.String string2 = "one";

        if (string1.equals(string2)){
            System.out.println("equal");
        } else {
            System.out.println("not equal");
        }*/

        Human human1 = new Human();
        human1.setName("Dasha");
        Human human2 = new Human();
        human2.setName("Dasha");

        if (human1.equals(human2)){
            System.out.println("pesrsons are equal");
        }else {
            System.out.println("persons are`nt equal");
        }



    }

}
