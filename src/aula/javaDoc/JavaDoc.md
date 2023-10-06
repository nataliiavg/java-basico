# Documentação

Uma das maiores características da linguagem Java é que desde suas primeiras versões tínhamos em nossas mãos uma documentação rica e detalhada dos recursos da linguagem.

Conforme site oficial, podemos compreender e explorar todos os recursos organizados por pacotes e classes bem específicas sem nem mesmo escrever uma linha de código.

Hoje costuma-se afirmar que para se tornar um desenvolvedor nível avançado, é um requisito imprescindível adquirir a habilidade de compreender a documentação oficial da linguagem e dos frameworks que são incorporados nos projetos atuais.

Aqui temos o [link](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html) da documentação de uma das principais classes da linguagem Java.

## Tags

Java Documentation é composto por tags que representam dados relevantes para a compreensão da proposta de uma classe e os conjuntos de seus métodos e atributos conforme tabela abaixo:

| Tag      | Descrição                                              |
| -------- | ------------------------------------------------------ |
| @autor   | Autor / Criador                                        |
| @version | Versão do recurso disponibilizado                      |
| @since   | Versão / Data de início da disponibilização do recurso |
| @param   | Descrição dos parâmetros dos métodos criados           |
| @return  | Definição do tipo de retorno de um método              |
| @throws  | Se o método lança alguma exceção                       |


### Tipos de comentários

- One Line
```java
// Olá, eu sou um comentário em uma única linha
```

- Mult Line

```java
/* Olá,

* Eu sou um comentario
* que posso ser mais detalhadod
* quando necessário
 */

```
- Documentation

``` java
/**
* Estas duas estrelinhas acima
* são feitas para identificar que você
* pretende elaborar um comentário
* a nível de documentação.
 */

```

## Javadoc

**Javadoc** é um gerador de documentação criado pela [Sun Microsystems](https://pt.wikipedia.org/wiki/Sun\_Microsystems) para documentar a [API](https://pt.wikipedia.org/wiki/API) dos programas em [Java](https://pt.wikipedia.org/wiki/Linguagem\_de\_programa%C3%A7%C3%A3o\_Java), a partir do [código-fonte](https://pt.wikipedia.org/wiki/C%C3%B3digo-fonte). O resultado é expresso em [HTML](https://pt.wikipedia.org/wiki/HTML). É constituído, basicamente, por algumas marcações muitos simples inseridas nos comentários do programa.

Este sistema é o padrão de documentação de classes em Java, e muitas dos [IDEs](https://pt.wikipedia.org/wiki/Ambiente\_de\_desenvolvimento\_integrado) desta linguagem irão automaticamente gerar um Javadoc em [HTML](https://pt.wikipedia.org/wiki/HTML).

{% embed url="<https://pt.wikipedia.org/wiki/Javadoc>" %}

Criando nossa documentação no formato html para disponibilizar via web.

- No terminal execute o comando abaixo:
``` 
javadoc -encoding UTF-8 -docencoding ISO-8859-1  -d ../docs  src/*.java
```
##
