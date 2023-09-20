package atividade_avaliativa_1;

import java.util.List;

public interface I_Armazenamento {
    void adicionarVeiculo(Veiculo veiculo);
    List<String> listarInformacoesVeiculos();
    List<Carro> listarCarros();
    List<Motocicleta> listarMotocicletas();
}
