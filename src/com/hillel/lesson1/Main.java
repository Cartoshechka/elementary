package com.hillel.lesson1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        System.out.println("Введите количество елементов массива: ");

        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));

        int numOfElement = Integer.parseInt(buffer.readLine());

        int[] nums;
        nums = new int[numOfElement];

        for (int i = 0; i < nums.length; i++) {

            nums[i] = i;

            if (nums[i] % 2 == 0) {

                System.out.println(nums[i] + " чётное");

            } else {
                System.out.println(nums[i] + " нечётное");
            }


        }

    }


}
