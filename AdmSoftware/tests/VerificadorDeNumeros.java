package AdmSoftware.tests;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class VerificadorDeNumeros {

    /**
     * Verifica si el texto proporcionado contiene uno o más números.
     *
     * @param texto el texto a verificar
     * @return true si el texto contiene al menos un número; false en caso contrario
     */

    public boolean contieneNumeros(String texto) {
        // Utiliza la expresión regular \d que coincide con cualquier dígito del 0 al 9.
        // El método matches busca en todo el texto, por lo que usamos .* al inicio y al final
        // para indicar "cualquier cantidad de cualquier carácter" antes y después del dígito.
        return texto.matches(".*\\d.*");
    }

    public static void main(String[] args) {
        VerificadorDeNumeros verificador = new VerificadorDeNumeros();

        String texto1 = "Este es un texto sin números";
        System.out.println("¿El texto \"" + texto1 + "\" contiene números? " + verificador.contieneNumeros(texto1));

        String texto2 = "Texto con 1 número";
        System.out.println("¿El texto \"" + texto2 + "\" contiene números? " + verificador.contieneNumeros(texto2));
    }

    // Pruebas unitarias
    @Test
    public void testContieneNumeros() {
        VerificadorDeNumeros verificador = new VerificadorDeNumeros();

        assertTrue(verificador.contieneNumeros("Este es un texto con 1 número"));
        assertTrue(verificador.contieneNumeros("12345"));
        assertTrue(verificador.contieneNumeros("Texto con varios números: 1, 2, 3, 4"));
        assertTrue(verificador.contieneNumeros("Incluso con números decimales: 3.14"));
    }

    @Test
    public void testNoContieneNumeros() {
        VerificadorDeNumeros verificador = new VerificadorDeNumeros();
    
        String texto = "Números al final: 10";
        System.out.println("Texto a evaluar: \"" + texto + "\"");
        boolean contieneNumeros = verificador.contieneNumeros(texto);
        System.out.println("¿El texto contiene números? " + contieneNumeros);
        assertFalse(contieneNumeros("El texto no debería contener números"));

    }
    
}