# Introdução à Inteligência Artificial — Aula 01: Como a inteligência Artificial Nasceu

**Bootcamp:** DIO — Itaú: Java com Inteligência Artificial  
**Bloco:** Introdução à Inteligência Artificial  
**Aula no bloco:** 1 de 4  
**Fonte:** relato de Matheus, com complemento histórico conferido em artigos originais.

## Resumo do conteúdo relatado

A primeira aula deste bloco discute a ideia de conversar com computadores usando linguagem humana e pergunta quando essa possibilidade começou a ser explorada. O professor aborda o artigo de Alan Turing, com uma menção ao filme *O Jogo da Imitação*.

No relato, aparecem dois conceitos: avaliar se uma máquina consegue se passar por uma pessoa durante uma conversa e simular respostas humanas por meio de padrões. A distinção histórica entre eles está registrada abaixo para apoiar a revisão.

## Alan Turing e o jogo da imitação

Em 1950, Turing publicou *Computing Machinery and Intelligence*, propondo o jogo da imitação como uma forma de discutir a inteligência das máquinas. O jogo original envolve um homem, uma mulher e um interrogador separado dos demais. Turing então considera substituir um dos participantes por um computador. [Fonte: artigo de Turing](https://courses.cs.umbc.edu/471/papers/turing.html).

Na apresentação simplificada do teste de Turing, um avaliador conversa por texto com uma pessoa e uma máquina, sem vê-las, e tenta identificar qual é qual. A pergunta central é se a máquina consegue produzir respostas que dificultem essa distinção.

O computador usado como meio de comunicação entre pessoas não é necessariamente quem produz as respostas. Quando a máquina participa da conversa, o programa gera as respostas que o avaliador recebe.

## John McCarthy e o termo inteligência artificial

O professor também cita **John McCarthy** e a criação do termo **inteligência artificial**.

Como complemento histórico: McCarthy é creditado pela criação do termo, que aparece na proposta de pesquisa de Dartmouth de **1955**, assinada por ele, Marvin Minsky, Nathaniel Rochester e Claude Shannon. O encontro proposto aconteceu em **1956** e é considerado um marco da formação da IA como campo de pesquisa. Assim, vale distinguir a data da proposta da data do encontro. [Fontes: proposta original](https://www-formal.stanford.edu/jmc/history/dartmouth/dartmouth.html) e [história da IA em Dartmouth](https://home.dartmouth.edu/about/artificial-intelligence-ai-coined-dartmouth).

## Esclarecimento histórico: teste e programa de conversa

O artigo de Turing propõe um teste e discute possibilidades de inteligência das máquinas. Ele não descreve a criação, por Turing, de um chatbot a partir de um levantamento das perguntas e respostas mais frequentes.

O professor também aborda **ELIZA**, de **Joseph Weizenbaum**, apresentada em um artigo de **1966**. O programa identifica palavras-chave e aplica regras para transformar o texto recebido em uma resposta. ELIZA é o exemplo de conversa por padrões citado na aula. [Fonte histórica: artigo de Weizenbaum](https://courses.cs.umbc.edu/331/papers/eliza.html).

## Como ELIZA funciona: repetição e substituição de palavras

Segundo o relato da aula, o professor explica a simulação da conversa por meio da repetição e substituição de palavras.

Como complemento técnico baseado no artigo, o processo pode ser resumido assim:

1. O usuário escreve uma mensagem.
2. ELIZA procura palavras-chave e padrões no texto.
3. Uma regra separa a frase em partes.
4. Outra regra monta a resposta, podendo reaproveitar trechos e substituir palavras ou pronomes para ajustar a perspectiva da conversa.

A repetição aqui é o reaproveitamento de partes da mensagem na resposta. As regras já programadas permitem essa transformação; o programa não precisa aprender novas regras a cada repetição. No roteiro que simula uma conversa terapêutica, devolver trechos como perguntas ajuda a manter o diálogo. [Fonte: artigo de Weizenbaum](https://courses.cs.umbc.edu/331/papers/eliza.html).

## Exemplo didático de resposta por regra

Exemplo criado para estas anotações, sem reproduzir uma fala da aula:

```text
Pessoa: Estou preocupado com a prova.
Programa: Por que você está preocupado com a prova?
```

Uma regra poderia reconhecer a estrutura “Estou preocupado com X” e responder “Por que você está preocupado com X?”. A resposta pode parecer natural sem que isso demonstre compreensão humana do assunto.

## Kenneth Colby e PARRY

O professor menciona **Kenneth Colby** e o programa **PARRY**.

Como complemento histórico, PARRY foi desenvolvido no projeto liderado por Colby em Stanford, no início dos anos 1970. Era um programa que respondia a perguntas em linguagem natural e buscava simular processos de pensamento associados à paranoia. O projeto também realizou avaliações semelhantes ao teste de Turing. [Fonte: relatório do laboratório de IA de Stanford](https://i.stanford.edu/pub/cstr/reports/cs/tr/74/409/CS-TR-74-409.pdf).

Enquanto o roteiro conhecido de ELIZA simulava o diálogo de um terapeuta, PARRY representava o outro lado da interação: um interlocutor com um modelo de crenças e reações. São exemplos históricos de simulação de conversa, com objetivos diferentes.

Os detalhes apresentados pelo professor sobre PARRY ainda serão acrescentados conforme o relato da aula avançar.

## Machine Learning — Aprendizado de máquina

**Machine Learning** foi mencionado na aula. Os detalhes da explicação do professor ainda não foram relatados.

Como definição complementar para estudo, aprendizado de máquina é uma área da inteligência artificial em que modelos aprendem padrões a partir de dados para realizar tarefas, como prever valores ou classificar informações.

Na abordagem por regras de ELIZA, as transformações da conversa são definidas no programa. Em Machine Learning, o treinamento ajusta o modelo a partir de exemplos, em vez de exigir que o desenvolvedor escreva uma regra específica para cada situação.

**Exemplo didático:** um modelo pode ser treinado com mensagens identificadas como spam ou não spam para aprender padrões e classificar novas mensagens.

## Modelo de linguagem

**Modelo de linguagem** foi mencionado na aula. Os detalhes da explicação do professor ainda não foram relatados.

Como definição complementar para estudo, um modelo de linguagem representa padrões e probabilidades de sequências de elementos da linguagem. Pode, por exemplo, estimar quais palavras ou partes de palavras são mais prováveis em determinado contexto.

Em muitos modelos atuais, o texto é dividido em **tokens**, que podem corresponder a palavras, partes de palavras ou sinais. A geração de texto ocorre pela produção sucessiva de tokens, considerando o contexto disponível.

**Exemplo didático:** diante de “Hoje eu vou estudar...”, um modelo pode atribuir diferentes probabilidades a continuações como “Java” ou “programação”. Não existe uma única continuação obrigatória.

Modelos de linguagem podem ser treinados com técnicas de Machine Learning. ELIZA, por sua vez, é um exemplo de programa de conversa baseado em regras de transformação de texto. Um modelo de linguagem é um componente que pode ser usado em um assistente de conversa; os dois termos não são sinônimos.

## Geração de textos literários — provável referência a Racter

Matheus relata a menção a um programa utilizado para escrever livros, cujo nome foi ouvido inicialmente como “Hector”. Pela descrição, a referência provavelmente é **Racter**; a grafia ainda precisa ser confirmada no material da aula.

Racter é creditado no livro de prosa e poesia *The Policeman's Beard Is Half Constructed*, publicado em **1984**. Esse exemplo ilustra a exploração da geração de textos literários por computador. O registro bibliográfico, por si só, não permite concluir que toda a produção e edição do livro ocorreu sem participação humana. [Fonte: registro do livro no WorldCat](https://search.worldcat.org/title/311319022).

## IBM Watson

**IBM Watson** foi mencionado na aula. Os detalhes da explicação do professor ainda não foram relatados.

Como complemento histórico, o Watson desenvolvido para o programa de perguntas e respostas **Jeopardy!** utilizava a arquitetura **DeepQA**. Em **fevereiro de 2011**, venceu os campeões humanos **Ken Jennings** e **Brad Rutter**, tornando-se um marco público da aplicação de IA a perguntas em linguagem natural. [Fonte: história do Watson pela IBM](https://www.ibm.com/history/watson-jeopardy).

O sistema combinava análise de linguagem, busca de informações, geração de respostas candidatas e avaliação de evidências para selecionar uma resposta com um grau de confiança. Esse exemplo ajuda a acompanhar a evolução dos sistemas que lidam com linguagem humana. [Referência técnica: visão geral do projeto DeepQA](https://research.ibm.com/publications/building-watson-an-overview-of-the-deepqa-project).

## PLN — Processamento de Linguagem Natural

**PLN (Processamento de Linguagem Natural)** foi mencionado na aula. Os detalhes da explicação do professor ainda não foram relatados.

Como definição complementar para estudo, PLN é a área que desenvolve métodos para computadores processarem a linguagem humana, em texto ou fala. Entre suas aplicações estão tradução, classificação de textos, análise de sentimentos e sistemas de perguntas e respostas.

Os exemplos da aula ajudam a conectar esse conceito: **ELIZA** transforma mensagens por palavras-chave e regras; **Watson** combina análise de linguagem e avaliação de informações para responder a perguntas. **Modelos de linguagem** também podem ser usados em tarefas de PLN.

PLN pode utilizar regras programadas ou técnicas de Machine Learning. Processar linguagem e produzir respostas úteis não demonstra, por si só, compreensão humana ou consciência.

## Pontos para revisão

- **Teste de Turing:** proposta para avaliar o comportamento de uma máquina em uma interação.
- **John McCarthy:** creditado pela criação do termo inteligência artificial, presente na proposta de Dartmouth de 1955 para o encontro de 1956.
- **Programa de conversa por regras:** mecanismo que produz respostas a partir de padrões no texto.
- **ELIZA:** usa palavras-chave e regras para recombinar partes das mensagens, repetindo trechos e substituindo palavras na resposta.
- **PARRY:** programa associado a Kenneth Colby, criado para simular processos de pensamento relacionados à paranoia em uma conversa.
- **Machine Learning:** modelos aprendem padrões a partir de dados durante o treinamento.
- **Modelo de linguagem:** representa padrões de linguagem e pode estimar ou gerar continuações de texto a partir de um contexto.
- **Racter (identificação provável):** programa associado ao livro *The Policeman's Beard Is Half Constructed* (1984), um exemplo histórico de geração de textos literários por computador.
- **IBM Watson:** sistema de perguntas e respostas baseado em DeepQA, conhecido pela vitória no Jeopardy! em 2011.
- **PLN:** Processamento de Linguagem Natural; área voltada ao processamento da linguagem humana por computadores.
- Simular uma conversa convincente não demonstra, por si só, compreensão ou consciência.
- A conversa com computadores tem antecedentes históricos anteriores aos assistentes atuais.

## Questões para acompanhar

- Como a aula vai conectar esses antecedentes à inteligência artificial atual?

## Referências

1. **Turing, Alan M. (1950). *Computing Machinery and Intelligence*.** Artigo abordado na aula, no qual Turing apresenta o jogo da imitação e discute a inteligência das máquinas. [Ler o artigo](https://courses.cs.umbc.edu/471/papers/turing.html).
2. **Weizenbaum, Joseph (1966). *ELIZA—A Computer Program for the Study of Natural Language Communication Between Man and Machine*.** Referência sobre o funcionamento de ELIZA, programa abordado na aula. A leitura do artigo complementa a explicação do professor. [Ler o artigo](https://courses.cs.umbc.edu/331/papers/eliza.html).
3. **McCarthy, John; Minsky, Marvin; Rochester, Nathaniel; Shannon, Claude (1955). *A Proposal for the Dartmouth Summer Research Project on Artificial Intelligence*.** Referência complementar sobre a origem do termo e a proposta para o encontro de 1956. [Ler a proposta](https://www-formal.stanford.edu/jmc/history/dartmouth/dartmouth.html).
4. **Stanford Artificial Intelligence Laboratory. *Relatório do projeto de inteligência artificial — julho de 1973*.** Referência complementar sobre o projeto de Kenneth Colby e PARRY, na seção 2.7.1. [Ler o relatório](https://i.stanford.edu/pub/cstr/reports/cs/tr/74/409/CS-TR-74-409.pdf).
5. **Racter. *The Policeman's Beard Is Half Constructed* (1984).** Registro bibliográfico usado para contextualizar a provável referência da aula ao programa gerador de textos. [Consultar no WorldCat](https://search.worldcat.org/title/311319022).
6. **IBM. *Watson, Jeopardy! champion*.** Referência histórica sobre a vitória de Watson em 2011. [Ler](https://www.ibm.com/history/watson-jeopardy).
7. **IBM Research (2011). *Building Watson: An Overview of the DeepQA Project*.** Referência técnica complementar sobre a arquitetura de Watson. [Consultar](https://research.ibm.com/publications/building-watson-an-overview-of-the-deepqa-project).
