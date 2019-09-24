package manejocolecciones;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @author Felipe Guerra
 */
public class ManejoColecciones {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //LISTA ESTRUCTURADA DE DATOS
        List empleados = new ArrayList();
        empleados.add("Felipe Guerra");
        empleados.add("Antonio Garcia");
        recorrer(empleados);
        
        //CONJUNTO DE DATOS
        Set tareas = new HashSet();
        tareas.add("Limpiar mi cuarto");
        tareas.add("sacar la basura");
        recorrer(tareas);
        
        //MAPA DE CLAVE:VALOR
        Map usuarios = new HashMap();
        usuarios.put("s24dafszf", "fguerra");
        usuarios.put("asda96341", "ypico");
        
        //PRESENTANDO LOS DATOS
        System.out.println("Buscar: " + usuarios.get("s24dafszf"));
        recorrer(usuarios.keySet());
        recorrer(usuarios.values());
    } 
    //RECORRER LA COLECCIÓN E IMPRIMIR CADA ELEMENTO
    /**
     * @param coleccion
     */
    public static void recorrer(Collection coleccion) {
        //PROGRAMACIÓN IMPERATIVA
            for(Object elemento: coleccion) {
            System.out.println(elemento);
            
       /* //PROGRAMACIÓN FUNCIONAL
            coleccion.forEach(elemento -> System.out.println(elemento.toString().toUppercase()));
            coleccion.forEach(System.out::println());
            System.out.println("");
        */
        }
    }
}
