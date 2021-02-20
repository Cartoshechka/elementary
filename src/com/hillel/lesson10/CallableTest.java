package com.hillel.lesson10;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class CallableTest {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        CallableImplement callableImplement = new CallableImplement();
        FutureTask<String> futureTask = new FutureTask<>(callableImplement);

        new Thread(futureTask).start();
        System.out.println(futureTask.get());

    }
}

class CallableImplement implements Callable<String> {

    @Override
    public String call() throws Exception {
        Thread.sleep(1000);
        return "response";
    }
}