package claseabstracta;

public class Rectangulo extends FiguraGeometrica {
    @Override
    public double calcularArea(double a, double b){
        //BASE * ALTURA
        return a*b;
    }
    @Override
    public void dibujar(){
        System.out.println("Dibujando Un Rectángulo");
    }
}
