package streamparalelos;

import java.util.List;
import java.util.ArrayList;
/**
 * @author Java
 */
public class StreamParalelos {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //CREAR UN ARREGLO DE TIPO ENTERO
        List<Integer> numeros = new ArrayList();
        
        //AÑADIR AL ARREGLO LOS NÚMEROS DEL 1 AL 6
        for (int i=0; i<6; i++){
            numeros.add(i);
        }
        
        //MUESTRO LOS NÚMEROS POR stream()
        numeros.stream().forEach(System.out::println);
        
        //SEPARO LOS RESULTADOS
        System.out.println("=========");
        
        //MUESTRO LOS NÚMEROS POR parallelStream()
        numeros.parallelStream().forEach(System.out::println);
    }
}