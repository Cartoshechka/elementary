package com.hillel.lesson11;

import java.util.concurrent.atomic.AtomicInteger;

public class RunnableTest {
    public static void main(String[] args) {
        AtomicInteger counter = new AtomicInteger();
//    int counter2 = 0;
//    Runnable runnable = () -> counter.getAndIncrement();
//                      (runnable)
        new Thread(() -> counter.getAndIncrement()).start();
//        new Thread(() -> counter2++).start();


    }


}
