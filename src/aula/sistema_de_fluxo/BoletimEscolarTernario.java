package aula.sistema_de_fluxo;

public class BoletimEscolarTernario {
    public static void main(String[] args) {
        double nota = 7.5;
        String resultado = nota >= 7 ? "Aprovado" : "Reprovado";
        System.out.println(resultado);
    }
}
