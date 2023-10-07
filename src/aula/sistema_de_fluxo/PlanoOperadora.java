package aula.sistema_de_fluxo;

/**
 * Observe que a nível de sintaxe não tivemos nenhum ganho quanto a redução de
 * códigos e ainda tivemos mais uma preocupação em
 * informar a palavra break em cada alternativa.
 * Porém, um cenário que poderíamos adequar o uso do switch/case para melhorar
 * nosso
 * algorítimo seria conforme ilustração abaixo:
 * 
 * Imagine que fomos requisitados a criar um sistema de plano telefônico onde:
 *
 * O sistema terá 03 planos: BASIC, MIDIA , TURBO
 * BASIC: 100 minutos de ligação
 * MIDIA: 100 minutos de ligação + Whats e Intagram grátis
 * TURBO: 100 minutos de ligação + Whats e Intagram grátis + 5Gb Youtube
 *
 */
public class PlanoOperadora {
    public static void main(String[] args) {
        String plano = "M"; 

        if (plano == "B") {
            System.out.println("100 minutos de ligação");
        } else if (plano == "M") {
            System.out.println("100 minutos de ligação");
            System.out.println("Whats e Instagram grátis");
        } else if (plano == "T") {
            System.out.println("100 minutos de ligação");
            System.out.println("Whats e Inwtagram grátis");
            System.out.println("5Gb Youtube");
        }

    }

}
