package Principal;
import Logica.ATM;
import java.util.Scanner;
import Modelos.Cliente;
import Modelos.ListaCliente;
/**
 * @author Felipe Guerra
 * @version 1.0.0
 */
public class CajeroATM {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
        //BIENVENIDA DEL CAJERO
        System.out.println("====================================");
        System.out.println("ATM JAVA BIENVENIDO");
        System.out.println("====================================");
        System.out.println("====================================");
        System.out.println("====================================");
        System.out.println("Por favor Introduzcan los datos que se solicitan a continuación: ");
        
        //INSTANCIA DE CLASE Scanner
        Scanner scan = new Scanner(System.in);
        
        //INSTANCIA DE CLASE Cliente
        Cliente CurrentCli = new Cliente();
        
        //SOLICITAR POR PANTALLA DATOS USUARIO
        System.out.print("Por Favor Ingrese Número de Tarjeta: ");
        System.out.print("Por Favor Ingrese Clave de su Tarjeta: ");
        
        //CAPTURAR DATOS USUARIO
        CurrentCli.setTarjeta(scan.nextInt());
        CurrentCli.setClave(scan.nextInt());
        
   
                
        ATM cajero = new ATM();
        boolean validado;
        validado = false;
        validado= cajero.validarUsuario(CurrentCli.getTarjeta(), CurrentCli.getClave());
         if (validado == true){
            System.out.print("Bienvenido Sr/Sra/Srta: " + cajero.clienteActual.getNombre());
            System.out.print("===================================: ");
            System.out.print("Por Favor Ingrese el número de la operación que desea realizar: ");
            System.out.print("===================================: ");
            System.out.print("Opcion 1 - Consultar Saldo ");
            System.out.print("Opcion 2 - Retiro ");
            System.out.print("Opcion 3 - Deposito ");
            System.out.print("Opcion 4 - Salir del Sistema ");
            byte operacion = scan.nextByte();
            
            switch(operacion){
                case 1:
                System.out.print("Su Saldo Actual es : " + cajero.clienteActual.getSaldo());
                
                case 2:
                System.out.print("Su Saldo Actual es : " + cajero.clienteActual.getSaldo());    
            }
         }   
    }
}
