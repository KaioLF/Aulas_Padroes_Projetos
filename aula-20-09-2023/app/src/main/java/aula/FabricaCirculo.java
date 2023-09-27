package aula;

public class FabricaCirculo implements iFabrica {

    @Override
    public iForma criarForma() {

        return new Circulo();
    }

    
    
}
