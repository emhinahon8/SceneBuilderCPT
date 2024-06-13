package controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;

/**
 * @author Elsemarie Hinahon
 * @date 06/13/2024
 * Displays my Github webpage 
 */
public class WebViewController implements Initializable {
	/**
	 * Instance variable for webView
	 */
	 @FXML
	 private WebView webView;
	 
	 /**
	  * Instance variable for textField
	  */
	 @FXML
	 private TextField textField;
	 
	 /**
	  * Instance variable for engine
	  */
	 private WebEngine engine;
	 
	/**
	 * Initializes the web engine and loads the Github web page
	 * @param arg0 Type URL
	 * @param arg1 Type ResourceBundle
	 */
	public void initialize(URL arg0, ResourceBundle arg1) {
		engine = webView.getEngine();
		loadPage();
	}
	
	/**
	 * Uses the engine to load the Github webpage of my profile
	 */
	public void loadPage() {
		engine.load("https://github.com/emhinahon8");
	}
	
}
