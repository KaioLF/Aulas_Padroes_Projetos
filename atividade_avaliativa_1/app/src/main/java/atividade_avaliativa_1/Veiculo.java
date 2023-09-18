package atividade_avaliativa_1;

public abstract class Veiculo {
    public String marca;
    public String modelo;
    public String anoFabricacao;
    public Double preco;

    public Veiculo(String marca, String modelo, String anoFabricacao, Double preco) {
        this.marca = marca;
        this.modelo = modelo;
        this.anoFabricacao = anoFabricacao;
        this.preco = preco;
    }

    // Getters e Setters para cada atributo

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(String anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public String toString() {
        return "Marca: " + marca + ", Modelo: " + modelo + ", Ano de Fabricação: " + anoFabricacao + ", Preço: "
                + preco;
    }

}
