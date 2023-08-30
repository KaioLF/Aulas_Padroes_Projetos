package universidade;

public class App {
    public static void main(String[] args) {
        Certificador certificador = new Certificador();
        
        Estudante_Grad estudanteGraduacao = new Estudante_Grad("João", 3.5);
        Estudante_Esp estudanteEspecializacao = new Estudante_Esp("Maria", 0, "D");
        
        System.out.println(certificador.certificarEstudante(estudanteGraduacao));
        System.out.println(certificador.certificarEstudante(estudanteEspecializacao));
    }
}






