package aula.sistema_de_fluxo;

public class PlanoOperadoraComSwtich {
    public static void main(String[] args) {
        String plano = "M"; 

        switch (plano) {
            case "T": {
                System.out.println("5Gb Youtube");
            }
            case "M": {
                System.out.println("Whats e Intagram grátis");
            }
            case "B": {
                System.out.println("100 minutos de ligação");
            }
        }
    }
}
