# Aula 03 — Operadores de atribuição e lógicos

**Bootcamp:** DIO — Itaú: Java com Inteligência Artificial

**Bloco:** Fundamentos de Sintaxe da linguagem Java

**Aula no bloco:** 3

**Data do estudo:** 13/10/2026

**Fonte:** relatos de Matheus sobre a aula, com exemplos equivalentes e complementos para revisão.

## Resumo da aula

O professor demonstra atribuição, comparações e operadores lógicos, incluindo expressões booleanas na saída do terminal e uma tabela verdade.

## Atribuição e comparação

| Operador | Significado | Exemplo e resultado |
| --- | --- | --- |
| `=` | Atribuição | `int numero = 3;` armazena 3 |
| `==` | Igualdade | `3 == 4` → `false` |
| `!=` | Diferença | `3 != 4` → `true` |
| `>` | Maior que | `4 > 3` → `true` |
| `>=` | Maior ou igual | `4 >= 4` → `true` |
| `<` | Menor que | `3 < 4` → `true` |
| `<=` | Menor ou igual | `3 <= 3` → `true` |

Atribuir um valor e comparar valores são operações diferentes. As comparações mostradas produzem um booleano.

**Complemento para revisão:** com referências a objetos, `==` compara identidade; para comparar o conteúdo de strings, normalmente usar `.equals()`.

## Comparações também podem aparecer no printf

Matheus destaca que uma expressão booleana pode ser usada diretamente no `printf`, sem exigir um `if/else` ou uma variável intermediária.

Exemplo didático equivalente ao apresentado pelo professor, dentro de `main`, com `import java.util.Scanner;`:

```java
Scanner sc = new Scanner(System.in);

System.out.print("Quanto é 2 + 2? ");
var result = sc.nextInt();

System.out.printf("Sua resposta está correta? %b%n", result == 4);
sc.close();
```

Se a entrada for `4`, a saída contém `true`; para `5`, `3` ou outro inteiro, contém `false`. `%b` formata o resultado booleano.

A expressão é avaliada antes da chamada ao método. Portanto, não é uma operação invertida: o resultado da comparação é passado ao `printf`. O exemplo pressupõe entrada inteira válida.

### Tornando a intenção mais clara

Depois, o professor extrai a comparação para uma variável com nome semântico:

```java
boolean isRight = result == 4;
System.out.printf("Sua resposta está correta? %b%n", isRight);
```

Também seria possível escrever `var isRight = result == 4;`, com tipo inferido `boolean`.

**Observação de Matheus:** esse exemplo relembrou uma possibilidade que ele já conhecia, mas utilizava pouco. O nome `isRight` ajuda a explicar a intenção e deixa a impressão mais fácil de ler.

## Operadores lógicos

| Operador | Nome | Comportamento com booleanos |
| --- | --- | --- |
| `!` | NÃO / negação | Inverte o valor |
| `&&` | E | Verdadeiro quando ambos são verdadeiros |
| `||` | OU inclusivo | Verdadeiro quando pelo menos um é verdadeiro |
| `^` | OU exclusivo / XOR | Verdadeiro quando os valores diferem |

`!` nega uma expressão; `!=` compara dois valores. O relato menciona um operador lógico de “diferente”: para booleanos, isso pode ser expresso por XOR (`^`) ou por `!=`. O símbolo exato utilizado pelo professor não foi informado.

```java
boolean temCadastro = true;
boolean temPermissao = false;

boolean podeEntrar = temCadastro && temPermissao; // false
boolean atendeAlgum = temCadastro || temPermissao; // true
boolean apenasUm = temCadastro ^ temPermissao; // true
boolean semPermissao = !temPermissao; // true
```

### Complemento: curto-circuito

`&&` não avalia a expressão da direita se a esquerda for `false`. `||` não avalia a direita se a esquerda for `true`.

Com operandos booleanos, `&` e `|` também representam E e OU, mas avaliam ambos os lados. Com operandos inteiros, `&`, `|` e `^` operam sobre bits.

## Tabela verdade para revisão

Tabela equivalente aos conceitos relatados; não é uma transcrição literal do quadro do professor.

| A | B | A && B | A &#124;&#124; B | A ^ B |
| --- | --- | --- | --- | --- |
| `false` | `false` | `false` | `false` | `false` |
| `false` | `true` | `false` | `true` | `true` |
| `true` | `false` | `false` | `true` | `true` |
| `true` | `true` | `true` | `true` | `false` |

| A | !A |
| --- | --- |
| `false` | `true` |
| `true` | `false` |

Referência para comparação, negação, operações booleanas e atribuição: [expressões — especificação Java 21](https://docs.oracle.com/javase/specs/jls/se21/html/jls-15.html).

## Pontos para revisão

- `=` atribui; `==` compara igualdade; `!=` compara diferença.
- `!` é negação, não comparação entre dois valores.
- Expressões booleanas podem ser impressas ou atribuídas, além de usadas em condições.
- Uma variável como `isRight` comunica a intenção da comparação.
- OU inclusivo aceita ambos verdadeiros; XOR aceita apenas um verdadeiro.
- `&&` e `||` usam curto-circuito.
