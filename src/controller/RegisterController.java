package controller;

import java.io.IOException;

import data.Database;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * @author Elsemarie Hinahon
 * @date 06/13/2024
 * A class that manages the register scene and saves credentials to a variable
 */
public class RegisterController {
	/**
	 * Instance variable for stage
	 */
	private Stage stage;

	/**
	 * Instance variable for scene
	 */
	private Scene scene;

	/**
	 * Instance variable for tfUsername
	 */
	@FXML
	public TextField tfUsername;
	
	/**
	 * Instance variable for pfpPassword
	 */
	@FXML
	public PasswordField pfPassword;
	
	/**
	 * Instance variable for lblError
	 */
	@FXML
	public Label lblError;

	/**
	 * Sets credentials and switches from the register scene to the login scene
	 * @param event The action triggered by user
	 * @throws IOException
	 */
	public void switchToSceneLogin(ActionEvent event) throws IOException {
		// Sets username and password
		Database.username = tfUsername.getText();
		Database.password = pfPassword.getText();

		//Loads the FXML file "SceneLogin.fxml"
		Parent root = FXMLLoader.load(getClass().getResource("/view/SceneLogin.fxml"));
		stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
}

