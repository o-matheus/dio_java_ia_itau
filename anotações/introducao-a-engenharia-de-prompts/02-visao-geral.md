# Aula 02 — Visão geral da Engenharia de Prompts

**Bootcamp:** DIO — Itaú: Java com Inteligência Artificial  
**Bloco:** Introdução à Engenharia de Prompts  
**Aula no bloco:** 2  
**Fonte:** relatos de Matheus sobre a aula.

## Conteúdo da aula

## Resumo da aula

A professora apresenta como modelos de linguagem processam prompts, abordando Transformers, tokens, embeddings, contexto e geração de respostas. Depois organiza os elementos de um bom prompt e demonstra sua aplicação na criação de uma história de RPG.

As explicações abaixo partem do relato de Matheus, com ajustes conceituais para revisão. O nome da professora ainda não foi informado.

## Transformers e o artigo Attention Is All You Need

**Attention Is All You Need** é um artigo científico de **2017**, de **Ashish Vaswani e colaboradores**, que apresenta a arquitetura **Transformer**. Não é apenas o nome de um arquivo. A arquitetura utiliza mecanismos de atenção para relacionar informações em sequências. [Artigo original](https://arxiv.org/abs/1706.03762).

O Transformer é uma arquitetura de rede neural. A estrutura de um prompt, por sua vez, é a organização das instruções e informações fornecidas ao modelo: os dois conceitos são diferentes.

## Treinamento e geração de respostas

Segundo o relato, o modelo recebe muitos textos durante o treinamento e aprende padrões que ajudam a produzir respostas para diferentes contextos.

**Complemento:** no pré-treinamento de muitos LLMs generativos, um objetivo é prever o próximo token a partir dos anteriores. O treinamento ajusta parâmetros para melhorar essas previsões; não se limita a memorizar pares de perguntas e respostas. Etapas adicionais podem treinar o seguimento de instruções.

Durante a geração, o modelo calcula probabilidades para o próximo token, seleciona um token e repete o processo. Uma continuação provável não é necessariamente a resposta mais verdadeira ou útil. A seleção também não precisa escolher sempre o token de maior probabilidade.

## Do prompt à resposta

Uma descrição simplificada do processamento em um LLM baseado em Transformer:

1. **Tokenização:** o texto é dividido em tokens, associados a identificadores numéricos.
2. **Embeddings:** os tokens são convertidos em vetores. Informações de posição também permitem representar a ordem da sequência.
3. **Camadas do Transformer:** atenção e outras operações da rede transformam essas representações, incorporando relações com o contexto permitido.
4. **Previsão:** o modelo produz probabilidades para o próximo token.
5. **Geração:** o token selecionado é acrescentado à sequência, e o processo continua.

Um embedding não é uma tradução perfeita do significado de todo o prompt. Inicialmente, representa um token; ao longo das camadas, as representações passam a incorporar informações contextuais.

### A palavra procurada: atenção

A palavra esquecida no relato provavelmente é **atenção**, em particular **autoatenção (self-attention)**. Esse mecanismo calcula como as representações de diferentes posições contribuem umas para as outras. É uma forma matemática de relacionar elementos do contexto, não uma busca automática na internet ou nos textos originais do treinamento.

### O modelo lê tudo ao mesmo tempo?

A explicação da aula contrasta Transformers com uma leitura estritamente sequencial. Transformers permitem processar várias posições em paralelo, mas isso não significa ignorar a ordem das palavras.

Em LLMs de geração causal, cada posição utiliza as posições anteriores permitidas pela máscara de atenção. O prompt pode ser processado em paralelo nessa etapa, enquanto a resposta é normalmente gerada token por token. Portanto, “ver todo o contexto” é uma simplificação: o modelo usa o contexto disponível e permitido pela arquitetura.

## Analogia com autocomplete

Matheus menciona a comparação entre LLMs e um “autocomplete mais sofisticado”. A analogia ajuda a entender a previsão de continuação de texto, mas é limitada: modelos grandes aprendem relações complexas e podem realizar muitas tarefas por meio dessa geração.

Isso também não significa que o modelo aprenda automaticamente os hábitos pessoais de quem conversa com ele ou atualize seus parâmetros a cada mensagem.

## Janela de contexto e memória

A **janela de contexto** limita a quantidade de tokens que o modelo pode utilizar em uma execução. O contexto pode incluir instruções, mensagens anteriores, documentos e resultados de ferramentas, além do espaço necessário à geração.

O modelo utiliza o histórico que a aplicação fornece; não recupera automaticamente todas as conversas já realizadas. Quando o histórico fica extenso, a aplicação pode resumir, selecionar ou remover trechos. Não é uma regra universal que as mensagens mais antigas sejam sempre apagadas da conversa: elas podem continuar armazenadas, mesmo sem serem enviadas ao modelo.

### Observação de Matheus sobre a aplicação

Matheus relaciona esse tema a recursos de memória e instruções personalizadas em assistentes, citando ChatGPT. Essa observação é registrada como contribuição pessoal; o funcionamento específico do produto não foi verificado nesta anotação.

Como distinção geral, a camada de aplicação que envolve o modelo — às vezes chamada de **harness** — pode selecionar informações armazenadas, instruções e resultados de ferramentas para compor o contexto. Isso é diferente de alterar os parâmetros do modelo. Não é necessário presumir que exista um único “arquivo de memória”.

## Elementos de um bom prompt

Os cinco elementos apresentados no relato são:

| Elemento | Função |
| --- | --- |
| Instrução inicial | Definir a tarefa e o objetivo |
| Contexto adequado | Explicar a situação e as restrições relevantes |
| Exemplos | Mostrar o estilo ou o tipo de resultado desejado |
| Dados de entrada | Fornecer as informações que serão utilizadas |
| Formato de saída | Indicar como a resposta deve ser organizada |

Nem todo pedido precisa conter os cinco elementos. Eles ajudam a verificar se faltam informações importantes para a tarefa.

## Exemplo da aula: história de RPG

A professora utiliza a criação de uma história de RPG para demonstrar os elementos:

- **Instrução inicial:** criar uma história ou aventura, com jogadores começando em uma cidade amaldiçoada e sombras que os atacam.
- **Contexto:** detalhar a situação e o caminho desejado para a aventura.
- **Exemplo:** indicar uma forma de construir a história ou uma direção narrativa.
- **Dados de entrada:** grupo de personagens, suas personalidades, vilão e informações sobre o primeiro encontro e o NPC envolvido.
- **Formato de saída:** definir como apresentar o material produzido.

O prompt literal, os nomes dos personagens e o formato final não foram fornecidos e não foram reconstruídos.

## Pontos para revisão

- Transformer é uma arquitetura de rede neural; a estrutura do prompt organiza o pedido.
- Tokens são convertidos em vetores e processados pelas camadas do modelo.
- Atenção relaciona informações entre posições do contexto.
- A ordem dos tokens importa, e a geração normalmente ocorre token por token.
- Probabilidade de continuação não equivale a garantia de verdade.
- Histórico disponível, memória da aplicação e parâmetros do modelo são conceitos diferentes.
- Instrução, contexto, exemplos, dados e formato de saída ajudam a orientar respostas.

## Referência

**Vaswani, Ashish et al. (2017). Attention Is All You Need.** [Ler o artigo](https://arxiv.org/abs/1706.03762).
