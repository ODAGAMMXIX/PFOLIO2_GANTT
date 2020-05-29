package global;

import global.Grafico;

public class Funcionario {
	
	String nomeFuncionario;
	
	
	
	//construtor
	public Funcionario(String nomeFuncionario) {
		this.nomeFuncionario = nomeFuncionario;
		
	}
	
	//metodos de acesso do tipo setter:
	
			public void setnomeFuncionario(String nfp) {
				nomeFuncionario=nfp;
			}
			
	//metodos de acesso do tipo getter:
			public String getNomeFuncionario() {
				return nomeFuncionario;
			}

}
