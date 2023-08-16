package heranca;

public class Cartao_Senf extends Cartao {

    public String categoria;

    @Override
    public boolean ValidarDtVencimento(){
        if(this.dt_Vencimento.equalsIgnoreCase("2020")){
            return false;
        }
        return true;
    }

    public boolean ValidarDtVencimento(String data){
        if(data.equalsIgnoreCase("2020")){
            return false;
        }
        return true;
    }

    @Override
    public boolean pagar() {
        System.out.println("Pagando com Cartão Senf");
        return false;
    }


}
