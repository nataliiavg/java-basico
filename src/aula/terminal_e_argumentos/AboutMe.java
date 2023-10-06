package aula.terminal_e_argumentos;

public class AboutMe {
    public static void main(String[] args) {
        // os argumentos começam com indice 0
        String nome = args[0];
        String sobrenome = args[1];
        int idade = Integer.valueOf(args[2]); // Wrappers
        double altura = Double.valueOf(args[3]);

        System.out.println("Olá, meu nome é " + nome + " " + sobrenome);
        System.out.println("Tenho " + idade + " anos ");
        System.out.println("Minha altura é " + altura + "m ");
    }
}
