package AdmSoftware.tests;

import static org.junit.Assert.*; 

import org.junit.Test; 

public class VerificadorPrimoTest { 

    VerificadorPrimo verificador = new VerificadorPrimo(); 

    @Test 

    public void testEsPrimo() { 

        assertTrue(verificador.esPrimo(7)); // 7 es primo 

        assertFalse(verificador.esPrimo(10)); // 10 no es primo 

    } 

} 