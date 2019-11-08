package org.view;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import org.App;

public class MenuController {

    @FXML
    private Button secondaryButton;

    @FXML
    private void switchToPrimary() throws IOException {
        App.setRoot("primary");
    }
}