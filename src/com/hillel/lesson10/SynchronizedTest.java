package com.hillel.lesson10;

public class SynchronizedTest {
    public static NameSwapper SWAPPER = new NameSwapper();

    public static void main(String[] args) {
        NameSwapper.printNames();
        NameSwapper nameSwapper1 = new NameSwapper();
        Thread thread1 = new Thread(nameSwapper1);
        thread1.start();

        NameSwapper nameSwapper2 = new NameSwapper();
        Thread thread2 = new Thread(nameSwapper1);
        thread2.run();

        NameSwapper.printNames();
    }
}

class NameSwapper implements Runnable {
    private static String name1 = "Olha";
    private static String name2 = "Lena";

    public void swap() {
        synchronized (this) {
            String s = name1;
            name1 = name2;
            name2 = s;
        }

    }

    @Override
    public void run() {
        swap();
    }

    public static void printNames() {
        System.out.println("Name1 = " + name1 + " Name2 = " + name2);
    }
}