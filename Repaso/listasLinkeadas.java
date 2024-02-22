package Repaso;

import java.util.LinkedList;

public class listasLinkeadas {

    public static void main(String[] args) {
        
        LinkedList <String> lista = new LinkedList<String>();

        /* 
        lista.push("A");
        lista.push("B");
        lista.push("C");
        lista.push("D");
        lista.push("F");
        lista.pop();
        */

        lista.offer("A");
        lista.offer("B");
        lista.offer("C");
        lista.offer("D");
        lista.offer("F");
        //lista.poll();

        lista.add(4, "E");
        lista.remove("E");

        System.out.println(lista.peekFirst());
        System.out.println(lista.peekLast());
        System.out.println(lista.indexOf("C"));
        lista.addFirst("S");
        lista.addLast("Z");
        String first = lista.removeFirst();
        String last = lista.removeLast();

        System.out.println(lista);

    }
    
}
