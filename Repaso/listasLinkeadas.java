package Repaso;

import java.util.LinkedList;

public class listasLinkeadas {

    public static void main(String[] args) {
        
        LinkedList <String> lista = new LinkedList<String>();

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
        lista.removeFirst();
        lista.removeLast();

        System.out.println(lista);

    }
    
}