package aula.sistema_de_fluxo.estruturas_execepcionais;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

/**
 * Aparentemente é um programa simples, mas vamos listar algumas possíveis
 * exceções que podem acontencer:
 *
 * Não informar o nome e sobrenome;
 * O valor da idade ter um caractere NÃO numérico;
 * O valor da altura ter uma vírgula ao invês de ser um ponto (conforme padrão
 * americano).
 *
 * A linguagem Java dispõe de uma vasta lista de classes que representam
 * exceções, abaixo iremos apresentar as mais comuns:
 * 
 * java.lang.NullPointerException -> Quando tentamos obter alguma informação de uma
 * variável nula;
 * java.lang.ArithmeticException ->  Quando tentamos dividir um valor por zero;
 * java.sql.SQLException -> Quando existe algum erro relacionado a interação com
 * banco de dados;
 * java.io.FileNotFoundException -> Quando tentamos ler ou escrever em um arquivo
 * que não existe.
 * 
 */

public class AboutMe {
    public static void main(String[] args) {
        
        try {
        // criando o objeto scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite seu nome");
        String nome = scanner.next();

        System.out.println("Digite seu sobrenome");
        String sobrenome = scanner.next();

        System.out.println("Digite sua idade");
        int idade = scanner.nextInt();

        System.out.println("Digite sua altura");
        double altura = scanner.nextDouble();

        System.out.println("Olá, meu nome é " + nome.toUpperCase() + " " + sobrenome.toUpperCase());
        System.out.println("Tenho " + idade + " anos ");
        System.out.println("Minha altura é de " + altura + "m ");
        scanner.close();
        } 
        catch(InputMismatchException e){
            System.err.println("Os campos idade e altura precisam ser numericos! ");
        }
    }
}
