package interfaces;

public class Interfaces {

    public static void main(String[] args) {
        // TODO code application logic here
        
     //INSTANCIA DE LA CLASE ConexionOracle
     ConexionOracle cnn = new ConexionOracle();
     
     //LLAMADO A LOS MÉTODOS NECESARIOS
     cnn.conectar();
     cnn.listar();
     cnn.desconectar();
     
     //ESTABLECIENDO EL VALOR Y MOSTRANDO
     cnn.setServiceName("xe");
     System.out.println(cnn.getServiceName());
    }
}
