package EstructurasIterativas;

public class estructurasIterativas {
        
public static void main(String[] args) {
        // TODO code application logic here
    //DECLARACION DE VARIABLES
    byte a =1;
    
    //ESTRUCTURA ITERATIVA "While"
    while (a < 5) {
        //IMPRIMIR EL VALOR
        System.out.println("Wile: "+ a);
        
        //INCREMENTAR VALOR DE VARIABLE "a" EN "1"
        a++; //a = a + 1
    }
    
    //ESTRUCTURA ITERATIVA "DoWhile"
    do {
        System.out.println("DoWhile: " + a);
    } while(a<5);
    
    //ESTRUCTURA ITERATIVA "For"
    for (byte i = 1; i <= 10; i++){
        System.out.println("For #" +i);
    }
    }
}