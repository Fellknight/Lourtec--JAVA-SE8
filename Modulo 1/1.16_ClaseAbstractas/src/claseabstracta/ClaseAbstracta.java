package claseabstracta;

public class ClaseAbstracta {

    public static void main(String[] args) {
        // TODO code application logic here
    // INSTANCIA DE LA CLASE Circulo Y Rectangulo
    Circulo circulo = new Circulo();
    Rectangulo rectangulo = new Rectangulo();
    
    // UTILIZAR METODOS IMPLEMENTADOS
    System.out.println("El Área del Ciruclo es " + circulo.calcularArea(Math.PI, 2));
    System.out.println("El Área de un Rectangulo es: " + rectangulo.calcularArea(10, 10));
    
    // DIBUJANDO LAS FIGURAS GEOMETRICAS
    circulo.dibujar();
    rectangulo.dibujar();
    }
}
