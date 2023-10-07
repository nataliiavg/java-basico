package aula.sistema_de_fluxo;

public class BoletimEscolarTernárioDois {
    public static void main(String[] args) {
        double nota = 5;
        String resultado = nota >= 7 ? "Aprovado" : nota >= 5 && nota < 7 ? "Recuperação" : "Reprovado";
        System.out.println(resultado);
    }
}
