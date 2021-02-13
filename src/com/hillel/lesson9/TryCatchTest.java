package com.hillel.lesson9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TryCatchTest {


    public static void main(String[] args) throws IOException {
        num1();
        System.out.println("after exeption1");
    }

    public static void num1() throws IOException {
        num2();
        System.out.println("after exeption2");
    }

    public static void num2() throws IOException {
        num3();
        System.out.println("after exeption3");
    }

    public static void num3() throws IOException {
        num4();
        System.out.println("after exeption4");
    }

    public static void num4() throws IOException {
        try {
           num5();
        }catch (Exception e){
            System.out.println("exeption caught");
        }
        System.out.println("after exeption5");
    }

    public static void num5() throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String input = bufferedReader.readLine();
        if (input.equals("throw")) {
            throw new RuntimeException("my exeption");
        }
       /* try {
            if (input.equals("throw")) {
                throw new RuntimeException("my exeption");
            }
        }catch (Exception e){
            System.out.println("exeption caught");
        }*/
        System.out.println("after exeption");
    }
}
