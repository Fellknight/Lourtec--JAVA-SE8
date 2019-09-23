package excepciones;
/**
 * This is the program's main class
 * @author Felipe Guerra
 * @version 1.0.0
 * @see MiExecpcion which captures the division by zero
 */
public class Excepciones {
/**
 * Method for starting the application
 * @param args Starting parameters for the application
 */
    public static void main(String[] args) {
        // TODO code application logic here
        //INSTANCIA LA CLAVE DE DIVISION
        Division div = new Division(11,0);
        
        //Llamamos al método para operar y lo tratamos con el bloque try-catch-catch
        try {
            div.dividir();
        } catch(MiExcepcion me){
            //Imprimo el mensaje de la excepción
            System.out.println(me.getMessage());
           
            //Imprimo la ruta completa del error de principio a fin
            //me.printStackTrace();
        } finally {
            System.out.println("\nFinalice la operacion");
        }
    }   
}
