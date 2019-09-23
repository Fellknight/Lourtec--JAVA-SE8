package estructurasControl;
import java.util.Scanner;

public class estructurasControl {

    public static void main(String[] args) {
        // TODO code application logic here
    //DECLARACIÓN DE VARIABLES
    byte dia;
    String diaSeleccionado;
    
    //INSTANCIA DE CLASE SCANNER
    Scanner scan= new Scanner(System.in);
    
    //SOLICITAR DATOS AL USUARIO
    System.out.println("Introduzca un número de un día de la semana");
    
    //CAPTURAR EL VALOR INGRESADO
    dia = scan.nextByte();
    
    //ESTABLECER LA ESTRUCTURA DE CONTROL Y EVAUAR LA VARIABLE "dia"
    switch (dia){
        // case 1: case 2: diaSelccionado = "Lunes"; break;
        case 1: diaSeleccionado = "Lunes"; break;
        case 2: diaSeleccionado = "Martes"; break;
        case 3: diaSeleccionado = "Miercoles"; break;
        case 4: diaSeleccionado = "Jueves"; break;
        case 5: diaSeleccionado = "Viernes"; break;
        case 6: diaSeleccionado = "Sabado"; break;
        case 7: diaSeleccionado = "Domingo"; break;
        default: diaSeleccionado = "El número no corresponde a un dia válido"; break;
        }
    //MOSTRANDO EL RESULTADO
    System.out.println("El día seleccionado es: "+ diaSeleccionado);
        }
    }
