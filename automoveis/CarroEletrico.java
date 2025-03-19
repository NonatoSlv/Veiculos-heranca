package automoveis;

public class CarroEletrico extends Carro {
    private int capacidadeBateria;
    
    public CarroEletrico(String marca, String modelo, int ano, String tipoCombustivel, int capacidadeBateria){
        super(marca, modelo, ano, tipoCombustivel);
                this.capacidadeBateria = capacidadeBateria;
    }
    
    public void exibirInfo(){
        super.exibirInfo();
        System.out.println("Capacidade da Bateria: " + capacidadeBateria + "kWh");
    }
}
