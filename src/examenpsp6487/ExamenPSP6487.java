package examenpsp6487;

/**
 *
 * @author Alba
 */
public class ExamenPSP6487 {

    public static void main(String[] args) throws InterruptedException {

        //HILOS EJERCICIOS 1 Y 2
        Ejercicio1y2_6487 e1 = new Ejercicio1y2_6487("e1");
        Ejercicio1y2_6487 e2 = new Ejercicio1y2_6487("e2");
        Ejercicio1y2_6487 e3 = new Ejercicio1y2_6487("e3");

        //EJERCICIO 1
        //iniciamos los hilos
//        e1.start();
//        e2.start();
//        e3.start();
//     
        //con join hacemos que el programa espera a que los hilos acaben su trabajo antes de finalizarlo
//        e1.join();
//        e2.join();
//        e3.join();


        //EJERCICIO 2
        //iniciamos cada hilo y despues cerramos cada uno con join, para que el resto de hilos esperen a que 
        //finalice el anterior antes de ejecutarse y conseguir el orden que queremos
//        e3.start();
//        e3.join();
//        e2.start();
//        e2.join();
//        e1.start();
//        e1.join();


        //HILO EJERCICIO 3
        Ejercicio3_6487 h1 = new Ejercicio3_6487("Hilo 1");

        //EJERCICIO 3
        h1.start();
        h1.join(); //nos aseguramos de que el programa no finalice antes de que termine de ejecutarse el hilo

        System.out.println("El programa principal ha finalizado");
    }

}
