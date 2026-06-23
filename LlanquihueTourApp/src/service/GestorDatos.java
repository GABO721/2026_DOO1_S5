package service;

import model.Guia;
import model.Tour;

import java.io.*;
import java.util.*;

// Clase responsable de la persistencia y lectura de datos
public class GestorDatos {

    private List<Tour> tours;

    public GestorDatos() {
        this.tours = new ArrayList<>();
    }

    /**
     * Lee un archivo de texto delimitado por puntos y comas, y los transforma en colecciones
     * @param rutaArchivo Ubicación del archivo de texto
     * @return lista de objetos Tour instanciados
    */

    public List<Tour> cargarArchivo(String rutaArchivo) {
        tours.clear();

        // bloque try-with-resources asegura cierre del flujo de lectura
        try (BufferedReader br = new BufferedReader(new FileReader(rutaArchivo))) {
            String linea;

            while ((linea = br.readLine()) != null) {
                if(linea.trim().isEmpty()) continue;

                String[] partes = linea.split(";");

                if(partes.length == 4) {
                    try {
                        // asignación de cada columna de la linea (trim para eliminar posibles espacios)
                        String destino = partes[0].trim();
                        String tipo = partes[1].trim();
                        int precio = Integer.parseInt(partes[2].trim());
                        Guia guia = new Guia(partes[3].trim());

                        // Instanciación y adición a la lista
                        tours.add(new Tour(destino, tipo, precio, guia));
                    } catch (NumberFormatException e) {
                        System.out.println("Formato de precio invalido en linea: " + linea);
                    }
                }
            }
        } catch(FileNotFoundException e) {
            System.out.println("Archivo no encontrado en la ruta: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }

        return tours;
    }

    public void listarTour() {
        int contador = 1;

        for(Tour tour : tours) {
            System.out.println(contador + ". " + tour);
            contador++;
        }
    }

    public void listarTourFiltrado(String filtro) {
        int contador = 1;
        for(Tour tour : tours) {
            if(tour.getTipo().equalsIgnoreCase(filtro)) {
                System.out.println(contador + ". " + tour);
                contador++;
            }
        }

        if(contador == 1) System.out.println("Tipo de tour no encontrado.");
    }
}