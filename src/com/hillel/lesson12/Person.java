package com.hillel.lesson12;

import java.util.List;

public class Person {

    private final String name;
    private final List<String> emails;

    public Person(String name, List<String> emails) {
        this.name = name;
        this.emails = emails;
    }

    public String getName() {
        return name;
    }

    public List<String> getEmails() {
        return emails;
    }
    public static List<Person> getPeople() {
        Person person1 = new Person("Vasya",
                List.of("vasya1@gmail.com", "vasya2@gmail.com", "vasya3@gmail.com"));

        Person person2 = new Person("Petya",
                List.of("petya1@gmail.com", "petya2@gmail.com", "petya3@gmail.com"));

        Person person3 = new Person("Shurik",
                List.of("shurik1@gmail.com", "shurik2@gmail.com", "shurik3@gmail.com"));
        List<Person> people = List.of(person1, person2, person3);
        return people;
    }
}
