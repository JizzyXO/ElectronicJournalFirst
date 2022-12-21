package com.example.electronicjournalfirst;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    private PasswordField idField;

    @FXML
    protected void loginMessage() {
        checkId();

        //обработка запроса и вывод электронного журнала по заданному айди
    }

    @FXML
    protected void checkId() {
        //Проверка айди на валидность и прочее, возврат результата
    }
}