package avaliacao.semestral;

import java.util.List;
import java.util.ArrayList;

public abstract class AgenteLogistico implements iAgenteLogistico {

    private String endereco;
    private List <ProdutoQuantidade> pacote = new ArrayList<>();

    public AgenteLogistico(String endereco, List<ProdutoQuantidade> pacote) {
        this.endereco = endereco;
        this.pacote = pacote;
    }

    @Override
    public void entregar() {
        System.out.print("Entrega realizada via ");
    }

    @Override
    public void cancelar() {
        System.out.print("Entrega cancelada via ");
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public List<ProdutoQuantidade> getPacote() {
        return pacote;
    }

    public void setPacote(List<ProdutoQuantidade> pacote) {
        this.pacote = pacote;
    }
}
