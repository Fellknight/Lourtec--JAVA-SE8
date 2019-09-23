package casting;
import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Casting {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    // TODO code application logic here
    // DECLARACIÓN DE LAS VARIABLES NECESARIAS
        byte a =12;
        Byte b =10;
        Double c = 12.9458957;
        
    // CASTING PRIMITIOS Y REFERENCIALES
    // IMPLICITOS
        Short aConvertido = (short)a;
        Long bConvertido= b.longValue();
        
    // EXPLICITOS
    Integer cConvertido = c.intValue();
    
    //FORMATO DECIMALES
    NumberFormat formatoDec = new DecimalFormat("#0.00");
    System.out.println("Formateando los Decimales: "+ formatoDec.format(c));
    
    // PRESENTACION DE LOS VALORES
    System.out.println("El valor Short es: "+ aConvertido + "-" + aConvertido.getClass());
    System.out.println("El valor Long es: "+ bConvertido + "-" + bConvertido.getClass());
    System.out.println("El valor Integer es: "+ cConvertido + "-"+cConvertido.getClass());
    }
}
