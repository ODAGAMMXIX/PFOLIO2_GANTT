# Git basic Tutorial

No terminal ou no GitBash, clone o nosso repositório na pasta desejada com o seguinte comando:  
  `git clone https://github.com/pydevelopers/pydevs`

Depois de clonar, entre na pasta do repositório:  
  `cd pydevs`

Faça um double-check de que você está realmente na master:    
  `git checkout master`  

Você também pode verificar em que branch está com o comando:    
  `git status`

Em todo inicio de sprint, será criada uma branch com o nome da sprint(first_sprint, second_sprint, etc).
Crie uma branch a partir dela. Para criar uma branch a partir de uma branch já existente, basta usar:  
  `git checkout 'nome da branch de origem'`   
  `git checkout -b 'nome da branch a ser criada' 'nome da branch de origem'`  
  e.g. `git checkout -b branch_andre first_sprint`

Depois disso, só trabalhar em sua branch!

## Commits

Para realizar os commits pelo terminal ou gitbash (caso não esteja usando alguma IDE integrada), basta digitar:   
  `git status`  
  Esse comando irá mostrar todos os arquivos que você realizou alteração! Depois, só adicionar eles ao commit com:  
  `git add nome_do_arquivo`  
  Se quiser adicionar todos os arquivos, pode digitar:  
  `git add .`  

Depois, adicione um comentário ao seu commit:  
  `git commit -m comentario_do_commit`  

E realize o PR:  
  `git push origin nome_da_branch_utilizada_para_o_commit`  

Isso irá retornar um link no terminal. Entre nesse link e pela interface do git, crie seu PR! Lembrando que todos os PRs dependem de aprovação de outros dois membros! No canto direito do PR, existe um campo chamado "Reviewers". Lá você pode designar os reviews do seu PR. Após duas aprovações, o PR poderá ser mergeado na branch de origem e no final das sprints, mergearemos a branch da sprint na master!  
Bora commitar! Qualquer dúvida, podemos discutir nas reuniões e adicionar mais informações neste markdown. Recomendo ler a documentação do git também!
