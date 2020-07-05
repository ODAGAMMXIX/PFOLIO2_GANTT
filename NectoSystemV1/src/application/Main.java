package application;
import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.ScrollPane;
import javafx.stage.Stage;
import application.ShowGantt;



public class Main extends Application {
	
	
	private static Scene mainScene;
	
	@Override
	public void start(Stage primaryStage) {
		try {

			
			//comando para abrir o grafico:
			ShowGantt teste = new ShowGantt();
			teste.mostrarGrafico();						
			
			//abre a tela CRUD de tarefas:
			FXMLLoader loader = new FXMLLoader(getClass().getResource("/gui/MainView.fxml"));
			ScrollPane scrollPane = loader.load();			
			scrollPane.setFitToHeight(true);
			scrollPane.setFitToWidth(true);			
			mainScene = new Scene(scrollPane);
			primaryStage.setScene(mainScene);
			primaryStage.setTitle("Sample JavaFX application");
			primaryStage.show();							
						
		} catch (IOException e) {
			e.printStackTrace();			
		}
	}

	public static Scene getMainScene() {
		return mainScene;
	}
	
	
	public static void main(String[] args) {
		launch(args);		
	}
}
