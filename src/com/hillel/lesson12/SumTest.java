package com.hillel.lesson12;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class SumTest {
    public static void main(String[] args) {

        List<Integer> nums = List.of(1, 2, 3, 4, 5, 6);

        Integer sum = nums.stream()
//                .reduce(0, (accumulator, nextInt) -> accumulator + nextInt);
                .reduce(0, Integer::sum);
        System.out.println("Sum: " + sum);

        Optional<Integer> min = nums.stream()
                .min(Comparator.comparingInt(Integer::intValue));

        System.out.println("Min " + min);

        Optional<Integer> max = nums.stream()
                .max(Comparator.comparingInt(Integer::intValue));
        System.out.println("Max" + max);
    }
}
