package com.hillel.lesson12;

import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamTest {

    public static void main(String[] args) {

        List<String> strings = List.of("one", "two", "three");

        Stream<String> stringStream = strings.stream();

        Stream<Integer> intStream1 = Stream.of(10, 20, 30, 40, 50, 60, 6);
        IntStream intStream = IntStream.of(10, 20, 40, 40, 50, 60, 60);

        intStream
                .distinct()
                .forEach(System.out::println);

        System.out.println(intStream1
                .filter(n -> n > 10)
                .count());

       /* strings.stream()
                .filter(x -> x.toString().length() <= 3)
                .forEach(System.out::println);*/
        stringStream
                .filter(x -> x.toString().length() == 3)
//                .forEach(s -> System.out.println(s))
                .forEach(System.out::println);
        strings.stream()
//                .map(str -> str.length())
                .map(String::length)
                .forEach(System.out::println);

    }

}
