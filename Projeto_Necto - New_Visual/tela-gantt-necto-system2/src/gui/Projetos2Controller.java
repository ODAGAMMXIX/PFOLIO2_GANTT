package gui;

import java.io.IOException;
import java.net.URL;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.ResourceBundle;

import application.Main;
import db.DbIntegrityException;
import gui.listeners.DataChangeListener;
import gui.util.Alerts;
import gui.util.Utils;
import javafx.beans.property.ReadOnlyObjectWrapper;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TableCell;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.Pane;
import javafx.stage.Modality;
import javafx.stage.Stage;
import model.entities.Projetos2;
import model.services.Projetos2Service;

public class Projetos2Controller implements Initializable, DataChangeListener {

	private Projetos2Service service;
	
	@FXML
	private TableView<Projetos2> tableViewProjetos2;

	@FXML
	private TableColumn<Projetos2, Integer> tableColumnId;

	@FXML
	private TableColumn<Projetos2, String> tableColumnTitleProject;

	@FXML
	private TableColumn<Projetos2, Date> tableColumnDuration;

	@FXML
	private TableColumn<Projetos2, String> tableColumnProjectcol;

		
	@FXML
	private TableColumn<Projetos2, Projetos2> tableColumnEDIT;

	@FXML
	private TableColumn<Projetos2, Projetos2> tableColumnREMOVE;

	@FXML
	private Button btNew;
	

private ObservableList<Projetos2> obsList;

@FXML
public void onBtNewAction(ActionEvent event) {
	Stage parentStage = Utils.currentStage(event);
	Projetos2 obj = new Projetos2();
	createDialogForm2(obj, "/gui/Projetos2Form.fxml", parentStage);
}

public void setProjetos2Service(Projetos2Service service) {
	this.service = service;
}

@Override
public void initialize(URL url, ResourceBundle rb) {
	initializeNodes();
}

private void initializeNodes() {
	tableColumnId.setCellValueFactory(new PropertyValueFactory<>("id"));
	tableColumnTitleProject.setCellValueFactory(new PropertyValueFactory<>("titleproject"));
	tableColumnDuration.setCellValueFactory(new PropertyValueFactory<>("duration"));
	Utils.formatTableColumnDate(tableColumnDuration,"dd/MM/yyyy");
	tableColumnProjectcol.setCellValueFactory(new PropertyValueFactory<>("projectcol"));
	


	Stage stage = (Stage) Main.getMainScene().getWindow();
	tableViewProjetos2.prefHeightProperty().bind(stage.heightProperty());
}

public void updateTableView() {
	if (service == null) {
		throw new IllegalStateException("Service was null");
	}

	List<Projetos2> list = service.findAll();
	obsList = FXCollections.observableArrayList(list);
	tableViewProjetos2.setItems(obsList);
	initEditButtons();
	initRemoveButtons();

}

private void createDialogForm2(Projetos2 projetos2, String absoluteName, Stage parentStage) {
	try {
		FXMLLoader loader = new FXMLLoader(getClass().getResource(absoluteName));
		Pane pane = loader.load();

		Projetos2FormController controller = loader.getController();
		controller.setProjetos2(projetos2);
		controller.setProjetos2Service(new Projetos2Service());
		controller.subscribeDataChangeListener(this);
		controller.updateFormData();

		Stage dialogStage = new Stage();
		dialogStage.setTitle("Cadastro de dados do Projeto");
		dialogStage.setScene(new Scene(pane));
		dialogStage.setResizable(false);
		dialogStage.initOwner(parentStage);
		dialogStage.initModality(Modality.WINDOW_MODAL);
		dialogStage.showAndWait();
	}

	catch (IOException e) {
		Alerts.showAlert("IO Exception", "Error loading view", e.getMessage(), AlertType.ERROR);
	}
}

@Override
public void onDataChanged() {
	updateTableView();

}

private void initEditButtons() {
	tableColumnEDIT.setCellValueFactory(param -> new ReadOnlyObjectWrapper<>(param.getValue()));
	tableColumnEDIT.setCellFactory(param -> new TableCell<Projetos2, Projetos2>() {
		private final Button button = new Button("edit");

		@Override
		protected void updateItem(Projetos2 obj, boolean empty) {
			super.updateItem(obj, empty);
			if (obj == null) {
				setGraphic(null);
				return;
			}
			setGraphic(button);
			button.setOnAction(event -> createDialogForm2(obj, "/gui/Projetos2Form.fxml", Utils.currentStage(event)));
		}
	});
}

private void initRemoveButtons() {
	tableColumnREMOVE.setCellValueFactory(param -> new ReadOnlyObjectWrapper<>(param.getValue()));
	tableColumnREMOVE.setCellFactory(param -> new TableCell<Projetos2, Projetos2>() {
		private final Button button = new Button("remove");

		@Override
		protected void updateItem(Projetos2 obj, boolean empty) {
			super.updateItem(obj, empty);
			if (obj == null) {
				setGraphic(null);
				return;
			}
			setGraphic(button);
			button.setOnAction(event -> removeEntity(obj));
		}
	});
}

private void removeEntity(Projetos2 obj) {
	
Optional<ButtonType> result = Alerts.showConfirmation("Confirmation", " Tem certeza que deseja remover ? ");

	if (result.get() == ButtonType.OK) {
		try {
		service.remove(obj);
		updateTableView();
	}
	catch (DbIntegrityException e) {
		Alerts.showAlert("Error removing object", null, e.getMessage(), AlertType.ERROR);
	}
		
	}
}

}
