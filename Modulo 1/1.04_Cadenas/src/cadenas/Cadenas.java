package cadenas;

public class Cadenas {

    public static void main(String[] args) {
        //DECLARACION VARIABLES TIPO: STRING
        String cadena;
        cadena ="Hola";
        cadena +="";
        cadena +="mundo";
       
        //PRESENTACION DE LA INFORMACIÓN
        System.out.println(cadena);
        System.out.println(cadena.length());
        System.out.println(cadena.getClass());
        System.out.println(cadena.isEmpty());
        System.out.println(cadena.toUpperCase());
        System.out.println(cadena.toLowerCase());
        System.out.println("");
        
        //USO STRINGBUILDER
        StringBuilder sb1= new StringBuilder();
        
        // CONCATENAR CADENAS DE CARACTERES
        sb1.append("Hola").append(" ").append("mundo");
        
        //AGREGO NUEVAS CADENAS
        sb1.insert(0,"i");
        sb1.insert (sb1.length(),"!");
        
        // PRESENTO LA INFORMACIÓN
        System.out.println("StringBuilder: ");
        System.out.println(sb1);
        System.out.println("");
        
        //USO DE StringBuffer
        StringBuffer sb2= new StringBuffer();
        
        // CONCATENAR LAS CADENAS DE CARACTACTERES
        sb2.append("Hola");
        sb2.append(" ");
        sb2.append("mundo");
        
        //AGREGO NUEVAS CADENAS
        sb2.insert (sb2.length(),"!");
        
        // PRESENTACIÓN DE LA INFORMACIÓN
        System.out.println("StringBuffer");
        System.out.println(sb2);
    }   
}
