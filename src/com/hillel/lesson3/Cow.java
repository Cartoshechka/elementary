package com.hillel.lesson3;

public class Cow {

    private String name;
    private Integer age;

    public Cow() {
        System.out.println("Cow created");
    }

    public Cow(String name, Integer age) {
        this.name = name;
        this.age = age;

    }

    public Cow(Integer age) {
        this.age = age;

    }

    public Cow(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Integer getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void print() {
        System.out.println("Age: " + getAge() + " Name: " + getName());
    }


}
