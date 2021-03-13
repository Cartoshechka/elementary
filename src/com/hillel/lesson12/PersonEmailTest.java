package com.hillel.lesson12;

import java.util.List;
import java.util.stream.Collectors;

import static com.hillel.lesson12.Person.getPeople;

public class PersonEmailTest {

    public static void main(String[] args) {

        List<Person> people = getPeople();

/*
        БЕЗ СТРИМОВ
        for (Person person: people) {

            for (String email: person.getEmails()) {

                boolean isSent = sendEmail(email);
                System.out.println("Email send status: " + isSent);
            }
        }
*/
        System.out.println("--------------------");
        System.out.println("Without collect to string");
//      С СТРИМАМИ
        people.stream()
                .flatMap(person -> person.getEmails().stream())
                .map(PersonEmailTest::sendEmail)
                .forEach(isSent -> System.out.println("Email send status: " + isSent));

        System.out.println("--------------------");
        System.out.println("Collect to string");
//        С ОБЪЕДИНЕНИЕМ В СТРИНГ
        String emails = people.stream()
                .flatMap(person -> person.getEmails().stream())
                .collect(Collectors.joining(", "));

        sendEmail(emails);
    }


    public static boolean sendEmail(String email) {

        System.out.println("send email to " + email);
        return true;
    }
}
