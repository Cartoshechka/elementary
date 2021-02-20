package com.hillel.lesson10;


public class TikTak1 {



    public static void main(String[] args) throws InterruptedException {
        Thread clocks = new Thread(new clocksThread());
        clocks.start();

        Thread.sleep(5000);

    }
}

