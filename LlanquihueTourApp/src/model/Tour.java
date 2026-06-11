package model;

// Entidad que representa un tour turistico
public class Tour {
    private String destino;
    private String tipo;
    private int precio;

    // Constructor
    public Tour(String destino, String tipo, int precio) {
        this.destino = destino;
        this.tipo = tipo;
        this.precio = precio;
    }

    // Metodos Getters y Setters
    public String getDestino() {return destino;}
    public void setDestino(String destino) {this.destino = destino;}

    public String getTipo() {return tipo;}
    public void setTipo(String tipo) {this.tipo = tipo;}

    public int getPrecio() {return precio;}
    public void setPrecio(int precio) {this.precio = precio;}

    // Sobreescritura de toString()
    @Override
    public String toString() {
        return "Tour: " + destino + " | tipo: " + tipo + " | precio: $" + precio;
    }
}
