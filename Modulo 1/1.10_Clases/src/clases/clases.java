package clases;
import java.util.Scanner;

public class clases {
    
    public static void main(String[] args) {
        // TODO code application logic here
        //DECLARACION DE VARIABLES
        String mayus;
        boolean esMayus;
        
        //INSTANCIA DE CLASE Personas
        personas p1 = new personas();
        personas p2 = new personas("Pepito", "Pregunton", 1982);
        Scanner scan = new Scanner(System.in);
        
        //PRESENTACION DE DATOS
        System.out.println(p2.nombre);
        System.out.println(p2.apellido);
        System.out.println(p2.anioNacimiento);
        System.out.println(p2.obtenerNombreCompleto());
        System.out.println(p2.obtenerEdad());
        System.out.println(" ");
        
        //PREGUNTAR VAORES NECESARIOS
        System.out.println("Indique su Nombre: ");
        p1.nombre = scan.next();
        System.out.println("Inique su Apellido: ");
        p1.apellido = scan.next();
        System.out.println("Indque el año de su Nacimiento");
        p1.anioNacimiento = scan.nextInt();
        System.out.println("¿Quiere su Nombre en Mayúsculas? (S/N): ");
        mayus = scan.next();
        
        //VALIDAR OPCIÓN
        esMayus = "S".equals(mayus);
        
        //MOSTAR VALORES
        System.out.println("");
        System.out.println("Su Nombre Completo es: " + p1.obtenerNombreCompleto(esMayus));
        System.out.println("Su Edad es: " + p1.obtenerEdad());        
    }    
}
