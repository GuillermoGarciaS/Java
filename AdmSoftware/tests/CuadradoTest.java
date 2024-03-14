package AdmSoftware.tests;

import static org.junit.Assert.*;
import org.junit.Test;

public class CuadradoTest {
    private Cuadrado cuadrado;

    @Test
    public void pruebaAreaVerdadera() {
        cuadrado = new Cuadrado(5);
        assertEquals(25, cuadrado.calcularArea(), 0.001);
    }

    @Test
    public void pruebaAreaFalsa() {
        cuadrado = new Cuadrado(4);
        assertNotEquals(20, cuadrado.calcularArea(), 0.001);
    }
}
