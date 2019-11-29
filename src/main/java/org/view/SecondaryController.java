package org.view;

import java.io.IOException;
import javafx.fxml.FXML;
import org.App;

public class SecondaryController {

    @FXML
    private void switchToMenu() throws IOException {
        App.setRoot("menu");
    }
}