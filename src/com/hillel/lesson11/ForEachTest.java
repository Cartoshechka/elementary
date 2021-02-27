package com.hillel.lesson11;

import java.util.List;
import java.util.function.Supplier;

public class ForEachTest {
    public static void main(String[] args) {

        List<String> strings = List.of("one", "two", "three");
//        strings.forEach(System.out::println);
        strings.forEach(ForEachTest::print);

        Supplier<String> strConsumer = String::new;
//        Supplier<String> strConsumer = () -> new String();
        String nStr = strConsumer.get();
    }

    public static void print(String s) {
        System.out.println("-----------------------------------");
        System.out.println(s);
    }

}
