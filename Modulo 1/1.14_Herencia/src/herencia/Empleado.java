package herencia;

public class Empleado extends Persona {
    //ATRIBUTOS
    private int sueldo;
    
    //MÉTODOS
    public String getSueldo(){
        StringBuilder sb = new StringBuilder();
        sb.append("El sueldo de ");
        sb.append(super.getNombre());
        sb.append(" ");
        sb.append(super.getApellido());
        sb.append("es BsS. ");
        sb.append(this.sueldo);
        return sb.toString().toUpperCase();
    }
    
    public String setSueldo(int _sueldo){
    String mensaje;
    if (_sueldo <= 40000){
        this.sueldo = _sueldo;
        mensaje = "Sueldo Actualizado con exito";
    } else {
        this.sueldo = 0;
        mensaje = "El sueldo no puee ser superior a los BsS. 40000";
    }    
    return mensaje;      
    }
}
