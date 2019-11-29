package org.view;

import java.io.IOException;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

import org.App;

public class SecondaryController {

    @FXML
    private Label labelErro;

    @FXML
    private JFXTextField input;

    @FXML
    private JFXButton secondaryButton;

    @FXML
    private void switchToMenu() throws IOException {
        App.setRoot("Menu");
    }

    @FXML
    void verificaCpf(ActionEvent event) throws IOException{
        if(input.getText().length() == 11){
            App.setRoot("Menu");
        }else{
            System.err.println("CPF INVALIDO");
            input.setPromptText("CPF Invalido");
        }
    } 
}