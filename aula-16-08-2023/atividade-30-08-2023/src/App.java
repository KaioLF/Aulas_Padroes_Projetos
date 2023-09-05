import atividade.Circulo;
import atividade.Figura;
import atividade.Quadrado;
import atividade.Triangulo;

public class App {
    public static void main(String[] args) throws Exception {
        // Exemplo de uso
        Triangulo triangulo = new Triangulo(3, 4, 5);
        Circulo circulo = new Circulo(2);
        Figura figura1 = new Figura(triangulo);
        Figura figura2 = new Figura(circulo);
        
        Quadrado quadrado = new Quadrado(4);
        Figura figura3 = new Figura(quadrado);

        System.out.println("Área do Triângulo: " + figura1.calcularArea());
        System.out.println("Perímetro do Triângulo: " + figura1.calcularPerimetro());
        System.out.println("Área do Círculo: " + figura2.calcularArea());
        System.out.println("Perímetro do Círculo: " + figura2.calcularPerimetro());
        System.out.println("Área do Quadrado: " + figura3.calcularArea());
        System.out.println("Perímetro do Quadrado: " + figura3.calcularPerimetro());
    }
}
