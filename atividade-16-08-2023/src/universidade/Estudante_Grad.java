package universidade;

public class Estudante_Grad extends Estudante {

    public Estudante_Grad(String nome, double nota){
        super(nome, nota);
    }

    @Override
    public String certificar(){
        if (getMedia() >= 6) {
            return "APROVADO";
        } else if (getMedia() > 4) {
            return "EXAME FINAL";
        } else {
            return "REPROVADO";
        }
    }
    
}
