package com.hillel.lesson11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ArrayCompareTest {
    public static void main(String[] args) {
        String[] array1 = {"one", "two", "three"};
        String[] array2 = {"one ", "two", "three", "four"};
        String[] array3 = {"one", "two"};

        List<String[]> strings = new ArrayList<>(List.of(array1, array2, array3));
        printResult(strings);

   /*Comparator<String[]> comparator = new Comparator<String[]>() {
            @Override
            public int compare(String[] o1, String[] o2) {
                return o1.length - o2.length;
            }
        };*/
        strings.sort((o1, o2) -> o1.length - o2.length);
//      strings.sort(Comparator.comparingInt(o -> o.length));
        printResult(strings);
    }

    public static void printResult(List<String[]> strings) {
        System.out.println("__-----------------------------__");
        for (String[] str : strings) {
            System.out.println(Arrays.toString(str));
        }
    }
}

