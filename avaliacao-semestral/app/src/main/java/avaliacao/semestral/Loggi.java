package avaliacao.semestral;

import java.util.List;

public class Loggi extends AgenteLogistico{

    public Loggi(String endereco, List<ProdutoQuantidade> pacote) {
        super(endereco, pacote);
    }

    @Override
    public void entregar() {
        System.out.println("Loggi!");
    }

    @Override
    public void cancelar() {
        System.out.println("Loggi!");
    }
    
}
