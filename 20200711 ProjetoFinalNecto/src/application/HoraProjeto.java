package application;

import java.util.List;

import db.DB;
import model.dao.impl.PRO_CadastroDaoJDBC;
import model.dao.impl.TarefaDaoJDBC;
import model.entities.PRO_Cadastro;
import model.entities.Tarefa;

public class HoraProjeto {

	public void horaProjeto() {
		
		PRO_CadastroDaoJDBC acessProject = new PRO_CadastroDaoJDBC(DB.getConnection());
		TarefaDaoJDBC acess = new TarefaDaoJDBC(DB.getConnection()); //conecta o banco
		List<PRO_Cadastro> projetos = acessProject.findAll();
		List<Tarefa> tarefas = acess.findAll();
		
		for(PRO_Cadastro projeto: projetos) {
			int horasProjeto = 0;
			for(Tarefa tarefa: tarefas) {
				if(tarefa.getProjeto().equals(projeto.getPro_Titulo())) {
					horasProjeto = horasProjeto + (Integer.parseInt(tarefa.getDuration())*8);
			projeto.setPro_Horas(Integer.toString(horasProjeto));
			acessProject.updateHorasProjeto(projeto);
				}
				
			}
		}
		
		
	}

}
