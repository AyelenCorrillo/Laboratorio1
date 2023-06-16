package Laboratorio1;

public class Radio {

    private String marca;
    private int potencia;

    public Radio(String marca, int potencia) {
        this.marca = marca;
        this.potencia = potencia;
    }

    @Override
    public String toString() {
        return "Radio [marca=" + marca + ", potencia=" + potencia + "]";
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    

    
    
}
