package com.hillel.lesson10;


class clocksThread1 extends Thread {

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
