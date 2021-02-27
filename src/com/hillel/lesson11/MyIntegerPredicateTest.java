package com.hillel.lesson11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;

public class MyIntegerPredicateTest {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        Integer num = Integer.parseInt(bufferedReader.readLine());

        //1. Regular class
        MyIntegerPredicate predicate0 = new EvenPredicate();
//        System.out.println(predicate0.test(num));
        //2. Anonymous class
        MyIntegerPredicate predicate1 = new MyIntegerPredicate() {
            @Override
            public boolean test(Integer integer) {
                return integer % 2 == 0;
            }
        };
//        System.out.println(predicate1.test(num));
        //3. Lambda
        MyIntegerPredicate predicate2 = integer -> integer % 2 == 0;
        MyIntegerPredicate predicate3 = integer -> integer > 0;
        MyIntegerPredicate predicate4 = integer -> integer % 5 == 0;
        checkNumberAndPrint(num, predicate2);
        checkNumberAndPrint(num, predicate3);
        checkNumberAndPrint(num, predicate4);

    }

    private static void checkNumberAndPrint(Integer num, MyIntegerPredicate predicate) {
        System.out.println(predicate.test(num));
    }
}

    class EvenPredicate implements MyIntegerPredicate {

        @Override
        public boolean test(Integer integer) {
            return integer % 2 == 0;
        }
    }