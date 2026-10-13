# Aula 02 — Keywords e tipos primitivos

**Bootcamp:** DIO — Itaú: Java com Inteligência Artificial

**Bloco:** Fundamentos de Sintaxe da linguagem Java

**Aula no bloco:** 2

**Data do estudo:** 13/10/2026

**Fonte:** relatos de Matheus sobre a aula, com complementos técnicos para revisão.

## Resumo da aula

O professor apresenta a configuração de versão no IntelliJ, uma referência para consultar palavras reservadas e os oito tipos primitivos, com exemplos de literais e sufixos numéricos.

## SDK e Language level no IntelliJ

Em **File → Project Structure → Project**, é possível alterar:

- **SDK:** JDK usado pelo projeto, incluindo compilador e bibliotecas.
- **Language level:** recursos de sintaxe aceitos pelo editor e considerados nas sugestões da IDE.

O nível da linguagem pode ser inferior à versão do SDK. Isso permite trabalhar com a sintaxe de uma versão anterior sem trocar necessariamente o JDK. Porém, mudar apenas o Language level não equivale a executar naquela versão nem garante, sozinho, compatibilidade com todas as APIs antigas.

Para acompanhar a aula, usar **SDK 21** e **Language level 21**, sem Preview. Os módulos podem herdar essas opções por **Project SDK** e **Project default**. Projetos Maven ou Gradle também precisam de configuração compatível no build.

Referência: [configurações de estrutura do projeto — JetBrains](https://www.jetbrains.com/help/idea/project-settings-and-structure.html).

## Keywords: palavras reservadas

O professor indica a seção de palavras reservadas Java do W3Schools. Segundo o relato, a lista não abrangia tudo na época da gravação. Para a versão estudada, consultar também a [lista oficial de keywords do Java 21](https://docs.oracle.com/javase/specs/jls/se21/html/jls-3.html#jls-3.9).

Palavras como `new`, `class`, `public` e `int` têm significado na linguagem e não podem nomear variáveis. Java distingue maiúsculas e minúsculas.

## Os oito tipos primitivos

| Tipo | Característica | Exemplo |
| --- | --- | --- |
| `byte` | Inteiro com sinal, 8 bits | `byte quantidade = 10;` |
| `short` | Inteiro com sinal, 16 bits | `short total = 1000;` |
| `int` | Inteiro com sinal, 32 bits | `int idade = 30;` |
| `long` | Inteiro com sinal, 64 bits | `long populacao = 8000000000L;` |
| `float` | Ponto flutuante, 32 bits | `float altura = 1.75F;` |
| `double` | Ponto flutuante, 64 bits | `double medida = 1.7;` |
| `char` | Uma unidade UTF-16, 16 bits | `char inicial = 'M';` |
| `boolean` | Valor lógico | `boolean ativo = true;` |

`String` é uma classe, não um tipo primitivo. Um `char` não representa sozinho todo caractere Unicode: alguns exigem duas unidades UTF-16. `float` e `double` têm precisão limitada; muitos valores decimais são aproximações.

Referência: [tipos primitivos — especificação Java 21](https://docs.oracle.com/javase/specs/jls/se21/html/jls-4.html#jls-4.2).

## Literais numéricos e inferência com var

```java
var inteiro = 1;        // int
var inteiroLongo = 1L;  // long
var decimal = 1.0;      // double
var decimalFloat = 1.0F; // float
var decimalDouble = 1.7d; // double
```

`L` ou `l` indica literal `long`; preferir `L` evita confusão com o algarismo 1. Sem sufixo, um literal inteiro é `int`. Uma variável `long` também pode receber um literal `int` compatível: `long valor = 1;`.

`F` ou `f` indica `float`. Um literal decimal sem sufixo é `double`, mesmo quando o destino declarado é `float`: `float valor = 1.0;` não compila sem conversão. Usar `1.0F`.

`D` ou `d` indica `double`, mas é opcional: `1.7`, `1.7d` e `1.7D` são literais `double`.

## Dúvida de Matheus: true e false em maiúsculas

Os literais booleanos são **`true` e `false`**, em minúsculas. `True`, `False`, `TRUE` e `FALSE` não são esses literais; seriam identificadores e, sem declaração correspondente, causariam erro.

`Boolean.TRUE` e `Boolean.FALSE` existem como constantes da classe wrapper `Boolean`. Tecnicamente, `true` e `false` são literais, não keywords, mas também não podem nomear variáveis.

Referência para literais e sufixos: [estrutura lexical do Java 21](https://docs.oracle.com/javase/specs/jls/se21/html/jls-3.html#jls-3.10).

## Pontos para revisão

- SDK e Language level são configurações diferentes.
- Existem oito tipos primitivos; `String` não faz parte dessa lista.
- Com `var`, o tipo depende da expressão inicializadora.
- Preferir `L` para literais long e usar `F` para literais float.
- O sufixo de double é opcional.
- Literais booleanos são sempre `true` e `false` em minúsculas.
