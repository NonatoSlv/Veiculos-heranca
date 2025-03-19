package automoveis;

public class main {
    public static void main(String[] args) {
        Veiculo veiculo = new Veiculo("Ferrari", "LAferrari", 2013);
        Carro carro = new Carro ("Lamborghini", "Veneno", 2014, "Gasolina");
        CarroEletrico carroEletrico = new CarroEletrico("BYD", "Seal", 2022, "Eletrico", 155);
    
        System.out.println("Informacoes do Veiculo");
        veiculo.exibirInfo();
        System.out.println();
        
        System.out.println("Informacoes do Carro:");
        carro.exibirInfo();
        System.out.println();
        
        System.out.println();
        carroEletrico.exibirInfo();
        
    }
    
}
    

