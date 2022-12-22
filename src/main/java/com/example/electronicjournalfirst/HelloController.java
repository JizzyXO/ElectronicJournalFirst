package com.example.electronicjournalfirst;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    private TextField TextName;

    @FXML
    private TextField TextID;
    @FXML
    protected void loginMessage() {
        checkId();

        //обработка запроса и вывод электронного журнала по заданному айди
    }

    @FXML
    protected void checkId() {
        if (TextID.getText().equals("1")) {

        }
    }


}