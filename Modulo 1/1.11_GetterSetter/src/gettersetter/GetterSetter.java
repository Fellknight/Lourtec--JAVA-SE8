package gettersetter;

public class GetterSetter {
    
    public static void main(String[] args) {
        // TODO code application logic here
        //INSTANCIA DE CLASE Persona
        Persona persona = new Persona("Felipe", "Guerra", (byte)33);
        
        //PRESENTACION DATOS
        System.out.println(persona.getNombre());
        System.out.println(persona.getApellido());
        System.out.println(persona.getEdad());
        System.out.println(persona.getnombreCompleto());
        System.out.println("");
        
        //CAMBIANDO VALORES
        persona.setNombre("Pedro");
        persona.setApellido("Lopez");
        persona.setEdad((byte)25);
        
        //MOSTAR DATOS
        System.out.println(persona.getNombre());
        System.out.println(persona.getApellido());
        System.out.println(persona.getEdad());
        System.out.println(persona.getnombreCompleto());
    }
}


