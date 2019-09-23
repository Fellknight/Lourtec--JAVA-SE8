package estructuras;

import Modelos.Libros;
import java.util.ArrayList;

/**
 * @author Felipe Guerra
 * @version 1.0.0
 * Interface for the library's principal operations and functionality
 */
public interface IMetodos {
    public abstract void menu();
    public abstract boolean validarLibros(String titulo, String autor, int anio);
    public abstract void ListarLibros();
    public abstract String BuscarLibros(String titulo);
    public abstract boolean AgregarLibros(String titulo, String autor, int anio);
    //public abstract void ModificarLibros();
    //public abstract void EliminarLibros();
}