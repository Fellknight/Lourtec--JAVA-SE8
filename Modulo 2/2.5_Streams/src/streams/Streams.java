package streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * @author Java
 */
public class Streams {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //ESTABLECER ARREGLO DE nombres
        List<String> nombres = new ArrayList();
        nombres.add("Anthony");
        nombres.add("Candy");
        nombres.add("Terry");
        nombres.add("Carlos");
        
        //UTILIZAR FILTORS Streams
        System.out.println("Buscar nombres que comiencen con la letra C");
        nombres.stream().filter(x -> x.startsWith("C")).forEach(System.out::println);
        System.out.println("");
        
        //ORDENO LOS NOMBRES
        System.out.println("Ordenar la lista (A-Z)");
        nombres.stream().sorted().forEach(System.out::println);
        System.out.println("");
        
        //RECORRO Y MANIPULO LOS NOMBRES
        System.out.println("Manipular cada elemento");
        nombres.stream().map(String::toUpperCase).forEach(System.out::println);
        System.out.println("");
        
        //LIMITAR LOS RESULTADOS
        System.out.println("Limitar los resultados");
        nombres.stream().limit(2).forEach(System.out::println);
        System.out.println("");
        
        //CONTAR LOS ELEMENTOS
        System.out.println("Cantidad de Elementos");
        System.out.println(nombres.stream().count());
        System.out.println("");
        
        //VARIOS
        nombres.stream().filter(x -> x.length() <6).sorted(Comparator.reverseOrder()).map(String::toUpperCase).distinct().forEach(System.out::println);
    }
}