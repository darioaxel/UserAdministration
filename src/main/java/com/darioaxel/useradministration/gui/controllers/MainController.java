package com.darioaxel.useradministration.gui.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class MainController {
	
	@FXML
	Button startButton;
	
	@FXML
	Label startLabel;
	
	@FXML
	TextField startTextField;
	
	@FXML
	Rectangle basicRectangle;
	
	@FXML
	public void saySomething(ActionEvent event) {
		startTextField.setText("Hey! ho! Let's go!!!");
		System.out.println(event.toString());
	}
	
	@FXML
	public void changeColorOnEnter() {
		System.out.println("On enter");
		basicRectangle.setFill(Color.RED);		
	}
	
	@FXML
	public void changeColorOnExit() {
		System.out.println("On exit");
		basicRectangle.setFill(Color.BLUE);		
	}
}
