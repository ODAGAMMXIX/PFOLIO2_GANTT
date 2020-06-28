package gui;

import java.net.URL;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import db.DbException;
import gui.listeners.DataChangeListener;
import gui.util.Alerts;
import gui.util.Constraints;
import gui.util.Utils;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Labeled;
import javafx.scene.control.TextField;
import model.entities.Projetos2;
import model.services.Projetos2Service;

public class Projetos2FormController implements Initializable {
	
	private Projetos2 entity;
	
	private Projetos2Service service;
	
	private List<DataChangeListener> dataChangeListeners = new ArrayList<>();
	
	
	@FXML
	private TextField txtId;
	
	@FXML
	private TextField txtTitleProject;
	
	@FXML
	private DatePicker dpDuration;
	
	@FXML
	private TextField txtProjectcol;
	

	@FXML
	private Button btSave;
	
	@FXML
	private Button btCancel;

	private Labeled txtTitleprojeto;

	
	public void setProjetos2(Projetos2 entity) {
		this.entity = entity;
	}
	
	
	public void setProjetos2Service(Projetos2Service service) {
		this.service = service;
	}
	
	public void subscribeDataChangeListener(DataChangeListener listener) {
		dataChangeListeners.add(listener);
	}
	
	
	@FXML
	public void onBtSaveAction(ActionEvent event) {
		if (entity == null) {
			throw new IllegalStateException("Entity was null");
			
		}
		
		if (service == null) {
			throw new IllegalStateException("Service was null");
		}
		
		try {
		entity = getFormData();
		service.saveOrUpdate(entity);
		notifyDataChangeListeners();
		Utils.currentStage(event).close();
		
		
		}
		catch(DbException e) {
			Alerts.showAlert("Error saving object", null, e.getMessage(), AlertType.ERROR);
		}
		
	}
	
	private void notifyDataChangeListeners() {
		for(DataChangeListener listener: dataChangeListeners) {
			listener.onDataChanged();
		}
		
	}


	private Projetos2 getFormData() {
		Projetos2 obj = new Projetos2 ();
		
		
		
		
		obj.setId(Utils.tryParseToInt(txtId.getText()));
		obj.setTitleproject(txtTitleprojeto.getText());
		dpDuration.setValue(LocalDate(entity.getDuration().toInstant(), ZoneId.systemDefault()));
		obj.setProjectcol(txtProjectcol.getText());
	
		
	
		
		return obj;
	}
	

	


	private LocalDate LocalDate(Instant instant, ZoneId systemDefault) {
		// TODO Auto-generated method stub
		return null;
	}


	@FXML
	public void onBtCancelAction(ActionEvent event) {
		Utils.currentStage(event).close();
	
	}
	@Override
	public void initialize(URL url, ResourceBundle rb) {
		initializeNodes();
		
	}

	private void initializeNodes() {
		Constraints.setTextFieldInteger(txtId);
		Constraints.setTextFieldMaxLength(txtTitleProject,30);
		Utils.formatDatePicker(dpDuration,"dd/MM/yyyy");
		Constraints.setTextFieldMaxLength(txtProjectcol,30);
	

			
	}
	
	public void updateFormData() {
		
		if (entity == null) {
			throw new IllegalStateException("Entity was null");
		}
		
		txtId.setText(String.valueOf(entity.getId()));
		txtTitleProject.setText(entity.getTitleproject());
		
		txtProjectcol.setText(entity.getProjectcol());
		dpDuration.setValue(LocalDate(entity.getDuration().toInstant(), ZoneId.systemDefault()));
		

	}
	

	}
	
	
