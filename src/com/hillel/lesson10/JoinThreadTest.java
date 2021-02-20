package com.hillel.lesson10;

public class JoinThreadTest {

    public static void main(String[] args) throws InterruptedException {
        Thread thread = new NewPrinter("my-join");
        thread.start();
        System.out.println("Started " + thread.getName());

        Thread.sleep(2000);

        Thread thread1 = new NewPrinter("my-join1");
        thread1.start();
        System.out.println("Started " + thread1.getName());

        thread.join();
        System.out.println("Joined " + thread.getName());

        thread1.join();
        System.out.println("Joined " + thread1.getName());

        System.out.println("Everything done");
    }

}
