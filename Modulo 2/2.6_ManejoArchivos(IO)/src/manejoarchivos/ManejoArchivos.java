package manejoarchivos;

import java.io.IOException;

/**
 * @author Java
 */
public class ManejoArchivos {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
     ArchivosPOO ap = new ArchivosPOO("./log.txt");
     try {
     ap.crear();
     ap.escribir("Lorem ipsum 1", false);
     ap.escribir("Lorem ipsum 2", true);
     ap.escribir("Lorem ipsum 2", true);
     ap.leer();
    } catch (IOException ex){
        System.out.println(ex.getMessage());
    }catch(Exception ex) {
        System.out.println(ex.getMessage());
        }  
    }
}