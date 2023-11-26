package avaliacao.semestral;

public class Ecommerce {
    private iPaymentProvider paymentProvider;
    private Carrinho carrinho;


    public Ecommerce(iPaymentProvider paymentProvider, Carrinho carrinho) {
        this.paymentProvider = paymentProvider;
        this.carrinho = carrinho;
    }

    public iPaymentProvider getPaymentProvider() {
        return paymentProvider;
    }

    public void setPaymentProvider(iPaymentProvider paymentProvider) {
        this.paymentProvider = paymentProvider;
    }

    public Carrinho getCarrinho() {
        return carrinho;
    }

    public void setCarrinho(Carrinho carrinho) {
        this.carrinho = carrinho;
    }
}
