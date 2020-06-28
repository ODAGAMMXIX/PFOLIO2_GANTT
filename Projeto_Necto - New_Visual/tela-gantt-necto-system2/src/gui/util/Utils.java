package gui.util;

import java.util.Date;

import javafx.event.ActionEvent;
import javafx.scene.Node;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.stage.Stage;
import model.entities.Projetos2;

public class Utils {
	
	public static Stage currentStage(ActionEvent event) {
		
		return (Stage) ((Node) event.getSource()).getScene().getWindow();
	}
	
	public static Integer tryParseToInt(String str) {
		try {
		return Integer.parseInt(str);
		
	}

		catch (NumberFormatException e) {
			return null;
		}
}

	public static void formatTableColumnDate(TableColumn<Projetos2, Date> tableColumnDuration, String string) {
		// TODO Auto-generated method stub
		
	}

	public static void formatDatePicker(DatePicker dpDuration, String string) {
		// TODO Auto-generated method stub
		
	}
}