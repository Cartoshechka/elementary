package com.hillel.lesson3;

public class Main {
    public static void main(String[] args) {
        Cow cow = new Cow();
        cow.setAge(4);
        cow.setName("Milka");
        cow.print();

        Cow cow1 = new Cow("Buryonka", 8);
        cow1.print();

        Cow cow2 = new Cow("Newborn");
        cow2.print();

        Cow cow3 = new Cow(22);
        cow3.print();

    }
}
