package global;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class TestesProjeto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//http://caiosantesso.com/como-calcular-diferenca-entre-datas-no-java-8/ 
		/*LocalDate inicio = LocalDate.of(2020, 4, 24);
		LocalDate fim = LocalDate.of(2020, 4, 28);
		long intervalo = (ChronoUnit.DAYS.between(inicio, fim))+1;
		System.out.println("A diferença é de " + intervalo + " dias.");*/
		
		Funcionario funcionario1 = new Funcionario("wilson"); // criando funcionarios, pessoal se possivel levantar os atributos que usaremos, ex: id, função, email, senha.
		Funcionario funcionario2 = new Funcionario("josé");
		Funcionario funcionario3 = new Funcionario("bento");
		Funcionario funcionario4 = new Funcionario("edson");
		Funcionario funcionario5 = new Funcionario("bosco");
		Funcionario funcionario6 = new Funcionario("ulisses");
		Funcionario funcionario7 = new Funcionario("lucas");
		Funcionario funcionario8 = new Funcionario("ney");
		Funcionario funcionario9 = new Funcionario("mathias");
		Funcionario funcionario0 = new Funcionario("gutemberg");	
		
		Projeto projeto1 = new Projeto("Necto");          	  // criando projeto1, lembrando que o projeto tem que ter a flexibilidade de adicionar inicio e fim depois
		Tarefa tarefa2 = new Tarefa ("Planejar");			// criando a tarefa 1 e 2, lembrando que as tarefas devem ter a opção de adicionar o inicio e fim depois
		Tarefa tarefa1 = new Tarefa ("Teste");				
		projeto1.add_tarefaProjeto(tarefa1);				// 
		projeto1.add_tarefaProjeto(tarefa2);
		tarefa1.add_dataInicioTarefa("25/05/2020");
		tarefa1.add_dataFimTarefa("26/05/2020");		
		tarefa1.add_funcionarioTarefa(funcionario1);        // adicionando funcionario na tarefa1, vou add 3 pessoas
		tarefa1.add_funcionarioTarefa(funcionario2);
		tarefa1.add_funcionarioTarefa(funcionario3);
		tarefa2.add_funcionarioTarefa(funcionario4);		// adicionando funcionario na tarefa2 , vou add 2 pessoas
		tarefa2.add_funcionarioTarefa(funcionario5);
		tarefa2.add_funcionarioTarefa(funcionario6);
		tarefa2.add_funcionarioTarefa(funcionario7);		//      ***Abaixo imprime os dias e horas da tarefa1****
		tarefa1.qtde_dias_tarefa();     					//      = 2 dias * 3 pessoas * 8 horas de trabalho por dia  = 48 horas             
		tarefa1.qtde_horas_tarefa();                        //      = consegue mostrar os funcionarios que estão executando a tarefa 
		tarefa1.mostrar_funcionarioTarefa();                 
		tarefa2.mostrar_funcionarioTarefa();
		projeto1.mostrar_tarefaProjeto();
		System.out.println(projeto1.tarefaProjeto[1].nomeTarefa); // tentei alimentar o gráfico com as variaveis criadas aqui, por enquanto sem sucesso! se alguem puder ajudar agradeço!
		
				
		//System.out.println(tarefa1.funcionarioTarefa);	
		
		/*
		 material de apoio:		 	 
		 http://caiosantesso.com/como-calcular-diferenca-entre-datas-no-java-8/
		 https://blog.education-ecosystem.com/dividir-string-java/
		 https://pt.stackoverflow.com/questions/48846/converter-string-para-inteiro-em-java/48847 
		 *		 
		 */
		
					
	}

}
