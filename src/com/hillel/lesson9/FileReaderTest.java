package com.hillel.lesson9;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = null;

        try {
            reader = new BufferedReader(new FileReader("C:\\Users\\Сlass9-PC10\\Desktop\\test.txt"));

            String first = reader.readLine();
            System.out.println(first);
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (reader!=null){
            reader.close();}
        }
    }
}
