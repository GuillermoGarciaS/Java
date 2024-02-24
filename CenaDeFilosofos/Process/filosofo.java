package Process;


public class filosofo{

    // Atributos que todos los filosofos tendran //
    
    String nombre;
    String frase;

    // Constructores //

    public filosofo(String nombre, String frase) {

        this.nombre = nombre;
        this.frase = frase; // Se inicializa la variable frase

    }

    // Aqui declararemoos lo que el proceso por el que pasan todos los filosofos //


    public void comer(int duracion) {

        System.out.println(nombre + " esta comiendo, y de mientras te dira una frase: " + frase);
        
        try {

            Thread.sleep(duracion);

        } catch (InterruptedException e) {

            e.printStackTrace();

        }

        System.out.println(nombre + " ha terminado de comer");

    }

}