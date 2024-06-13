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
 * A class that manages the login scene and login button
 */

public class LoginController {

	/**
	 * Instance variable for stage
	 */
	private Stage stage;

	/**
	 * Instance variable for scene
	 */
	private Scene scene;

	/**
	 * Instance variable for root
	 */
	private Parent root;

	/**
	 * Instance variable for tfUsername
	 */
	@FXML
	public TextField tfUsername;

	/**
	 * Instance variable for pfPassword
	 */
	@FXML
	public PasswordField pfPassword;

	/**
	 * Instance variable for lblError
	 */
	@FXML
	public Label lblError;

	/**
	 * Handles the login button and checks to see if username and password are correct
	 * @param event The action triggered by user
	 * @throws IOException
	 */
	public void loginButtonPressed(ActionEvent event) throws IOException {

		/* Get the user name and password from register page */
		String username = tfUsername.getText();
		String password = pfPassword.getText();

		// If credentials entered DOES NOT EQUAL
		// credentials in database (aka registered credentials),
		// return error message.
		if (!username.equals(Database.username) || !password.equals(Database.password)) {
			lblError.setText("Invalid username or password.");
			lblError.setVisible(true);
			return;
		}

		// Switch scenes to Github WebView if entered credentials are correct
		root = FXMLLoader.load(getClass().getResource("/view/SceneWebView.fxml"));
		stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();

	}

//// EXTRA CODE THAT WORKS TO SOLELY SWITCH SCENES without credentials (Initial test code)
//public void switchToSceneWebView(ActionEvent event) throws IOException {
//Parent root = FXMLLoader.load(getClass().getResource("/view/SceneWebView.fxml"));
//stage = (Stage)((Node)event.getSource()).getScene().getWindow();
//scene = new Scene(root);
//stage.setScene(scene);
//stage.show();
// }
}
