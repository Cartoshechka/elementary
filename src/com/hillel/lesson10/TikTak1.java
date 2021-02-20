package com.hillel.lesson10;


public class TikTak1 {



    public static void main(String[] args) throws InterruptedException {
        Thread clocks = new Thread(new clocksThread());
        clocks.start();

        Thread.sleep(5000);

    }

    static class clocksThread1 extends Thread {

        @Override
        public void run() {
            while (!isInterrupted()) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Tik");

            }

        }
    }
}

