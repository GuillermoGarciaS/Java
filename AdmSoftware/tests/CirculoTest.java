package AdmSoftware.tests;

import org.junit.Test;
import static org.junit.Assert.*;
public class CirculoTest {
    
    @Test
    public void testObtenerDiametro() {

        Circulo circulo = new Circulo(5);
        assertTrue(circulo.obtenerDiametro() == 10);

    }

    @Test
    public void testObtenerDiametroIncorrecto() {

        Circulo circulo = new Circulo(3);
        assertFalse(circulo.obtenerDiametro() == 10);

    }

}