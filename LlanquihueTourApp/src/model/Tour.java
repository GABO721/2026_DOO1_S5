package model;

// Entidad que representa un tour turistico
public class Tour {
    private String destino;
    private String tipo;
    private int precio;
    private Guia guia;

    // Constructor
    public Tour(String destino, String tipo, int precio, Guia guia) {
        this.destino = destino;
        this.tipo = tipo;
        this.precio = precio;
        this.guia = guia;
    }

    // Metodos Getters y Setters
    public String getDestino() {return destino;}
    public void setDestino(String destino) {this.destino = destino;}

    public String getTipo() {return tipo;}
    public void setTipo(String tipo) {this.tipo = tipo;}

    public int getPrecio() {return precio;}
    public void setPrecio(int precio) {this.precio = precio;}

    public Guia getGuia() {return guia;}
    public void setGuia(Guia guia) {this.guia = guia;}

    // Sobreescritura de toString()
    @Override
    public String toString() {
        return "Tour: " + destino + " | tipo: " + tipo + " | precio: $" + precio + " | " + guia;
    }
}
