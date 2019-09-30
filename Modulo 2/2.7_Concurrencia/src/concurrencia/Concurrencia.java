package concurrencia;

public class Concurrencia {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //CREAR OBJETO Contador
        Contador contador = new Contador();
        
        //CREAR DOS OBJETOS DE TIPO HiloContador
        HiloContador h1 = new HiloContador("PrimerHilo", contador);
        HiloContador h2 = new HiloContador("SegundoHilo", contador);
        HiloContador h3 = new HiloContador("TercerHilo", contador);
        
        //CAMBIANDO LA PRIORIDAD DE LOS HILOS
        h1.setPriority(Thread.MAX_PRIORITY);
        h2.setPriority(Thread.NORM_PRIORITY);
        h3.setPriority(Thread.MIN_PRIORITY); // 1 al 10
        
        //INICIAR HILOS
        h1.start();
        h2.start();
        h3.start();       
    }
}
