package atividade;

public class Figura {
    private Object forma;

    public Figura(Object forma) {
        this.forma = forma;
    }

    public double calcularArea() {
        if (forma instanceof Triangulo) {
            return ((Triangulo) forma).calcularArea();
        } else if (forma instanceof Circulo) {
            return ((Circulo) forma).calcularArea();
        } else if(forma  instanceof Quadrado) {
            return((Quadrado) forma).calcularArea();
        }
        else{
            throw new IllegalArgumentException("Forma desconhecida");
        }
    }

    public double calcularPerimetro() {
        if (forma instanceof Triangulo) {
            return ((Triangulo) forma).calcularPerimetro();
        } else if (forma instanceof Circulo) {
            return ((Circulo) forma).calcularPerimetro();
        } else if(forma instanceof Quadrado){
            return((Quadrado) forma).calcularPerimetro();
        }

        else {
            throw new IllegalArgumentException("Forma desconhecida");
        }
    }
}
