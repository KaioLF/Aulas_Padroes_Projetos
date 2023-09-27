package aula;

public class FabricaRetangulo implements iFabrica {

    @Override
    public iForma criarForma() {
        return new Retangulo();
    }
    
    
}
