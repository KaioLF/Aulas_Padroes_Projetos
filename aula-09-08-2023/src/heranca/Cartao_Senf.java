package heranca;

public class Cartao_Senf extends Cartao {

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


}
