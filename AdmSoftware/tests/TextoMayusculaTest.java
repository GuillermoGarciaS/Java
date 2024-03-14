package AdmSoftware.tests;

import static org.junit.Assert.*;
import org.junit.Test;

public class TextoMayusculaTest {

    @Test
    public void testTieneMayusculas() {

        assertTrue(VerificadorMayusculas.tieneMayusculas("Pedro pica papas"));
        assertTrue(VerificadorMayusculas.tieneMayusculas("pedro pica papaS"));

    }

    @Test
    public void testNoTieneMayusculas() {

        assertFalse(VerificadorMayusculas.tieneMayusculas("pedro pica papas"));
        assertFalse(VerificadorMayusculas.tieneMayusculas("pedro no pica papas"));

    }
    
}