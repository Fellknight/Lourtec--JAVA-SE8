package com.main;

import com.operation.FileControl;
import com.operation.UserAndDateControl;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;
/**
 *
 * @author Felipe Guerra
 */
public class EntryPoint {
    
    public static void main(String[] args) {
    String nombre;
    String textoEntrada;
    String fecha;
    
    FileControl FileCo = new FileControl("./BankAccounts.txt");
    UserAndDateControl UserDateCo= new UserAndDateControl();
  
    System.out.println("\n=========================================");
    System.out.println("\nBIENVENIDO AL SISTEMA DE CUENTA BANCARIAS");
    System.out.println("\n=========================================");
    
    
    textoEntrada = ud.saludar(nombre, ud.fecha());
        System.out.println(mensaje);
        System.out.println("");
        System.out.print("---------------------");
        System.out.println("");
        System.out.print("Movimientos Bancarios");
        System.out.println("");
        System.out.print("---------------------");
        System.out.println("");
    
    
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
