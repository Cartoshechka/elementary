package com.hillel.lesson9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MathTest {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            Integer num1 = Integer.parseInt(reader.readLine());
            Integer num2 = Integer.parseInt(reader.readLine());

            Integer res = num1 / num2;
            System.out.println(res);
        } catch (/*IOException |*/ NumberFormatException e) {
            System.out.println("Invalid input");
        } catch (IOException e) {
            System.out.println("IO error");
        } catch (ArithmeticException e) {
            System.out.println("Do not divide by zero!");
        } catch (Exception e) {
            System.out.println("Exeption!");
        } finally {
         reader.close();
        }
    }
}
