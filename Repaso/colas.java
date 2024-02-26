package Repaso;

import java.util.LinkedList;

public class colas {

    public static void main(String[] args) {

        /* FIFO */

        LinkedList<Integer> cola = new LinkedList<>();

        for (int i = 1; i < 11; i++) {

            cola.add(i);
            if (i == 1) System.out.println("Ahora tu cola FIFO cuenta con " + i + " articulo");
            else System.out.println("Ahora tu cola FIFO cuenta con " + i + " articulos");

        }

        System.out.println("======================================================");

        while (cola.isEmpty()) {

            int item = cola.poll();
            System.out.println("ahora pasaremos a retirar el articulo de la lista FIFO" + item);

        }

        /* LIFO */

        LinkedList<Integer> cola2 = new LinkedList<>();

        for (int i = 1; i < 11; i++) {

            cola2.add(i);
            if (i == 1) System.out.println("Ahora tu cola LIFO cuenta con " + i + " articulo");
            else System.out.println("Ahora tu cola LIFO cuenta con " + i + " articulos");

        }

        System.out.println("======================================================");

        while (cola.isEmpty()) {

            int item = cola2.removeLast();
            System.out.println("ahora pasaremos a retirar el articulo de la lista LIFO" + item);

        }

    }

}