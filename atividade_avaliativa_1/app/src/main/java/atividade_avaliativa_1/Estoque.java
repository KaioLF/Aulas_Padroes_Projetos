package atividade_avaliativa_1;

import java.util.ArrayList;
import java.util.List;

public class Estoque implements I_Armazenamento {
    private List<Veiculo> veiculos;

    public Estoque() {
        veiculos = new ArrayList<>();
    }

    public void adicionarVeiculo(Veiculo veiculo) {
        veiculos.add(veiculo);
    }

    public void removerVeiculo(Veiculo veiculo) {
        veiculos.remove(veiculo);
    }

    public List<String> listarInformacoesVeiculos() {
        List<String> informacoes = new ArrayList<>();
        for (Veiculo veiculo : veiculos) {
            informacoes.add(veiculo.toString()); // Você pode personalizar o método toString() na classe Veiculo.
        }
        return informacoes;
    }

    @Override
    public List<Carro> listarCarros() {
        List<Carro> carros = new ArrayList<>();
        for (Veiculo veiculo : veiculos) {
            if (veiculo instanceof Carro) {
                carros.add((Carro) veiculo);
            }
        }
        return carros;
    }

    @Override
    public List<Motocicleta> listarMotocicletas() {
        List<Motocicleta> motocicletas = new ArrayList<>();
        for (Veiculo veiculo : veiculos) {
            if (veiculo instanceof Motocicleta) {
                motocicletas.add((Motocicleta) veiculo);
            }
        }
        return motocicletas;
    }
}

