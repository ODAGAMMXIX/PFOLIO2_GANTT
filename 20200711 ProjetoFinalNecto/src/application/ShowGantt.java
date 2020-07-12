package application;
import java.util.List;
import application.GraphGantt;
import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.ScrollPane;
import javafx.stage.Stage;
import application.GraphGantt;
import model.dao.PRO_CadastroDao;
import model.dao.impl.*;
import db.DB;
import model.entities.PRO_Cadastro;
import model.entities.Tarefa;

public class ShowGantt {

	
		public void mostrarGrafico() {
		PRO_CadastroDaoJDBC acessProject = new PRO_CadastroDaoJDBC(DB.getConnection());
		TarefaDaoJDBC acess = new TarefaDaoJDBC(DB.getConnection()); //conecta o banco
		List<PRO_Cadastro> projetos = acessProject.findAll();
		List<Tarefa> tarefas = acess.findAll(); //lista os dados da tabela		
		GraphGantt gantt = new GraphGantt(projetos,tarefas);	
	}

}
