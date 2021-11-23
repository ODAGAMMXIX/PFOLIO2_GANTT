package application;

import java.util.List;

import db.DB;
import model.dao.impl.TarefaDaoJDBC;
import model.dao.impl.USE_CadastroDaoJDBC;
import model.entities.PRO_Cadastro;
import model.entities.Tarefa;
import model.entities.USE_Cadastro;

public class HoraUser {

	public void horaUsuario() {

		USE_CadastroDaoJDBC acessUser = new USE_CadastroDaoJDBC(DB.getConnection());
		TarefaDaoJDBC acess = new TarefaDaoJDBC(DB.getConnection());
		List<Tarefa> tarefas = acess.findAll();
		List<USE_Cadastro> usuarios = acessUser.findAll();	
		for(USE_Cadastro usuario: usuarios) {
			int horasUsuario = 0;
			for(Tarefa tarefa: tarefas) {
				if(tarefa.getOwner().equals(usuario.getUse_nome())) {
					horasUsuario = horasUsuario + (Integer.parseInt(tarefa.getDuration())*8);
			usuario.setUse_horas_usuario(Integer.toString(horasUsuario));
			acessUser.updateHorasUsuario(usuario);
				}
				
			}
		}
		
		
	}

}
