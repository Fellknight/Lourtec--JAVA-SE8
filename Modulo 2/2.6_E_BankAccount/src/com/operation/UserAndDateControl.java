package com.operation;
import com.structure.I_UserAndDate;
import java.io.File;
import javax.swing.text.DateFormatter;
/**
 *
 * @author Java
 */
public class UserAndDateControl implements I_UserAndDate {

    @Override
    public String leerNombre(String nombre, String Apellido) {    
        
        /*
        String nombrFound = "";
        System.out.println("Se ha leido el archivo correctamente");
        nombrFound = nombre +" "+ Apellido;
        
        this.file = new File(this.url);
        //this.file.exists(); retorna (true/false)
        
        return nombrFound;
    }
        */
    @Override
    public string leerFecha() {
        LocalDate 1d1 = LocalDate.now();
        return "Fecha" +DateFormatter + 
    }
  }
}

