package heranca;

public class Cartao_Master extends Cartao {

    @Override
    public boolean pagar() {
        System.out.println("Pagando com cartão master");
        return true;
    }
    
}
