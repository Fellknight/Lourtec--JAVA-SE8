package manejoarchivos;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;


/**
 * @author Felipe Guerra
 */
public class ArchivosPOO {
    private final String url;
    private File file;
    
    public ArchivosPOO(String url){
        this.url = url;
    }
    
    public void crear() throws IOException {
        //INSTANCIA
        this.file = new File(this.url);
        
        //UTILIZO LAS CLASES PrintWriter y FileWriter
        PrintWriter pw = new PrintWriter(new FileWriter(this.file));
        
        //CIERRO LA CONEXCIÓN
        pw.close();
        
        //IMPRIMO UN MENSAJE
        System.out.println("El archivo se ha creado correctamente");
    }
    
    public void escribir(String text, boolean add) throws IOException {
        //INSTANCIA DE Archivo
        this.file = new File(this.url);
        
        //UTILIZO LAS CLASES PrintWriter y FileWriter
        PrintWriter pw = new PrintWriter(new FileWriter(this.file, add));
        
        //ESCRIBO POR PRIMERA VEZ EN EL ARCHIVO
        pw.println(text);
        pw.println("");
        
        //CIERRO LA CONEXIÓN
        pw.close();
        
        //IMPRIMO MENSAJE
        System.out.println("Se ha creado correctamente el archivo");  
    }
    
    public void leer() throws IOException {
        //INSTANCIA DE Archivo
        this.file = new File(this.url);
        //this.file.exists(); retorna (true/false)
        
        //UTILIZO LAS CLASES BufferedRead y FileReader
        BufferedReader br = new BufferedReader(new FileReader(this.file));
        
        //LEO LA INFORMACIÓN DEL ARCHIVO
        String lectura;
        lectura = br.readLine();
        while (lectura != null){
            System.out.println(lectura);
            lectura = br.readLine();
        }
        
        //CIERRO LA CONEXCIÓN
        
        //IMPRIMO MENSAJE
        System.out.println("Se ha leido el archivo correctamente");
    }
}
