package com.hillel.lesson7;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueTest {

    public static void main(String[] args) {
        Queue<Integer> stringPriorityQueue = new PriorityQueue<>();

        stringPriorityQueue.add(3);
        System.out.println(stringPriorityQueue.toString());
        stringPriorityQueue.add(1);
        System.out.println(stringPriorityQueue.toString());
        stringPriorityQueue.add(2);
        System.out.println(stringPriorityQueue.toString());
        stringPriorityQueue.add(4);
        System.out.println(stringPriorityQueue.toString());
        stringPriorityQueue.offer(6);
        System.out.println(stringPriorityQueue.toString());


        System.out.println(stringPriorityQueue.element());

        System.out.println(stringPriorityQueue.remove());
        System.out.println(stringPriorityQueue);

        System.out.println(stringPriorityQueue.poll());
        System.out.println(stringPriorityQueue.poll());
        System.out.println(stringPriorityQueue.poll());
        System.out.println(stringPriorityQueue.poll());



    }

}
