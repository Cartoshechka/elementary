package com.hillel.lesson2;

public class TestString {
    public static void main(java.lang.String[] args) {
        StringBuffer buffer = new StringBuffer("test");

        buffer.append("cont");
        buffer.append("ttt");
        //buffer.reverse();

        System.out.println("StringBuffer append: " + buffer.toString());
    }
}
