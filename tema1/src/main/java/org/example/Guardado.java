package org.example;


import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class Guardado {
    public static void main(String[] args) throws IOException {
        Path salida = Path.of("informes/resumen.txt");
        Files.createDirectories(salida.getParent());

        Files.writeString(salida, "Todo correcto\n", StandardCharsets.UTF_8);

        List<String> lineas = List.of("Primera línea", "Segunda línea");
        Files.write(salida, lineas, StandardCharsets.UTF_8);





    }

}
