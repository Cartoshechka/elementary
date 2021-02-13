package com.hillel.lesson9;

public class MyExeptionTest {
    public static void main(String[] args) {
        try {
            throw new MyCheckExeption("checked");
        } catch (MyCheckExeption myCheckExeption) {
            myCheckExeption.printStackTrace();
            /*System.out.println(myCheckExeption.getMessage());*/
        }
        throw new MyUncheckedExeption("unchecked");
    }
}
