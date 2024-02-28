package org.champlain.itsec.lab71inputvalidation;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;

public class RegistrationController {
    @FXML
    private TextField firstNameTextField;

    @FXML
    private TextField lastNameTextField;

    @FXML
    protected void onRegisterButtonClick() {
        new Alert(Alert.AlertType.CONFIRMATION, "Hello, " +
                this.firstNameTextField.getText() + " " +
                this.lastNameTextField.getText() +
                "!\nYour registration was successful.").show();
    }
}