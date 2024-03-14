package AdmSoftware.tests;

public class Circulo {
    
    private double radio;

    public Circulo(double radio) {

        this.radio = radio;

    }

    public double obtenerDiametro() {

        return 2 * radio;
    }

}