package avaliacao.semestral;

public class AgenteLogisticoFactory {
    public iAgenteLogistico getAgenteLogistico(String agente, String endereco, Ecommerce ecommerce) throws Exception{
        if (agente.equalsIgnoreCase("Correios")) {
            return new Correios(endereco,ecommerce.getCarrinho().getProdutos() );
        } else if (agente.equalsIgnoreCase("Loggi")) {
            return new Loggi(endereco,ecommerce.getCarrinho().getProdutos());
        } else if (agente.equalsIgnoreCase("TotalExpress")) {
            return new TotalExpress(endereco,ecommerce.getCarrinho().getProdutos());
        } else {
            throw new Exception("Provider desconhecido: " + agente);
        }
    }
}
