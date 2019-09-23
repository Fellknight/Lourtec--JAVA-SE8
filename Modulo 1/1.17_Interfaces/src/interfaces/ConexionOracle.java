package interfaces;

public class ConexionOracle implements IAccesoDatos, IAccesoOracle {

    //ATRIBUTOS
    private String serviceName;
    
    @Override
    public void conectar(){
    System.out.println("Método Implementado Conectar");
    }
    
    @Override
    public void desconectar(){
    System.out.println("Método Implementado Desconectar");
    }
    
    @Override
    public void listar(){
    System.out.println("Método Implementado Listar");
    }
    
    @Override
    public String getServiceName() {
        return this.serviceName;
    }
    
    @Override
    public void setServiceName(String _sn){
        this.serviceName = _sn;
    }
}