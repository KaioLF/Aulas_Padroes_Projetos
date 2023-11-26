package avaliacao.semestral;

public class Senf implements iPaymentProvider{

    @Override
    public void pagar() {
        System.out.println("Pagando via Senf");
    }
    
}
