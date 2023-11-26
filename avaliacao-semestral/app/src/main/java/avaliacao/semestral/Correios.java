package avaliacao.semestral;

import java.util.List;

public class Correios extends AgenteLogistico {

    public Correios(String endereco, List<ProdutoQuantidade> pacote) {
        super(endereco, pacote);
    }

    @Override
    public void entregar() {
        super.entregar();
        System.out.println("Correios");
    }

    @Override
    public void cancelar() {
        super.cancelar();
        System.out.println("Correios");
    }
    
}
