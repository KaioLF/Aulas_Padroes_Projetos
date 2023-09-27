package aula;

public class Consumidor {
    
    public static void main(String[] args) {
        Desenhista desenhista = new Desenhista();
        System.out.println(desenhista.desenhar("retangulo"));


        iForma desenho = desenhista.desenho("circulo");
        System.out.println(desenho.desenhar());
    }
}
