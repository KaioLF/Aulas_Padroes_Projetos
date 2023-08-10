package heranca;

public class Teste_Heranca {

    public static void main(String[] args) {
        Cartao_Master cm = new Cartao_Master();//construindo objeto
        System.out.println(cm.dt_Vencimento);
        System.out.println(cm.nome);
        System.out.println(cm.numero);
        System.out.println(cm.ValidarNome());

        Cartao_Senf cs = new Cartao_Senf();
        cs.dt_Vencimento = "2020";
        System.out.println(cs.ValidarDtVencimento());

        Cartao_Senf cs2 = new Cartao_Senf();

        Cartao c = new Cartao();
        Serv_Financeiro sf = new Serv_Financeiro();
        sf.ProcessarPagto(cs);
    }
    
}
