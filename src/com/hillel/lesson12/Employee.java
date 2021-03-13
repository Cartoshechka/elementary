package com.hillel.lesson12;

public class Employee {

   private final String name;

    public String getName() {
        return name;
    }

    public Employee(Person person) {
        String name = person.getName();
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                '}';
    }
}
