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
 
O cliente NECTUS, que enfrenta algumas dificuldades gerenciais em seu dia a dia, e solicita um     programa simples e funcional com baixa manutenção, para a realização das seguintes tarefas, a fim     gerenciar as demandas que chegam até a empresa, sendo elas:



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





**INSERIR DIAGRAMA DE CASO DE USO**


**INSERIR DIAGRAMA DE SEQUENCIA**

### Não funcionais:

* Sistema leve e de baixa manutenção.
* Interdependência entre tarefas.
* Portabilidade : o  sistema deverá rodar em qualquer plataforma.
* Intuitivo
* O sistema deve utilizar cores na construção do gráfico para melhor identificação dos projetos/tarefas em andamento.


## Proposta

 A seguinte proposta visa entregar um  sistema desktop que gere diagrama interativo (Gantt) de controle de tarefas, projetos e carga horária de cada recurso,trazendo uma interface intuitiva e amigável ao usuário.
 
 ![gantt4](https://user-images.githubusercontent.com/54503903/81460735-9da50a80-917d-11ea-8d43-042b45c3241a.gif)
 
 
 ![gantt3](https://user-images.githubusercontent.com/54503903/81460795-feccde00-917d-11ea-8d71-061152ad9dd1.gif)
 
 
 ![gantt1](https://user-images.githubusercontent.com/54503903/81460361-5158cb00-917b-11ea-9c1f-9fc04561a573.gif)


### Visão:
Pesquisa das melhores tecnologias para o caso concreto, conjugando facilidade de desenvolvimento e estabilidade da aplicação em face da capacidade de entrega do grupo Pydevs, dentro do tempo disponível. 

##  Usabilidade:
 **(INSERIR AQUI AS HEURISTICAS)**

## Instalação:
**COLOCAR AS ESPECIFICAÇÕES AQUI**



## Tecnologias aplicadas

 - Gantt / JFreeCharts
 - Java
 - Docker / DockerCompose
 - PostgreSQL
 - Scrum
 - Versionamento com base em releases
