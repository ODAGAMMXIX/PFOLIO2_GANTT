package global;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Tarefa {
	
	
	
	//private Projeto projetoTarefa;
	String nomeTarefa;
	LocalDate datainicioTarefa;
	LocalDate datafimTarefa;
	Funcionario[] funcionarioTarefa;
	Integer horasTarefas;

	
	//construtor:
	public Tarefa (String nomeTarefa) {
		//this.projetoTarefa = projetoTarefa;
		this.nomeTarefa = nomeTarefa;
		this.datainicioTarefa = datainicioTarefa = LocalDate.now();
		this.datafimTarefa = datafimTarefa = LocalDate.now();
		this.funcionarioTarefa = new Funcionario[10];
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
		
		//metodos:			
		
		
		void add_dataInicioTarefa(String iniciotarefa){
			String[] inicio_tarefa = iniciotarefa.split("/");
			int diaInicioTarefa = Integer.parseInt(inicio_tarefa[0]);
			int mesInicioTarefa = Integer.parseInt(inicio_tarefa[1]);
			int anoInicioTarefa = Integer.parseInt(inicio_tarefa[2]);
			LocalDate novoinicioTarefa = LocalDate.of(anoInicioTarefa, mesInicioTarefa, diaInicioTarefa);
			datainicioTarefa = novoinicioTarefa;
			System.out.println("Data de Inicio da Tarefa: " + datainicioTarefa);		
			}
		
		void add_dataFimTarefa(String fimtarefa){
			String[] fim_tarefa = fimtarefa.split("/");
			int diaFimTarefa = Integer.parseInt(fim_tarefa[0]);
			int mesFimTarefa = Integer.parseInt(fim_tarefa[1]);
			int anoFimTarefa = Integer.parseInt(fim_tarefa[2]);
			LocalDate novofimTarefa = LocalDate.of(anoFimTarefa, mesFimTarefa, diaFimTarefa);
			datafimTarefa = novofimTarefa;
			System.out.println("Data de Fim da Tarefa: " + datafimTarefa);		
			}
		
		void add_funcionarioTarefa(Funcionario adicionaFuncionario) {	
			for (int i = 0; i < this.funcionarioTarefa.length; i++) {
				if(funcionarioTarefa[i]==null) {
					funcionarioTarefa[i] = adicionaFuncionario;
					System.out.println("Funcionario "+funcionarioTarefa[i].nomeFuncionario + " adicionado a Tarefa "+ nomeTarefa);
					break;
				    }
				}
			}
		
		void qtde_horas_tarefa() {
			int c = 0;
			for (int i = 0; i < this.funcionarioTarefa.length; i++) {
				if(funcionarioTarefa[i]!=null) {
					c++;					
				    }
				else
					break;
				}
			long intervalodiaTarefa = (ChronoUnit.DAYS.between(datainicioTarefa, datafimTarefa))+1; //http://caiosantesso.com/como-calcular-diferenca-entre-datas-no-java-8/
			System.out.println("total de horas da tarefa é de " + (intervalodiaTarefa*c*8) + " hora(s).");
			}		
				
		void qtde_dias_tarefa() {			
			long intervalodiaTarefa = (ChronoUnit.DAYS.between(datainicioTarefa, datafimTarefa))+1; //http://caiosantesso.com/como-calcular-diferenca-entre-datas-no-java-8/
			System.out.println("duração da Tarefa é de " + intervalodiaTarefa + " dia(s).");
			}
		
		void mostrar_funcionarioTarefa() {
			System.out.print("\nEquipe da Tarefa "+nomeTarefa+" \n"); 
			for(int i = 0; i < this.funcionarioTarefa.length; i++) {
				if(funcionarioTarefa[i]!=null) {
					System.out.println("Recurso "+(i+1)+" "+funcionarioTarefa[i].nomeFuncionario + " Função: ");
			
				}
			}
		}

}
		
		


	

	
