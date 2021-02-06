package com.hillel.lesson8;


public class Person implements Comparable<Person>{

    private final String name;
    private final Integer age;

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Person o) {

        if (this.age > o.age){
            return -1;
        } else if (this.age < o.age){
            return  1;
        }else {
            return 0;
        }
    }
}
