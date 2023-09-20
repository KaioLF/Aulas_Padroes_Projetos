package atividade_avaliativa_1;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ArquivoArmazenamento implements I_Armazenamento {
    private String arquivoNome;

    public ArquivoArmazenamento(String arquivoNome) {
        this.arquivoNome = arquivoNome;
    }

    @Override
    public void adicionarVeiculo(Veiculo veiculo) {
        try (FileWriter writer = new FileWriter(arquivoNome, true);
                BufferedWriter bufferedWriter = new BufferedWriter(writer)) {

            String veiculoString = veiculo.toString(); // Converte o veículo para uma representação de texto
            bufferedWriter.write(veiculoString);
            bufferedWriter.newLine(); // Adiciona uma nova linha após cada veículo
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<String> listarInformacoesVeiculos() {
        List<String> informacoes = new ArrayList<>();
        try (FileReader reader = new FileReader(arquivoNome);
                BufferedReader bufferedReader = new BufferedReader(reader)) {

            String linha;
            while ((linha = bufferedReader.readLine()) != null) {
                informacoes.add(linha);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return informacoes;
    }

    @Override
    public List<Carro> listarCarros() {
        List<Carro> carros = new ArrayList<>();
        try (FileReader reader = new FileReader(arquivoNome);
                BufferedReader bufferedReader = new BufferedReader(reader)) {

            String linha;
            while ((linha = bufferedReader.readLine()) != null) {
                // Verifica se a linha contém a string "Número de Portas: "
                if (linha.contains("Número de Portas: ")) {
                    // Extrai informações do carro da linha
                    String[] partes = linha.split(",");
                    String marca = partes[0].trim().replace("Marca: ", "");
                    String modelo = partes[1].trim().replace("Modelo: ", "");
                    String anoFabricacao = partes[2].trim().replace("Ano de Fabricação: ", "");
                    double preco = Double.parseDouble(partes[3].trim().replace("Preço: ", ""));
                    int numPortas = Integer.parseInt(partes[4].trim().replace("Número de Portas: ", ""));

                    // Cria um novo objeto Carro e adiciona à lista
                    Carro carro = new Carro(marca, modelo, anoFabricacao, preco, numPortas);
                    carros.add(carro);
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        return carros;
    }

    @Override
    public List<Motocicleta> listarMotocicletas() {
        List<Motocicleta> motocicletas = new ArrayList<>();
        try (FileReader reader = new FileReader(arquivoNome);
                BufferedReader bufferedReader = new BufferedReader(reader)) {

            String linha;
            while ((linha = bufferedReader.readLine()) != null) {
                // Verifica se a linha contém a string "Cilindradas: "
                if (linha.contains("Cilindradas: ")) {
                    // Extrai informações da motocicleta da linha
                    String[] partes = linha.split(",");
                    String marca = partes[0].trim().replace("Marca: ", "");
                    String modelo = partes[1].trim().replace("Modelo: ", "");
                    String anoFabricacao = partes[2].trim().replace("Ano de Fabricação: ", "");
                    double preco = Double.parseDouble(partes[3].trim().replace("Preço: ", ""));
                    int cilindradas = Integer.parseInt(partes[4].trim().replace("Cilindradas: ", ""));

                    // Cria um novo objeto Motocicleta e adiciona à lista
                    Motocicleta motocicleta = new Motocicleta(marca, modelo, anoFabricacao, preco, cilindradas);
                    motocicletas.add(motocicleta);
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        return motocicletas;
    }

}
