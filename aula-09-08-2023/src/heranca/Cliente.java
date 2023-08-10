package heranca;

public class Cliente {

    Cliente(){};

    Cliente(String cpf, String nome){
        if(nome.equalsIgnoreCase("Kaio")){
            this.nome = "não pode, parceiro";
        }
    }

    Cliente(String cpf) {
        if (cpf.equals("888")) {
            this.nome = "Pedro de Lara";
            this.CPF = cpf;
        }
    }

    private String nome;
    private String CPF;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String cPF) {
        CPF = cPF;
    }
}
