package com.hillel.lesson10;

class NewPrinter extends Thread {
    String name;

    public NewPrinter(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println("running " + name);
        try {
            Thread.sleep(2000,1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(name + " finished");
    }
}
