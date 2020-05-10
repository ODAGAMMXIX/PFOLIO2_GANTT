![Fatec-logo-9710C99301-seeklogo com](https://user-images.githubusercontent.com/61067500/81480184-54e16600-91fe-11ea-86d6-dbae737cefa1.png)   <img align="left" width="100" height="100" src="https://user-images.githubusercontent.com/61067500/81479704-434a8f00-91fb-11ea-8d71-0cf029bc25ab.png">

# Projeto Integrador - 2º semestre BD
## Disciplinas:
* Engenharia de Software - Prof Giuliano Bertotti
* Lab II - Prof Adriana Jacinto
* Arquitetura de Banco de Dados - Prof Emanuel Mineda


## Integrantes:
 
  * Caroline Paz de Sousa RA: 1460281923049
  * Denise de Oliveira Silva RA: 1460281923007
  * Fábio Odaguiri RA: 1460281923008
  * Wilson Amore Vieira Filho RA: 1460281923041

## Introdução:

  O presente documento visa apresentar soluções e atender as necessidades do cliente,este documento   possibilita a identificação,extração e classificação dos requisitos...
**(COMPLEMENTAR  - FABIO)**

## Elicitação e Identificação de Requisitos
 ### Declaração do Problema:
 
O cliente NECTO, que enfrenta algumas dificuldades gerenciais em seu dia a dia, e solicita um programa simples e funcional com baixa manutenção, para a realização das seguintes tarefas, a fim de gerenciar as demandas que chegam até a empresa, sendo elas:



* Gerenciar as cargas horárias em cada tarefa dos colaboradores;
* Distribuição mais uniforme das tarefas para os colaboradores;
* Equilibrar as demandas dos projetos para os clientes e colaboradores;
* Gerenciar a quantidade de tarefas e projetos possíveis de realizar por vez;
* Limitar a quantidade de horas trabalhadas por cada colaborador a fim de evitar sobrecargas;


## Especificação de Requisitos:
 ### Funcionais:

* Diagrama interativo para os gestores. 
* Calcular as horas totais do projeto com base na carga horária das tasks. 
* Cadastrar tarefas e projetos.
* Cadastrar colaboradores e realizar autenticação dos usuários(administrador,operador,etc)
* Realizar a gestão do fluxo de caixa.
* Gerar relatórios com relação prazo/preço, comparativo de tarefas e projetos atuais e futuros
* Mostrar a quantidade de  horas /custo alocados em cada projeto.
* Controlar o calendário a fim de monitorar os(dias úteis, finais de semana, feriados, férias/ absenteísmo  etc

![tABELA I 2020-05-09 16 16 50](https://user-images.githubusercontent.com/61067500/81482962-025d7500-9211-11ea-81de-9508c7949e67.png)

**DIAGRAMA DE CASO DE USO**
![Diagrama de caso de uso_Final](https://user-images.githubusercontent.com/61089745/81488663-1a99b800-9242-11ea-8d1e-8a217660276a.PNG)

### Não funcionais:

* Sistema leve e de baixa manutenção.
* Interdependência entre tarefas.
* Portabilidade : o  sistema deverá rodar em qualquer plataforma.
* Intuitivo
* O sistema deve utilizar cores na construção do gráfico para melhor identificação dos projetos/tarefas em andamento.


## Proposta

 A seguinte proposta visa entregar um  sistema desktop que gere diagrama interativo (Gantt) de controle de tarefas, projetos e carga horária de cada recurso,trazendo uma interface intuitiva e amigável ao usuário.

**WILSON - INSERIR OS GIFS AQUI**

### Visão:
Pesquisa das melhores tecnologias para o caso concreto, conjugando facilidade de desenvolvimento e estabilidade da aplicação em face da capacidade de entrega do grupo Pydevs, dentro do tempo disponível. 

##  Usabilidade:
 **HEURISTICAS**
 
*Correspondência entre o sistema e o mundo real  

O sistema possuirá uma interface simplista com menus e botões de ações de fácil entendimento, utilizando uma linguagem familiar que seus usuários obtém no dia a dia.

*Controle do usuário e liberdade  

Com o sistema intuitivo, o usuário possurái uma certa liberdade no sistema, minimizando erros, pois os usuários conseguirá de uma forma clara identificar as suas funcionalidades e comandos disponíveis, sem precisar decorar algum procedimento.

*Design estético e minimalista  

Com design intuitivo o sistema exibirá informações precisas e de fácil interpretação, com calendários e gráficos de barras para quando o responsável acessar a plataforma, consiga gerar relatórios de maneira ágil.

*Ajuda e documentação  

A interface será intuitiva para que o usuário tenha uma melhor experiência e liberdade em usar o sistema, evitando desperdício de tempo lendo manual e documentação do sistema.


## Instalação:

* Instalação Desktop  

* Arquivo executável  

* Disponível nas plataformas Windows, Linux e Mac OS  





## Tecnologias aplicadas

 - Gantt / JFreeCharts
 - Java
 - Docker / DockerCompose
 - PostgreSQL
 - Scrum
 - Versionamento com base em releases
