# Aula 01 — Introdução

**Bootcamp:** DIO — Itaú: Java com Inteligência Artificial  
**Bloco:** Introdução ao Java e seu Ambiente de Desenvolvimento  
**Aula no bloco:** 1  
**Professor:** José Luiz Abreu Cardoso Junior (conhecido como Junior)  
**Fonte:** relatos de Matheus sobre a aula.

## Conteúdo da aula

## Apresentação do professor

Junior apresenta sua trajetória educacional: curso técnico na cidade onde vivia, ensino superior em uma cidade próxima e pós-graduação.

Segundo o relato, estudou ou trabalhou com **Java, Kotlin, Scala, Python, Delphi e .NET**, e passou por empresas como **PicPay, Embraer, AMI, Caju e RD Station**, entre outras. Essas informações são registradas conforme a aula, sem verificação externa de seu currículo. .NET é uma plataforma de desenvolvimento, não uma linguagem específica.

## Conteúdo programático anunciado

- Conceitos básicos.
- Programação orientada a objetos.
- Gerenciamento de sessões — expressão relatada, a confirmar no material; não foi substituída por outro tópico.
- I/O: entrada e saída.
- Gerenciamento de dependências.
- Técnicas avançadas.
- Padrões e persistência.

A lista registra o que foi informado até este momento, sem presumir que seja a grade completa do bootcamp.

## Origem do Java: Green Project e StarSeven

Na narrativa da aula, o projeto começa na **Sun Microsystems**, em **1991**, com o **Green Team**, que explorava software para dispositivos de uso doméstico e sua interação. **James Gosling** aparece como uma figura central no desenvolvimento da linguagem.

O professor menciona a sequência de nomes **GreenTalk → Oak → Java**. A documentação histórica confirma que Oak foi projetada por Gosling para aplicações embarcadas de eletrônicos de consumo. O detalhe sobre GreenTalk foi registrado como conteúdo relatado da aula. [Referência: prefácio da especificação da linguagem](https://docs.oracle.com/javase/specs/jls/se6/html/j.preface.html).

O **StarSeven (Star7 ou *7)** é apresentado como um protótipo de dispositivo portátil para interação com equipamentos domésticos. A busca por portabilidade da linguagem aparece como uma ideia importante que continuou além do projeto inicial. O relato também associa o personagem **Duke**, mascote do Java, a essa fase.

## Observações de Matheus sobre o vídeo do StarSeven

[Vídeo indicado na aula — Star7](https://www.youtube.com/watch?v=1CsTH9S79qI).

Matheus assistiu ao vídeo e destacou:

- A montagem inicial com peças de outros dispositivos, que lhe lembrou um “Frankenstein”.
- Interação com televisão e videocassete (VCR), incluindo canais e volume.
- Comunicação entre dois dispositivos próximos.
- Um quadro branco para escrever e compartilhar conteúdo.

A comunicação entre dispositivos lembrou a Matheus recursos atuais como AirDrop. Essa é uma **analogia pessoal**, não uma afirmação de que utilizavam a mesma tecnologia ou os mesmos protocolos. O vídeo não pôde ser acessado pela ferramenta de pesquisa; as observações acima vêm do relato de quem o assistiu.

## Da eletrônica de consumo à web

Segundo a aula, o crescimento da web em torno de **1994** abriu outra possibilidade para a linguagem. O professor descreve o navegador **WebRunner**, posteriormente chamado **HotJava**, e o uso de **applets** para tornar páginas mais interativas.

Matheus sintetizou a ideia assim: **em um contexto de páginas mais estáticas, os applets traziam dinamicidade**. Applets eram programas Java executados em um ambiente do navegador; são uma referência histórica, não uma proposta para desenvolver aplicações web atuais.

No relato, Oak precisou mudar de nome por um conflito de marca. A associação entre **Java** e café também foi apresentada pelo professor; a história específica de que um café mais forte motivava os programadores não foi confirmada nestas anotações.

O lançamento público de Java ocorre em **1995**, e o **JDK 1.0** é lançado em **1996**. O JDK reúne ferramentas para desenvolvimento, incluindo compilação. [Histórico de lançamentos](https://ops.java/releases/).

## Portabilidade: escreva uma vez, execute em qualquer lugar

A expressão **Write Once, Run Anywhere** resume o objetivo de portabilidade. Em termos simplificados, código Java pode ser compilado para **bytecode**, executado por uma **JVM** compatível na plataforma de destino.

Isso não significa que qualquer programa funcione sem ajustes em qualquer equipamento: versões, dependências e recursos específicos de plataforma também importam.

## Evolução das versões e suporte

O professor relaciona a evolução da linguagem à preocupação com compatibilidade, segurança e estabilidade. A explicação de que essa preocupação teria reduzido a velocidade das mudanças foi percebida por Matheus como uma hipótese, não como uma causa histórica comprovada.

### Ajuste sobre LTS e versões intermediárias

O ritmo de **lançamentos semestrais** começa com o **JDK 10, em 2018**. Não é preciso atribuir essa mudança diretamente ao momento da aquisição da Sun pela Oracle. [Fonte: anúncio do Java 10](https://blogs.oracle.com/java/introducing-java-se-10).

**LTS (Long-Term Support)** significa **suporte de longo prazo**, oferecido por fornecedores para determinadas versões. As versões **8, 11, 17, 21 e 25** são classificadas como LTS pela Oracle. O prazo e as condições de suporte dependem do fornecedor. [Roadmap da Oracle](https://www.oracle.com/europe/java/technologies/java-se-support-roadmap.html).

Versões **não LTS** também são lançamentos de produção: não são simplesmente versões experimentais. Funcionalidades de prévia ou incubação podem aparecer em lançamentos, mas essa condição é específica do recurso, não determinada apenas pelo rótulo LTS.

O Java **25** foi a versão citada na aula. Isso não significa que seja a versão mais recente na data em que a gravação está sendo estudada.

## Vocabulário

Para traduzir **features**, utilizar **funcionalidades**, **recursos** ou **novidades**, conforme a frase. Exemplo: “a nova versão acrescenta funcionalidades à linguagem”.

## Java no mercado: visão apresentada na aula

O professor menciona o uso de Java em empresas como Netflix, PayPal, Airbnb, Slack e LinkedIn. A lista é registrada como relato da aula, sem uma auditoria das stacks atuais dessas empresas.

Matheus relaciona a continuidade do Java à própria oferta deste bootcamp pelo Itaú. O interesse é compreender como uma linguagem com décadas de história continua evoluindo e sendo utilizada em sistemas de negócio.

## Pontos para revisão

- Java tem raízes em um projeto para eletrônicos de consumo.
- StarSeven ajuda a visualizar o contexto de experimentação do Green Project.
- Oak antecede o nome Java; a web abriu uma nova aplicação para a linguagem.
- Applets trouxeram interatividade às páginas daquele período.
- JVM e bytecode são conceitos centrais para compreender portabilidade.
- LTS se refere à política de suporte; versões não LTS não são, por definição, experimentais.
- Compatibilidade e evolução precisam ser consideradas juntas ao estudar a linguagem.

## Referências

- [Vídeo Star7 indicado na aula](https://www.youtube.com/watch?v=1CsTH9S79qI).
- [Prefácio da especificação Java — origem de Oak](https://docs.oracle.com/javase/specs/jls/se6/html/j.preface.html).
- [The Java Language Environment — documentação histórica](https://www.oracle.com/java/technologies/language-environment.html).
- [Histórico de lançamentos do JDK](https://ops.java/releases/).
- [Java 10 e a cadência semestral](https://blogs.oracle.com/java/introducing-java-se-10).
- [Oracle Java SE Support Roadmap](https://www.oracle.com/europe/java/technologies/java-se-support-roadmap.html).
