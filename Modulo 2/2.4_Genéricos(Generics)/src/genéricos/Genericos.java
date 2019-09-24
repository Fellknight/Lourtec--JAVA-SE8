package genéricos;
/**
 * @author Felipe Guerra
 */
public class Genericos {
    public static void main(String[] args) {
        // TODO code application logic here
        
        //GENERICO DE TIPO interger
        ClaseGenerica<Integer> cg = new ClaseGenerica<>(20);
        cg.obtenerTipo();
        
        //GENERICO DE TIPO cadena
        ClaseGenerica<String> cg2 = new ClaseGenerica<>("Felipe Guerra");
        cg2.obtenerTipo();
        
        //GENÉRICO DE TIPO double
        ClaseGenerica<Double> cg3 = new ClaseGenerica<>(3.14);
        cg3.obtenerTipo();
    }
}    
