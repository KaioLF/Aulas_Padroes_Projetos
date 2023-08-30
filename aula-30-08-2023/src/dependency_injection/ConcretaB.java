package dependency_injection;

public class ConcretaB extends SuperClasse {
    public String t;

    @Override
    public String gerar_conteudo(){
        return "<H2> " + this.t + "</H2>";
    }
    
}
