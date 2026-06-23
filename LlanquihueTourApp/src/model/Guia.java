package model;

public class Guia {
    private String nombre;

    public Guia(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {return nombre;}
    public void setNombre(String nombre) {this.nombre = nombre;}

    @Override
    public String toString() {
        return "Guia: " + nombre;
    }
}
