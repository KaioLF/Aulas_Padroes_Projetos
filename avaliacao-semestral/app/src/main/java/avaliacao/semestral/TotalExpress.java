package avaliacao.semestral;

import java.util.List;

public class TotalExpress extends AgenteLogistico {

    public TotalExpress(String endereco, List<ProdutoQuantidade> pacote) {
        super(endereco, pacote);
    }

    @Override
    public void entregar() {
        System.out.println("TotalExpress!");
    }

    @Override
    public void cancelar() {
        System.out.println("TotalExpress");
    }
    
}
