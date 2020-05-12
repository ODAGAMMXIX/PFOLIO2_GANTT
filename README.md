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

  O presente documento visa apresentar soluções e atender as necessidades do cliente, este documento possibilita a identificação, extração e classificação dos requisitos que serão contemplados para desenvolver o projeto.
**(COMPLEMENTAR  - FABIO)**

## Elicitação e Identificação de Requisitos
 ### Declaração do Problema:
 
O cliente "Cadu" da empresa NECTO, enfrenta algumas dificuldades gerenciais nos projetos de sua equipe no dia a dia, assim solicita um programa simples e funcional com baixa manutenção, para a realização das seguintes tarefas, a fim de gerenciar as demandas que chegam até a empresa, sendo elas:

* Gerenciar as cargas horárias em cada tarefa dos colaboradores;
* Distribuição mais uniforme das tarefas para os colaboradores;
* Equilibrar as demandas dos projetos para os clientes e colaboradores;
* Gerenciar a quantidade de tarefas e projetos possíveis de realizar por vez;
* Limitar a quantidade de horas trabalhadas por cada colaborador a fim de evitar sobrecargas.


## Especificação de Requisitos:
 ### Funcionais:

* Diagrama interativo para os gestores;
* Calcular as horas totais do projeto com base na carga horária das tasks;
* Cadastrar tarefas e projetos;
* Cadastrar colaboradores e realizar autenticação dos usuários(administrador,operador,etc);
* Realizar a gestão do fluxo de caixa;
* Interdependência entre tarefas;
* Gerar relatórios com relação prazo/preço, comparativo de tarefas e projetos atuais e futuros;
* Mostrar a quantidade de  horas /custo alocados em cada projeto;
* Controlar o calendário a fim de monitorar os dias úteis, finais de semana, feriados, férias/ absenteísmo, entre outros.

|NOME|Cod|Descrição|
|----|--|----------|
|Diagrama Interativo|R1|Gerar gráficos de Gantt responsivos que ao ter a barra arrastada, calcule os prazos dos projetos, para melhor controle dos gestores.|
|Cálculo de horas |R2|O sistema deve calcular as horas totais do projeto com base na carga horária das tarefas, de modo que, de acordo com situações que possam alongar ou adiantar as mesmas, os gestores tenham controle do prazo final do projeto.|
|Cadastro de Tarefas|R3|O sistema deve permitir inserir novos projetos e tarefas relacionadas aos mesmos|
|Cadastro de Colaboradores|R4|O sistema deve permitir a inserção de colaboradores e também a distribuição dos mesmos, em projetos e tarefas, baseado nas horas/recurso humanos.|
|Fluxo de Caixa|R5|O sistema deve gerenciar fluxo de caixa|
|Relatórios|R6|Gerar relatórios com relação prazo/preço, e comparativo de tarefas e projetos atuais e futuros.|
|Horas|R7|O sistema deve mostrar a quantidade de horas/custo alocados em cada projeto.|
|Calendário|R8|O sistema deve controlar o calendário a fim de monitorar: dias úteis, finais de semana, feriados, férias, absenteísmo etc.|

**DIAGRAMA DE CASO DE USO**
![Diagrama de caso de uso_Atualizado](https://user-images.githubusercontent.com/61089745/81743282-ced05400-9477-11ea-96bb-afa824678ecf.PNG)

### Não funcionais:

* Sistema leve.
* Baixa manutenção.
* Portabilidade : o  sistema deverá rodar em qualquer plataforma.
* Intuitivo



## Proposta

 A seguinte proposta visa entregar um  sistema desktop que gere diagrama interativo (Gantt) de controle de tarefas, projetos e carga horária de cada recurso, trazendo uma interface intuitiva e amigável ao usuário.

 ![gantt4](https://user-images.githubusercontent.com/54503903/81460735-9da50a80-917d-11ea-8d43-042b45c3241a.gif)
 
 
 ![gantt3](https://user-images.githubusercontent.com/54503903/81460795-feccde00-917d-11ea-8d71-061152ad9dd1.gif)
 
 
 ![gantt5](https://user-images.githubusercontent.com/54503903/81517212-89454700-9310-11ea-84f5-e20f23d8fb15.gif)


### Visão:
 Pesquisa das melhores tecnologias para o caso concreto, conjugando facilidade de desenvolvimento e estabilidade da aplicação em face da capacidade de entrega do grupo Pydevs, dentro do tempo disponível. 

##  Usabilidade:
 **HEURISTICAS**
 
* Correspondência entre o sistema e o mundo real  

O sistema possuirá uma interface intuitiva com menus e botões de ações de fácil entendimento, utilizando um dialeto familiar que seus usuários obtém no dia a dia. Sendo, ao excluir uma tarefa, para identificar essa ação conterá o botão "deletar", o calendário de acompanhamento de atividades do projeto será em português e para inserir novos projetos e novas tarefas serão sinalizadas com o sinal de mais "+".

* Controle do usuário e liberdade  

Com o sistema intuitivo, o usuário possuirá uma certa liberdade no sistema, minimizando erros, pois os usuários conseguirá de uma forma clara identificar as suas funcionalidades e comandos disponíveis, sem precisar decorar algum procedimento. Sendo a facilidade em indentificar cada etapa do projeto e sua evolução devido o calendário de acompanhamento do projeto e as cores do gráfico de Gantt, ao acessar o sistema com capslock ligado o sistema avisará o usuário, para acrescentar um novo projeto e tarefas, só será aceito no sistema caso aperte o botão "Salvar", ao realizar qualquer alteração no sistema abrirá uma caixa modal perguntando se realmente deseja realizar a modificação, assim minimizando erros ao longo da usabilidade do sistema. 

* Design estético e minimalista  

Com design intuitivo o sistema exibirá informações precisas e de fácil interpretação, com calendários e gráficos de barras para quando o responsável acessar a plataforma, consiga gerar relatórios de maneira ágil. O sistema deve utilizar cores na construção do gráfico para melhor identificação dos projetos/tarefas em andamento e identificação de interdependência das atividades.

* Ajuda e documentação  

A interface será intuitiva para que o usuário tenha uma melhor experiência e liberdade em usar o sistema, o sistema será de fácil usabilidade sendo opcional a leitura de manual e documentação. Para os usuários que precisam desse documento na própria plataforma conterá um arquivo digital para ser baixado com as instruções de utilização objetiva.


## Instalação:

* Instalação Desktop;  

* Arquivo executável;  

* Disponível nas plataformas Windows, Linux e Mac OS.  





## Tecnologias aplicadas

 - Gantt / JFreeCharts
 - Java
 - Docker / DockerCompose
 - PostgreSQL
 - Scrum
 - Versionamento com base em releases
