package es.iesejemplo.sonoteca;

import es.iesejemplo.sonoteca.modelo.Album;
import es.iesejemplo.sonoteca.modelo.Artista;
import es.iesejemplo.sonoteca.modelo.Cancion;
import es.iesejemplo.sonoteca.modelo.Genero;
import es.iesejemplo.sonoteca.util.JsonUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * En esta clase creo 3 canciones. Pero la canción 2 es la única que uso para probar los métodos de JsonUtils
 * También meto estas 3 canciones en una lista para probar los metodos exportarLista e importarLista
 *
 */
public class PruebaJsonUtils {
    public static void main(String[] args) {

        Cancion cancion1 = new Cancion("Gimpse of us",185,1,new Album());
        Cancion cancion2 = new Cancion("End of begining",250,3,new Album("End",2021,new Artista("Djo"),new Genero("Indie")));
        Cancion cancion3 = new Cancion("Babieca",160,9,new Album());
        ArrayList<Cancion> listaCanciones = new ArrayList<>(Arrays.asList(cancion1,cancion2,cancion3));

        //Prueba exportar cancion
        String cancionJson = JsonUtils.exportarCancion(cancion2);
        System.out.println("- Canción pasada a Json(exportarCancion):\n "+cancionJson);
        System.out.println("-------------------------------------------------------------");

        //Prueba importar cancion
        Cancion cancionFromJson = JsonUtils.importarCancion(cancionJson);
        System.out.println("\n- De Json a Canción (importarCancion):\n "+cancionFromJson);

        System.out.println("-------------------------------------------------------------");

        //Prueba exportar lista canciones
        String listaJson = JsonUtils.exportarLista(listaCanciones);
        System.out.println("\n- Lista canciones pasada a JSON (exportarLista): \n"+listaJson);

        System.out.println("-------------------------------------------------------------");

        //Prueba importar lista canciones
        List<Cancion> listaImportada = JsonUtils.importarLista(listaJson);
        System.out.println("\n- Lista JSON pasada a clase List (importarLista): \n"+listaImportada);


    }
}
