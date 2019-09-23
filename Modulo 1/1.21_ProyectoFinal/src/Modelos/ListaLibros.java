package Modelos;

import java.util.ArrayList;
/**
 * @author Felipe Guerra
 * @version 1.0.0
 * Public Class to store the books data in array form
 */
public class ListaLibros {
    public ArrayList<Libros> getLista() {
        //Libros = new ArrayList<>();
        ArrayList<Libros> ListaLibros = new ArrayList<>();
        ListaLibros.add(new Libros("El Señor de los Anillos: La Comunidad del Anillo", "J. R. R. Tolkien", 1954));
        ListaLibros.add(new Libros("El Señor de los Anillos: Las Dos Torres", "J. R. R. Tolkien", 1954));
        ListaLibros.add(new Libros("El Señor de los Anillos: El Retorno del Rey I", "J. R. R. Tolkien", 1954));
        ListaLibros.add(new Libros("1984 (Novel)", "George Orwell", 1949));
        ListaLibros.add(new Libros("The Dunwich Horror", "H. P. Lovecraft", 1929));
        ListaLibros.add(new Libros("At the Mountains of Madness", "H. P. Lovecraft", 1936));
        ListaLibros.add(new Libros("The Shadow over Innsmouth", "H. P. Lovecraft", 1936));
        ListaLibros.add(new Libros("The Dreams in the Witch House", "H. P. Lovecraft", 1933));
        ListaLibros.add(new Libros("The Shadow Out of Time", "H. P. Lovecraft", 1936));
        ListaLibros.add(new Libros("Everything's Eventual", "Stephen King", 2002));
        ListaLibros.add(new Libros("Cujo", "Stephen King", 1981));
        return ListaLibros;   
    }
}