package universidade;

public class Estudante implements Certificavel{
    public String nome;
    public double nota;

    public Estudante(String nome, double nota){
    this.nome = nome;
    this.nota = nota;
    }

    public String getNome() {
        return nome;
    }
    
    public double getMedia() {
        return nota;
    }

    @Override
    public String certificar(){
        return "Resultado inválido";
    }
}


