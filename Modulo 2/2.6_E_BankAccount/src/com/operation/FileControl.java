/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.operation;

import com.main.EntryPoint;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author Java
 */
public class FileControl {
    private final String url;
    private File file;
    
    public FileControl(String url){
        this.url = url;
    }
    
   //METODO PARA LEER EL NOMBRE
    public void leerNombre() throws IOException {
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
    
    //METODO PARA LEER LA FECHA
    public void leerFecha() throws IOException {
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
