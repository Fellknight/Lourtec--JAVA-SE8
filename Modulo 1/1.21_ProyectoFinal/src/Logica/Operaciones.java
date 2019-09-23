package Logica;

import Modelos.Libros;
import Modelos.ListaLibros;
import estructuras.IMetodos;
import java.util.ArrayList;

/**
 * @author Felipe Guerra
 * @version 1.0.0
 * Library's main functions 
 */
public class Operaciones implements IMetodos {
    ListaLibros listaLibros = new ListaLibros();
    ArrayList<Libros> resultado = listaLibros.getLista();
    
    /**
    * @author Felipe Guerra
    * @version 1.0.0
    * Validation Method for the Book's existence in the inventory
     * @param titulo book's tittle
     * @param autor book's author
     * @param anio book's year
     * @return result of the Boolean comparison
    */
    
    @Override
    public boolean validarLibros(String titulo, String autor, int anio) {
        return false;
    }
    
    @Override
    public void menu(){
        //MENU PINCIPAL OPCIONES/OPERACIONES
        System.out.print("\n=======================================================================");
        System.out.print("\nPor Favor Ingrese el número de la operación que desea realizar: ");
        System.out.print("\n=======================================================================");
        System.out.print("\nOpcion 1 - LISTAR EL INVENTARIO COMPLETO DE LIBROS ");
        System.out.print("\nOpcion 2 - BUSCAR LIBROS ");
        System.out.print("\nOpcion 3 - AGREGAR LIBROS AL INVENTARIO");
        System.out.print("\nOpcion 4 - MODIFICAR ");
        System.out.print("\nOpcion 5 - ELIMINAR LIBROS DEL INVETARIO");
        System.out.print("\nOpcion 6 - SALIR DEL SISTEMA\n");
    }
    
    @Override
    //public ArrayList<Libros> ListarLibros() {
        public void ListarLibros() {
        //ArrayList<Libros> resultado = listaLibros.getLista();
            System.out.print("\n=======================================================================");    
            System.out.println("\n LIBROS ALMACENADOS: ");
                for (byte i = 0; i <resultado.size() ; i++){
                System.out.println("\n" +resultado.get(i).getTitulo()+" "+resultado.get(i).getAutor()+" "+resultado.get(i).getAnio());
                System.out.print("\n=======================================================================");
            }
        }

    /**
     * @param libronom
     * @return econtrado string para almacenar el retorno en caso que el valor en el arreglo haga match
     */
    @Override
    public String BuscarLibros(String libronom) {
        //ArrayList<Libros> resultado = listaLibros.getLista();
        String encontrado = "";
            for (byte i = 0; i <resultado.size() ; i++){
               if (resultado.get(i).getTitulo().equals(libronom)){
               encontrado = resultado.get(i).getTitulo()+ ", " +resultado.get(i).getAutor()+ ", " +resultado.get(i).getAnio();
            }
        }
        return encontrado;  
    }
    
    @Override
    public boolean AgregarLibros(String titulo, String autor, int anio) {
        boolean libroAgre = false;
        if (BuscarLibros(titulo)==""){
            //AGREGAR LIBROS AL ARREGLO
            resultado.add(new Libros(titulo, autor, anio));
            libroAgre = true;
        }
        return libroAgre;
    }
}
/*
    @Override
    public void ModificarLibros(){}
/*
    @Override
    public void EliminarLibros(){}
*/
