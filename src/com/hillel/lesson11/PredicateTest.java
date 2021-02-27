package com.hillel.lesson11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.function.Predicate;

public class PredicateTest {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        Integer num = Integer.parseInt(bufferedReader.readLine());

        Predicate<Integer> predicate2 = integer -> integer % 2 == 0;
        Predicate<Integer> predicate3 = integer -> integer > 0;
        Predicate<Integer> predicate4 = integer -> integer % 5 == 0;
        checkNumberAndPrint(num, predicate2);
        checkNumberAndPrint(num, predicate3);
        checkNumberAndPrint(num, predicate4);


    }
    private static void checkNumberAndPrint(Integer num, Predicate<Integer> predicate) {
        System.out.println(predicate.test(num));
    }
}
