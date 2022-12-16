package com.example.electronicjournalfirst;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void loginMessage() {
        welcomeText.setText("Вход выполнен!");
    }
}