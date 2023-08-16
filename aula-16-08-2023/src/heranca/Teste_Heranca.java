package heranca;

public class Teste_Heranca {

    public static void main(String[] args) {
        Cartao_Master cm = new Cartao_Master();//construindo objeto
        cm.nome = "Pedro de Lara";
        System.out.println(cm.dt_Vencimento);
        System.out.println(cm.nome);
        System.out.println(cm.numero);
        System.out.println(cm.ValidarNome());

        Cartao_Senf cs = new Cartao_Senf();
        cs.dt_Vencimento = "2020";
        System.out.println(cs.ValidarDtVencimento());

        Cartao_Senf cs2 = new Cartao_Senf();
        cs2.nome = "Araci de Almeida";
        cs2.categoria = "Premium";
        //Cartao c = new Cartao();

        Pix pix  = new Pix();
        Serv_Financeiro sf = new Serv_Financeiro();
        sf.ProcessarPagto(pix);
    } 
}
