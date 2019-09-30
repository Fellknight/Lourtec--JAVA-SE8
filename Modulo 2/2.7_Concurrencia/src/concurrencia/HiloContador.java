package concurrencia;
/**
 * @author Java
 */
public class HiloContador extends Thread {
    //ATRIBUTOS 
    Contador contador;
    
    //CONSTRUCTOR
    public HiloContador(String name, Contador counter){
        //LLAMADA AL CONSTRUCTOR DE LA CLASE PADRE (THREAD)
        // Y SE LE PASA EL NOMBRE DEL HILO
        super(name);
        this.contador = counter;
    }
    
    //IMPLEMENTO EL MÉTODO run() DEL A LA CLASE PADRE (Thread)
    @Override
    public void run() {
        try{
            String mensaje;
            for (int i=0; i <10; i++){
                //VARIABLE NECESARIA
                int valorContador;
            
                //DECORADOR PAR SINCRONIZAR LA EJECUCIÓN DE LOS HIJOS
                synchronized(this.contador){
                    //OBTENGO EL VALOR ACTUAL DEL OBJETOP
                    valorContador = this.contador.getContador();
                    
                    //DETENER POR 500 MILISEGUNDOS LA EJECUCIÓN DEL HIJO
                    Thread.sleep(10);
                
                    //ESTABLECER EL VALOR DE LA PROPIEDAD
                    this.contador.setContador(valorContador + 1);
                    
                    //IMPRIMIR EL VALOR ACTUAL
                    mensaje = "Hilo: " + super.getName();
                    mensaje += "Prioridad: " + super.getPriority();
                    mensaje += "Contador: " + valorContador;
                    System.out.println(mensaje);
                }
            }
        } catch (InterruptedException e){
            System.out.println(e.getMessage());
        } catch (Exception ex){
            System.out.println(ex.getMessage());
        }
    }
}