package AdmSoftware.tests;

public class Cuadrado {
    
    private double lado;

    public Cuadrado(double lado) {

        this.lado = lado;

    }

    public double calcularArea() {

        return lado * lado;
    }

}