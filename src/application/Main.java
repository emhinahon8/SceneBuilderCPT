package application;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * @author Elsemarie Hinahon
 * @date 06/13/2024
 * The main class that manages the register, login, and webview code
 */
public class Main extends Application{

	/**
	 * Initializes and displays the stages using the layouts in the FXML files
	 */
	@Override
	public void start(Stage stage) {
		try {
			//Loads the FXML file "SceneRegister.fxml"
			Parent root = FXMLLoader.load(getClass().getResource("/view/SceneRegister.fxml"));
			
			// Creates a new scene from the FXML file
			Scene sceneRegister = new Scene(root);
			stage.setScene(sceneRegister);
			// Displays the stage with the scene that was set
			stage.show();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	
	/**
	 * Starts the JavaFX application
	 * @param args The arguments being passed in
	 */
	public static void main(String[] args) {
		launch(args);
	}
	
}
