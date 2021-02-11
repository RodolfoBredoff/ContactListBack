# PUC Minas - Sistemas de Informação - Laboratório de Sistemas de Informação

<p> Este repositório foi criado para um trabalho universitário sobre o framework Angular, no qual construímos um sistema de lista de contatos.

<p> O usuário pode favoritar, excluir, adicionar e visualizar seus contatos contemplando as ações de CRUD como solicitado.
  
  O Backend é foi desenvolvido em Java utilizando o Framework Spring Boot. Utilizamos também duas APIs como fonte:
  
  > https://randomuser.me : Para gerar usuários fictícios e aleatórios;
  
  > https://www.countryflags.io/ : Para obter as bandeiras dos países origem de cada contato ;

 > <a href="https://github.com/Neemias-S/ContactList" target="_blank">`Repositório Backend`</a> : Projeto em Spring

## Como rodar o projeto:

 1 : Instalação da JDK : <a href="https://www.oracle.com/java/technologies/javase/javase-jdk8-downloads.html" target="_blank">Download da JDK 8</a>

 2 : Instalação do Maven : <a href="https://maven.apache.org/download.cgi" target="_balnk">Download Maven</a>
  
 3 : Agora é necessário configurar as variáveis de ambiente com o caminho dos diretórios em que você acabou de descompactar/instalar, tanto do Java (JDK) quanto o Maven. Abra o Editor de variáveis de ambiente do seu SO e adicione as duas variáveis a seguir:
 
 Adicione as variáveis abaixo: 
  > JAVA_HOME : `C:\Program Files\Java\jdk1.8.0_251` (Adicione o caminho da pasta jdk1.8.0_251 instalada anteriormente)
  > Maven_Home : `C:\apache-maven-3.6.3` (Adicione o caminho da pasta apache-maven-3.6.3 baixada anteriormente )
  
 Adicione á variável PATH, já existente,  a variável abaixo, que faz referência a cirada anteriormente mas agora o alvo é a pasta bin:
  >  %Maven_Home%\bin

 4 : Para clonar o projeto, entre no diretório desejado, abra o prompt de comando e execute : `git clone https://github.com/Neemias-S/ContactListBack.git`

 5 : Agora vamos instalar o PostgresSQL. O projeto está configurado para ouvir a porta 5432, com as informações de autenticação abaixo:
    
    > usuario : postgres
    > senha : postgres
 
  Faça a instalação com base nos dados acima e acessando esste link : <a href="https://www.postgresql.org/download/windows/" target="_blank"> Download Postgres </a>

 6 : Abra o prompt de comando no diretório que acabou de clonar e execute : `mvn spring-boot:run`

 7 : Prontinho, agora basta seguir os passos do projeto front end seguindo este link : <a href="https://github.com/Neemias-S/ContactList" target="_blank"> Projeto Angular </a>
