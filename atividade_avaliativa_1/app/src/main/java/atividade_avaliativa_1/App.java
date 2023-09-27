package atividade_avaliativa_1;

import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.MongoCollection;
import org.bson.Document;

import java.util.List;

public class App {
    public static void main(String[] args) {
        // Crie instâncias de veículos
        Veiculo veiculo1 = new Carro("Chevrolet", "Celta", "2014", 34000.00, 4);
        Veiculo veiculo2 = new Motocicleta("Honda", "PCX", "2023", 16800.00, 160);

        // Configuração da conexão com o MongoDB
        MongoClient mongoClient = MongoClients.create("mongodb://localhost:27017");
        MongoDatabase database = mongoClient.getDatabase("veiculosDB");
        MongoCollection<Document> veiculosCollection = database.getCollection("veiculosCollection");

        // Cria uma instância de MongoArmazenamento com a coleção configurada
        I_Armazenamento mongoArmazenamento = new MongoArmazenamento(veiculosCollection);
        // Cria uma instância de Concessionaria com o MongoArmazenamento
        Concessionaria concessionariaComMongo = new Concessionaria(mongoArmazenamento);


        // Cria uma instância de ArquivoArmazenamento com a coleção configurada
        I_Armazenamento arquivoArmazenamento = new ArquivoArmazenamento("veiculos.txt");
        // Cria uma instância de Concessionaria com o ArquivoArmazenamento
        Concessionaria concessionariaComArquivo = new Concessionaria(arquivoArmazenamento);

        // Adicione os veículos ao estoque da concessionária com o Mongo
        //concessionariaComMongo.adicionarVeiculoAoEstoque(veiculo1);
        //concessionariaComMongo.adicionarVeiculoAoEstoque(veiculo2);


        // Adicione os veículos ao estoque da concessionária com o um arquivo txt
        concessionariaComArquivo.adicionarVeiculoAoEstoque(veiculo1);
        concessionariaComArquivo.adicionarVeiculoAoEstoque(veiculo2);
        

        // Liste informações sobre todos os veículos em estoque
        List<String> informacoesVeiculos = concessionariaComArquivo.listarInformacoesVeiculosEmEstoque();//alterar para concessionariaComArquivo para utilizar o arquivo txt
        System.out.println("------------------------------------------------------------");
        System.out.println("------------------------------------------------------------");
        System.out.println("Informações sobre os veículos em estoque:");
        for (String informacao : informacoesVeiculos) {
            System.out.println(informacao);
        }

        // Liste carros em estoque
        List<Carro> carros = concessionariaComArquivo.listarCarros();//alterar para concessionariaComArquivo para utilizar o arquivo txt
        System.out.println("------------------------------------------------------------");
        System.out.println("------------------------------------------------------------");
        System.out.println("\nCarros em estoque:");
        for (Carro carro : carros) {
            System.out.println(
                    "Marca: " + carro.getMarca() +
                            ", Modelo: " + carro.getModelo() +
                            ", Ano de Fabricação: " + carro.getAnoFabricacao() +
                            ", Preço: " + carro.getPreco() +
                            ", Número de Portas: " + carro.getNumPortas());
        }

        // Liste motocicletas em estoque
        List<Motocicleta> motocicletas = concessionariaComArquivo.listarMotocicletas();//alterar para concessionariaComArquivo para utilizar o arquivo txt
        System.out.println("------------------------------------------------------------");
        System.out.println("------------------------------------------------------------");
        System.out.println("\nMotocicletas em estoque:");
        for (Motocicleta motocicleta : motocicletas) {
            System.out.println(
                    "Marca: " + motocicleta.getMarca() +
                            ", Modelo: " + motocicleta.getModelo() +
                            ", Ano de Fabricação: " + motocicleta.getAnoFabricacao() +
                            ", Preço: " + motocicleta.getPreco() +
                            ", Cilindradas: " + motocicleta.getCilindradas());
        }
    }
}
