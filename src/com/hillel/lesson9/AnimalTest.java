package com.hillel.lesson9;

import java.util.HashSet;
import java.util.Set;

public class AnimalTest {

    public static void main(String[] args) {

        Set<Animal> animals = new HashSet<>();

        for (Animal an :animals) {
            an.print();
        }
// do not do
//        Set animals2 = new HashSet();
//        for (Object an:animals2) {
//            if (an instanceof Animal){
//                ((Animal)an).print();
//            }
//        }



    }
}
