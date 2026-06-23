package app;

import service.GestorDatos;
import model.Tour;

import java.util.List;

// Clase principal que ejecuta la aplicación
public class Main {
    public static void main(String[] args) {

        GestorDatos gestor = new GestorDatos();

        // Carga de datos obtenidos por el gestor
        List<Tour> tours = gestor.cargarArchivo("tours.txt");

        // Control de flujo si el archivo está vacio
        if(tours.isEmpty()) {
            System.out.println("El archivo está vacio");
            return;
        }

        // 1. Recorrido completo de la colección
        System.out.println("----- LISTA DE TOURS -----");
        gestor.listarTour();

        // 2. Recorrido filtrado bajo condición especifica
        System.out.println("\n----- TOURS FILTRADOS (GASTRONOMICOS) -----");
        gestor.listarTourFiltrado("Gastronomico");
    }
}