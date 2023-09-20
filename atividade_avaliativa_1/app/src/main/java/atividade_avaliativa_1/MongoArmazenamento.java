package atividade_avaliativa_1;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.FindIterable;
import org.bson.Document;
import java.util.ArrayList;
import java.util.List;

public class MongoArmazenamento implements I_Armazenamento {
    private MongoCollection<Document> veiculosCollection; // Declara a coleção como um campo de classe

    public MongoArmazenamento(MongoCollection<Document> veiculosCollection) {
        this.veiculosCollection = veiculosCollection;
    }

    @Override
    public void adicionarVeiculo(Veiculo veiculo) {
        Document documentoVeiculo = new Document("marca", veiculo.getMarca())
                .append("modelo", veiculo.getModelo())
                .append("anoFabricacao", veiculo.getAnoFabricacao())
                .append("preco", veiculo.getPreco());

        // Verifica o tipo do veículo (Carro ou Motocicleta) e adiciona atributos
        // específicos
        if (veiculo instanceof Carro) {
            Carro carro = (Carro) veiculo;
            documentoVeiculo.append("numPortas", carro.getNumPortas());
        } else if (veiculo instanceof Motocicleta) {
            Motocicleta motocicleta = (Motocicleta) veiculo;
            documentoVeiculo.append("cilindradas", motocicleta.getCilindradas());
        }

        veiculosCollection.insertOne(documentoVeiculo); // Usa veiculosCollection para inserir documentos
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

            if (documento.containsKey("numPortas")) {
                // Este é um carro, inclua informações específicas de carro
                informacao += String.format(", Número de Portas: %d", documento.getInteger("numPortas"));
            } else if (documento.containsKey("cilindradas")) {
                // Esta é uma motocicleta, inclua informações específicas de motocicleta
                informacao += String.format(", Cilindradas: %d", documento.getInteger("cilindradas"));
            }

            informacoes.add(informacao);
        }
        return informacoes;
    }

    @Override
    public List<Carro> listarCarros() {// Lista os carros
        List<Carro> carros = new ArrayList<>(); // Cria uma lista para armazenar os carros

        // Consulta no banco de dados MongoDB para encontrar documentos que tenham o
        // campo "numPortas" definido
        FindIterable<Document> carrosDocument = veiculosCollection
                .find(new Document("numPortas", new Document("$exists", true)));

        // Cria um iterador para percorrer os resultados da consulta
        MongoCursor<Document> cursor = carrosDocument.iterator();

        // Itera pelos documentos encontrados na consulta
        while (cursor.hasNext()) {
            Document documento = cursor.next();
            // Cria um objeto Carro com os dados do documento
            Carro carro = new Carro(
                    documento.getString("marca"),
                    documento.getString("modelo"),
                    documento.getString("anoFabricacao"),
                    documento.getDouble("preco"),
                    documento.getInteger("numPortas"));
            // Adiciona o carro à lista de carros
            carros.add(carro);
        }

        // Retorna a lista de carros encontrados na consulta
        return carros;
    }

    @Override
    public List<Motocicleta> listarMotocicletas() {// Lista as motos
        List<Motocicleta> motocicletas = new ArrayList<>();

        FindIterable<Document> motocicletasDocument = veiculosCollection
                .find(new Document("cilindradas", new Document("$exists", true)));
        MongoCursor<Document> cursor = motocicletasDocument.iterator();
        while (cursor.hasNext()) {
            Document documento = cursor.next();
            Motocicleta motocicleta = new Motocicleta(
                    documento.getString("marca"),
                    documento.getString("modelo"),
                    documento.getString("anoFabricacao"),
                    documento.getDouble("preco"),
                    documento.getInteger("cilindradas"));
            motocicletas.add(motocicleta);
        }

        return motocicletas;
    }
}
