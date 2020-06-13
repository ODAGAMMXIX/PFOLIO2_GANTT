package gui;

import java.io.IOException;
import java.net.URL;
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
import model.entities.Projetos;
import model.services.ProjetosService;

public class ProjetosListController implements Initializable, DataChangeListener {

	private ProjetosService service;

	@FXML
	private TableView<Projetos> tableViewProjetos;

	@FXML
	private TableColumn<Projetos, Integer> tableColumnId;

	@FXML
	private TableColumn<Projetos, String> tableColumnTaskname;

	@FXML
	private TableColumn<Projetos, String> tableColumnStarttime;

	@FXML
	private TableColumn<Projetos, String> tableColumnOwner;

	@FXML
	private TableColumn<Projetos, String> tableColumnDuration;

	@FXML
	private TableColumn<Projetos, Projetos> tableColumnEDIT;

	@FXML
	private TableColumn<Projetos, Projetos> tableColumnREMOVE;

	@FXML
	private Button btNew;

	private ObservableList<Projetos> obsList;

	@FXML
	public void onBtNewAction(ActionEvent event) {
		Stage parentStage = Utils.currentStage(event);
		Projetos obj = new Projetos();
		createDialogForm(obj, "/gui/ProjetosForm.fxml", parentStage);
	}

	public void setProjetosService(ProjetosService service) {
		this.service = service;
	}

	@Override
	public void initialize(URL url, ResourceBundle rb) {
		initializeNodes();
	}

	private void initializeNodes() {
		tableColumnId.setCellValueFactory(new PropertyValueFactory<>("id"));
		tableColumnTaskname.setCellValueFactory(new PropertyValueFactory<>("taskname"));
		tableColumnStarttime.setCellValueFactory(new PropertyValueFactory<>("starttime"));
		tableColumnOwner.setCellValueFactory(new PropertyValueFactory<>("owner"));
		tableColumnDuration.setCellValueFactory(new PropertyValueFactory<>("duration"));

		Stage stage = (Stage) Main.getMainScene().getWindow();
		tableViewProjetos.prefHeightProperty().bind(stage.heightProperty());
	}

	public void updateTableView() {
		if (service == null) {
			throw new IllegalStateException("Service was null");
		}

		List<Projetos> list = service.findAll();
		obsList = FXCollections.observableArrayList(list);
		tableViewProjetos.setItems(obsList);
		initEditButtons();
		initRemoveButtons();

	}

	private void createDialogForm(Projetos obj, String absoluteName, Stage parentStage) {
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource(absoluteName));
			Pane pane = loader.load();

			ProjetosFormController controller = loader.getController();
			controller.setProjetos(obj);
			controller.setProjetosService(new ProjetosService());
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
		tableColumnEDIT.setCellFactory(param -> new TableCell<Projetos, Projetos>() {
			private final Button button = new Button("edit");

			@Override
			protected void updateItem(Projetos obj, boolean empty) {
				super.updateItem(obj, empty);
				if (obj == null) {
					setGraphic(null);
					return;
				}
				setGraphic(button);
				button.setOnAction(event -> createDialogForm(obj, "/gui/ProjetosForm.fxml", Utils.currentStage(event)));
			}
		});
	}

	private void initRemoveButtons() {
		tableColumnREMOVE.setCellValueFactory(param -> new ReadOnlyObjectWrapper<>(param.getValue()));
		tableColumnREMOVE.setCellFactory(param -> new TableCell<Projetos, Projetos>() {
			private final Button button = new Button("remove");

			@Override
			protected void updateItem(Projetos obj, boolean empty) {
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

	private void removeEntity(Projetos obj) {
		
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
