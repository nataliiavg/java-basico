package aula.sistema_de_fluxo;

public class CaixaEletronico {
    public static void main(String[] args) {
        double saldo = 28.0;
        double valorSolicitado = 18.0;

        if (valorSolicitado < saldo)
            saldo = saldo - valorSolicitado;

        System.out.println(saldo);
    }
}
