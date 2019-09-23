package Modelos;
/**
 * @author Felipe Guerra
 * @version 1.0.0
 */
public class Cliente {
    private String nombre;
    private String apellido;
    private int tarjeta;
    private int clave;
    private double saldo;

    public Cliente(String nombre, String apellido, int tarjeta, int clave, double saldo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.tarjeta = tarjeta;
        this.clave = clave;
        this.saldo = saldo;
    }

    public Cliente() {
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getTarjeta() {
        return tarjeta;
    }

    public void setTarjeta(int tarjeta) {
        this.tarjeta = tarjeta;
    }

    public int getClave() {
        return clave;
    }

    public void setClave(int clave) {
        this.clave = clave;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
