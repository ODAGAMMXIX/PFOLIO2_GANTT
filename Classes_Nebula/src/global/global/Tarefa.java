package global;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
public class Tarefa {
	
	
	
	//private Projeto projetoTarefa;
	String nomeTarefa;
	LocalDate datainicioTarefa;
	
	Calendar startEvent;
	Calendar endEvent;
	
	LocalDate datafimTarefa;	
	ArrayList<LocalDate> diasTarefa;
	ArrayList<Funcionario> funcionarioTarefa;
	Integer horasTarefas;

	
	//construtor:
	public Tarefa (String nomeTarefa) {
		//this.projetoTarefa = projetoTarefa;
		this.nomeTarefa = nomeTarefa;
		this.datainicioTarefa = datainicioTarefa = LocalDate.now();
		
		this.startEvent  = Calendar.getInstance();
		this.endEvent = Calendar.getInstance();
		
		this.datafimTarefa = datafimTarefa = LocalDate.now();		
		this.diasTarefa = new ArrayList<LocalDate>();
		this.funcionarioTarefa = new ArrayList<Funcionario>();
		this.horasTarefas = horasTarefas;
	}
	
	//metodos de acesso do tipo setter:
		
		//public void setprojetoTarefa(Projeto pt) {
			//projetoTarefa=pt;
		//}
		public void setnomeTarefa(String nt) {
			nomeTarefa=nt;
		}
		public void setdatainicioTarefa(LocalDate dit) {
			datainicioTarefa=dit;
			
		}
		public void setdatafimTarefa(LocalDate dft) {
			datafimTarefa=dft;
		}
		
		public void setdiasTarefa(ArrayList<LocalDate> dtt){
			diasTarefa = dtt;
		}
		public void setfuncionarioTarefa(ArrayList<Funcionario> nft) {
			funcionarioTarefa=nft;
		}
		
		
		//metodos de acesso do tipo getter:
		//public Projeto getProjetoTarefa() {
			//return projetoTarefa;
		//}
		public String getNomeTarefa() {
			return nomeTarefa;
		}
		public LocalDate DataInicioTarefa() {
			return datainicioTarefa;
		}
		public LocalDate DataFimTarefa() {
			return datafimTarefa;
		}	
		public ArrayList<LocalDate> DiasTarefa() {
			return diasTarefa;
		}
		public ArrayList<Funcionario> FuncionarioTarefa() {
			return funcionarioTarefa;
		}
		
		//metodos:		
		void add_dataInicioTarefa(String iniciotarefa){
			String[] inicio_tarefa = iniciotarefa.split("/");
			int diaInicioTarefa = Integer.parseInt(inicio_tarefa[0]);
			int mesInicioTarefa = Integer.parseInt(inicio_tarefa[1]);
			int anoInicioTarefa = Integer.parseInt(inicio_tarefa[2]);
			Date data = new Date(inicio_tarefa[1]+"/"+inicio_tarefa[0]+"/"+inicio_tarefa[2]);
			startEvent.setTime(data);
			LocalDate novoinicioTarefa = LocalDate.of(anoInicioTarefa, mesInicioTarefa, diaInicioTarefa);
			datainicioTarefa = novoinicioTarefa;
			System.out.println("Data de Inicio da Tarefa: " + datainicioTarefa);		
			}
		
		void add_dataFimTarefa(String fimtarefa){
			String[] fim_tarefa = fimtarefa.split("/");
			int diaFimTarefa = Integer.parseInt(fim_tarefa[0]);
			int mesFimTarefa = Integer.parseInt(fim_tarefa[1]);
			int anoFimTarefa = Integer.parseInt(fim_tarefa[2]);
			
			Date data = new Date(fim_tarefa[1]+"/"+fim_tarefa[0]+"/"+fim_tarefa[2]);
			endEvent.setTime(data);
			
			LocalDate novofimTarefa = LocalDate.of(anoFimTarefa, mesFimTarefa, diaFimTarefa);
			datafimTarefa = novofimTarefa;
			System.out.println("Data de Fim da Tarefa: " + datafimTarefa);
			
			int diaTarefa = 0;		
			LocalDate diaAnalizado = datainicioTarefa;
			LocalDate diaFim = datafimTarefa;				
			for (LocalDate fim= diaFim.plus(1, ChronoUnit.DAYS);!fim.equals(diaAnalizado);diaAnalizado = diaAnalizado.plus(1, ChronoUnit.DAYS))			
				if (!diaAnalizado.getDayOfWeek().name().equals("SATURDAY")&&!diaAnalizado.getDayOfWeek().name().equals("SUNDAY"))		
					diasTarefa.add(diaAnalizado);
			//long intervalodiaTarefa = (ChronoUnit.DAYS.between(datainicioTarefa, datafimTarefa))+1; //http://caiosantesso.com/como-calcular-diferenca-entre-datas-no-java-8/
												
			}
		
		void add_funcionarioTarefa(Funcionario adicionaFuncionario) {
			funcionarioTarefa.add(adicionaFuncionario);
			for(int i = 0; i<diasTarefa.size();i++)				
				adicionaFuncionario.diasFuncionario.add(diasTarefa.get(i));
			}	
		
		void qtde_horasTarefa() {			
			System.out.println("total de horas da tarefa "+nomeTarefa+" é de "+(diasTarefa.size()*funcionarioTarefa.size()*8)+" hora(s).");
			}	
		
		void qtde_diasTarefa() {
			System.out.println("duração da Tarefa é de " +diasTarefa.size()+" dia(s).");
			}	
		
		void mostrar_funcionarioTarefa() {				
			System.out.println("Equipe da Tarefa: "+nomeTarefa);
			int n = funcionarioTarefa.size();
			for (int i = 0; i < n; i++) {
				System.out.println(" "+funcionarioTarefa.get(i).nomeFuncionario);				
				}
			}
		}
		
		


	

	
