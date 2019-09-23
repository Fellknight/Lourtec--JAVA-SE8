package excepciones;
/**
 * Esta clase nos permite dividir dos números 
 * @Felipe Guerra
 * @version 1.0.0
 */
public class Division {
    /**
     * Numerador de la división
     */
    private int numerador;
    /**
     * Denominador de la división
     */
    private int denominador;
    /**
     * Constructor de la clase
     * @param _numerador numerador
     * @param _denominador denominador
     */
    
    public Division(int _numerador, int _denominador){
        this.numerador = _numerador;
        this.denominador = _denominador;
    }
    /**
     * Method to divide two numbers
     * @throws MiExcepcion Exception for divisions by zero
     */
    public void dividir() throws MiExcepcion{
        int resultado;
        
        if (this.denominador == 0) {
            throw new MiExcepcion("La division entre cero no puede ser realizada");
        }
        resultado = this.numerador / this.denominador;
        System.out.println("El Resultado es: " + resultado);
    }
}
