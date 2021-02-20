package com.hillel.lesson10;

public class RunnableTest {

    public static void main(String[] args) {
        Printer printer = new Printer("Vanya-worker");
        Thread thread = new Thread(printer);
        thread.start();
        System.out.println(printer.name + " started");

        Printer printer1 = new Printer("Petty-worker");
        Thread thread1 = new Thread(printer1);
        thread1.start();
        System.out.println(printer1.name + " started");

        Thread thread2 = new Thread(printer1);
        thread2.start();
        System.out.println(printer1.name + " second started");

        System.out.println("Main thread finished");
    }
}

class Printer implements Runnable {
    String name;

    public Printer(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println("I'm " + name);
        System.out.println(name + " thread finished");
    }
}
