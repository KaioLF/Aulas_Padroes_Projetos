package avaliacao.semestral;

public class PaymentProviderFactory {

    public iPaymentProvider getPaymentProvider(String provider) throws Exception {
        if (provider.equalsIgnoreCase("Mastercard")) {
            return new Mastercard();
        } else if (provider.equalsIgnoreCase("Senf")) {
            return new Senf();
        } else if (provider.equalsIgnoreCase("Visa")) {
            return new Visa();
        } else {
            throw new Exception("Provider desconhecido: " + provider);
        }
    }
}
