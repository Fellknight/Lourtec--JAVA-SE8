package herencia;

public class Herencia {

    public static void main(String[] args) {
        // TODO code application logic here
        
    // CLASE EMPLEADO
    Empleado empleado = new Empleado();
    empleado.setNombre("Felipe");
    empleado.setApellido("Guerra");
    
    //PRESENTACIÓN DE DATOS
    System.out.println(empleado.getNombre());
    System.out.println(empleado.getApellido());
    System.out.println(empleado.setSueldo(35000));
    System.out.println(empleado.getSueldo());
    }  
}
