package com.hillel.lesson10;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorTest {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        ExecutorService executorService = Executors.newFixedThreadPool(2);
        List<Future<String>> futures = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            CallableImplement callable = new CallableImplement();
            Future<String> future = executorService.submit(callable);
            futures.add(future);
        }

        futures.get(3).cancel(true);

        System.out.println(futures.get(8).get());

    }

}
