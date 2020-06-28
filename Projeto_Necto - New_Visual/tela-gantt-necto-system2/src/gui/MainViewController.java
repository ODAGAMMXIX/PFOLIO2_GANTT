package gui;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.function.Consumer;

import application.Main;
import gui.util.Alerts;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.VBox;
import model.services.ProjetosService;

public class MainViewController implements Initializable {
	
	
	
	@FXML
	private Button Projetos;
	
	@FXML
	private Button Tarefas;

	@FXML
	private Button Gantt;
	
	@FXML
	private Button Funcionarios;
	
	
	
	
	@FXML
	public void onBtProjetosAction() {
		loadView("/gui/ProjetosList.fxml", (ProjetosListController controller) -> {
			controller.setProjetosService(new ProjetosService());
			controller.updateTableView();
		});
		
	}
	
	@FXML
	public void onBtTarefasAction() {
		loadView("/gui/Projetos2.fxml", x -> {});
		
	}
	
	@FXML
	public void onBtGanttAction() {
		loadView("/gui/Gantt.fxml", x -> {});
		
	}

	
	@FXML
	public void onBtFuncionariosAction() {
		loadView("/gui/Funcionarios.fxml", x -> {});
		
	}
	

	
	
	
	
	@Override
	public void initialize(URL uri, ResourceBundle rb) {
	
		
	}
	private synchronized <T >void loadView(String absoluteName, Consumer<T> initializingAction) {
		try {
		FXMLLoader loader = new FXMLLoader(getClass().getResource(absoluteName));
		VBox newVBox = loader.load();
		
		Scene mainScene = Main.getMainScene();
		
		VBox mainVBox = (VBox) ((ScrollPane) mainScene.getRoot()).getContent();
		
		Node mainMenu = mainVBox.getChildren().get(0);
		mainVBox.getChildren().clear();
		mainVBox.getChildren().add(mainMenu);
		mainVBox.getChildren().addAll(newVBox.getChildren());
		
		T controller = loader.getController();
		initializingAction.accept(controller);
	}
		catch (IOException e) {
			Alerts.showAlert("IO Exception", "Error loading view", e.getMessage(), AlertType.ERROR);
		}
	}
	
	
	
	
}