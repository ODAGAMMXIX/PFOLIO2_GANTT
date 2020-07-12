package global;
//package neb01

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import global.TestesProjeto;
import org.eclipse.nebula.widgets.ganttchart.AdvancedTooltip;
import org.eclipse.nebula.widgets.ganttchart.DateHelper;
import org.eclipse.nebula.widgets.ganttchart.GanttChart;
import org.eclipse.nebula.widgets.ganttchart.GanttEvent;
import org.eclipse.nebula.widgets.ganttchart.GanttGroup;
import org.eclipse.nebula.widgets.ganttchart.GanttSection;
import org.eclipse.nebula.widgets.ganttchart.themes.ColorThemeGrayBlue;
import org.eclipse.nebula.widgets.ganttchart.themes.ColorThemeSilver;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

public class Gantt {

	@SuppressWarnings("unchecked")
	public static void main(String args[]) {
		//crie o gerenciador de tarefas:		
		Gerenciador necto = new Gerenciador();
		
		
		//crie funcionarios:
		System.out.println("Crie Colaboradores: ");
		Funcionario funcionario1 = new Funcionario ("Fábio");
		System.out.println("Colaborador: "+funcionario1.nomeFuncionario+" criado com sucesso!");
		Funcionario funcionario2 = new Funcionario ("Denise");
		System.out.println("Colaborador: "+funcionario2.nomeFuncionario+" criado com sucesso!");
		Funcionario funcionario3 = new Funcionario ("Caroline");
		System.out.println("Colaborador: "+funcionario3.nomeFuncionario+" criado com sucesso!");
		Funcionario funcionario4 = new Funcionario ("W");
		System.out.println("Colaborador: "+funcionario4.nomeFuncionario+" criado com sucesso!");
		System.out.println("");
		
		
		
		//criar projetos:				
		System.out.println("");
		System.out.println("Crie projetos:");
		Projeto projeto1 = new Projeto("Necto");
		System.out.println("Projeto "+projeto1.nomeProjeto+" criado com sucesso!");
		Projeto projeto2 = new Projeto("Teste");
		System.out.println("Projeto "+projeto2.nomeProjeto+" criado com sucesso!");
		System.out.println("");
				
		//crie tarefas:
		System.out.println("Crie tarefas: ");
		Tarefa tarefa1 = new Tarefa ("Teste");		
		Tarefa tarefa2 = new Tarefa ("Planejar");		
		Tarefa tarefa3 = new Tarefa ("Desenvolver");		
		Tarefa tarefa4 = new Tarefa ("Reunião");		
		Tarefa tarefa5 = new Tarefa ("Manutenção");		
		Tarefa tarefa6 = new Tarefa ("Revisão");		
		Tarefa tarefa7 = new Tarefa ("Venda");
		
		
		//adicione inicio e fim as tarefas:						
		tarefa1.add_dataInicioTarefa("10/06/2020");
		tarefa2.add_dataInicioTarefa("12/06/2020");
		tarefa3.add_dataInicioTarefa("14/06/2020");
		tarefa4.add_dataInicioTarefa("16/06/2020");
		tarefa5.add_dataInicioTarefa("10/06/2020");
		tarefa6.add_dataInicioTarefa("15/06/2020");
		tarefa7.add_dataInicioTarefa("20/06/2020");				
		tarefa1.add_dataFimTarefa("12/06/2020");
		tarefa2.add_dataFimTarefa("14/06/2020");
		tarefa3.add_dataFimTarefa("16/06/2020");
		tarefa4.add_dataFimTarefa("18/06/2020");
		tarefa5.add_dataFimTarefa("15/06/2020");
		tarefa6.add_dataFimTarefa("20/06/2020");
		tarefa7.add_dataFimTarefa("26/06/2020");		
		System.out.println("Tarefa: "+tarefa1.nomeTarefa+" inicio: "+tarefa1.datainicioTarefa+" fim: "+tarefa1.datafimTarefa);
		System.out.println("Tarefa: "+tarefa2.nomeTarefa+" inicio: "+tarefa2.datainicioTarefa+" fim: "+tarefa2.datafimTarefa);
		System.out.println("Tarefa: "+tarefa3.nomeTarefa+" inicio: "+tarefa3.datainicioTarefa+" fim: "+tarefa3.datafimTarefa);
		System.out.println("Tarefa: "+tarefa4.nomeTarefa+" inicio: "+tarefa4.datainicioTarefa+" fim: "+tarefa4.datafimTarefa);
		System.out.println("Tarefa: "+tarefa5.nomeTarefa+" inicio: "+tarefa5.datainicioTarefa+" fim: "+tarefa5.datafimTarefa);
		System.out.println("Tarefa: "+tarefa6.nomeTarefa+" inicio: "+tarefa6.datainicioTarefa+" fim: "+tarefa6.datafimTarefa);
		System.out.println("Tarefa: "+tarefa7.nomeTarefa+" inicio: "+tarefa7.datainicioTarefa+" fim: "+tarefa7.datafimTarefa);
				
		
		//adicionando tarefas ao projeto:
		System.out.println("");
		System.out.println("Adicione Tarefas ao Projeto: ");
		projeto1.add_tarefaProjeto(tarefa1);
		projeto1.add_tarefaProjeto(tarefa2);
		projeto1.add_tarefaProjeto(tarefa3);
		projeto1.add_tarefaProjeto(tarefa4);
		projeto2.add_tarefaProjeto(tarefa5);
		projeto2.add_tarefaProjeto(tarefa6);
		projeto2.add_tarefaProjeto(tarefa7);		
		System.out.println("Tarefa "+tarefa1.nomeTarefa+" foi adicionada ao Projeto " +projeto1.nomeProjeto);
		System.out.println("Tarefa "+tarefa2.nomeTarefa+" foi adicionada ao Projeto " +projeto1.nomeProjeto);
		System.out.println("Tarefa "+tarefa3.nomeTarefa+" foi adicionada ao Projeto " +projeto1.nomeProjeto);
		System.out.println("Tarefa "+tarefa4.nomeTarefa+" foi adicionada ao Projeto " +projeto1.nomeProjeto);
		System.out.println("Tarefa "+tarefa5.nomeTarefa+" foi adicionada ao Projeto " +projeto2.nomeProjeto);
		System.out.println("Tarefa "+tarefa6.nomeTarefa+" foi adicionada ao Projeto " +projeto2.nomeProjeto);
		System.out.println("Tarefa "+tarefa7.nomeTarefa+" foi adicionada ao Projeto " +projeto2.nomeProjeto);
		
		//adicione colaboradores as tarefas:
		tarefa1.add_funcionarioTarefa(funcionario1);
		tarefa2.add_funcionarioTarefa(funcionario2);
		tarefa3.add_funcionarioTarefa(funcionario3);
		tarefa4.add_funcionarioTarefa(funcionario4);
		tarefa5.add_funcionarioTarefa(funcionario1);
		tarefa6.add_funcionarioTarefa(funcionario2);
		tarefa7.add_funcionarioTarefa(funcionario3);			
		
		//salve os projetos após atualização:
		projeto1.atualizaDataInicioProjeto();
		projeto1.atualizaDataFimProjeto();
		projeto2.atualizaDataInicioProjeto();
		projeto2.atualizaDataFimProjeto();
		
		necto.add_projeto(projeto1);
		necto.add_projeto(projeto2);
		necto.add_funcionario(funcionario1);
		necto.add_funcionario(funcionario2);
		necto.add_funcionario(funcionario3);
		necto.add_funcionario(funcionario4);
		
		//visualize quantidade de horas e funcionarios de uma tarefa:
		System.out.println("");
		System.out.println("visualize quantidade de horas e funcionarios de uma tarefa:");		
		tarefa1.qtde_horasTarefa();
		tarefa1.mostrar_funcionarioTarefa();
		tarefa2.qtde_horasTarefa();
		tarefa2.mostrar_funcionarioTarefa();
		tarefa3.qtde_horasTarefa();
		tarefa3.mostrar_funcionarioTarefa();		
		tarefa4.qtde_horasTarefa();
		tarefa4.mostrar_funcionarioTarefa();
		tarefa5.qtde_horasTarefa();
		tarefa5.mostrar_funcionarioTarefa();
		tarefa6.qtde_horasTarefa();
		tarefa6.mostrar_funcionarioTarefa();
		tarefa7.qtde_horasTarefa();
		tarefa7.mostrar_funcionarioTarefa();
		System.out.println("");		
		
		
		//visualize quantidade de dias de um projeto:
		System.out.println("");
		System.out.println("visualize quantidade de dias de um projeto:");		
		projeto1.dia_projeto();
		projeto2.dia_projeto();		
		System.out.println("");
		
		//visualize as tarefas do projeto:		
		System.out.println("");
		projeto1.mostrar_tarefaProjeto();
		System.out.println("");
		projeto2.mostrar_tarefaProjeto();		
		
		//visualize a quantidade de horas por dia:
		System.out.println("");
		System.out.println("visualize a quantidade de horas por dia:");
		necto.horas_dia("11/06/2020");
		
		//visualize a quantidade de horas disponiveis de um colaborador no mês:
		System.out.println("");
		System.out.println("visualize a quantidade de horas disponiveis de um colaborador no mês:");
		funcionario1.qtde_horasMesFuncionario("JUNE");
		funcionario2.qtde_horasMesFuncionario("JUNE");
		funcionario3.qtde_horasMesFuncionario("JUNE");
		funcionario4.qtde_horasMesFuncionario("JUNE");					
		
/*		
//inicia o gantt:						
		Display display = new Display();
		Shell shell = new Shell(display);
		shell.setText("Gantt Chart - FATEC-NECTO");
		
//tamanho da tela a plotar:
		shell.setSize(900, 750);
		shell.setLayout(new FillLayout());

// Create a chart					
		final GanttChart ganttChart = new GanttChart(shell, SWT.NONE, null, new ColorThemeGrayBlue(), null, null);
		
//inserindo os nomes dos projetos através de ArrayList no gráfico:
		ArrayList<GanttSection> sectionList = new ArrayList<>();
		for(int i1 = 0; i1<necto.listaProjeto.size();i1++) {
// aqui é feito o input do projeto que está no ArrayList no gráfico: 
			GanttSection section = new GanttSection(ganttChart,necto.listaProjeto.get(i1).nomeProjeto);
			sectionList.add(section);
// aqui é feito o input das tarefas do projeto:
			for (int i2 = 0; i2<necto.listaProjeto.get(i1).tarefaProjeto.size();i2++) {
				
//aqui é feito o input da data de inicio da tarefa:				
				Calendar startEvent = Calendar.getInstance();		
				startEvent = necto.listaProjeto.get(i1).tarefaProjeto.get(i2).startEvent;
				startEvent.add(necto.listaProjeto.get(i1).tarefaProjeto.get(i2).startEvent.DATE,0);
				
//aqui é feito o input da data de fim da tarefa:		
				Calendar endEvent = Calendar.getInstance();				
				endEvent = necto.listaProjeto.get(i1).tarefaProjeto.get(i2).endEvent;
				endEvent.add(necto.listaProjeto.get(i1).tarefaProjeto.get(i2).endEvent.DATE, 0);
								
//aqui é feito o input do nome da tarefa e % de progresso:								
				GanttEvent event = new GanttEvent(ganttChart,necto.listaProjeto.get(i1).tarefaProjeto.get(i2).nomeTarefa, startEvent, endEvent, 0);
				section.addGanttEvent(event);
				
//distancia (visual) entre as barras de tarefa no grafico:				
				event.setFixedRowHeight(20);//distancia entre as barras
				event.setVerticalEventAlignment(SWT.CENTER);				
				section.addGanttEvent(event);								
			}			
		}

// move chart start date to the earliest event
		ganttChart.getGanttComposite().jumpToEarliestEvent();
// Show chart
		shell.open();

		while (!shell.isDisposed()) {
			if (!display.readAndDispatch())
				display.sleep();
		}
		display.dispose();
*/
	}
}
