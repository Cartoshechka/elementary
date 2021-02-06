package com.hillel.lesson8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.HashSet;
import java.util.Set;

public class HashSetTest {
    public static void main(String[] args) throws IOException {
        HashSet<String> statuses = new HashSet<>();
        String aNew = "new";
        String lost = "lost";
        String in_progress = "in progress";
        String done = "done";
        String failed = "failed";

        statuses.add(aNew);
        statuses.add(in_progress);
        statuses.add(done);
        statuses.add(failed);
        statuses.add(lost);

        System.out.println(statuses);

        System.out.println(statuses.contains("done"));
        System.out.println(statuses.contains("delivered"));

        for (String str : statuses) {
            System.out.println(str);
        }

        Set<String> goodStatuses = Set.of(aNew, in_progress, done);
        Set<String> badStatuses = Set.of(lost,failed);

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String orderStatus;
        while (!(orderStatus = reader.readLine()).equals("exit")) {
            if (goodStatuses.contains(orderStatus)) {
                System.out.println("Painting green");
            } else if (badStatuses.contains(orderStatus)) {
                System.out.println("Painting red");
            } else {
                System.out.println("Unknown status");
            }
        }
    }
}
