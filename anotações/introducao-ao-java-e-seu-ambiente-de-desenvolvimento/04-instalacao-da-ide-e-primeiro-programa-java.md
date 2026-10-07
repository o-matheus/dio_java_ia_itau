# Aula 04 — Instalação da IDE e Execução do seu primeiro programa Java

**Bootcamp:** DIO — Itaú: Java com Inteligência Artificial  
**Bloco:** Introdução ao Java e seu Ambiente de Desenvolvimento  
**Aula no bloco:** 4  
**Professor:** José Luiz Abreu Cardoso Junior (Junior)  
**Fonte:** relatos de Matheus sobre a aula.

## Conteúdo da aula

## Resumo da aula

O professor apresenta três demonstrações de instalação e uso: **Eclipse, VS Code e IntelliJ IDEA**. Em seguida, cria um primeiro programa Java e mostra execução, argumentos, configurações de Run e recursos de depuração.

Matheus utiliza principalmente IntelliJ para estudar Java; segundo o relato, também é a ferramenta mais utilizada pelo professor.

## Ambientes apresentados

- **Eclipse:** IDE tradicional; a percepção de um visual mais datado é uma avaliação subjetiva registrada no relato.
- **VS Code:** editor de código extensível, utilizado com diferentes linguagens e tecnologias. Para Java, o professor indica o **Extension Pack for Java**, da Microsoft.
- **IntelliJ IDEA:** IDE utilizada nas demonstrações de estrutura do projeto, execução e debug.

O professor também recomenda incluir um **README** no projeto para explicar sua finalidade e funcionamento. Não foi reproduzido um tutorial de instalação neste arquivo.

## Estrutura inicial no IntelliJ

| Item | Função |
| --- | --- |
| `.idea/` | Configurações do projeto na IDE; o nome mencionado como `.IDE` corresponde provavelmente a essa pasta |
| `src/` | Código-fonte, na estrutura simples apresentada |
| `out/` | Saída compilada pelo build nativo do IntelliJ, conforme a configuração do projeto |
| `.gitignore` | Padrões de arquivos que o Git deve ignorar quando ainda não estão rastreados |
| External Libraries | Visão da IDE sobre o JDK e as bibliotecas disponíveis; não necessariamente uma pasta física com esse nome |

Projetos Maven ou Gradle podem ter outras estruturas e diretórios de saída, como `target/` e `build/`. O `.gitignore` não remove automaticamente arquivos já rastreados pelo Git.

## Primeiro programa: estrutura tradicional

Exemplo didático equivalente ao descrito, para um arquivo `Main.java` sem declaração de pacote:

```java
public class Main {
    public static void main(String[] args) {
        System.out.println("Olá, mundo!");
    }
}
```

- `Main` é o nome da classe pública e deve corresponder a `Main.java`.
- Iniciar nomes de classes com letra maiúscula é uma **convenção**, não uma exigência geral da linguagem.
- As chaves da classe envolvem seus membros; as chaves do método envolvem seu corpo.
- **O método `main` é o ponto de entrada**, não o nome da classe. A classe poderia se chamar `PrimeiroPrograma`, com o arquivo correspondente.
- `public static void main(String[] args)` é a assinatura tradicional apresentada na aula. `args` é um nome convencional para o parâmetro e pode ser alterado.
- `System.out.println` escreve na saída padrão e acrescenta uma quebra de linha.

É o mecanismo de lançamento da aplicação Java que inicia o método apropriado; o compilador transforma o código em bytecode, não executa o programa.

## Atalhos do IntelliJ

O relato menciona os templates **`psvm`**, para criar o método `main`, e **`sout`**, para inserir `System.out.println`. A expansão depende das configurações dos templates da IDE.

## Compilar e executar no terminal

Para o exemplo sem pacote, a partir da raiz do projeto:

```sh
# Compilar src/Main.java, gerando src/Main.class
javac src/Main.java

# Executar a classe compilada, indicando onde encontrá-la
java -cp src Main
```

Esse fluxo é diferente da execução direta do arquivo-fonte:

```sh
java src/Main.java
```

No modo de execução de fonte, o Java compila o código para executá-lo sem exigir um comando `javac` separado. Portanto, `java src/Main.java` não é a forma de executar o `.class` produzido anteriormente.

### Dúvida de Matheus: depois de compilar, basta `java src/Main`?

Não. Para esse exemplo sem pacote, utilizar **`java -cp src Main`**:

- `-cp src` define o **classpath**, indicando o diretório onde o Java deve procurar a classe.
- `Main` é o nome da classe a executar, sem `.java` ou `.class` e sem o caminho `src/`.

Outra opção é entrar no diretório que contém a classe compilada:

```sh
cd src
java Main
```

Já **`java src/Main.java`** recebe um caminho de arquivo-fonte, compila em memória e executa sem gravar o `Main.class` nesse fluxo. O `src/Main.class` gerado por um comando `javac` anterior não é utilizado para executar esse fonte.

Em resumo, o modo de fonte recebe o **arquivo**; o modo de classe compilada recebe o **nome da classe**, com o classpath apropriado.

Os exemplos dependem dos nomes e da estrutura do projeto. Se houver pacotes, o nome qualificado da classe e a raiz do classpath também precisam ser considerados. Os comandos não foram executados como parte destas anotações.

## Argumentos de execução

O professor acrescenta uma impressão semelhante a:

```java
System.out.println("Argumento 1: " + args[0]);
```

`String[] args` é um **array de strings**, não uma `List` do Java. O índice inicial é `0`, portanto `args[0]` acessa o primeiro argumento. O operador `+`, nesse exemplo, concatena o texto com o valor.

Exemplo com a classe compilada:

```sh
java -cp src Main primeiro segundo
```

Ou com execução do fonte:

```sh
java src/Main.java primeiro segundo
```

Nesse caso, `args[0]` recebe `primeiro` e `args[1]` recebe `segundo`. Para passar um argumento com espaços, utilizar aspas, por exemplo `"primeiro argumento"`.

**Cuidado para revisão:** acessar `args[0]` sem fornecer argumentos causa `ArrayIndexOutOfBoundsException`. Um exemplo complementar de verificação é:

```java
if (args.length > 0) {
    System.out.println("Argumento 1: " + args[0]);
}
```

## Configurações de Run

Após a execução inicial, o professor mostra configurações de execução no IntelliJ, incluindo:

- Argumentos do programa.
- JDK utilizado na execução.
- Variáveis de ambiente.

As variáveis de ambiente foram apresentadas sem aprofundamento. Argumentos do programa e opções da JVM são configurações diferentes; o array `args` recebe os argumentos destinados ao programa.

Matheus espera utilizar principalmente a IDE, mas os comandos do terminal ajudam a compreender as etapas que ela automatiza.

## Debug e Evaluate

O professor demonstra um **breakpoint**, que pausa a execução em um ponto definido, e comandos de navegação:

- **Step Into:** entrar na execução de um método, quando aplicável.
- **Step Over:** avançar sem acompanhar internamente a chamada de método.
- **Step Out:** continuar até sair do método atual.

Matheus destaca o recurso **Evaluate Expression**: com a execução suspensa no depurador, é possível avaliar expressões usando variáveis e o contexto disponíveis naquele ponto. Isso permite explorar valores e testar hipóteses sem necessariamente editar o código-fonte.

Como complemento, a avaliação depende do frame selecionado e do que está acessível nele. Expressões que alteram variáveis ou chamam métodos podem produzir efeitos no estado da aplicação; não são sempre uma consulta sem consequências.

## Pontos para revisão

- O ponto de entrada é o método `main`; a classe não precisa se chamar `Main`.
- O nome da classe pública corresponde ao nome do arquivo.
- `javac` compila; `java` inicia a execução.
- Executar uma classe compilada e executar um arquivo-fonte são caminhos diferentes.
- `args` é um array e seus índices começam em zero.
- Configurações de Run permitem fornecer argumentos e escolher o ambiente de execução.
- Debug e Evaluate ajudam a observar e investigar o comportamento do programa.
