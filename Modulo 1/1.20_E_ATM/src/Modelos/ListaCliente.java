package Modelos;
import java.util.ArrayList;
/**
 * @author Felipe Guerra
 */
public class ListaCliente {
    private ArrayList<Cliente> lista;

    public ListaCliente() {
        lista = new ArrayList<>();
        lista.add(new Cliente("Felipe", "Guerra", 17423, 17423, 17423));
        //lista.add(new Cliente("Antonio", "Garcia", 7777, 1010, 2001));
    }   
    public ArrayList<Cliente> getLista() {
        return lista;
    }
}