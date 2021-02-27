package com.hillel.lesson11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.function.*;

public class StringChangerTest {

    public static void main(String[] args) throws IOException {
        Supplier<String> stringSupplier = () -> {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            try {
                return reader.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return null;
        };

        String userString = stringSupplier.get();
        UnaryOperator<String> reversF = stringToReverse -> new StringBuilder(stringToReverse).reverse().toString();
//        Function<String, String> reversF = stringToReverse -> new StringBuilder(stringToReverse).reverse().toString();
        changeString(userString, reversF);

//        Function<String, Integer> countF = stringForCount -> stringForCount.length();
        Function<String, Integer> countF = String::length;
        System.out.println(countF.apply(userString));

//        Consumer<String> printer = stringToPrint -> System.out.println(stringToPrint);
        Consumer<String> printer = System.out::println;
        printer.accept(userString);
//      UnaryOperator<String> upperCaseF = stringToUpperCase -> stringToUpperCase.toUpperCase();
        UnaryOperator<String> upperCaseF = String::toUpperCase;
        changeString(userString, upperCaseF);

//        Predicate<String> checkIsNull = check -> check.isEmpty();
        Predicate<String> checkIsNull = String::isEmpty;
        System.out.println(checkIsNull.test(userString));
    }


    public static void changeString(String s, Function<String, String> f) {
        String nString = f.apply(s);
        System.out.println(nString);
    }

}
