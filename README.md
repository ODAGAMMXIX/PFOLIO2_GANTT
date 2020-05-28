![Fatec-logo-9710C99301-seeklogo com](https://user-images.githubusercontent.com/61067500/81480184-54e16600-91fe-11ea-86d6-dbae737cefa1.png) <img align="left" width="100" height="100" src="https://user-images.githubusercontent.com/61067500/81479704-434a8f00-91fb-11ea-8d71-0cf029bc25ab.png">

# Projeto Integrador - 2º semestre BD
## Disciplinas:
* Engenharia de Software - Prof Giuliano Bertotti
* Laboratório de Desenvolvimento de Banco de Dados II - Prof Adriana Jacinto
* Arquitetura e Modelagem de Banco de Dados - Prof Emanuel Mineda


## Integrantes:

* Caroline Paz de Sousa RA: 1460281923049
* Denise de Oliveira Silva RA: 1460281923007
* Fabio Odaguiri RA: 1460281923008
* Wilson Amore Vieira Filho RA: 1460281923041
	


[![youtube](https://user-images.githubusercontent.com/54503903/82103748-a3a16b00-96ea-11ea-80ac-3a5a2ca6b4d4.jpg)](https://youtu.be/CQHUWNFfv5M)

## Introdução:

O presente documento visa apresentar a solução tecnológica proposta pela equipe para atender às necessidades do cliente NECTO, possibilitando a identificação e classificação dos requisitos, que nortearão o desenvolvimento do projeto.

A solução consiste numa aplicação visual de planejamento estratégico e gerenciamento de tempo dos seus recursos humanos em projetos de desenvolvimento de softwares (seu core business).

Nesse passo, como característica principal, da qual decorrem as funcionalidades (requisitos), a aplicação deve possibilitar a alocação dos recursos humanos em um gráfico de GANTT (tarefas em linhas de tempo), gerando métricas sobre a ocupação e o tempo disponível da equipe para novos projetos e contingências.

A GUI (Graphical User Interface) permitirá o planejamento colaborativo sobre o uso do tempo, v.g. mudanças de pessoas em tarefas/projetos, cobertura de ausências/férias de colaboradores, determinação de data de início de novos projetos, carga de trabalho por colaborador etc.

Será utilizado o Java como linguagem de programação.

## Elicitação e Identificação de Requisitos
### Declaração do Problema:

A cliente NECTO busca melhorar o gerenciamento de seus projetos e consequentemente de sua equipe no dia a dia, buscando a melhor alocação de tempo possível porém, de forma humanizada, respeitando limite de tempo diário de trabalho, descanso semanal, férias, ausências por motivos particulares e de saúde de cada colaborador.

Com base nesse briefing, solicita um programa simples e funcional, de baixa manutenção, para a realização de seu planejamento, especialmente:

* Gerenciar as cargas horárias em cada tarefa dos colaboradores;
* Distribuir mais uniformemente as tarefas para os colaboradores;
* Equilibrar a relação custo x receita dos projetos;
* Obter previsibilidade de faturamento e de ações comerciais;
* Gerenciar a quantidade de tarefas e projetos possíveis com uma determinada equipe;
* Limitar a quantidade de horas trabalhadas por colaborador a fim de evitar sobrecargas.
* Permitir a divisão de uma tarefa por dia (um dia = unidade mínima de tempo);
* Exportar arquivo para envio a terceiros (cliente e outros stakeholders, em PDF ou HTML ou GDOCs);
* Gerar Relatório;


## Especificação de Requisitos:
### Funcionais:

* Manipular a GUI na forma de diagrama interativo;
* Cadastrar tarefas e projetos;
* Criar interdependência entre tarefas;
* Cadastrar colaboradores e realizar autenticação dos usuários (administrador,operador,etc);
* Calcular as horas totais do projeto com base na carga horária das tarefas (tasks);
* Calcular/Mostrar métricas de tempo x receita nos projetos com quantidade de horas/valor alocados em cada projeto, por dia. por semana, por mês e um "Grand Total";
* Gerar relatórios por desenvolvedor, por período;
* Armazenar dados (busca-se autosalvamento e versionamento de arquivo);
* Dispor da informação sobre prazos reais e líquidos, contemplando calendário com dias úteis, finais de semana, feriados, férias e ausências, entre outros.

|NOME|Cod|Descrição|
|----|--|----------|
|Diagrama Interativo|R1|Gerar gráficos de Gantt responsivos que ao ter a barra arrastada, calcule os prazos dos projetos, para melhor controle dos gestores.|
|Cálculo de horas |R2|O sistema deve calcular as horas totais do projeto com base na carga horária das tarefas, de modo que, de acordo com situações que possam alongar ou adiantar as mesmas, os gestores tenham controle do prazo final do projeto.|
|Cadastro de Tarefas|R3|O sistema deve permitir inserir novos projetos e tarefas relacionadas aos mesmos|
|Cadastro de Colaboradores|R4|O sistema deve permitir a inserção de colaboradores e também a distribuição dos mesmos, em projetos e tarefas, baseado nas horas/recurso humanos.|
|Relatórios|R5|Gerar relatórios.|
|Horas|R6|O sistema deve mostrar a quantidade de horas/custo alocados em cada projeto.|
|Calendário|R7|O sistema deve controlar o calendário a fim de monitorar: dias úteis, finais de semana, feriados, férias, e outras ausências.|
|Importação|R8| O sistema poderá importar planilha (desnecessária a sua exportação).

**DIAGRAMA DE CASO DE USO**
![Diagrama de caso de uso_Atualizado](https://user-images.githubusercontent.com/61089745/81743282-ced05400-9477-11ea-96bb-afa824678ecf.PNG)

### Não funcionais:

* Sistema leve;
* Baixa manutenção;
* Portabilidade: o sistema deverá rodar em qualquer plataforma;
* Intuitivo;
* Colorido;
* Visual;
* Gerencialmente Inteligível;


## Proposta

A seguinte proposta visa entregar um sistema que gere diagrama interativo (Gráfico de Gantt) de controle de tarefas, projetos e carga horária de cada recurso, trazendo uma interface intuitiva e amigável ao usuário.

![sprint1_1](https://user-images.githubusercontent.com/54503903/81874733-e7fb0280-9554-11ea-87b8-fe689079100a.gif)


![sprint1_2](https://user-images.githubusercontent.com/54503903/81874756-f47f5b00-9554-11ea-9914-bf3bcb1b1c4e.gif)


![sprint1_3](https://user-images.githubusercontent.com/54503903/81874769-fea15980-9554-11ea-9eff-5f1b2235be99.gif)



### Visão:
Pesquisa das melhores tecnologias para o caso concreto, conjugando facilidade de desenvolvimento e estabilidade da aplicação em face da capacidade de entrega do grupo Pydevs, dentro do tempo disponível.

## Usabilidade:
**HEURISTICAS**

* Correspondência entre o sistema e o mundo real

O sistema possuirá uma interface intuitiva com menus e botões de ações de fácil entendimento, utilizando um nomenclatura familiar aos seus usuários. As ações tais quais exclusão ou criação de nova tarefa/projeto serão realizadas por meio de botões/opções de menu sinalizados por "deletar" ou simplesmente "X", tanto quanto "adicionar" ou "+". O calendário de acompanhamento de atividades do projeto será em português. Busca-se uma interface clique-e-arraste, induzindo os caminhos para que a utilização seja fluída.

* Controle do usuário e liberdade

Com o sistema intuitivo, o usuário possuirá uma certa liberdade no sistema, minimizando erros, pois conseguirá identificar claramente as funcionalidades e comandos disponíveis, sem precisar decorar procedimento algum. Sendo a facilidade em identificar cada etapa do projeto e sua evolução devido o calendário de acompanhamento do projeto e as cores do gráfico de Gantt, ao acessar o sistema com capslock ligado o sistema avisará o usuário (campo de senha é CASE SENSITIVE), almeja-se que tenha autosalvamento, controle de versões, permitindo simulações (usabilidade do sistema).

* Design estético e minimalista

Com design intuitivo o sistema exibirá informações precisas e de fácil interpretação, com calendários e gráficos de barras coloridos, ícones familiares. O sistema deve utilizar cores na construção do gráfico para melhor identificação dos projetos/tarefas/pessoas em andamento e identificação de interdependência das atividades.

* Ajuda e documentação

A interface será intuitiva para que o usuário tenha uma melhor experiência e liberdade em usar o sistema, o sistema será de fácil usabilidade sendo opcional a leitura de manual e documentação. Para os usuários que precisam desse documento na própria plataforma conterá um arquivo digital para ser baixado com as instruções de utilização objetiva.


## Instalação:

Após os primeiros testes com nosso código, será possível decidir entre hospedagem em um endereço para acesso por meio de um navegador ou, se será necessária a instalação local nos computadores, com arquivo executável.

A princípio, será compatível nas plataformas Windows, Linux e Mac OS.

## Tecnologias e Metodologias aplicadas

- Gantt / JFreeCharts
- Java
- Docker / DockerCompose
- PostgreSQL
- Scrum
- Versionamento com base em releases

## Entrega 01 - 18  de março de 2020.

## Entrega 02 - 15  de maio de 2020.
![Quadrante 2 de 4 da Tela (GANTT-NECTO)](https://user-images.githubusercontent.com/54047352/83085242-bfe5c600-a061-11ea-8aaf-9350cc7e52bd.png) <img align="left" width="100" height="100" src=https://user-images.githubusercontent.com/54047352/83085242-bfe5c600-a061-11ea-8aaf-9350cc7e52bd.png">

## Entrega 03 - 29  de maio de 2020.

## Entrega 04 - 12  de junho de 2020.

