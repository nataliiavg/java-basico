package aula.sistema_de_fluxo.estruturas_execepcionais;

/**
 * Exceções customizadas
 * 
 * Nós podemos criar nossas próprias exceções baseadas em regras de negócio e,
 * assim, melhor direcionar quem for utilizar os recursos desenvolvidos no
 * projeto, exemplo:
 * 
 * Imagine que como regra de negócio, para formatar um cep necessita sempre de
 * ter 8 dígitos, caso contrário lançará uma exceção que denominamos de
 * CepInvalidoException.
 */
public class CepInvalidoException extends Exception {

}
