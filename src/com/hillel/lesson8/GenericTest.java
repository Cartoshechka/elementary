package com.hillel.lesson8;

public class GenericTest {

    public static void main(String[] args) {
        String strng = printAndGet("Max clown");
        Integer integer = printAndGet(123);
        Boolean b = printAndGet(true);
        Person person = printAndGet(new Person("Vasya", 123));
        Printer<String> printer = new Printer<>("smthng nothing");
        System.out.println(printer);
        System.out.println(printer.getValue());

        Printer<Person> personPrinter = new Printer<>(new Person("Max",25));
        System.out.println(personPrinter);
        System.out.println(personPrinter.getValue());


    }

    public static <T> T printAndGet(T o) {

        T anotherLink = o;

        System.out.println(o);
        return o;
    }
}
