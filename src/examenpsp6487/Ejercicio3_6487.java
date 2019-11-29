package examenpsp6487;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Alba
 */
public class Ejercicio3_6487 extends Thread {
    //contador para controlar el numero de hilos
    static int cont = 1;

    public Ejercicio3_6487(String str) {
        super(str);
    }

    public void run() {

        //crearemos en total 3 hilos
        while (cont <= 3) {
            //numero de hilo
            cont++;
            Thread hilo = new Ejercicio3_6487("Hilo " + cont);
            //lo iniciamos
            hilo.start();

            //bucle que indica que cada hilo se esta procesando
            for (int i = 0; i <= 25; i++) {

                System.out.println(i + ": Procesando hilo " + getName());

                Thread.yield(); //despues de cada iteración el hilo que se esta ejecutando cede su sitio a otro
                try {
                    Thread.sleep(2000); //pausa durante 2 segundos
                } catch (InterruptedException ex) {
                    Logger.getLogger(Ejercicio3_6487.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
}
