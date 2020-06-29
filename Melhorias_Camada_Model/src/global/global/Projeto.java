package global;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;

//deixar privados
public class Projeto {
	Integer idProjeto;
	String nomeProjeto;
	Empresa nomeEmpresaProjeto;
	LocalDate datainicioProjeto;
	LocalDate datafimProjeto;
	Integer horasProjeto;
	ArrayList<Tarefa> tarefaProjeto;
	
	//construtor:
	public Projeto (String nomeProjeto) {
		
		this.nomeProjeto = nomeProjeto;
		this.datainicioProjeto = datainicioProjeto = LocalDate.now();
		this.datafimProjeto = datafimProjeto = LocalDate.now();
		this.horasProjeto = horasProjeto;
		this.tarefaProjeto = new ArrayList<Tarefa>();
		
		}
		
	//setters:
		
		public void setnomeProjeto(String npp) {
			nomeProjeto=npp;
		}
		public void datainicioProjeto(LocalDate dip) {
			datainicioProjeto=dip;
		}
		public void datafimProjeto(LocalDate dfp) {
			datafimProjeto=dfp;
		}
		public void horasProjeto(Integer hpp) {
			horasProjeto=hpp;
		}
		
		public void tarefaProjeto (ArrayList<Tarefa> tpp) {
			tarefaProjeto=tpp;
			
		}


	//getters:
		public String getNomeProjeto() {
			return nomeProjeto;
		}
		public LocalDate getDataInicioProjeto() {
			return datainicioProjeto;
		}
		public LocalDate getDataFimProjeto() {
			return datafimProjeto;
		}
		public Integer getHorasProjeto() {
			return horasProjeto;
		}
		
		public ArrayList<Tarefa> getTarefaProjeto(){
			return tarefaProjeto;
			
		}
		
		
		void dia_projeto() {			
			int diaProjeto = 0;		
			LocalDate diaInicio = datainicioProjeto;
			LocalDate diaFim = datafimProjeto;				
			for (LocalDate fim= diaFim.plus(1, ChronoUnit.DAYS);!fim.equals(diaInicio);diaInicio = diaInicio.plus(1, ChronoUnit.DAYS))			
				if (!diaInicio.getDayOfWeek().name().equals("SATURDAY")&&!diaInicio.getDayOfWeek().name().equals("SUNDAY"))
					diaProjeto++;						
			//long intervalodiaTarefa = (ChronoUnit.DAYS.between(datainicioTarefa, datafimTarefa))+1; //http://caiosantesso.com/como-calcular-diferenca-entre-datas-no-java-8/
			System.out.println("Duração do Projeto "+nomeProjeto +" é de " + diaProjeto + " dia(s).");
			}	
		
		void atualizaDataInicioProjeto(){						
			if (tarefaProjeto.size() != 0) {                              // se o numero de tarefas do projeto for diferente de zero
				datainicioProjeto = tarefaProjeto.get(0).datainicioTarefa;// coloco a data inicio da primeira tarefa como data de inicio do projeto
				for(int i = 0; i < tarefaProjeto.size(); i++) {			  // e começo a comparar com as outras datas de inicio de tarefa para ver qual é a menor
					if (tarefaProjeto.get(i).datainicioTarefa.compareTo(datainicioProjeto) == 0) { //se as datas de inicio das tarefas forem iguais													
						
					}
					else if (tarefaProjeto.get(i).datainicioTarefa.compareTo(datainicioProjeto) > 0) {
						datainicioProjeto = datainicioProjeto;
					}					
					else {
						datainicioProjeto = tarefaProjeto.get(i).datainicioTarefa;						
					}	
				}
			}
			System.out.println("data inicio do projeto: " + datainicioProjeto);
		}
						
		void atualizaDataFimProjeto() {
			if (tarefaProjeto.size() != 0) {                              // se o numero de tarefas do projeto for diferente de zero
				datafimProjeto = tarefaProjeto.get(0).datafimTarefa;// coloco a data inicio da primeira tarefa como data de inicio do projeto
				for(int i = 0; i < tarefaProjeto.size(); i++) {			  // e começo a comparar com as outras datas de inicio de tarefa para ver qual é a menor
					if (tarefaProjeto.get(i).datafimTarefa.compareTo(datafimProjeto) == 0) { //se as datas de inicio das tarefas forem iguais 											   															
					}
					else if (tarefaProjeto.get(i).datafimTarefa.compareTo(datafimProjeto) < 0) {
						datafimProjeto = datafimProjeto;						
					}					
					else {
						datafimProjeto = tarefaProjeto.get(i).datafimTarefa;						
					}	
				}
			}
			System.out.println("data fim do projeto: " + datafimProjeto);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*void add_tarefaProjeto(Tarefa adicionaTarefa) {	
			for (int i = 0; i < this.tarefaProjeto.length; i++) {
				if(tarefaProjeto[i]==null) {
					tarefaProjeto[i] = adicionaTarefa;
					System.out.println("Tarefa "+ tarefaProjeto[i].nomeTarefa + " foi adicionada ao projeto " + nomeProjeto);
					break;
				    }
				}
			}
		*/
		
		void add_tarefaProjeto(Tarefa novaTarefaProjeto) {
			tarefaProjeto.add(novaTarefaProjeto);			
		}
		
		void mostrar_tarefaProjeto() {
			System.out.println("Tarefas do Projeto "+nomeProjeto+" :");			
			int n = tarefaProjeto.size();
			for (int i = 0; i < n; i++) {
				System.out.print(
						"Nome: "+tarefaProjeto.get(i).nomeTarefa+
						" Inicio: "+ tarefaProjeto.get(i).datainicioTarefa+
						" Fim: "+tarefaProjeto.get(i).datafimTarefa);
				tarefaProjeto.get(i).mostrar_funcionarioTarefa();
			}
		}
		
		/*
		void mostrar_tarefaProjeto() {
			System.out.print("\nTarefas do Projeto "+nomeProjeto+"\n"); 
			for(int i = 0; i < this.tarefaProjeto.length; i++) {
				if(tarefaProjeto[i]!=null) {
					System.out.println("Nome: "+tarefaProjeto[i].nomeTarefa + " Inicio:"+ tarefaProjeto[i].datainicioTarefa+" Fim:"+tarefaProjeto[i].datafimTarefa);				
				}
			}
		}*/
		
		

}
	


