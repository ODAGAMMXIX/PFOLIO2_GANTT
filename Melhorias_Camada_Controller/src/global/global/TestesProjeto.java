package global;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import java.text.ParseException;

public class TestesProjeto {
	
	public static void main(String[] args) throws ParseException {
		
		//crie o gerenciador de tarefas:
		Gerenciador necto = new Gerenciador();
		
		//crie funcionarios:
		System.out.println("");
		System.out.println("Crie Funcionarios: ");
		Funcionario funcionario1 = new Funcionario("wilson");
		Funcionario funcionario2 = new Funcionario("vieira");
		System.out.println("nome do funcionario: "+ funcionario1.nomeFuncionario);
		System.out.println("nome do funcionario: "+ funcionario2.nomeFuncionario);
		System.out.println("");
		
		
		//criar projetos:
		
		System.out.println("");
		System.out.println("Crie projetos:");
		Projeto projeto1 = new Projeto("Necto");
		System.out.println("nome do projeto: "+projeto1.nomeProjeto);
		
		
		//crie tarefas:
		Tarefa tarefa1 = new Tarefa ("Teste");
		Tarefa tarefa2 = new Tarefa ("Planejar");
		Tarefa tarefa3 = new Tarefa ("Desenvolver");
		Tarefa tarefa4 = new Tarefa ("Reunião");
		
		//alterer o inicio e fim das tarefas:
		System.out.println("");
		System.out.println("crie altere e adicione ao projeto tarefas:");
		System.out.println("");
		System.out.println(tarefa1.nomeTarefa);
		tarefa1.add_dataInicioTarefa("10/07/2020");
		tarefa1.add_dataFimTarefa("12/07/2020");
		
		System.out.println("");
		System.out.println(tarefa2.nomeTarefa);
		tarefa2.add_dataInicioTarefa("15/07/2020");
		tarefa2.add_dataFimTarefa("17/07/2020");
		
		System.out.println("");
		System.out.println(tarefa3.nomeTarefa);
		tarefa3.add_dataInicioTarefa("10/07/2020");
		tarefa3.add_dataFimTarefa("22/07/2020");
		
		System.out.println("");
		System.out.println(tarefa4.nomeTarefa);
		tarefa4.add_dataInicioTarefa("22/07/2020");
		tarefa4.add_dataFimTarefa("25/07/2020");
		System.out.println("");
		
		//adicione as tarefas aos projetos:
		
		projeto1.add_tarefaProjeto(tarefa1);				 
		projeto1.add_tarefaProjeto(tarefa2);
		
		projeto1.add_tarefaProjeto(tarefa3);
		projeto1.add_tarefaProjeto(tarefa4);
		
		//escolha quais funcionarios serão atribuidos as tarefas:
		
		tarefa1.add_funcionarioTarefa(funcionario1);
		tarefa1.add_funcionarioTarefa(funcionario2);
		
		tarefa2.add_funcionarioTarefa(funcionario1);
		tarefa2.add_funcionarioTarefa(funcionario2);
		
		tarefa3.add_funcionarioTarefa(funcionario1);
		tarefa3.add_funcionarioTarefa(funcionario2);
		
		tarefa4.add_funcionarioTarefa(funcionario1);
		tarefa4.add_funcionarioTarefa(funcionario2);	
		
		//atualize a data de inicio e fim do projeto de acordo com as tarefas:
		
		System.out.println("atualize a data de inicio e fim do projeto de acordo com as tarefas:");
		
		System.out.println(projeto1.nomeProjeto);
		projeto1.atualizaDataInicioProjeto();
		projeto1.atualizaDataFimProjeto();
		System.out.println("");		
		
		
		//adicione os funcionarios no gerenciador:
		
		necto.add_funcionario(funcionario1);
		necto.add_funcionario(funcionario2);
		
		//adicione os projetos no gerenciador:
		necto.add_projeto(projeto1);
		
		
		//visualize a qtde de horas de trabalho em determinada data:		
		System.out.println("");
		System.out.println("visualize a qtde de horas de trabalho em determinada data:");
		necto.horas_dia("22/07/2020");		
		
		//visualize a qtde de horas trabalhadas e disponiveis do funcionario no mes
		System.out.println("");
		System.out.println("visualize a qtde de horas trabalhadas e disponiveis do funcionario no mes:");
		funcionario1.qtde_horasMesFuncionario("JULY");
		
		//visualize a qtde de horas gastas na tarefa, descontando os fins de semana
		System.out.println("\n");
		System.out.println("visualize a qtde de horas gastas na tarefa, descontando os fins de semana:");
		tarefa1.qtde_horasTarefa();
		
		//visualize os funcionarios responsaveis pela tarefa:
		System.out.println("");
		System.out.println("adicione e visualize os funcionarios responsaveis pelas tarefas:");
		tarefa1.mostrar_funcionarioTarefa();
		
		
		
		System.out.println("");
		
//		Calendar hoje = Calendar.getInstance();
//		Date data = hoje.getTime();
//		//System.out.println(data);
//		DateFormat dataEdit = DateFormat.getDateInstance();
//		Date data1 = dataEdit.parse("01/01/2001");
//		hoje.setTime(data1);
//		System.out.println(hoje);
		Date data = new Date("03/08/2020");
		Calendar cal = Calendar.getInstance();
		cal.setTime(data);
		
		System.out.println(cal.getTime());
		System.out.println(data);
		System.out.println(tarefa1.startEvent.getTime());
		
		
		
		
		
		
		
		
		
		

		
					
	}

}
