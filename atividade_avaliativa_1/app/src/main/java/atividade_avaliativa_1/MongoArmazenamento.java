package atividade_avaliativa_1;

import com.mongodb.BasicDBObject;
import com.mongodb.MongoClientSettings;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import org.bson.Document;
import com.mongodb.ServerAddress;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MongoArmazenamento implements I_Armazenamento {
    private MongoCollection<Document> veiculosCollection; // Declara a coleção como um campo de classe

    public MongoArmazenamento(String dbName, String collectionName) {
        MongoClient mongoClient = MongoClients.create(
            MongoClientSettings.builder()
                .applyToClusterSettings(builder -> builder.hosts(Arrays.asList(new ServerAddress("localhost", 27017))))
                .build());

        MongoDatabase database = mongoClient.getDatabase("veiculosDB"); // Use o nome do banco de dados passado como argumento
        veiculosCollection = database.getCollection("veiculosCollection"); // Use o nome da coleção passado como argumento
    }

    @Override
    public void adicionarVeiculo(Veiculo veiculo) {
        Document documentoVeiculo = new Document("marca", veiculo.getMarca())
            .append("modelo", veiculo.getModelo())
            .append("anoFabricacao", veiculo.getAnoFabricacao())
            .append("preco", veiculo.getPreco());

        veiculosCollection.insertOne(documentoVeiculo); // Use veiculosCollection para inserir documentos
    }

    @Override
    public void removerVeiculo(Veiculo veiculo) {
        Document filtro = new Document("marca", veiculo.getMarca())
            .append("modelo", veiculo.getModelo());

        veiculosCollection.deleteOne(filtro); // Use veiculosCollection para excluir documentos
    }

    @Override
    public List<String> listarInformacoesVeiculos() {
        List<String> informacoes = new ArrayList<>();
        for (Document documento : veiculosCollection.find()) {
            String informacao = String.format("Marca: %s, Modelo: %s, Ano de Fabricação: %s, Preço: %.2f",
                documento.getString("marca"),
                documento.getString("modelo"),
                documento.getString("anoFabricacao"),
                documento.getDouble("preco"));
            informacoes.add(informacao);
        }
        return informacoes;
    }

    @Override
    public List<Veiculo> listarVeiculos() {
        // Você pode implementar este método se necessário
        return null;
    }

    @Override
    public List<Carro> listarCarros() {
        List<Carro> carros = new ArrayList<>();
        BasicDBObject query = new BasicDBObject("tipo", "carro"); // Filtro para carros

        FindIterable<Document> carrosDocument = veiculosCollection.find(query);
        MongoCursor<Document> cursor = carrosDocument.iterator();

        while (cursor.hasNext()) {
            Document documento = cursor.next();
            Carro carro = new Carro(
                documento.getString("marca"),
                documento.getString("modelo"),
                documento.getString("anoFabricacao"),
                documento.getDouble("preco"),
                documento.getInteger("numPortas")
            );
            carros.add(carro);
        }

        return carros;
    }

    @Override
    public List<Motocicleta> listarMotocicletas() {
        List<Motocicleta> motocicletas = new ArrayList<>();
        BasicDBObject query = new BasicDBObject("tipo", "motocicleta"); // Filtro para motocicletas

        FindIterable<Document> motocicletasDocument = veiculosCollection.find(query);
        MongoCursor<Document> cursor = motocicletasDocument.iterator();

        while (cursor.hasNext()) {
            Document documento = cursor.next();
            Motocicleta motocicleta = new Motocicleta(
                documento.getString("marca"),
                documento.getString("modelo"),
                documento.getString("anoFabricacao"),
                documento.getDouble("preco"),
                documento.getInteger("cilindradas")
            );
            motocicletas.add(motocicleta);
        }

        return motocicletas;
    }
}
