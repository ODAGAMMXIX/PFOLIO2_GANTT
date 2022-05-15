## PORTFOLIO ACADÊMICO - PROJETOS INTEGRADORES:

[SEMESTRE-01-2019.2 - *Python-Sqlite3 Web Scrapper - Monitor de Segurança Pública*](https://github.com/ODAGAMMXIX/PFOLIO1_DANZO) 

## [SEMESTRE-02-2020.1 - *Java-MySQL Stand Alone App - Gráfico de GANTT para Gestores*](https://github.com/ODAGAMMXIX/PFOLIO2_GANTT)

[SEMESTRE-03-2020.2 - *Java-Oracle - Gamificação, Monetização, Fidelização e Educação Financeira*](https://github.com/ODAGAMMXIX/PFOLIO3_VALCODE)

[SEMESTRE-04-2021.1 - *Java-Oracle API - Recrutamento por Geolocalização et al*](https://github.com/ODAGAMMXIX/PFOLIO4_JOBNATION)

[SEMESTRE-05-2021.2 - *Java-Pentaho-My(SQL)Server-MongoDB-Engajamento Estudantil*](https://github.com/ODAGAMMXIX/PFOLIO4_JOBNATION)

[SEMESTRE-06-2022.1 - *Python-MongoDB-LGPD opt-in opt-out ou Análise de Dados Eleitorais*](https://github.com/ODAGAMMXIX/PFOLIO4_JOBNATION)

***

<h1 align="center">[Java-MySQL Stand Alone App - Gráfico de GANTT para Gestores]</h1>

[![image](https://user-images.githubusercontent.com/54047352/142968066-33394dd3-a3a5-4f93-b410-e26d4af17ab1.png)](https://youtu.be/PNLVLtlSrio)

# **I - RESUMO DO PROJETO.**

Desafio: desenvolver uma aplicação visual emulando um Gráfico de GANTT para gerenciar o tempo de seus recursos humanos em projetos de desenvolvimento de softwares.

*Requisitos Funcionais* de um programa simples e funcional, de baixa manutenção para:

:arrow_right: **Gerenciar carga horária** por tarefa, por colaborador;

:arrow_right: **Distribuir uniformemente** as tarefas;

:arrow_right: Equilibrar a **relação custo x receita** dos projetos;

:arrow_right: Obter **previsibilidade de faturamento** e de ações comerciais;

:arrow_right: Gerenciar **tarefas e projetos possíveis**  por equipe;

:arrow_right: Permitir **um dia = unidade mínima de tempo**;

Escolhemos o ![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=java&logoColor=white) para praticar a linguagem ensinada no semestre.


**1) Arquitetura:**

<p align="center"> 
 
 <img src="https://user-images.githubusercontent.com/61089745/141656917-4c7bceb8-5ca6-4b42-8643-a97302af5c39.PNG">
 
</p>

<p align="center"> 
 <img width="560" height="670"  src="https://user-images.githubusercontent.com/61089745/141662816-3e911c89-d405-43c9-9daa-60db2f6c1ec3.png">
 
</p>



 **1.1) Diagrama de Casos de Uso.**
 
<p align="center">
 <img src="imgs//MicrosoftTeams-image%20(1).png">
</p>

**2) Modelagem Conceitual - Banco de Dados ![MySQL](https://img.shields.io/badge/mysql-%2300f.svg?style=for-the-badge&logo=mysql&logoColor=white).**

<p align="center">
 <img width="860" height="600" src="https://user-images.githubusercontent.com/61089745/141656940-7af9ae17-2bdd-4853-acbf-d6ee7405a267.PNG">
</p>



**3) Diagrama Lógico - ![MySQL](https://img.shields.io/badge/mysql-%2300f.svg?style=for-the-badge&logo=mysql&logoColor=white)**

<p align="center">
 <img src="https://user-images.githubusercontent.com/61089745/141656954-10700f13-b26b-4513-b51b-a5a20a4429e6.PNG">
</p> 




**4) Tela de Login.**

<p align="center">
 <img width="260" height="160" src="https://user-images.githubusercontent.com/61089745/141656980-681987ac-1e9d-4fe9-bceb-9d83434fb975.PNG">
</p>


**5) Tela de Cadastro do Projeto com CRUD**.

<p align="center">
<img src="https://user-images.githubusercontent.com/61089745/141657004-75236913-3a62-4006-990a-4f89f0475a45.PNG">
</p>



**6) Tela de Cadastro do colaborador com CRUD.**

<p align="center">
<img src="https://user-images.githubusercontent.com/61089745/141657014-8a8603a8-4cef-4aad-8837-1d5aa535aebd.PNG">
</p>



**7) Tela de Cadastro da Tarefa com CRUD**.

<p align="center">
<img src="https://user-images.githubusercontent.com/61089745/141657029-41bfd888-73e2-4c8c-a9d2-26a065968dc2.PNG">
 </p>
 
  
 <p align="center">
<img src="imgs/MicrosoftTeams-image.jpg">
</p>



**8) Gráfico de Gantt interativo** com seleção de projeto, cada tarefa com a data inicial e final e suas dependências (**clica-arrasta-redimensiona**).
 
<p align="center">
<img width="760" height="500"  src="https://user-images.githubusercontent.com/61089745/141657083-849746d2-3416-47e8-b1b2-66174241bb95.PNG">
 </p>
 
 
 
<p align="center">
<img src="https://user-images.githubusercontent.com/61089745/141659977-db3e03ec-18c6-4e8a-90c6-8d080fc8f9ff.PNG">
</p>


# II - TECNOLOGIAS ADOTADAS NA SOLUÇÃO 

:wrench: Linguagem ![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=java&logoColor=white): métodos *getters, setters* e o *serializable* - processo no qual a instância de um objeto é transformada em uma sequência de bytes, útil para enviar objetos pela rede, salvar em disco ou pra comunicação entre JVMs, com destaque para:

:orange_circle:  Classes, Objetos. Atributos e Métodos de Acesso;​

:orange_circle: Construtores, Getters and Setters;​

:orange_circle: Arrays, ArrayLists;​

:orange_circle: Polimorfismo;​

:orange_circle: C.R.U.D.;​

:orange_circle:  Java Database Conectivity (JDBC);​

:orange_circle: Data Access Object (DAO);​

:orange_circle: Tratamento de Erros (Try & Catch & Finally);​

#
## Bibliotecas ![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=java&logoColor=white) e Classes, por camada: 
#

<h3 align="center">VIEW</h3>

:orange_circle: ***Util***: [*"Contains the collections framework, legacy collection classes, event model, date and time facilities, internationalization, and miscellaneous utility classes (a string tokenizer, a random-number generator, and a bit array)"*](https://docs.oracle.com/javase/8/docs/api/java/util/package-summary.html).


:orange_circle: ***Calendar***: produz valores típicos de calendário, com formatação de data e hora e dependência no gráfico de Gantt.
<p align="center">
<img src="https://user-images.githubusercontent.com/61089745/141659932-dcffb9a5-21fe-48b8-869d-d3da453b7d90.PNG">
 
 
 <p align="center">
<img src="https://user-images.githubusercontent.com/61089745/141659947-761d230f-4b7b-4def-94eb-ed2a676ca744.PNG">
</p>


:orange_circle:  ***Nebula***: gera o gráfico de GANTT personalizável, permite a interação do usuário (clica-arrasta-redimensiona) e interação de dependência.

<p align="center">
<img src="https://user-images.githubusercontent.com/61089745/141661748-853192b1-eb41-4289-8833-2fe22a038937.PNG">
</p>


:orange_circle:  ***JavaFx***: para aplicações desktop (front-end), com telas para exibição CRUD para classes Tarefa, Projeto e Funcionário.

 <p align="center">
<img width="760" height="500" src="https://user-images.githubusercontent.com/61089745/141662165-caf52ddc-0949-4b67-92d0-59bc7fb3d766.PNG">
</p>



<p align="center">
<img width="760" height="500" src="https://user-images.githubusercontent.com/61089745/141662854-8bcebc08-1a5f-4cbb-b200-9bc2c57e8858.PNG">
</p>

<p align="center">
<img width="560" height="400" src="imgs/MicrosoftTeams-image%20(7).png">
</p>


<h3 align="center">CONTROLLER</h3>

***Classes*** Projeto, Tarefa e Cadastros, com 2 classes *Controller* para cada entidade (.java e .fxml de conexão com o javaFx ao front-end). 

 <p align="center">
<img src="https://user-images.githubusercontent.com/61089745/141661946-5d4840d6-5ee6-4b17-b782-789d3cbadacb.PNG">
 </p>
 
 
<p align="center">
<img src="imgs/MicrosoftTeams-image%20(6).png">
</p>


<h3 align="center">SERVICE</h3>

***Classes*** TarefaService e CadastroService com métodos na interface DAO.

<p align="center">
<img src="https://user-images.githubusercontent.com/61089745/141662039-8927ae32-78c8-43e3-b233-13e15c97767e.PNG">
</p>


<h3 align="center">SERVICE IMPLEMENTS</h3>

***Classes*** Tarefa e Cadastro, com métodos definidos no Service com interface ***DAO*** usando o ***JDBC***.

<h3 align="center">JAVA DATABASE CONECTIVITY (JDBC)</h3>

:orange_circle:  ***Conector*** com instruções SQL para bancos de dados relacionais, definido pela IBM como [*Java™ database connectivity (JDBC) is the JavaSoft specification of a standard application programming interface (API) that allows Java programs to access database management systems. The JDBC API consists of a set of interfaces and classes written in the Java programming language.*](https://www.ibm.com/docs/en/informix-servers/12.10?topic=started-what-is-jdbc)

<p align="center">
<img src="https://user-images.githubusercontent.com/61089745/141662145-fe473c43-cd2f-467e-98cc-0d08ac044fd7.png">
</p>

<h3 align="center"> Data Access Object (DAO) </h3>

:orange_circle:  Desin Pattern adaptável, utilizado para conexão com, e CRUD no, Banco de Dados, assim definido pela Oracle: [*The DAO pattern allows data access mechanisms to change independently of the code that uses the data.*](https://www.oracle.com/java/technologies/data-access-object.html)

<p align="center">
<img src="https://user-images.githubusercontent.com/61089745/141662133-a50122f1-c75f-4d30-b7a7-942af643caa7.PNG">
</p>

:wrench: SGBD: ![MySQL](https://img.shields.io/badge/mysql-%2300f.svg?style=for-the-badge&logo=mysql&logoColor=white).
 
 <p align="center">
<img src="https://user-images.githubusercontent.com/61089745/141662257-f06ecc37-cb7f-4212-a92e-0aaef1580655.png">
</p>

:wrench: IDE ![Eclipse](https://img.shields.io/badge/Eclipse-FE7A16.svg?style=for-the-badge&logo=Eclipse&logoColor=white).

:wrench: IDE ![Eclipse](https://img.shields.io/badge/Eclipse-FE7A16.svg?style=for-the-badge&logo=Eclipse&logoColor=white).

:wrench:  metodologia: Scrum.

Foram testadas e abandonadas:

:wrench: SGBD: ![Postgres](https://img.shields.io/badge/postgres-%23316192.svg?style=for-the-badge&logo=postgresql&logoColor=white).

:wrench: Biblioteca Gantt / JFreeCharts.

<p align="center">
<img src="imgs/MicrosoftTeams-image%20(8).png">
</p>

 
 
# III - CONTRIBUIÇÕES INDIVIDUAS/PESSOAIS 

<h3 align="center">PESQUISA E DESENVOLVIMENTO</h3>

 - Atuei como **agente de pesquisa e desenvolvimento** (*R&D*) e segundo *Scrum Master* e segundo *Product Owner*.

 - **Descobri a biblioteca** ***Nebula*** e ensinei os colegas a integrá-la ao código (**possibilitou a entrega de gráfico INTERATIVO**).

 <p align="center">
<img src="imgs/MicrosoftTeams-image9.png">
</p>


<h3 align="center">ADMINISTRADOR DE BANCO DE DADOS</h3>
 - **Fui um dos DBA do projeto**, administrando o banco de dados com as seguintes tabelas:

<h4 align="center">TABELA "TAREFA"</h4> 

<p align="center">
<img src="imgs/MicrosoftTeams-image%20(2).png">
</p>


<h4 align="center">TABELA "PROJETO"</h4> 

<p align="center">
<img src="imgs/MicrosoftTeams-image%20(3).png">
</p>


<h4 align="center">TABELA "USUÁRIO"</h4> 

<p align="center">
<img src="imgs/MicrosoftTeams-image%20(4).png">
</p>



 - Realizei as **Apresentações Comerciais** e editei o README.MD em todas as SPRINTS e editei os vídeos;

# IIII - APRENDIZADOS EFETIVOS

:heavy_check_mark:  Tratamento de EVENTOS (***Event Listeners***) (https://docs.oracle.com/javase/tutorial/uiswing/events/intro.html), melhor definidos como "*An event can be defined as changing the state of an object or behavior by performing actions. Actions can be a button click, cursor movement, keypress through keyboard or page scrolling, etc.*" (https://www.geeksforgeeks.org/event-handling-in-java/)
 
<p align="center">
<img src="imgs/MicrosoftTeams-image8.png">
 </p>
 


:heavy_check_mark: Desafios de uma aplicação Desktop, direcionados pelas limitações da biblioteca *Nebula*, a mais versátil e apropriada para os requisitos funcionais do projeto; porém, incompatível com o padrão web.


:heavy_check_mark: administração e desenvolvimento de banco de dados (comandos básicos INSERT, UPDATE, DELETE, SELECT, ALTER TABLE etc.), em auto-aprendizado, por meio da documentação do ![MySQL](https://img.shields.io/badge/mysql-%2300f.svg?style=for-the-badge&logo=mysql&logoColor=white).
 
<p align="center">
<img src="https://user-images.githubusercontent.com/61089745/141656954-10700f13-b26b-4513-b51b-a5a20a4429e6.PNG">
 </p>
 
 
:heavy_check_mark: Introdução ao estudo autônomo do ![GitHub](https://img.shields.io/badge/github-%23121011.svg?style=for-the-badge&logo=github&logoColor=white), necessário para garantir o trabalho contínuo da equipe em isolmento social;

:heavy_check_mark: ***soft skills:*** Pesquisando, administrando banco de dados e vendando a solução como *Product Owner*, com o início da Pandemia do COVID-19, foi necessária a negoiação individual com os colegas e professores para consolidar o projeto, exigida a imersão técnica durante o isolamento social.
