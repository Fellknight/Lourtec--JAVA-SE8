package expresioneslambda;
/**
 * @author Felipe Guerra
 */
public class ExpresionesLambda {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //VARIABLES
        int resultado;
        
        //INSTANCIA DE LA CLASE Aritmetica
        Aritmetica arit = new Aritmetica();
        resultado = arit.sumar(3,2);
        System.out.println("Resultado: " + resultado);
        
        //USO DE LA EXPRESIÓN LAMBDA
        Operacion op = (x,y) -> x + y;
        resultado = op.sumar(3,2);
        System.out.println("Resultado (Lambda): " + resultado);
    }
}
