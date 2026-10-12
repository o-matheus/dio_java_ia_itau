# Aula 01 — Padrões de desenvolvimento e conceitos

**Bootcamp:** DIO — Itaú: Java com Inteligência Artificial  
**Bloco:** Fundamentos de Sintaxe da linguagem Java  
**Aula no bloco:** 1  
**Fonte:** relatos de Matheus sobre a aula, com ajustes técnicos para revisão.

## Resumo da aula

A aula apresenta convenções de nomes, organização em pacotes, comentários, entrada de dados com `Scanner`, saída com concatenação e `printf`, inferência de tipos com `var`, palavras reservadas, acesso e uso de `final`.

## Convenções de nomes

| Elemento | Convenção | Exemplo |
| --- | --- | --- |
| Classe | PascalCase: cada palavra começa com maiúscula | `CadastroCliente` |
| Método | camelCase: primeira palavra começa com minúscula; seguintes, com maiúscula | `calcularIdade()` |
| Variável | camelCase | `nomeCompleto` |
| Pacote | Letras minúsculas, com níveis separados por pontos | `br.com.dio` |
| Constante | Maiúsculas, com palavras separadas por underscore (`_`) | `WELCOME_MESSAGE` |

Esses padrões são convenções de desenvolvimento. Java diferencia maiúsculas e minúsculas: `nome` e `Nome` são identificadores diferentes.

## Pacotes e imports

Pacotes organizam classes e ajudam a evitar conflitos de nomes. Uma convenção é utilizar o domínio da organização invertido: para `dio.com.br`, `br.com.dio`; no exemplo de Tias Viagens, `br.com.tiasviagens`, supondo o domínio `tiasviagens.com.br`.

```java
package br.com.dio;

import java.util.Scanner;
```

O nome correto é **`java.util`**, no singular e em minúsculas. `Scanner` é uma **classe** da biblioteca padrão, não uma interface Java.

O `import` permite referenciar um tipo de outro pacote pelo nome simples, como `Scanner`, em vez de escrever `java.util.Scanner`. Esse tipo pode pertencer ao próprio projeto, à biblioteca padrão ou a uma dependência; o import não copia arquivos nem importa automaticamente os subpacotes.

Na organização usual dos arquivos-fonte, cada segmento do pacote corresponde a uma pasta abaixo da raiz de fontes:

```text
src/
└── br/
    └── com/
        └── dio/
            └── CadastroCliente.java
```

Em projetos Maven ou Gradle, a raiz de fontes costuma ser `src/main/java`. A classe acima declara `package br.com.dio;`.

### Criação de pacote e classe no IntelliJ

Na demonstração relatada, criar uma classe informando `br.com.dio.CadastroCliente` permite que a IDE crie o caminho do pacote e o arquivo `CadastroCliente.java` dentro da raiz de fontes selecionada.

A IDE pode apresentar pacotes intermediários compactados em uma única linha, como `br.com.dio`. Isso é uma forma de visualização: as pastas intermediárias continuam existindo. Criar `br.com.OutraClasse` coloca essa classe no pacote `br.com`. A possibilidade de navegar diretamente pelos níveis depende da visualização e das configurações da IDE; não é uma limitação da linguagem Java.

## Comentários

```java
// Comentário de uma linha

/*
 * Comentário de múltiplas linhas.
 */

/**
 * Comentário de documentação (Javadoc).
 */
```

Javadoc documenta elementos como classes e métodos e pode ser usado para gerar documentação. Comentários não são executados como instruções do programa.

## String

`String` é uma classe que representa uma sequência de caracteres e é **imutável**: o conteúdo de um objeto `String` não pode ser alterado depois de criado. Uma variável pode receber uma referência a outra string.

```java
String nome = "Matheus";
```

Como modelo inicial, pensar em caracteres ajuda, mas `String` não é um array `char[]`. São tipos diferentes, mesmo que seja possível construir uma string a partir de um array de caracteres.

## Entrada de dados com Scanner

```java
Scanner sc = new Scanner(System.in);
```

- `Scanner` é o tipo da variável.
- `sc` é o nome escolhido para ela.
- `new Scanner(...)` cria uma instância chamando um construtor.
- `System.in` é a entrada padrão, normalmente ligada ao teclado no terminal, mas também pode receber entrada redirecionada.

O `Scanner` lê e interpreta a entrada; ele não cria uma interface gráfica.

| Método | O que lê |
| --- | --- |
| `sc.next()` | Próximo token; por padrão, espaços e quebras de linha separam tokens |
| `sc.nextLine()` | Restante da linha atual, consumindo sua quebra de linha |
| `sc.nextInt()` | Próximo token interpretado como inteiro (`int`) |

```java
String nome = sc.next();
int age = sc.nextInt();
```

`next()` lê apenas uma palavra quando a entrada tem espaços. Para um nome completo, usar `nextLine()`. Uma entrada incompatível com `nextInt()`, como `abc`, causa `InputMismatchException` se não houver tratamento.

### Atenção: nextInt() seguido de nextLine()

Ao digitar um número e pressionar Enter, `nextInt()` consome o número e deixa o separador de linha na entrada. Um `nextLine()` logo depois pode retornar uma string vazia, pois lê o restante daquela linha.

```java
int age = sc.nextInt();
sc.nextLine(); // Consome o restante da linha do número.
String nomeCompleto = sc.nextLine(); // Lê a próxima linha.
```

Esse consumo descarta qualquer texto restante na linha do número. Não é uma limpeza geral da memória. A distinção relevante é entre **`nextInt()` e `nextLine()`**: `next()` pula os delimitadores e não retorna uma string vazia simplesmente por encontrar o Enter.

Esses comportamentos estão descritos na [documentação oficial de Scanner](https://docs.oracle.com/javase/8/docs/api/java/util/Scanner.html).

## Saída: concatenação e printf

Na concatenação, o operador `+` junta textos e valores dentro da expressão passada ao método:

```java
System.out.print("Olá, " + nome + ", sua idade é " + age);
System.out.println("Olá, " + nome + ", sua idade é " + age);
```

`print` não acrescenta uma quebra de linha; `println` acrescenta.

Com `printf`, o texto contém especificadores e os argumentos seguintes preenchem suas posições, na ordem:

```java
System.out.printf("Olá, %s, sua idade é %d.%n", nome, age);
```

| Especificador | Uso apresentado |
| --- | --- |
| `%s` | Texto/string |
| `%d` | Número inteiro |
| `%f` | Número de ponto flutuante |
| `%.2f` | Número de ponto flutuante com duas casas decimais |
| `%n` | Quebra de linha adequada ao sistema |

## Fechamento do Scanner

```java
sc.close();
```

Fechar o scanner libera os recursos associados e também fecha sua fonte de entrada quando ela é fechável. No caso de `System.in`, isso fecha a entrada padrão: em um programa simples, faça isso ao terminar todas as leituras. Se outras partes do programa ainda precisarem da entrada padrão, não a feche prematuramente. O fechamento não equivale a apagar imediatamente o objeto da memória. Veja a [documentação de Scanner.close()](https://docs.oracle.com/javase/8/docs/api/java/util/Scanner.html#close--).

## Tipagem estática e var

Java tem tipagem forte e estática. O compilador conhece o tipo das variáveis e verifica a compatibilidade das operações.

Desde Java 10, `var` permite inferir o tipo de uma variável local a partir da expressão de inicialização:

```java
var nome = "Matheus"; // Tipo inferido: String.
var age = 30;         // Tipo inferido: int; valor apenas ilustrativo.
var sc = new Scanner(System.in); // Tipo inferido: Scanner.
```

O tipo continua fixo: `age = "trinta";` não compila. Em uma declaração local comum com `var`, é obrigatório fornecer um inicializador que permita inferir o tipo; `var nome;` e `var nome = null;` não compilam. Inicializar uma variável não exige criar um objeto com `new`.

`var` não substitui o tipo de campos de uma classe, parâmetros comuns de métodos ou retornos de métodos. Tecnicamente, é um identificador de tipo restrito, não uma palavra-chave comum como `new`. Referência: [Using the Var Type Identifier — dev.java](https://dev.java/learn/language-basics/using-var/).

## Palavras reservadas e case sensitive

Palavras-chave, como `new`, `public`, `private` e `final`, não podem ser usadas como nomes de variáveis.

Como Java diferencia maiúsculas e minúsculas, `New` não é a palavra-chave `new`. Embora possa ser um identificador, usá-lo para uma variável contraria a convenção de camelCase e prejudica a clareza.

## Acesso e encapsulamento

Para os membros da classe abordados nesta introdução:

| Acesso | Alcance básico |
| --- | --- |
| `private` | Dentro da classe que declara o membro |
| `public` | Acessível de outros contextos, desde que o tipo também seja acessível |
| Sem modificador (package-private) | Dentro do mesmo pacote |

**Acesso de pacote não se escreve com `default`.** Ele resulta da ausência de `public`, `protected` ou `private`. A palavra-chave `default` tem outros usos na linguagem. Existe também `protected`, cujo comportamento será aprofundado com herança e encapsulamento.

## final e constantes

Uma variável `final` só pode receber uma atribuição. Ela pode ser inicializada na declaração ou depois, desde que as regras de inicialização sejam respeitadas e haja valor antes do uso.

```java
final int limite;
limite = 10;
// limite = 20; // Erro: já recebeu um valor.
```

Para uma mensagem constante compartilhada pela classe, uma declaração comum é:

```java
private static final String WELCOME_MESSAGE = "Bem-vindo!";
```

- `private`: restringe o acesso.
- `static`: associa o campo à classe, em vez de a cada instância.
- `final`: impede reatribuir o campo.
- `WELCOME_MESSAGE`: segue a convenção de nomes de constantes.

`private final String WELCOME_MESSAGE = "Bem-vindo!";` também é válido, mas declara um campo de cada instância. Para campos `final` sem inicializador, a atribuição deve ocorrer no caminho de inicialização adequado, por exemplo no construtor para campos de instância.

**Complemento:** em uma variável que referencia um objeto, `final` impede trocar a referência, mas não torna todo objeto imutável. No exemplo, a própria classe `String` já é imutável.

## Exemplo integrado para revisão

Exemplo didático equivalente aos conceitos relatados, em `br/com/dio/CadastroCliente.java` abaixo da raiz de fontes:

```java
package br.com.dio;

import java.util.Scanner;

public class CadastroCliente {
    private static final String WELCOME_MESSAGE = "Bem-vindo!";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println(WELCOME_MESSAGE);
        System.out.print("Digite sua idade: ");
        int age = sc.nextInt();
        sc.nextLine(); // Consome o restante da linha da idade.

        System.out.print("Digite seu nome completo: ");
        String nome = sc.nextLine();

        System.out.printf("Olá, %s, sua idade é %d.%n", nome, age);
        sc.close();
    }
}
```

O exemplo pressupõe uma idade inteira válida; o tratamento de entradas inválidas fica para aprofundamento.

## Pontos para revisão

- Classes usam PascalCase; métodos e variáveis usam camelCase; constantes usam maiúsculas e `_`.
- Pacotes organizam os tipos; imports permitem usar nomes simples.
- O pacote de `Scanner` é `java.util` e `Scanner` é uma classe.
- `String` representa texto, é imutável e não é um array `char[]`.
- `next()` lê um token; `nextLine()` lê o restante da linha.
- Após `nextInt()`, atenção ao `nextLine()` e à quebra de linha pendente.
- Concatenação usa `+`; `printf` usa especificadores e argumentos ordenados.
- `var` infere o tipo local em compilação; não torna a variável dinâmica.
- Acesso de pacote é a ausência de modificador, não o uso de `default`.
- `final` impede reatribuição; `static final` é comum para constantes da classe.
