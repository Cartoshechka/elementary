package com.hillel;

public class RecursionCursion {
    public static void main(String[] args) {

        recursionFucn(0);

    }

    public static void recursionFucn(int num) {
        System.out.println("NUm " + num);
        System.out.println("Привет");
        if (num >= 100) {
            return;
        }
        recursionFucn(num + 1);



    }
}
