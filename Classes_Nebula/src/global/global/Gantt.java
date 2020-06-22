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
		
		//criar projetos:				
		System.out.println("");
		System.out.println("Crie projetos:");
		Projeto projeto1 = new Projeto("Necto");
		Projeto projeto2 = new Projeto("Teste");				
				
		//crie tarefas:
		Tarefa tarefa1 = new Tarefa ("Teste");
		Tarefa tarefa2 = new Tarefa ("Planejar");
		Tarefa tarefa3 = new Tarefa ("Desenvolver");
		Tarefa tarefa4 = new Tarefa ("Reunião");
				
		Tarefa tarefa5 = new Tarefa ("Manutenção");
		Tarefa tarefa6 = new Tarefa ("Revisão");
		Tarefa tarefa7 = new Tarefa ("Venda");							 												
						
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
				
		projeto1.add_tarefaProjeto(tarefa1);
		projeto1.add_tarefaProjeto(tarefa2);
		projeto1.add_tarefaProjeto(tarefa3);
		projeto1.add_tarefaProjeto(tarefa4);
		projeto2.add_tarefaProjeto(tarefa5);
		projeto2.add_tarefaProjeto(tarefa6);
		projeto2.add_tarefaProjeto(tarefa7);
				
		necto.add_projeto(projeto1);
		necto.add_projeto(projeto2);
		
		
		
		
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
		ArrayList<	> sectionList = new ArrayList<>();
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

	}
}
