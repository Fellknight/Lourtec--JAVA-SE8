package excepciones;
/**
 * Construyendo mi propia exepción para la división cero
 * @author Felipe Guerra
 * @version 1.0.0
 */

public class MiExcepcion extends Exception {
    /**
     * Declaro mi constructor y llamo al constructor padre
     */
    public MiExcepcion(String _mensaje){
        super(_mensaje);
    }
}