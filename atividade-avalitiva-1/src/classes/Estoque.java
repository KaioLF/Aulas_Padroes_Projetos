package classes;

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

    public List<Veiculo> listarVeiculos() {
        return veiculos;
    }

    public List<String> listarInformacoesVeiculos() {
        List<String> informacoes = new ArrayList<>();
        for (Veiculo veiculo : veiculos) {
            informacoes.add(veiculo.toString()); // Você pode personalizar o método toString() na classe Veiculo.
        }
        return informacoes;
    }
}
