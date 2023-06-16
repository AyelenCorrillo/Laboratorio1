package Laboratorio1;

public class AutoClasico extends Vehiculo{

    private Radio radio;

    public AutoClasico(String color, String marca, String modelo) {
        super(color, marca, modelo);
    }

    public void agregarRadio(Radio radio) {
        if (this.radio == null) {
            this.radio = radio;
            System.out.println("Se ha agregado una radio al auto clásico.");
        } else {
            System.out.println("El auto clásico ya tiene una radio.");
        }
    }

    
}
