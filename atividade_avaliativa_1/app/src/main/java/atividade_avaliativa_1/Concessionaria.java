package atividade_avaliativa_1;

import java.util.List;

public class Concessionaria {
    private I_Armazenamento armazenamento;

    public Concessionaria(I_Armazenamento armazenamento) {
        this.armazenamento = armazenamento;
    }

    public void adicionarVeiculoAoEstoque(Veiculo veiculo) {
        armazenamento.adicionarVeiculo(veiculo);
    }

    public List<String> listarInformacoesVeiculosEmEstoque() {
        return armazenamento.listarInformacoesVeiculos();
    }

    public List<Carro> listarCarros() {
        return armazenamento.listarCarros();
    }

    public List<Motocicleta> listarMotocicletas() {
        return armazenamento.listarMotocicletas();
    }
}

