package automoveis;

public class Carro extends Veiculo {
    protected String tipoCombustivel;
    
    public Carro(String marca, String modelo, int ano, String tipoCombustivel){
        super(marca, modelo, ano);
        this.tipoCombustivel = tipoCombustivel;
    }
    
    public void exibirInfo(){
        super.exibirInfo();
        System.out.println("Tipo de Combustivel: " + tipoCombustivel);
    }
}