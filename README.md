
# PORTFOLIO - LIST OF ACADEMIC PROJECTS:

[PROJECT-SEMESTRE-01-2019.2 - *Python WebBot - Scrapping - Public Safety Monitor*](https://github.com/ODAGAMMXIX/PFOLIO1_DANZO) 

[PROJECT-SEMESTRE-02-2020.1 - *Java Stand Alone GANTT Chart tool*](https://github.com/ODAGAMMXIX/PFOLIO2_GANTT)

[PROJECT-SEMESTRE-03-2020.2 - *Java Web App - Benefits According Credit Score*](https://github.com/ODAGAMMXIX/PFOLIO3_VALCODE) 
#
#
#
![Fatec-logo-9710C99301-seeklogo com](https://user-images.githubusercontent.com/61067500/81480184-54e16600-91fe-11ea-86d6-dbae737cefa1.png)   <img align="left" width="100" height="100" src="https://user-images.githubusercontent.com/61067500/81479704-434a8f00-91fb-11ea-8d71-0cf029bc25ab.png">

###**I - RESUMO DO PROJETO.**

Empresa parceira "NECTO" figurou como cliente.

Desafio: desenvolver uma aplicação visual emulando um Gráfico de GANTT para gerenciar o tempo de seus recursos humanos em projetos de desenvolvimento de softwares.

Programa simples e funcional, de baixa manutenção para:

* **Gerenciar carga horária** por tarefa, por colaborador;
* **Distribuir uniformemente** as tarefas;
* Equilibrar a **relação custo x receita** dos projetos;
* Obter **previsibilidade de faturamento** e de ações comerciais;
* Gerenciar **tarefas e projetos possíveis**  por equipe;
* **Limitar a quantidade de horas trabalhadas** por colaborador;
* Permitir **um dia = unidade mínima de tempo**;
* **Exportar arquivo**;
* Gerar Relatório;

**ARQUITETURA**
 
**1- Camadas:**
 
 ![Estrutura](https://user-images.githubusercontent.com/61089745/141656917-4c7bceb8-5ca6-4b42-8643-a97302af5c39.PNG)
 
 ![image](https://user-images.githubusercontent.com/61089745/141662816-3e911c89-d405-43c9-9daa-60db2f6c1ec3.png)

**2- Modelagem Conceitual - Banco de Dados MYSQL.**

![ModelagemConceitual](https://user-images.githubusercontent.com/61089745/141656940-7af9ae17-2bdd-4853-acbf-d6ee7405a267.PNG)

**3- Diagrama Lógico - MYSQL**

![ModelagemBD](https://user-images.githubusercontent.com/61089745/141656954-10700f13-b26b-4513-b51b-a5a20a4429e6.PNG)

**4- Tela de Login.**

![Login](https://user-images.githubusercontent.com/61089745/141656980-681987ac-1e9d-4fe9-bceb-9d83434fb975.PNG)

**5- Tela de Cadastro do Projeto com CRUD**.

![CadastroProjetosII](https://user-images.githubusercontent.com/61089745/141657004-75236913-3a62-4006-990a-4f89f0475a45.PNG)

**6- Tela de Cadastro do colaborador com CRUD.**

![CadastroFuncionarios](https://user-images.githubusercontent.com/61089745/141657014-8a8603a8-4cef-4aad-8837-1d5aa535aebd.PNG)

**7- Tela de Cadastro da Tarefa com CRUD**.

![CadastroTarefa](https://user-images.githubusercontent.com/61089745/141657029-41bfd888-73e2-4c8c-a9d2-26a065968dc2.PNG)

**8- Gráfico de Gantt interativo** com selação de projeto, cada tarefa com a data inicial e final e suas dependências (**clica-arrasta-redimensiona**).

![Gantt2](https://user-images.githubusercontent.com/61089745/141657083-849746d2-3416-47e8-b1b2-66174241bb95.PNG)

![ShowGantt](https://user-images.githubusercontent.com/61089745/141659977-db3e03ec-18c6-4e8a-90c6-8d080fc8f9ff.PNG)


### II - TECNOLOGIAS ADOTADAS NA SOLUÇÃO 

- linguagem: ***Java*** (métodos getters, setters e o serializable - processo no qual a instância de um objeto é transformada em uma sequência de bytes, útil para enviar objetos pela rede, salvar em disco ou pra comunicação entre JVMs)
#
- Bibliotecas: 
#
--***Calendar***: produz valorestípicos de calendário, com formatação de data e hora,e dependência no gráfico de Gantt.

![CalendarBiblioteca](https://user-images.githubusercontent.com/61089745/141659932-dcffb9a5-21fe-48b8-869d-d3da453b7d90.PNG)
#
![CalendarCodigo](https://user-images.githubusercontent.com/61089745/141659947-761d230f-4b7b-4def-94eb-ed2a676ca744.PNG)

-- ***JavaFx***: para aplicações desktop (front-end), com telas para exibição CRUD para classes Tarefa, Projeto e Funcionário.

![CadastroTarefa](https://user-images.githubusercontent.com/61089745/141662165-caf52ddc-0949-4b67-92d0-59bc7fb3d766.PNG)

![FX](https://user-images.githubusercontent.com/61089745/141662854-8bcebc08-1a5f-4cbb-b200-9bc2c57e8858.PNG)

-- ***Nebula***: gera o gráfico de GANTT personalizável, permite a interação do usuário (clica-arrsta-redimensiona) e interação de dependência.

![Entities](https://user-images.githubusercontent.com/61089745/141661748-853192b1-eb41-4289-8833-2fe22a038937.PNG)

- Camada ***Controller***: classes Projeto, Tarefa e Cadastros, com 2 classes controller para cada entidade (.java e .fxml de conexão com o javaFx ao front-end). 

![ExtensaoClasses](https://user-images.githubusercontent.com/61089745/141661946-5d4840d6-5ee6-4b17-b782-789d3cbadacb.PNG)

- Camada ***Service***: classes Tarefa Service e Cadastro Service com métodos na interface DAO.

![Service](https://user-images.githubusercontent.com/61089745/141662039-8927ae32-78c8-43e3-b233-13e15c97767e.PNG)

 - Camada ***Service implements***: Criei as classes Tarefa e Cadastro e implementei os métodos definidos no Service com inteface DAO usando o JDBC.

- ***Java Database Connectivity (JDBC)*** conector com instruções SQL par bancos de dados relacionais; 

![image](https://user-images.githubusercontent.com/61089745/141662145-fe473c43-cd2f-467e-98cc-0d08ac044fd7.png)


- Classes ***DAO***: para conexão e CRUD com o Banco de Dados.

![DAO](https://user-images.githubusercontent.com/61089745/141662133-a50122f1-c75f-4d30-b7a7-942af643caa7.PNG)

- IDE Eclipse.

- SGBD: MySQL.
![image](https://user-images.githubusercontent.com/61089745/141662257-f06ecc37-cb7f-4212-a92e-0aaef1580655.png)

-  metodologia: Scrum.

- ci: Docker / DockerCompose.

Foram testadas e abandonadas:
- SGBD: PostgreSQL.
- Biblioteca Gantt / JFreeCharts.

### III - CONTRIBUIÇÕES INDIVIDUAS/PESSOAIS 

- Atuei como agende de pesquisa e desenvolvimeto (*R&D*) e segundo Scrum Master e segudo Product Owner.
- Descobri a biblioteca ***Nebula*** e ensinei os colegas a integrá-la ao código.
- Fui um dos DBA do projeto;
- Realizei as **Apresentações Comerciais** e editei o README.MD em todas as SPRINTS, com as animações aqui apresentadas;

### IIII - APRENDIZADOS EFETIVOS

-  Tratmento de EVENTOS: 
-
-
-
;
- Aplicação desktop;
- administração e desenvolviment de banco de dados (comandos básicos INSERT, UPDATE, DELETE, SELECT, ALTER TABLE etc.)
- Github;

- ênfase em ssoftskills com o início da Pandemia do COVID-19 com imersão técnica durante o isolamento social.
