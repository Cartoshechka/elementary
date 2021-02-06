package com.hillel.lesson8;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PersonQueueMain {

    public static void main(String[] args) {
        Comparator<Person> personComparator = new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                if (o1.getName().length() > o2.getName().length()) {
                    return -1;
                } else if (o1.getName().length() < o2.getName().length()) {
                    return 1;
                }
                return 0;
            }
        };

        //PriorityQueue<Person> personPriorityQueue = new PriorityQueue<>();
        PriorityQueue<Person> personPriorityQueue = new PriorityQueue<>(personComparator);

        Person person2 = new Person("Vasya23", 89);
        Person person3 = new Person("Vasya345", 79);
        Person person1 = new Person("Vasya1", 99);
        Person person5 = new Person("Vasya56789", 59);
        Person person4 = new Person("Vasya4567", 69);
        Person person6 = new Person("Vasya678910", 49);

        personPriorityQueue.add(person1);
        personPriorityQueue.add(person2);
        personPriorityQueue.add(person3);
        personPriorityQueue.add(person4);
        personPriorityQueue.add(person5);
        personPriorityQueue.add(person6);

        System.out.println(personPriorityQueue.poll());
        System.out.println(personPriorityQueue.poll());
        System.out.println(personPriorityQueue.poll());
        System.out.println(personPriorityQueue.poll());
        System.out.println(personPriorityQueue.poll());
        System.out.println(personPriorityQueue.poll());


    }

}
