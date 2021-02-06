package com.hillel.lesson8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;

public class MonthTest {
    public static void main(String[] args) throws IOException {

        Month january = Month.JANUARY;
        System.out.println(january);
        System.out.println(january.getName());

        Month february = Month.FEBRUARY;
        System.out.println(february);
        System.out.println(february.getName());


        MonthEnum jan = MonthEnum.JANUARY;
        System.out.println(jan);

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input;
        while (!(input = reader.readLine()).equals("exit")){
            MonthEnum inputEnum = MonthEnum.valueOf(input.toUpperCase());
        switch (inputEnum){
            case JANUARY:
            case FEBRUARY:
            case MARCH:
            case ARPIL:
            case MAY:
                System.out.println("Spring");
                break;
            case JUNE:
                System.out.println("Summer");
                break;
            case JULY:
            case AUGUST:
            case SEPTEMBER:
                System.out.println("Autumn");
                break;
            case OCTOBER:
            case NOVEMBER:
            case DECEMBER:
                System.out.println("Winter");
                break;

        }
        }



    }
}
