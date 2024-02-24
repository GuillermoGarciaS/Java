package Process;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;


public class cena {

    public static void iniciarCena(Map<String, List<filosofo>> grupos) {

        // Con este codigo iniciamos las cenas //

        for (List<filosofo> grupo : grupos.values()) {

            List<Thread> hilosGrupo = new ArrayList<>();

            for (filosofo filosofo : grupo) {

                Thread hilo = new Thread(() -> filosofo.comer(5000));
                hilosGrupo.add(hilo);

            }

            // Ahora esperamos a que los hilos concluyan //

            for (Thread hilo : hilosGrupo) {

                hilo.start();

                try {

                    hilo.join();

                } catch (InterruptedException e) {

                    e.printStackTrace();

                }

            }

        }
        
    }
    
}