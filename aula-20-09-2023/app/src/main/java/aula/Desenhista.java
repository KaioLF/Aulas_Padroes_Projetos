package aula;

public class Desenhista {
    public String desenhar(String figura) {
        String resultado = "";
        if (figura.equalsIgnoreCase("circulo")) {
            iFabrica fabricaCirculo = new FabricaCirculo();
            iForma formaCirculo = fabricaCirculo.criarForma();
            resultado = formaCirculo.desenhar();
        }
        if (figura.equalsIgnoreCase("retangulo")) {
            iFabrica fabricaRetangulo = new FabricaRetangulo();
            iForma formaRetangulo = fabricaRetangulo.criarForma();
            resultado = formaRetangulo.desenhar();
        }
        return resultado;
    }

    public iForma desenho(String figura) {
        iForma forma = null;
        if (figura.equalsIgnoreCase("circulo")) {
            iFabrica fabricaCirculo = new FabricaCirculo();
            forma = fabricaCirculo.criarForma();
        }
        if (figura.equalsIgnoreCase("retangulo")) {
            iFabrica fabricaRetangulo = new FabricaRetangulo();
            forma = fabricaRetangulo.criarForma();
        }
        return forma;
    }
}
