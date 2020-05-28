package gui;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

import application.Main;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import model.entities.Projetos;
import model.services.ProjetosService;

public class ProjetosListController implements Initializable{
	
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
	private Button btNew;
	
	private ObservableList<Projetos> obsList;
	
	@FXML
	public void onBtNewAction() {
		System.out.println("onBtNewAction");
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
		}
}
