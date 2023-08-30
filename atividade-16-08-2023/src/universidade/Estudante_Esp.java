package universidade;

public class Estudante_Esp extends Estudante {
    private String conceito;
    
    public Estudante_Esp(String nome, double media, String conceito) {
        super(nome, media);
        this.conceito = conceito;
    }

    @Override
    public String certificar(){
        if (conceito != null) {
            if (conceito.equals("A") || conceito.equals("B") || conceito.equals("C")) {
                return "APROVADO";
            } else if (conceito.equals("D")) {
                return "REPROVADO";
            }
        }
        return "PENDENTE";
    }
}
