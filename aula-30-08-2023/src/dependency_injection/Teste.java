package dependency_injection;

public class Teste {
    public static void main(String[] args) {

        ConcretaA cA = new ConcretaA();
        ConcretaB cB = new ConcretaB();
        cB.t = "Curitiba";

        Consumidora c = new Consumidora(cB);
        System.out.println(c.getConteudo());



    }
}
