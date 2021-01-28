/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.darioaxel.useradministration.gui;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 * JavaFX App
 */
public class App extends Application {

	 @Override

		 public void start(Stage stage) {
	    	  Parent root = null;
	  		// We need to add a try catch to avoid Exceptions if the fxml document doesn't exist.
	      	try {
	      		// FXMLLoader join our Front View FXML document (Main.fxml) and the Control Java class (MainController.java)
	      		
	  			root = FXMLLoader.load(getClass().getResource("/com/darioaxel/useradministration/gui/views/Main.fxml"));
	  			
	  		} catch (IOException e) {
	  			System.out.print("EXCEPCION: No es capaz de encontrar Main.fxml");
	  			// TODO Auto-generated catch block
	  			e.printStackTrace();
	  		}
	           Scene scene = new Scene(root);
	           stage.setScene(scene);
	           stage.show();
	    }
	    

    public static void main(String[] args) {
        launch();
    }

}