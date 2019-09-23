package gettersetter;

public class Persona {

    //ATRIBUTOS
    private String nombre;
    private String apellido;
    private byte edad;
    
    //CONSTRUCTOR
    public Persona(String nombre, String apellido, byte edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }
    
    public String getnombreCompleto() {
        return this.getNombre() +" " +
               this.getApellido() + "tiene " + this.getEdad() + "años";
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

    public byte getEdad() {
        return edad;
    }

    public void setEdad(byte edad) {
        this.edad = edad;
    }
}
