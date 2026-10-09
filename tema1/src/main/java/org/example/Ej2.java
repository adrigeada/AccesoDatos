package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class Ej2 {
    static void main() throws IOException {

        Path path = Path.of("informes/prueba.csv");
        Files.writeString(path, "3;Joaquín Sabina;España\n", StandardCharsets.UTF_8);
        Files.writeString(path,"otra\n",StandardCharsets.UTF_8, StandardOpenOption.APPEND);

        try (BufferedReader reader = Files.newBufferedReader(path, StandardCharsets.UTF_8)) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        }catch (IOException e) {
            System.out.println(e.getMessage());
        }



    }
}
