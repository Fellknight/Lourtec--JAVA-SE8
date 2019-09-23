package clases;

import java.util.Calendar;

public class personas {
 
    //ATRIBUTOS
    public String nombre;
    public String apellido;
    public int anioNacimiento;
    
    //CONSTRUCTOR #01
    public personas() { }
    
    //CONSTRUCTOR #02
    public personas(String firstname, String lastname, int birthdate){
        this.nombre = firstname;
        this.apellido = lastname;
        this.anioNacimiento = birthdate;
    }
    
    //MÉTODOS DE OPERACIONES
    public String obtenerNombreCompleto(boolean mayus){
        String cadena = this.nombre + " " + this.apellido;
        return (mayus) ? cadena.toUpperCase(): cadena.toLowerCase();
    }
    
    public String obtenerNombreCompleto() {
        return this.apellido + " " +this.nombre;
    }
    
    public int obtenerEdad() {
        //return 2019 - this.anioNacimiento;
        return Calendar.getInstance().get(Calendar.YEAR)- this.anioNacimiento;   
    }
}