package avaliacao.semestral;

public class ProdutoFactory {
    public ProdutoQuantidade getProduto(String produtoNome, double produtoPreco, int produtoQuantidade){
        Produto produto = new Produto(produtoNome, produtoPreco);
        return new ProdutoQuantidade(produto, produtoQuantidade);
    }
}
