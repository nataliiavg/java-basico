package aula.sistema_de_fluxo;

public class ExemploForEach {
    public static void main(String[] args) {
        String alunos[] = { "FELIPE", "JONAS", "JULIA", "MARCOS" };

        // Forma abreviada
        for (String aluno : alunos) {
            System.out.println("Nome do aluno é " + aluno);
        }

    }
}
