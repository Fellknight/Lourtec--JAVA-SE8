package Principal;

import java.util.Scanner;
import Modelos.Libros;
import Modelos.ListaLibros;
import Logica.Operaciones;
import estructuras.IMetodos;
import java.lang.reflect.Array;

/**
 * @author Felipe Guerra
 * @version 1.0.0
 * Program's Main Method
 */
public class Libreria {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
        //MENSAJE DE BIENVENIDA
        System.out.println("\n=====================================================================================");
        System.out.print("\nBIENVENIDO AL SISTEMA PARA LA GESTION DEL INVETARIO DE LA BIBLIOTECA JAVA1-BIBLIO-MOD: ");
        System.out.println("\n=====================================================================================");
        //System.out.println("\n=====================================================================================");
   
        //INSTANCIA
        Operaciones oper = new Operaciones();
       
        //INSTANCIA DE CLASE Scanner
        Scanner scan = new Scanner(System.in);
                      
        //MOSTRAR MENU PRINCIPAL
        oper.menu();
                    
        //CAPTURAR INPUT DE SELECCIÓN
        int opcion;
        String libronom;
        String autorNuevo;
        int anioNuevo;
        opcion = scan.nextInt();  
      
        switch (opcion){
        //LISTAR LIBROS TODOS LOS LIBROS ALMACENADOS
       case 1: 
            oper.ListarLibros();
            oper.menu();
        break;
        
        //BUSCAR LIBROS
        case 2:
            System.out.println("Por favor introduzca el nombre del libro que desea buscar");
            libronom = scan.next();
            String libroEcontrado = "";
            if (!libronom.matches("[a-zA-Z]+")) {
                System.out.println("El nombre solo puede contener letras");
            } else{
                libroEcontrado = oper.BuscarLibros(libronom);
                    if (libroEcontrado != "") {
                    System.out.println(libroEcontrado);    
                    } else {
                        System.out.println("El libro no se enuentra en el inventario");
                    }
                }
        break;
        
        //AGREGAR LIBROS AL INVENTARIO
        case 3: 
            System.out.println("\nPor favor introduzca el titulo del nuevo libro)");
            libronom = scan.next();
            System.out.println("\nPor favor introduzca el autor del nuevo libro)");
            autorNuevo = scan.next();
            System.out.println("\nPor favor introduzca el año del nuevo libro)");
            anioNuevo= scan.nextInt();
            if (!libronom.matches("[a-zA-Z]+")&& autorNuevo.matches("[a-zA-Z]+")) {
                System.out.println("\nLos nombres del libro y autor solo puede contener letras");
            } else {   
                oper.AgregarLibros(libronom, autorNuevo, opcion);
                oper.ListarLibros();
            }
        break;
       
        default: System.out.println("El valor ingresado no corresponde a una opcion válida" + "'" + opcion + "'"); 
            //opcion = scan.nextInt();
        break;    
        }
    }
}