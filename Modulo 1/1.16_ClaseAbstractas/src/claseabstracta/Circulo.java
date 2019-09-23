package claseabstracta;

public class Circulo extends FiguraGeometrica {
    @Override
    public double calcularArea(double a, double b){
        //PI + R(2)
        return a + Math.pow(b,2);   
    }
    
    @Override
    public void dibujar() {
        System.out.println("Dibujando un Circulo");
    }
}
