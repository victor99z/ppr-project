package org.view;

import java.io.IOException;
import javafx.fxml.FXML;
import org.App;

public class PrimaryController {

    @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("secondary");
    }
}
