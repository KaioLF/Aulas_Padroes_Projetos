/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package atividade_avaliativa_1;

import java.util.List;

public class App {
    public static void main(String[] args) {
        // Crie instâncias de veículos
        Veiculo veiculo1 = new Carro("Toyota", "Corolla", "2022", 35000.0, 4);
        Veiculo veiculo2 = new Motocicleta("Honda", "CBR500R", "2022", 9000.0, 500);

        // Crie uma instância de MongoArmazenamento (certifique-se de configurar a conexão corretamente)
        I_Armazenamento armazenamento = new MongoArmazenamento("veiculosDB", "veiculosCollection");

        // Crie uma instância de Concessionaria com o Armazenamento
        Concessionaria concessionaria = new Concessionaria(armazenamento);

        // Adicione os veículos ao estoque da concessionária
        concessionaria.adicionarVeiculoAoEstoque(veiculo1);
        concessionaria.adicionarVeiculoAoEstoque(veiculo2);

        // Liste informações sobre os veículos em estoque
        List<String> informacoesVeiculos = concessionaria.listarInformacoesVeiculosEmEstoque();
        System.out.println("Informações sobre os veículos em estoque:");
        for (String informacao : informacoesVeiculos) {
            System.out.println(informacao);
        }

        // Liste carros em estoque
        List<Carro> carros = concessionaria.listarCarros();
        System.out.println("\nCarros em estoque:");
        for (Carro carro : carros) {
            System.out.println(carro);
        }

        // Liste motocicletas em estoque
        List<Motocicleta> motocicletas = concessionaria.listarMotocicletas();
        System.out.println("\nMotocicletas em estoque:");
        for (Motocicleta motocicleta : motocicletas) {
            System.out.println(motocicleta);
        }
    }
}
