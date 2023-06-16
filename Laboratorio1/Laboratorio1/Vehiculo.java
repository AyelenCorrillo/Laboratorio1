package Laboratorio1;

public class Vehiculo {

    private String color;
    private String marca;
    private String modelo;
    private boolean precio;

    public Vehiculo(String color, String marca, String modelo) {
        this.color = color;
        this.marca = marca;
        this.modelo = modelo;
    }   

    
    public void cambiarRadio(Radio radio) {
        System.out.println("Se ha cambiado la radio del vehículo.");
    }

    public void agregarRadio(Radio radio) {
        System.out.println("Se ha agregado una radio al vehículo.");
    }  


    @Override
    public String toString() {
        return "Vehiculo [color=" + color + ", marca=" + marca + ", modelo=" + modelo + ", precio=" + precio + "]";
    }


    public String getColor() {
        return color;
    }


    public void setColor(String color) {
        this.color = color;
    }


    public String getMarca() {
        return marca;
    }


    public void setMarca(String marca) {
        this.marca = marca;
    }


    public String getModelo() {
        return modelo;
    }


    public void setModelo(String modelo) {
        this.modelo = modelo;
    }


    public boolean isPrecio() {
        return precio;
    }


    public void setPrecio(boolean precio) {
        this.precio = precio;
    }

    


    
}
