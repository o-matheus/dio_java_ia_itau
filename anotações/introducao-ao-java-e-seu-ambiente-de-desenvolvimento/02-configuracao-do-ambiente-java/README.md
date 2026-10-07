# Aula 02 — Configuração do Ambiente Java

**Bootcamp:** DIO — Itaú: Java com Inteligência Artificial  
**Bloco:** Introdução ao Java e seu Ambiente de Desenvolvimento  
**Aula no bloco:** 2  
**Professor:** José Luiz Abreu Cardoso Junior (Junior)  
**Fonte:** texto de apoio fornecido no curso e relato de Matheus.

## Objetivo

Instalar o **JDK (Java Development Kit)** e verificar sua utilização no ambiente de desenvolvimento. O material apresenta instalação direta no Windows, instalação do Amazon Corretto por APT no Linux e gerenciamento de versões com SDKMAN!.

O texto menciona vídeos por sistema operacional, mas as três opções descritas são uma para Windows e duas para Linux. O relato de Matheus confirma o foco nesses sistemas. As instruções abaixo registram o material recebido, sem execução ou instalação nesta máquina.

## Windows — Oracle JDK pelo instalador

1. Acessar os [downloads da Oracle](https://www.oracle.com/java/technologies/downloads/#java21) e escolher o JDK 21 para Windows.
2. Executar o instalador e identificar a pasta de instalação, por exemplo `C:\Program Files\Java\jdk-21`.
3. Criar a variável de ambiente `JAVA_HOME` apontando para essa pasta.
4. Adicionar `%JAVA_HOME%\bin` ao `Path`.
5. Abrir um terminal novo e verificar:

```sh
java -version
javac -version
```

Segundo o material, Junior descreve esse caminho como menos flexível para alternar versões, mas adequado a um ambiente que utiliza uma versão fixa.

## Linux — Amazon Corretto por APT

Este caminho do material utiliza **APT**, portanto é voltado a distribuições compatíveis, como Debian e Ubuntu; não é um comando universal para todo Linux.

Importar a chave e adicionar o repositório:

```sh
wget -O - https://apt.corretto.aws/corretto.key | sudo gpg --dearmor -o /usr/share/keyrings/corretto-keyring.gpg
echo "deb [signed-by=/usr/share/keyrings/corretto-keyring.gpg] https://apt.corretto.aws stable main" | sudo tee /etc/apt/sources.list.d/corretto.list
```

Atualizar os índices de pacotes e instalar:

```sh
sudo apt-get update
sudo apt-get install -y java-21-amazon-corretto-jdk
java -version
javac -version
```

Os comandos são reproduzidos do texto fornecido. Antes de uma instalação futura, conferir as instruções atuais do fornecedor.

## SDKMAN! — gerenciamento de versões

Segundo o material, essa é a opção utilizada e recomendada por Junior para alternar versões com facilidade. O texto cita Linux e macOS, além de WSL ou Git Bash no Windows; detalhes de compatibilidade devem ser conferidos antes da instalação.

Comandos apresentados:

```sh
curl -s "https://get.sdkman.io" | bash
source "$HOME/.sdkman/bin/sdkman-init.sh"
sdk list java
```

Selecionar na lista o identificador da versão desejada e instalar:

```sh
sdk install java <identificador-exato-da-lista>
java -version
javac -version
```

O texto utiliza `21.0.11-amzn` como exemplo. Esse identificador não foi verificado como disponível e não deve ser tratado como fixo: consultar `sdk list java`.

## Caminho utilizado por Matheus — macOS e IntelliJ IDEA

Matheus já teve contato com Java em seus estudos e utiliza dois caminhos:

- Download do Java/JDK pelo site da Oracle para utilização no computador e no terminal.
- Download e seleção de JDK pelo IntelliJ IDEA para desenvolver e testar projetos.

A versão efetivamente configurada ainda não foi confirmada. Matheus considera utilizar **Java 21** para acompanhar a aula, além de eventualmente manter **Java 25** para outros estudos.

### JDK do projeto e Java do terminal

O JDK selecionado no IntelliJ pode ser diferente daquele encontrado pelo terminal. Baixar ou selecionar um JDK na IDE não significa que o `PATH` do sistema será alterado.

- **SDK do projeto:** JDK escolhido para o projeto na IDE.
- **JAVA_HOME:** variável que aponta para o diretório do JDK utilizado por ferramentas que a consultam.
- **PATH:** define onde o terminal procura executáveis, como `java` e `javac`.

Para conferir o ambiente no macOS:

```sh
/usr/libexec/java_home -V
java -version
javac -version
which java
echo "$JAVA_HOME"
```

A lista retornada por `java_home` depende dos JDKs instalados e reconhecidos pelo macOS; não substitui a conferência da configuração do projeto na IDE.

### Exemplo de seleção no terminal

Se houver um JDK 21 reconhecido pelo macOS, um exemplo para a sessão atual do zsh é:

```sh
export JAVA_HOME="$(/usr/libexec/java_home -v 21)"
export PATH="$JAVA_HOME/bin:$PATH"
java -version
javac -version
```

Esse exemplo é um complemento às anotações, não uma alteração realizada no computador. Uma configuração persistente pode ser feita no arquivo de inicialização apropriado do shell, considerando as configurações já existentes.

## Escolha da versão para acompanhar o curso

O material utiliza **JDK 21**. Para reduzir diferenças entre os exemplos e o ambiente de estudo, faz sentido selecionar essa versão no projeto do curso. Outros projetos podem utilizar outro JDK.

Ter um JDK mais recente não significa que todo projeto ou dependência terá o mesmo comportamento. Além do JDK, verificar a versão de linguagem e as configurações de compilação utilizadas pelo projeto.

## Checklist de revisão

- [ ] Confirmar qual JDK está selecionado no projeto do IntelliJ.
- [ ] Decidir se o projeto do curso utilizará JDK 21.
- [ ] Conferir `java -version` e `javac -version` no terminal.
- [ ] Verificar se `JAVA_HOME` e `PATH` estão coerentes com o uso desejado.

## Referências do material

- [Downloads do Oracle JDK](https://www.oracle.com/java/technologies/downloads/#java21).
- SDKMAN!: endereço de instalação citado no texto — `https://get.sdkman.io`.

Os passos do curso foram registrados a partir do material fornecido; não houve instalação nem verificação das configurações locais nesta aula.
