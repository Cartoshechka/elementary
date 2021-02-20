package com.hillel.lesson9;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class DateTest {

    public static void main(String[] args) {

        LocalDate now = LocalDate.now();
        System.out.println(now);

        LocalDate dateOfBirth = LocalDate.of(2020,7,15);
        System.out.println(dateOfBirth);

        LocalDate anotherDate = LocalDate.parse("1981-01-21");
        System.out.println(anotherDate);

        System.out.println(anotherDate.getMonth());

        System.out.println(anotherDate.isAfter(dateOfBirth));

        LocalTime time = LocalTime.now();
        System.out.println(time);
        LocalTime time1 = LocalTime.of(15,48,59);
        System.out.println(time1);
        LocalTime time2 = LocalTime.parse("15:51:40");
        System.out.println(time2);

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);
        LocalDateTime localDateTime1 = LocalDateTime.parse("2021-01-01T06:00:00");
        System.out.println(localDateTime1);

        System.out.println(localDateTime.plusYears(4));

        System.out.println(localDateTime.format(DateTimeFormatter.ISO_LOCAL_DATE));
        System.out.println(localDateTime.format(DateTimeFormatter.ofPattern("dd MM yyyy")));
        System.out.println(localDateTime.format(DateTimeFormatter.ofPattern("dd MMM yyyy")));
        System.out.println(localDateTime.format(DateTimeFormatter.ofPattern("MM yyyy")));

        ZoneId zoneId = ZoneId.of("CET");
        ZonedDateTime zonedDateTime = ZonedDateTime.of(2020,3,10,0,0,0,0,zoneId);
        System.out.println(zonedDateTime);

        System.out.println(ZonedDateTime.now());


    }
}
