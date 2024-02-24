import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import Process.cena;
import Process.filosofo;


public class Main {

    public static void main(String[] args) {

        // Creamos los objetos //
    
        filosofo filosofo_1 = new filosofo("Arthur Schopenhauer", "Es dificil encontrar la felicidad dentro de uno mismo, pero es imposible encontrarla en otro lugar");
        filosofo filosofo_2 = new filosofo("Albert Camus", "La vida no tiene sentido, pero vale la pena vivir, siempre que reconozcas que no tiene sentido");
        filosofo filosofo_3 = new filosofo("Immanuel Kant", "El sabio puede cambiar de opinion, el necio nunca");
        filosofo filosofo_4 = new filosofo("Karl Marx", "La desvalorizacion del mundo humano crece en razon directa de la valorizacion del mundo de las cosas");
        filosofo filosofo_5 = new filosofo("Friedrich Nietzsche", "Solo cuando construimos el futuro tenemos derecho a juzgar el pasado");
    
        // Ahora agrupamos a los filósofos por grupo //
    
        Map<String, List <filosofo>> grupos = new HashMap<>();
        grupos.put("Grupo 1", Arrays.asList(filosofo_1, filosofo_3));
        grupos.put("Grupo 2", Arrays.asList(filosofo_2, filosofo_4));
        grupos.put("Grupo 3", Arrays.asList(filosofo_5, filosofo_3));
    
        cena.iniciarCena(grupos);
    
    }
    
}