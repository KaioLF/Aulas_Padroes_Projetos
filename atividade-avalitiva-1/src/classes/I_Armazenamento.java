package classes;

import java.util.List;

public interface I_Armazenamento {
    void adicionarVeiculo(Veiculo veiculo);
    void removerVeiculo(Veiculo veiculo);
    List<Veiculo> listarVeiculos();
    List<String> listarInformacoesVeiculos();
}
