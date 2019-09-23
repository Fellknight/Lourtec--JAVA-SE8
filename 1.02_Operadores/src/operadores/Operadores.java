package operadores;

public class Operadores {

    public static void main(String[] args) {
        // DECLARACION DE VARIABLES NECESARIAS
        int a =6;
        int b =2;
        int c =a -b; //4
        System.out.println("Resultado Inicial: "+ c);
        
        /**
         * UTILIZANDO EL OPERADOR *= NOS SIRVE PARA
         * MULTIPLICAR DE LA SIGUIENTE FORMA
         * (VALOR_ACTUAL * VALOR_ACTUAL)
         */
        c *=c;
        /* c = (a ==2 )? 10:5;
        if (a ==2){
            c = 10;
        } else {
            c = 5;
        }*/
        
        // PRESENTACION DE LOS VALORES
        System.out.println("Suma: "+(a+b));
        System.out.println("Resta: "+(a-b));
        System.out.println("Multiplicacion: "+(a*b));
        System.out.println("División: "+(a/b));
        System.out.println("Módulo: "+(a%b));
        System.out.println("Resultado Multiplicado: "+c);
        System.out.println("Calculo del IVA (12%): "+(a+b+c)*12/100);
    }    
}
