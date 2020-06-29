package global;

import java.time.LocalDate;
import java.util.ArrayList;

public class Gerenciador {
	
	ArrayList<Projeto> listaProjeto;
	ArrayList<Funcionario> listaFuncionario;
	ArrayList<Empresa> listaEmpresa;

	public Gerenciador() {
		
		this.listaProjeto = new ArrayList<Projeto>();
		this.listaFuncionario = new ArrayList<Funcionario>();
		this.listaEmpresa = new ArrayList<Empresa>();
		// TODO Auto-generated constructor stub
	}
	
	//setters:
	public void setlistaProjeto(ArrayList<Projeto> lp) {
		listaProjeto = lp;
	}	
	public void setlistaFuncionario(ArrayList<Funcionario> lf) {
		listaFuncionario = lf;
	}	
	public void setlistaEmpresa(ArrayList<Empresa> le) {
		listaEmpresa = le;
	}
	
	//getters:
	public ArrayList<Projeto> getListaProjeto() {
		return listaProjeto;
	}
	
	public ArrayList<Funcionario> getListaFuncionario() {
		return listaFuncionario;
	}
	
	public ArrayList<Empresa> getListaEmpresa() {
		return listaEmpresa;
	}
	
	//metodos:
	void add_projeto(Projeto novoProjeto) {
		listaProjeto.add(novoProjeto);
	}
	void add_funcionario(Funcionario novoFuncionario) {
		listaFuncionario.add(novoFuncionario);
	}
	void add_empresa(Empresa novaEmpresa) {
		listaEmpresa.add(novaEmpresa);
	}
	void horas_dia(String dataEmAnalise) {
		int horas = 0;
		String[] dia_Em_Analise = dataEmAnalise.split("/");
		int diaEmAnalise = Integer.parseInt(dia_Em_Analise[0]);
		int mesEmAnalise = Integer.parseInt(dia_Em_Analise[1]);
		int anoEmAnalise = Integer.parseInt(dia_Em_Analise[2]);
		LocalDate dia = LocalDate.of(anoEmAnalise, mesEmAnalise,diaEmAnalise );
		
		
		for(int i1 = 0; i1<listaProjeto.size(); i1++)
			
			for(int i2 = 0; i2<listaProjeto.get(i1).tarefaProjeto.size();i2++)
				
				//for(int i3 = 0; i3<listaProjeto.get(i1).tarefaProjeto.get(i2).DiasTarefa(i3))
				if(listaProjeto.get(i1).tarefaProjeto.get(i2).DiasTarefa().contains(dia))
					horas = horas + (listaProjeto.get(i1).tarefaProjeto.get(i2).funcionarioTarefa.size()*8);
		
		System.out.println("Total de Horas do dia "+dataEmAnalise+": " +horas+" horas.");
	}
	
	void imprimeGrafico() {
		
	}
	
	
	
	
	
	
	
		
	
}
