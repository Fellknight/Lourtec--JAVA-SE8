package swingframe;

import javax.swing.JFrame;

/**
 * @author Java
 */
public class MisVentanas extends JFrame {
    //CONSTRUCTOR DE LA CLASE
    public MisVentanas(){
        //UTILIZANDO LOS MÉTODOS DE JFrame
        super("Mi Segunda Ventana");
        super.setSize(400,400);
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        super.setVisible(true);
    }
}