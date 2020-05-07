package com.darioaxel.useradministration.gui.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class MainController {
	
	@FXML
	Button startButton;
	
	@FXML
	Label startLabel;
	
	@FXML
	TextField startTextField;
	
	@FXML
	public void saySomething(ActionEvent event) {
		startTextField.setText("Hey! ho! Let's go!!!");
	}
}
