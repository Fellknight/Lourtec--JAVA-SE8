package imc;
import java.util.Scanner;

/**
 * @author Felipe Guerra
 * @version 1.0.0
 */
public class Principal {
    public static void main(String[] args) {
        // TODO code application logic here
        
        //INSTANCIA DE CLASE Scanner
        Scanner scan = new Scanner(System.in);
        
        //INSTANCIA DE CLASE Persona
        Persona Persona = new Persona();
                       
        //SOLICITAR POR PANTALLA DATOS DEL USUARIO
        System.out.print("Ingrese su Nombre: ");
        System.out.print("Ingrese su Apellido: ");
        System.out.print("Ingrese su Peso: ");
        
        //CAPTURAR DATOS DEL USUARIO
        Persona.setNombre(scan.next());
        Persona.setApellido(scan.next());
        Persona.setPeso(scan.nextFloat());
        Persona.setAltura(scan.nextFloat());
            
        //CAPTURAR Y VALIDAR QUE NOMBRE SON STRING VALIDOS
       if (!Persona.setNombre.matches("[a-zA-Z]+")) {
        System.out.println("El nombre solo debe contener letras");         
        } else {
           Persona.setNombre = scan.next();
        }
       if (!Persona.setApellido.matches("[a-zA-Z]+")) {
        System.out.println("El nombre solo debe contener letras");         
        } else {
           Persona.setApellido = scan.next();
        } 
   }
}