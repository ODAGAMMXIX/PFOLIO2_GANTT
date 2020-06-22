package global;

import java.time.LocalDate;
import java.util.ArrayList;

import global.Grafico;

public class Funcionario {
	
	String nomeFuncionario;
	ArrayList<LocalDate> diasFuncionario;		
	//construtor
	public Funcionario(String nomeFuncionario) {
		this.nomeFuncionario = nomeFuncionario;
		this.diasFuncionario = new ArrayList<LocalDate>();
	}	
	//setters:	
			public void setnomeFuncionario(String nfp) {
				nomeFuncionario=nfp;
			}			
			public void setdiasFuncionario(ArrayList<LocalDate> dff){
				diasFuncionario = dff;
			}			
	//getters:
			public String getNomeFuncionario() {
				return nomeFuncionario;
			}
			public ArrayList<LocalDate> getDiasFuncionario() {
				return diasFuncionario;
			}
	//metodos:
			
			void qtde_horasFuncionario() {
				System.out.println("Total de horas do funcionario "+nomeFuncionario+": "+diasFuncionario.size()*8+" horas");
				
			}
			
			void qtde_horasMesFuncionario(String mes) {
				double dia = 0;
					for(int i = 0; i<diasFuncionario.size();i++) {
						if(diasFuncionario.get(i).getMonth().name().equals(mes)) {
							dia++;
						}
					}
				System.out.print("Nome: "+nomeFuncionario+", Horas Trabalhadas no mes de "+mes+": "+(dia*8));
				System.out.print(", % de horas disponiveis: "+((1-((dia*8)/200))*100)+" %"); 										
			}
			
			
			
			
			

}
