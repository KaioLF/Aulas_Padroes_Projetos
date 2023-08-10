package heranca;

public abstract class Cartao {
    public String nome;
    public String numero;
    public String dt_Vencimento;
    
    public boolean ValidarNome(){
        return true;
    }

    public boolean ValidarNumero(){
        return true;
    }

    public boolean ValidarDtVencimento(){
        return true;
    }
}
