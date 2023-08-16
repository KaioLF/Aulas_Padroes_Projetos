package heranca;

public class Pix  implements I_Objeto_Financeiro{
    public String copia_e_cola;

    @Override
    public boolean pagar() {
        // Logica de processamento do pgmto em PIX
        System.out.println("Pagamento do momento");
        return true;
    }
}
