# Aula 03 — Gerenciadores de Build

**Bootcamp:** DIO — Itaú: Java com Inteligência Artificial  
**Bloco:** Introdução ao Java e seu Ambiente de Desenvolvimento  
**Aula no bloco:** 3  
**Professor:** José Luiz Abreu Cardoso Junior (Junior)  
**Fonte:** material fornecido na aula e dúvidas de Matheus, com explicações complementares.

## O que é build?

Build é o processo de preparar o código para execução ou distribuição. Em Java, pode incluir resolução de dependências, compilação de `.java` para `.class`, execução de testes e empacotamento em `.jar` ou `.war`.

Um `.class` contém bytecode executado pela JVM, não um executável nativo do sistema operacional. Um JAR é um arquivo de empacotamento; nem todo JAR é diretamente executável com `java -jar`.

## Maven e Gradle

As ferramentas automatizam e organizam etapas do build, incluindo dependências e testes.

| Aspecto | Maven | Gradle |
| --- | --- | --- |
| Configuração comum | `pom.xml` | `build.gradle` (Groovy) ou `build.gradle.kts` (Kotlin) |
| Organização | Ciclo de vida com fases e plugins | Tarefas e plugins, com dependências entre tarefas |
| Estilo | Convenções e configuração declarativa | Convenções de plugins e scripts personalizáveis |

Ambos podem ser personalizados. Maven também oferece extensões por plugins, e Gradle também utiliza convenções; a diferença não é simplesmente “rígido versus flexível”.

## Ambiente utilizado por Matheus

A aula demonstra instalações manuais no Windows, mas Matheus acompanha o curso pelo **macOS** e não pretende reproduzir esse caminho neste momento.

Matheus informa que **instalou o SDKMAN! no macOS** para facilitar o gerenciamento de Java, Maven, Gradle e outras ferramentas disponíveis. Isso registra a instalação do gerenciador; as versões e a instalação individual de cada ferramenta não foram confirmadas.

Posteriormente, poderá retomar as aulas para configurar seu notebook Windows. Se utilizar SDKMAN! nesse sistema, deverá considerar um ambiente compatível, como WSL, em vez de presumir instalação nativa no Windows.

Não foi mantido um tutorial de instalação manual para Windows nestas anotações, conforme a preferência de Matheus. Os materiais de referência podem ser consultados quando houver necessidade:

- [Maven — downloads](https://maven.apache.org/download.cgi).
- [Gradle — lançamentos](https://gradle.org/releases/).
- [SDKMAN! — instalação](https://sdkman.io/install/).

## Síntese da aula

Apesar das diferenças de configuração e organização das etapas, **Maven e Gradle ajudam a automatizar o build, executar testes e gerenciar as dependências do projeto**. São essas responsabilidades gerais que interessam neste momento; os detalhes de instalação serão retomados conforme a necessidade.

## Dúvida: são uma mistura de npm e Vite?

**A comparação é útil como aproximação.** Maven e Gradle reúnem responsabilidades que, em muitos projetos JavaScript, ficam distribuídas entre várias ferramentas.

| Responsabilidade | Exemplo em JavaScript | Exemplo em Java |
| --- | --- | --- |
| Resolver dependências | npm | Maven ou Gradle |
| Coordenar comandos | Scripts no `package.json` | Fases/plugins do Maven ou tarefas do Gradle |
| Preparar o código | Vite, compilador ou outras ferramentas | Compilador Java acionado pelo gerenciador |
| Executar testes | Ferramenta de testes chamada por um script | Plugins/tarefas de teste |
| Empacotar | Ferramentas do projeto | Plugins/tarefas para JAR ou WAR |

`npm run build` executa o script definido no projeto. O npm não determina sozinho o que “build” significa: o script pode chamar Vite, TypeScript ou outra ferramenta. Da mesma forma, Maven e Gradle coordenam ferramentas e plugins para realizar o trabalho.

## Dúvida: fazer build manual em Java é complicado?

Para um programa pequeno, pode ser simples. Considerando um `Main.java` sem pacote e sem dependências externas:

```sh
javac Main.java
java Main
```

O primeiro comando compila; o segundo executa pela JVM. Esses comandos são exemplos, não foram executados nesta anotação.

A complexidade cresce quando precisamos organizar vários arquivos, pacotes, bibliotecas externas, testes, recursos e empacotamento. Manualmente, seria necessário cuidar de caminhos, classpath, versões das bibliotecas e da ordem das etapas. É possível fazer isso por scripts, mas o script passa a assumir responsabilidades de uma ferramenta de build.

Com um projeto já configurado, o fluxo cotidiano também pode ser um único comando:

```sh
# Maven: executar as fases necessárias até o empacotamento
mvn package

# Gradle, em um projeto Java com as tarefas correspondentes
gradle build
```

A simplicidade do comando vem da configuração e das convenções que organizam o trabalho por trás dele. A IDE pode executar essas etapas pela interface, mas elas continuam existindo.

## Complemento: wrappers do projeto

Projetos podem fornecer **Maven Wrapper** ou **Gradle Wrapper**, para utilizar uma versão definida pelo próprio projeto sem depender de uma instalação global prévia do gerenciador.

Exemplos em macOS/Linux, quando os arquivos do wrapper existem:

```sh
./mvnw package
./gradlew build
```

Os wrappers podem baixar a distribuição necessária; não eliminam a necessidade de um ambiente Java adequado nem a configuração do build.

## Pontos para revisão

- Compilar um programa pequeno não exige Maven ou Gradle.
- Gerenciadores tornam builds maiores mais organizados, repetíveis e automatizados.
- Build não significa necessariamente gerar um executável nativo.
- `npm run build` também depende de ferramentas e configuração por trás do comando.
- Gradle com Kotlin utiliza normalmente `build.gradle.kts`.
- A versão do JDK deve ser compatível com a versão da ferramenta utilizada.
