package AdmSoftware;

import junit.framework.TestCase;
import org.junit.Test;

public class EjemploPrueba extends TestCase {

    public EjemploPrueba(String nombre) {
    super(nombre);

    }

    @Test
    public void testCaso1() {

    int respuesta = 2;
    assertEquals((1+1), respuesta);

    } 
    
}