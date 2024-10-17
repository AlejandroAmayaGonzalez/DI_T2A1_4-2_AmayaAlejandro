package ieslosmontecillos.di_t2a1_ej4_2_amayaalejandro;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.text.Text;

public class FXMLExampleController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    @FXML private Text action_target;

    @FXML protected void handleSubmitButtonAction(ActionEvent event) {
        action_target.setText("Sign in button pressed");
    }
}