package com.hillel.lesson10;

public class ThreadTest {
    public static void main(String[] args) {
        Thread thread = new NewPrinter("Vasyl");
        thread.start();

        System.out.println(thread.getName() + " started");

        Thread thread1 = new NewPrinter("Petr");
        thread1.start();

        System.out.println(thread1.getName() + " started");

    }
}

