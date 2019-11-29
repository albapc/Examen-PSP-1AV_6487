package examenpsp6487;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Alba
 */
public class Ejercicio1y2_6487 extends Thread {
    
    public Ejercicio1y2_6487(String str) {
        super(str);
    }
    
    public void run() {
        //numero de iteraciones por hilo
        for(int i = 0; i <= 25; i++) {
            try {
                //cada hilo imprime el numero de iteracion y su nombre
                System.out.println(i + ": Hola, soy el hilo " + getName());
                
                //se "duerme" durante unos segundos aleatorios 
                Thread.sleep((long) ((Math.random() * (5000 - 100))));
            } catch (InterruptedException ex) {
                Logger.getLogger(Ejercicio1y2_6487.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
