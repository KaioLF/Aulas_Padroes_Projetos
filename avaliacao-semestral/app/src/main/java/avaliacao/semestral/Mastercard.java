package avaliacao.semestral;

public class Mastercard implements iPaymentProvider{

    @Override
    public void pagar() {
        System.out.println("Pagando via Mastercard");
    }
    
}
