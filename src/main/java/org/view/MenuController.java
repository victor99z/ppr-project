package org.view;

import javafx.fxml.FXML;
import org.App;

import java.io.IOException;

public class MenuController {
    @FXML
    private void SwitchToHome() throws IOException {
        App.setRoot("primary");
    }
}
