package avaliacao.semestral;

import java.util.List;
import java.util.ArrayList;

public class Carrinho {
    private List <ProdutoQuantidade> produtos = new ArrayList<>();

    public Carrinho(){
        
    }

    public List<ProdutoQuantidade> getProdutos() {
        return produtos;
    }


    public void addProdutos(ProdutoQuantidade produto) {
        produtos.add(produto);
    }

    public double getTotal(){
        double total = 0;
        for (ProdutoQuantidade produtoQuantidade : produtos) {
            total += produtoQuantidade.getQuantidade() * produtoQuantidade.getProduto().getPreco();
        }
        return total;
    }
    
}
