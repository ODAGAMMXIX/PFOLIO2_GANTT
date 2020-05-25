package global;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Projeto {
	
	String nomeProjeto;
	LocalDate datainicioProjeto;
	LocalDate datafimProjeto;
	Integer horasProjeto;
	Tarefa[] tarefaProjeto;
	
	//construtor:
	public Projeto (String nomeProjeto) {
		this.nomeProjeto = nomeProjeto;
		this.datainicioProjeto = datainicioProjeto = LocalDate.now();
		this.datafimProjeto = datafimProjeto = LocalDate.now();
		this.horasProjeto = horasProjeto;
		this.tarefaProjeto = new Tarefa[10];
		}
		
	//metodos de acesso do tipo setter:
		
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


	//metodos de acesso do tipo getter:
		public String getNomeProjeto() {
			return nomeProjeto;
		}
		public LocalDate getDataInicioProjeto() {
			return datainicioProjeto;
		}
		public LocalDate DataFimProjeto() {
			return datafimProjeto;
		}
		public Integer HorasProjeto() {
			return horasProjeto;
		}
		
		
		void dia_projeto() {			
			long intervalodiaProjeto = (ChronoUnit.DAYS.between(datainicioProjeto, datafimProjeto))+1; //http://caiosantesso.com/como-calcular-diferenca-entre-datas-no-java-8/
			System.out.println("duração do projeto é de " + intervalodiaProjeto + " dia(s).");
			}
		void add_dataInicioProjeto(String inicioprojeto){
			String[] inicio_projeto = inicioprojeto.split("/");//https://blog.education-ecosystem.com/dividir-string-java/
			int diaInicioProjeto = Integer.parseInt(inicio_projeto[0]);//https://pt.stackoverflow.com/questions/48846/converter-string-para-inteiro-em-java/48847
			int mesInicioProjeto = Integer.parseInt(inicio_projeto[1]);
			int anoInicioProjeto = Integer.parseInt(inicio_projeto[2]);
			LocalDate novoinicioProjeto = LocalDate.of(anoInicioProjeto, mesInicioProjeto, diaInicioProjeto);
			datainicioProjeto = novoinicioProjeto;
			System.out.println("Data de Inicio do Projeto: " + datainicioProjeto);		
			}
		void add_dataFimProjeto(String fimprojeto) {
			String[] fim_projeto = fimprojeto.split("/");
			int diaFimProjeto = Integer.parseInt(fim_projeto[0]);
			int mesFimProjeto = Integer.parseInt(fim_projeto[1]);
			int anoFimProjeto = Integer.parseInt(fim_projeto[2]);
			LocalDate novofimProjeto = LocalDate.of(anoFimProjeto, mesFimProjeto, diaFimProjeto);
			datafimProjeto = novofimProjeto;
			System.out.println("Data de Fim do Projeto: " + datafimProjeto);							
			}
		void add_tarefaProjeto(Tarefa adicionaTarefa) {	
			for (int i = 0; i < this.tarefaProjeto.length; i++) {
				if(tarefaProjeto[i]==null) {
					tarefaProjeto[i] = adicionaTarefa;
					System.out.println("Tarefa "+ tarefaProjeto[i].nomeTarefa + " foi adicionada ao projeto " + nomeProjeto);
					break;
				    }
				}
			}
		
		void mostrar_tarefaProjeto() {
			System.out.print("\nTarefas do Projeto "+nomeProjeto+"\n"); 
			for(int i = 0; i < this.tarefaProjeto.length; i++) {
				if(tarefaProjeto[i]!=null) {
					System.out.println("Nome: "+tarefaProjeto[i].nomeTarefa + " Inicio:"+ tarefaProjeto[i].datainicioTarefa+" Fim:"+tarefaProjeto[i].datainicioTarefa);				
				}
			}
		}
		
		

}
	


