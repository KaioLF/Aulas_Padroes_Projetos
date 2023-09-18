package atividade_avaliativa_1;

public class Carro extends Veiculo {

    public int numPortas;  

    public Carro(String marca, String modelo, String anoFabricacao, Double preco, int numPortas) {
        super(marca, modelo, anoFabricacao, preco);
        this.numPortas = numPortas;
    }

    public int getNumPortas() {
        return numPortas;
    }

    public void setNumPortas(int numPortas) {
        this.numPortas = numPortas;
    }

    @Override
    public String toString() {
        return super.toString() + ", Número de Portas: " + numPortas;
    }
}
