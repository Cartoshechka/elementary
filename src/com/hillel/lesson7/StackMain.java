package com.hillel.lesson7;

import java.util.PriorityQueue;
import java.util.Stack;

public class StackMain {

    public static void main(String[] args) {

        Stack<String> stackString = new Stack<>();

        stackString.push("1");
        System.out.println(stackString.peek());
        System.out.println(stackString.size());

        System.out.println(stackString.pop());
        System.out.println(stackString.size());

        stackString.push("2");
        stackString.push("3");
        stackString.push("4");
        stackString.push("5");
        stackString.push("6");
        stackString.push("7");
        stackString.push("8");
        stackString.push("9");

        System.out.println(stackString.peek());


    }

}
