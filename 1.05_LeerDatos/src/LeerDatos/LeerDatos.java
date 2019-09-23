package LeerDatos;
import java.util.Scanner;

public class LeerDatos {
    
    public static void main (String [] args) {
    //DECLARACION DE VARIABLES LOCALES
    short edad;
    short anio;
    String nombre;
    
    //INSTANCIA DE LA CLASE Scanner
    Scanner scan = new Scanner(System.in);
    
    //SOLICITAR POR PANTALLA EL NOMBRE DEL USUARIO
    System.out.print("Ingrese su Nombre: ");
    
    //CAPTURAR DATOS INGRESADOS POR USUARIO
    nombre =scan.next();
    if (!nombre.matches("[a-zA-Z]+")) {
        System.out.println("El nombre solo debe contener letras");
    }
    
    //SOLICITAR POR PANTALLA LA EDAD DEL USUARIO
    System.out.print("Ingrese su Edad: ");
    
    //CAPTURAR DATOS INGRESADOS POR USUARIO
    edad = scan.nextShort();
    
    //SE REALIZA LA OPERACION PARA CONOCER LA EDAD DEL USUARIO
    anio = (short) (2019 - edad);
    
    //SE PRESENTA EL RESULTADO
    System.out.println("Hola, " + nombre + " naciste en el año " + anio);
}
}
