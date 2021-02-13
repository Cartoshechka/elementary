package com.hillel.lesson9;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileWithCloseTest {
    public static void main(String[] args) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\Сlass9-PC10\\Desktop\\test.txt"))) {
            String first = reader.readLine();
            System.out.println(first);
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
