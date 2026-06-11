package ui;

import data.GestorDatos;
import model.Tour;

import java.util.List;

// Clase principal que ejecuta la aplicación
public class Main {
    public static void main(String[] args) {

        // Configuracion de la ruta y el gestor
        String ruta = "src/resources/tours.txt";
        GestorDatos gestor = new GestorDatos();

        // Carga de datos obtenidos por el gestor
        List<Tour> tours = gestor.obtenerLista(ruta);

        // Control de flujo si el archivo está vacio
        if(tours.isEmpty()) {
            System.out.println("El archivo está vacio");
            return;
        }

        // 1. Recorrido completo de la colección
        System.out.println("----- LISTA DE TOURS -----");
        int contador = 1;
        for(Tour tour : tours) {
            System.out.println(contador + ". " + tour);
            contador++;
        }

        // 2. Recorrido filtrado bajo condición especifica
        System.out.println("\n----- TOURS FILTRADOS (GASTRONOMICOS) -----");
        contador = 1;
        for(Tour tour : tours) {
            if(tour.getTipo().equalsIgnoreCase("Gastronomico")) {
                System.out.println(contador + ". " + tour);
                contador++;
            }
        }
    }
}