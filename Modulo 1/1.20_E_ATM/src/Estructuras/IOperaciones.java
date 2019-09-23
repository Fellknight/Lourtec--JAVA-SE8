package Estructuras;

/**
 * @author Felipe Guerra
 * @version 1.0.0
 */
public interface IOperaciones {
    public abstract boolean validarUsuario(int tarjeta, int clave);
    public abstract double consultarSaldo();
    public abstract boolean verificarSaldo();
    public abstract boolean retiro(double monto);
    public abstract boolean deposito(double monto);
}