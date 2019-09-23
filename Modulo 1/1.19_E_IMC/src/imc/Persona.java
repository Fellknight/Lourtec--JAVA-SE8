package imc;
/**
 * @author Felipe Guerra
 * @version 1.0.0.0
 */
public class Persona {
    //ATRIBUTOS
    private String nombre;
    private String apellido;
    private float peso;
    private float altura;
    public final float resIMC; 
    private final String nombreCompleto;

    //CONSTRUCTOR
    public Persona() {
        this.nombreCompleto = nombre+apellido;
        this.resIMC = (float) (peso/Math.pow(altura,2));
    }
    
    //GETTER Y SETTERS PARA LAS VARIABLES
    public float getPeso() {
        return peso;
    }
    public void setPeso(float peso) {
        this.peso = peso;
    }
    public float getAltura() {
    return altura;
    }
    public void setAltura(float altura) {
        this.altura = altura;
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
}