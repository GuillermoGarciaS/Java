package AdmSoftware.tests;


public class VerificadorMayusculas {

    public static boolean tieneMayusculas(String texto) {

        for(char c : texto.toCharArray()) {

            if (Character.isUpperCase(c)) {

                return true;

            }

        }

        return false;

    }

}