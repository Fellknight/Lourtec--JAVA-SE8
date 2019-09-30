/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swingframe;

import javax.swing.JFrame;

/**
 * @author Java
 */
public class SwingJFrame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //CREANDO MI PRIMERA VENTANA
        JFrame f = new JFrame("Mi Primera Ventana");
        f.setSize(400,300);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
        
        //CREANDO MI SEGUNDA VENTANA
        MisVentanas mv = new MisVentanas();
    }   
}