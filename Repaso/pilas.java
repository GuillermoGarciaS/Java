package Repaso;

import java.util.Stack;

public class pilas {

    public static void main(String[] args) {
        
        Stack<Object> pila = new Stack<>();
        pila.push(50);
        pila.push("String");
        pila.push(20);
        pila.push(35);

        System.out.println("El ultimo elemento de la pila es: " + pila.peek());

        // Metodo para vaciar la pila, imprimiendo los datos que vaya eliminando
        while(!pila.empty()) {

            System.out.println(pila.pop());

        }

    }
    
}