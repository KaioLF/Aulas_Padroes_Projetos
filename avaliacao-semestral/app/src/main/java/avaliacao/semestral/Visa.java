package avaliacao.semestral;

public class Visa implements iPaymentProvider{

    @Override
    public void pagar() {
        System.out.println("Pagando via Visa");
    }
    
}
