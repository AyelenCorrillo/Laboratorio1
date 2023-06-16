package Laboratorio1.test;

import Laboratorio1.AutoClasico;
import Laboratorio1.AutoNuevo;
import Laboratorio1.Colectivos;
import Laboratorio1.Radio;

public class Main {
    public static void main(String[] args) {

        AutoClasico autoClasico = new AutoClasico("Rojo", "Ford", "Mustang");
        autoClasico.agregarRadio(new Radio("Sony", 100));
        autoClasico.agregarRadio(new Radio("Pioneer", 120));
        System.out.println(autoClasico);

        AutoNuevo autoNuevo = new AutoNuevo("Azul", "Toyota", "Corolla");
        autoNuevo.cambiarRadio(new Radio("Pioneer", 150));
        System.out.println(autoNuevo);

        Colectivos colectivos = new Colectivos("Amarillo", "Mercedes-Benz", "O500");
        colectivos.agregarRadio(new Radio("Blaupunkt", 80));
        System.out.println(colectivos);

        
    }
    
}
