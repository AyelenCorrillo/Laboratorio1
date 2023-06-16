package Laboratorio1;

final public class Colectivos extends Vehiculo{

    public Colectivos(String color, String marca, String modelo) {
        super(color, marca, modelo);
    }

    public void agregarRadio(Radio radio) {
        System.out.println("Se ha agregado una radio al colectivo.");
    }

    

    
}
