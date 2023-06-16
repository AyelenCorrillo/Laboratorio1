package Laboratorio1;

public class AutoNuevo extends Vehiculo{

    public AutoNuevo(String color, String marca, String modelo) {
        super(color, marca, modelo);
    }

    public void cambiarRadio(Radio radio) {
        System.out.println("Se ha cambiado la radio del auto nuevo.");
    }
    
}
