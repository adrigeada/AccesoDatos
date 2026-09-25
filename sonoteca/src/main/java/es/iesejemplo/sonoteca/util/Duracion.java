package es.iesejemplo.sonoteca.util;

/**
 * UNIDAD 1 - EJERCICIO 2
 * <p>
 * Utilidad para convertir una duración en segundos a formato "mm:ss" y viceversa.
 * Complétala siguiendo las indicaciones de la práctica y comprueba tu solución
 * ejecutando los tests ya incluidos en el proyecto ({@code DuracionTest}).
 */
public class Duracion {

    private final int segundosTotales;

    /**
     * @param segundosTotales duración total en segundos; debe ser >= 0.
     * @throws IllegalArgumentException si segundosTotales es negativo.
     */
    public Duracion(int segundosTotales) {
        // TODO: valida que segundosTotales no sea negativo antes de asignarlo.
        if (segundosTotales < 0){
            throw new IllegalArgumentException();
        }
        this.segundosTotales = segundosTotales;
    }

    public int getSegundosTotales() {
        return segundosTotales;
    }

    /**
     * @return la duración con formato "mm:ss" (por ejemplo, 185 segundos -> "3:05").
     *         Los segundos siempre se muestran con dos dígitos.
     */
    public String aTexto() {
        // TODO: implementar.
        String minutos = Integer.toString(segundosTotales/60);

        int segundos = segundosTotales%60;
        String segundosCadena= "";
        if (segundos < 10){
            segundosCadena = "0"+segundos;
        }else {
            segundosCadena = Integer.toString(segundos);
        }


        return minutos+":"+segundosCadena;

        //throw new UnsupportedOperationException("TODO: implementar (unidad 1)");
    }

    /**
     * Proceso inverso a {@link #aTexto()}.
     *
     * @param texto una duración con formato "mm:ss".
     * @return el objeto Duracion equivalente.
     */
    public static Duracion desdeTexto(String texto) {
        // TODO: implementar.
        String[] vectorTexto = texto.split(":");
        int minutos = Integer.parseInt(vectorTexto[0])*60;
        int segundos = Integer.parseInt(vectorTexto[1]);

        return new Duracion(minutos+segundos);


        //throw new UnsupportedOperationException("TODO: implementar (unidad 1)");
    }


    @Override
    public String toString() {
        return aTexto();
    }
}
