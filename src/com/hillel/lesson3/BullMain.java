package com.hillel.lesson3;

public class BullMain {
    public static void main(String[] args) {
        Bull bull = new Bull("BUll",29);
        Bull bull1 = new Bull("RedBull", 76);
        System.out.println(Bull.fight(bull.strength, bull1.strength));
        System.out.println("There was " + Bull.getCount() + " bulls in fight.");
        System.out.println("BUll won? " + bull.fight1(bull1));
        System.out.println("BUll1 won? " + bull1.fight1(bull));

      /*  Bull[] bulls = new Bull[100];
        for (int i = 0; i < bulls.length; i++) {
            bulls[i] = new Bull("Bull " + i);
        }*/

       // System.out.println("Bull count: " + Bull.getCount());

        /*bull.getCount();

        bull.COUNT;

        Bull.getCount();*/
    }
}
