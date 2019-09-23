package arreglos;
import java.util.ArrayList;

public class arreglos {
    
    public static void main(String[] args) {
        // TODO code application logic here
        /**
         * PRIMERA FORMA DE DECLARAR UN ARREGLO
         * ESTABLECIENDO LOS VALORES AL INICIO
         * */
        String[] nombres = {"Anthony", "Ricardo", "Ana", "Petra"};
        int[] numeros = {1,2,3};
       
        /**
         * SEGUNDA FORMA DE DECLARAR UN ARREGLO:
         * EL VALOR ENTRE CORCHETES SERÁ LO LONGITUD QUE TENDRÁ EL ARREGLO
         **/
        String[] apellidos = new String[2];
        apellidos[0] = "Hurtado";
        apellidos[1] = "Perez";
        // apellidos[2] = "Lopez;
        
        //MOSTRANDO VALORES
        System.out.println(nombres[2] + "" + apellidos[1] + "" + numeros[2]);
        System.out.println("");
        
        /* ======================================== */
        
        //INSTANCIAR CLASE ArrayList
        ArrayList<String> arreglo = new ArrayList<>();
        
        //AGREGAR ELEMENTOS AL ArrayList
        arreglo.add("Anthony");
        arreglo.add("Ruben");
        arreglo.add("Pedro");
        
        //MOSTRAR LOS VALORES
        System.out.println("La Cantidad de lo Elementos del Arreglo son: " + arreglo.size());
        System.out.println("Valor en la posicion 1: " + arreglo.get(1));
        
        //ELIMINAR REGISTRO, INDICANDO POSICIÓN
        arreglo.remove(2);
        
        //MOSTRAR ARREGLO COMPLETO
        System.out.println("Lista de Elemento: " + arreglo);
        
        //BUSCAR REGISTROS
        System.out.println("¿Se encuentra?: " + arreglo.contains("Ruben"));
        
        //ACTUALIZAR LOS ELEMENTOS
        arreglo.set(arreglo.indexOf("Ruben"),"Pepito");
        
        //MOSTRANDO EL ARREGLO COMPLETO
        System.out.println("Lista de Elemento:" + arreglo);
    }
}
