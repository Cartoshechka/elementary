package com.hillel.lesson10;


public class TikTak {



    public static void main(String[] args) throws InterruptedException {
        Thread clocks = new Thread(new clocksThread());
        clocks.start();

        Thread.sleep(5000);
        clocksThread.interrupting();
    }
}

class clocksThread implements Runnable {
   private static Thread currentThread = Thread.currentThread();

   public static void interrupting(){
       currentThread.interrupt();
   }

    @Override
    public void run() {
        while (!currentThread.isInterrupted()) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Tik");

        }

    }
}
