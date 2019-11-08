package org.view;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

import java.io.IOException;

public class ThirdController {

    @FXML
    private Button secondaryButton;

    @FXML
    private void switchToPrimary() throws IOException {
        App.setRoot("primary");
    }
}