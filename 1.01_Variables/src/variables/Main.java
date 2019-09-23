package variables;

public class Main {

// DECLARACION VARAIBLES GLOBALES
 static byte  a =7;
 static int b =5;

// DECLARACION CONSTANTES
static final double PI = 3.14;

    public static void main(String[] args) {
        // DECLARACION VARIABLE LOCAL
	Integer c =1;

	// PRESENTACION LOS VALORES
	System.out.println("el valor de mi variable gloal es: "+ a);
	System.out.println("el valor de mi variable gloal es: "+ b);
	System.out.println("el valor de mi variable gloal es: "+ PI);
	System.out.println("el valor de mi variable gloal es: "+ c);

	//MODIFICACION VARIABLE LOCAL
	a =12;

	//MODIFICION VARIBLE LOCAL
	c =20;

	//PRESENTACION VALORES
	System.out.println("El valor de mi varible global modificada es "+ a);
	System.out.println("El valor de mi varible local modificada es "+ c);
	System.out.println("Nombre de la clase "+ c.getClass());
    }
    
}
