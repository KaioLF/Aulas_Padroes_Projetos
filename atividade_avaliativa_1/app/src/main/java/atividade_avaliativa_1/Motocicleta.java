package atividade_avaliativa_1;

public class Motocicleta extends Veiculo {

    public int cilindradas;

    public Motocicleta(String marca, String modelo, String anoFabricacao, Double preco, int cilindradas) {
        super(marca, modelo, anoFabricacao, preco);
        this.cilindradas = cilindradas;
    }

    public int getCilindradas() {
        return cilindradas;
    }

    public void setCilindradas(int cilindradas) {
        this.cilindradas = cilindradas;
    }

    @Override
    public String toString() {
        return super.toString() + ", Cilindradas: " + cilindradas;
    }

}
