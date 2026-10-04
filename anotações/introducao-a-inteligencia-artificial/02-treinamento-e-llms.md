# Introdução à Inteligência Artificial — Aula 02: Como uma Inteligência Artificial é treinada e o que são LLMs

**Bootcamp:** DIO — Itaú: Java com Inteligência Artificial  
**Bloco:** Introdução à Inteligência Artificial  
**Aula no bloco:** 2 de 4  
**Fonte:** relatos de Matheus sobre a aula.

## Conteúdo da aula

## Treinamento: modelo, dados e parâmetros

Segundo o relato da aula, o treinamento envolve um **modelo de IA** e uma **base de conhecimento**. À medida que informações são apresentadas durante o treinamento, o modelo passa a reconhecer padrões relacionados ao contexto ou ao objeto analisado.

## Conceitos para revisão

Como complemento explicativo às anotações:

- **Modelo:** estrutura computacional que processa entradas e produz resultados, como uma classificação, previsão ou texto.
- **Dados de treinamento:** exemplos utilizados para ajustar o modelo. A expressão “base de conhecimento”, mencionada no relato, pode estar se referindo a esses dados; também pode designar uma fonte externa de consulta, dependendo do contexto.
- **Parâmetros:** valores internos ajustáveis do modelo, como os pesos de uma rede neural. Durante o treinamento, seus ajustes permitem aprender padrões nos dados.

## Como ocorre o aprendizado

Em uma descrição simplificada de um treinamento baseado em otimização:

1. O modelo recebe exemplos e produz resultados.
2. Uma função de perda mede o erro em relação ao objetivo de treinamento.
3. O processo de treinamento ajusta os parâmetros para reduzir esse erro.
4. O ciclo se repete com os dados, buscando melhorar o desempenho.

**Exemplo didático:** no treinamento de um modelo para reconhecer objetos em imagens, exemplos identificados como “gato” ou “cachorro” ajudam a ajustar os parâmetros para distinguir padrões visuais dessas categorias.

O aprendizado depende dos dados, do método e dos ajustes realizados; a passagem do tempo, sozinha, não treina o modelo.

## Treinamento e uso do modelo

Apresentar informações durante o treinamento pode alterar os parâmetros. Durante o uso comum de um modelo já treinado, fornecer uma mensagem geralmente altera apenas o contexto disponível para aquela resposta, sem atualizar os parâmetros. Uma base externa também pode fornecer informações para consulta sem que o modelo seja treinado novamente.

## LLMs

**LLM** significa **Large Language Model**, em português, **modelo de linguagem de grande porte**. A sigla e seu significado foram apresentados na aula.

Como complemento para estudo, um LLM é um modelo de linguagem treinado com grandes volumes de dados textuais e muitos parâmetros. Ele aprende padrões da linguagem e pode ser utilizado em tarefas como geração de textos, resumos, tradução e respostas a perguntas.

Esse conceito conecta os temas anteriores: o texto é dividido em **tokens**, e o treinamento ajusta os **parâmetros** que o modelo utiliza para processar o contexto e produzir resultados. O termo “grande” se refere à escala do modelo e de seu treinamento, sem estabelecer um número mínimo universal de parâmetros.

## SLM — Small Language Models

**SLM** significa **Small Language Model**, no singular, ou **Small Language Models**, no plural: **modelo(s) de linguagem de pequeno porte**. O termo foi mencionado na aula.

Como complemento para estudo, SLMs são modelos de linguagem de menor escala, geralmente com menos parâmetros que os modelos classificados como LLMs. Não existe um limite universal de parâmetros que separe as duas categorias.

Modelos menores tendem a exigir menos memória e recursos computacionais. Podem ser úteis em tarefas específicas ou em ambientes com recursos limitados. O desempenho depende também da qualidade dos dados, do treinamento e da tarefa; o tamanho sozinho não determina a qualidade das respostas.

| Conceito | Significado | Característica geral |
| --- | --- | --- |
| LLM | Large Language Model | Modelo de linguagem de grande porte |
| SLM | Small Language Model | Modelo de linguagem de pequeno porte |

## Reforço positivo e sinais de recompensa

O professor menciona o **reforço positivo** como uma forma de ajudar no treinamento do modelo.

Como complemento para estudo, no **aprendizado por reforço**, sinais de recompensa orientam o aprendizado: o processo de treinamento busca ajustar o comportamento do modelo para obter uma recompensa esperada maior. A recompensa é um sinal numérico relacionado ao objetivo definido para a tarefa.

**Exemplo didático:** um agente que aprende a jogar pode receber uma recompensa ao alcançar um objetivo. Ao longo do treinamento, os ajustes favorecem estratégias que levam a melhores resultados.

No caso de modelos de linguagem, avaliações e preferências humanas podem orientar etapas de treinamento. Uma abordagem é o **RLHF (aprendizado por reforço com feedback humano)**, em que preferências ajudam a construir um sinal de recompensa usado para ajustar o modelo.

Um elogio enviado em uma conversa comum não implica, por si só, uma atualização imediata dos parâmetros. Para haver aprendizado, esse feedback precisa participar de um processo de treinamento. Nem todo treinamento de IA utiliza aprendizado por reforço.

## Tokens e parâmetros: conceitos diferentes

No relato da aula, surgiu a ideia de que os parâmetros seriam armazenados em forma de tokens. Para revisão, cabe esclarecer: **parâmetros não são armazenados como tokens**.

- **Tokens:** unidades em que o texto é dividido para ser processado. Podem representar palavras, partes de palavras ou sinais e são associados a identificadores numéricos.
- **Parâmetros:** valores numéricos internos do modelo, como os pesos de uma rede neural, ajustados durante o treinamento.

Em um modelo de linguagem neural, os tokens são convertidos em representações numéricas chamadas **embeddings**. O modelo processa essas representações usando seus parâmetros para calcular, por exemplo, as probabilidades do próximo token. Em muitos modelos, a própria tabela de embeddings também contém parâmetros aprendidos.

**Relação simplificada:** texto → tokens → representações numéricas → processamento com os parâmetros do modelo → probabilidades do próximo token.

Os tokens compõem a entrada e a saída textual; os parâmetros determinam como o modelo realiza o processamento. A formulação exata usada pelo professor ainda pode ser conferida para verificar se ele se referia aos tokens ou às suas representações.
