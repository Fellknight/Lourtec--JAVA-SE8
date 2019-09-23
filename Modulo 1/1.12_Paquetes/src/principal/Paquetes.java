package principal;
import externo.Saludo;
import static externo.Saludo.despedir;

public class Paquetes {
    
    public static void main(String[] args) {
        // TODO code application logic here
        
// INSTANCIA LA CLASE Paquetes
        Saludo sal = new Saludo();

//  USO DEL METODO NORMAL
        sal.saludar();
    
//  USO DEL METODO ESTATICO
        Saludo.despedir();
    
//  USO DEL METODO ESTATICO IMPORTADO
        despedir();
    }   
}