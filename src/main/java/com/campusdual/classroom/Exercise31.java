package com.campusdual.classroom;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Exercise31 {

    public static void main(String[] args) {

        try {

            //Se abre un bufferedReader para leer el archivo
            BufferedReader br = new BufferedReader(new FileReader("src/main/resources/lorem.txt"));

            String line;

            //Se recorren las lineas del archivo
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

            br.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
