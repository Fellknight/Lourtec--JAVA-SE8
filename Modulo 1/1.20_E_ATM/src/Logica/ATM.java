package Logica;
import Estructuras.IOperaciones;
import Modelos.Cliente;
import Modelos.ListaCliente;
/**
 * @author Felipe Guerra
 * @version 1.0.0
 */
public class ATM implements IOperaciones{
    public Cliente clienteActual;
    ListaCliente listaCliente;
        
    public ATM (){
        listaCliente = new ListaCliente();
        clienteActual = new Cliente();
    }

    @Override
    public boolean validarUsuario(int tarjeta, int clave) {
       boolean resultado;
        resultado = false;
       try {
        for (Cliente c: listaCliente.getLista()) {
            if (c.getTarjeta() == tarjeta && c.getClave() == clave){
                    this.clienteActual =c;
                    resultado = true;
                }
            }
        }
        catch (Exception a){
        System.out.println(a.getMessage());    
        } //finally {
           System.out.println("Disculpe, los datos ingresados no se encuentran regitrados. Por favor digise a una agencia");
        return false;
}    

    @Override
    public double consultarSaldo() {
        clienteActual.setSaldo(0);
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean verificarSaldo() {
        clienteActual.getSaldo();
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean retiro(double monto) {
        
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean deposito(double monto) {
        //clienteActual.setSaldo();
       
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }            
}