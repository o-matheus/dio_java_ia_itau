# Aula 03 — Aplicações práticas da Engenharia de Prompts

**Bootcamp:** DIO — Itaú: Java com Inteligência Artificial  
**Bloco:** Introdução à Engenharia de Prompts  
**Aula no bloco:** 3  
**Fonte:** relatos de Matheus sobre a aula.

## Conteúdo da aula

## Resumo da aula

A professora demonstra duas aplicações de engenharia de prompts: **planejamento de metas pessoais** e **preparação para entrevistas de emprego**. Para cada uma, apresenta um template, um exemplo preenchido e sua execução em um chatbot. Ao final, aborda vieses, alucinações, privacidade, segurança e considerações éticas.

As anotações partem do relato de Matheus. Os templates abaixo são reconstruções para estudo, não transcrições literais.

## Planejamento de metas pessoais

O pedido reúne uma tarefa inicial, informações da pessoa e requisitos para a resposta.

### Template reconstruído

```text
Crie um plano detalhado de desenvolvimento pessoal para os próximos [período],
considerando as seguintes características:

- Foco: [o que desejo desenvolver]
- Objetivos: [o que desejo alcançar]
- Disponibilidade de tempo: [horas por dia ou por semana]
- Recursos financeiros: [orçamento disponível]

Estruture o plano com:
1. Metas específicas e mensuráveis.
2. Recursos de aprendizado dentro do orçamento disponível.
3. Cronograma semanal adaptado à disponibilidade.
4. Métricas de acompanhamento para medir o progresso.
5. Possíveis obstáculos e estratégias de superação.
```

O exemplo da professora envolve **aprender a criar peças de biscuit**. O período, o orçamento e as demais informações preenchidas não foram relatados.

### Relação com os elementos da aula anterior

| Elemento | Aplicação no template |
| --- | --- |
| Instrução inicial | Criar um plano de desenvolvimento pessoal |
| Contexto e dados de entrada | Foco, objetivos, período, tempo disponível e orçamento |
| Requisitos da resposta | Metas, recursos, cronograma, métricas e obstáculos |

Pedir esses componentes define o conteúdo esperado; também seria possível indicar um formato específico, como tabela ou lista semanal. O template não precisa conter todos os cinco elementos estudados anteriormente para ser útil.

## Preparação para entrevistas de emprego

A segunda aplicação é uma **simulação de entrevista**, orientada por informações como:

- Perfil da pessoa candidata.
- Descrição da vaga.
- Empresa.
- Nível de senioridade.

O exemplo envolve uma pessoa **arquiteta**, com conhecimentos em programas específicos da área. Os nomes dos programas, o prompt completo e os detalhes da dinâmica não foram fornecidos e não foram presumidos.

Assim como no planejamento pessoal, a estrutura combina tarefa, informações relevantes e indicação do resultado esperado, agora voltados à preparação profissional.

## Usar a IA para melhorar o próprio prompt

Matheus destaca que é possível pedir ajuda à IA para construir ou refinar um prompt antes de utilizá-lo na tarefa final. Isso pode ser feito em um chatbot, sem exigir um agente.

**Exemplo complementar criado para estas anotações:**

```text
Quero construir um prompt para [objetivo].
Estas são as informações que já tenho: [informações].
Identifique o que falta e faça perguntas para esclarecer o pedido.
Depois, proponha um prompt com instrução, contexto, dados de entrada
e formato de saída. Não execute a tarefa final ainda.
```

Revisar esse prompt continua sendo importante: a IA pode sugerir informações ou requisitos que não correspondem à intenção da pessoa.

## Cuidados discutidos na aula

### Vieses no pedido

A professora compara duas perguntas sobre café:

```text
Pergunta que já pressupõe uma conclusão:
Por que o café é a melhor bebida de todos os tempos?

Pergunta que abre espaço para comparação:
Quais são as vantagens e desvantagens do café em comparação com outras bebidas?
```

O primeiro pedido direciona a resposta a defender uma preferência. O segundo permite considerar diferentes aspectos.

**Complemento:** um pedido persuasivo pode ser intencional, mas não deve ser confundido com uma análise imparcial. Reformular o prompt ajuda a reduzir o direcionamento; não elimina todos os vieses do modelo ou das fontes utilizadas.

### Alucinações

A aula aborda respostas que apresentam informações falsas, inexistentes ou duvidosas como se fossem válidas. No relato aparecem exemplos como referências a bibliotecas inexistentes, funções inventadas e código inadequado ao pedido.

**Complemento:** “alucinação” não pressupõe uma intenção de enganar. Além disso, nem todo erro de código é uma alucinação; pode ser um erro de lógica ou implementação. Referências devem ser conferidas e código deve ser validado antes do uso.

### Privacidade e segurança

Matheus registra o cuidado de anonimizar dados ao utilizar IA.

**Esclarecimento:** enviar dados a uma ferramenta não significa automaticamente torná-los públicos. O tratamento depende do serviço, das configurações e de suas políticas. Ainda assim, é útil fornecer apenas os dados necessários e retirar informações identificáveis ou confidenciais quando não forem essenciais.

Substituir um nome não garante anonimização: profissão, local, datas e outros detalhes combinados também podem identificar uma pessoa. Não foram verificadas políticas de uma ferramenta específica nesta anotação.

### Ética e inclusão

Segundo o relato, a professora apresenta como objetivos respostas imparciais, seguras, confiáveis, respeitosas da privacidade, transparentes, responsáveis e inclusivas.

**Interpretação complementar de inclusão:** nesse contexto, pode significar evitar linguagem discriminatória, não presumir que todas as pessoas tenham as mesmas condições e considerar diferentes necessidades e experiências. Exemplos incluem adaptar um plano a recursos limitados, utilizar linguagem acessível e considerar necessidades de acessibilidade.

Democratizar o acesso à IA é um tema relacionado, mas mais amplo. Não há informação suficiente para afirmar que esse era o sentido específico pretendido pela professora.

## Vocabulário: alternativas a “contexto” e “escopo”

As palavras não são sempre equivalentes; a escolha depende do que se quer expressar:

| Intenção | Alternativas possíveis |
| --- | --- |
| Informações que situam o pedido | Cenário, situação, circunstâncias, informações de base |
| Tema tratado | Assunto, tema, tópico |
| Limites do trabalho | Abrangência, delimitação, limites da tarefa |
| Resultado desejado | Objetivo, finalidade, propósito |
| Direção da abordagem | Foco, perspectiva, recorte |

Para a frase “levando em consideração o que queremos abordar”, alternativas naturais são **“considerando o objetivo do pedido”**, **“de acordo com o assunto”** ou **“conforme o foco da tarefa”**.

## Pontos para revisão

- Templates ajudam a organizar tarefa, informações e resultado esperado.
- Tempo, orçamento e objetivos tornam um plano pessoal mais adequado à situação.
- Perfil e descrição da vaga orientam uma simulação de entrevista.
- A própria IA pode ajudar a identificar informações ausentes e refinar um prompt.
- Perguntas podem induzir conclusões; comparações abertas favorecem uma análise mais equilibrada.
- Clareza no prompt não garante ausência de erros ou alucinações.
- Privacidade envolve limitar dados compartilhados e considerar possíveis identificadores.
- Inclusão pode envolver linguagem, acessibilidade e atenção a diferentes condições das pessoas.
