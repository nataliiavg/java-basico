package aula.sistema_de_fluxo;

public class SistemaDeMedida {
    public static void main(String[] args) {
        String sigla = "M";

        if (sigla == "P")
            System.out.println("PEQUENO");
        else if (sigla == "M")
            System.out.println("MEDIO");
        else if (sigla == "G")
            System.out.println("GRANDE");
        else
            System.out.println("INDEFINIDO");

    }
}