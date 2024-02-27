package Repaso;

import java.util.LinkedList;

class clasePersonaje <T> {

    /* Atributos */

    private String nombre;
    private int atq;

    public clasePersonaje (String nombre, int atq) {

        this.nombre = nombre;
        this.atq = atq;
    
    }

    /* Getters & Setters */


    public String getNombre() {

        return nombre;

    }

    public void setNombre(String nombre) {

        this.nombre = nombre;

    }

    public int getAtq() {

        return atq;

    }

    public void setAtq(int atq) {

        this.atq = atq;

    }

    @Override
    public String toString() {

        return "Personaje {" +
                "nombre = '" + nombre + '\'' +
                ", ataque = " + atq +
                '}';


    }
    
}

public class clasesGenericas {

    public static void main(String[] args) {
        
        LinkedList<clasePersonaje<String>> personajesGenshin = new LinkedList<>();

        /* Agregamos los valores */

        personajesGenshin.add(new clasePersonaje<>("Kamisato Ayato", 2500));
        personajesGenshin.add(new clasePersonaje<>("Liney", 3200));
        personajesGenshin.add(new clasePersonaje<>("Neuvilette", 2750));

        /* Imprimir personajes */

        for (clasePersonaje<String> classpersonaje : personajesGenshin) {

            System.out.println(classpersonaje);

        }

    }

}