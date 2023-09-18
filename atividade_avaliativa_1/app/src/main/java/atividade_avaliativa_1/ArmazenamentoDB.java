package atividade_avaliativa_1;

import java.util.ArrayList;
import java.util.List;

public class ArmazenamentoDB implements I_Armazenamento {

    private List<Veiculo> veiculosBanco;

    public ArmazenamentoDB() {
        veiculosBanco = new ArrayList<>();
    }

    @Override
    public void adicionarVeiculo(Veiculo veiculo) {
        veiculosBanco.add(veiculo);
    }

    @Override
    public void removerVeiculo(Veiculo veiculo) {
        veiculosBanco.remove(veiculo);
    }

    @Override
    public List<Veiculo> listarVeiculos() {
        return veiculosBanco;
    }

    @Override
    public List<String> listarInformacoesVeiculos() {
        List<String> informacoes = new ArrayList<>();
        for (Veiculo veiculo : veiculosBanco) {
            informacoes.add(veiculo.toString());
        }
        return informacoes;
    }

    @Override
    public List<Carro> listarCarros() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'listarCarros'");
    }

    @Override
    public List<Motocicleta> listarMotocicletas() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'listarMotocicletas'");
    }
    
}
