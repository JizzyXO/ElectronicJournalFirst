package com.example.electronicjournalfirst;

import backend.Students;
import backend.Teachers;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloController {
    Students students1 = new Students("Абдулхаев Руслан Илфатович", "0.1");
    Students students2 = new Students("Агарков Родион Андреевич", "0.2");
    Students students3 = new Students("Алёшин Илья Алексеевич", "0.3");
    Students students4 = new Students("Бебякин Марк Алексеевич", "0.4");
    Students students5 = new Students("Бородин Дмитрий Иванович", "0.5");
    Students students6 = new Students("Булавкин Михаил Николаевич", "0.6");
    Students students7 = new Students("Василенко Денис Владимирович", "0.7");
    Students students8 = new Students("Виноградов Александр Юрьевич", "0.8");
    Students students9 = new Students("Еремеев Дмитрий Васильевич", "0.9");
    Students students10 = new Students("Ермаков Ростислав Сергеевич", "1.0");
    Students students11 = new Students("Жевраков Руслан Александрович", "1.1");
    Students students12 = new Students("Жулин Артём Михайлович", "1.2");
    Students students13 = new Students("Зайцев Владислав Дмитриевич", "1.3");
    Students students14 = new Students("Иванов Илья Сергеевич", "1.4");
    Students students15 = new Students("Камбаров Самандар Ойбек Угли", "1.5");
    Students students16 = new Students("Катёлкин Павел Алексеевич", "1.6");
    Students students17 = new Students("Комляков Владислав Александрович", "1.7");
    Students students18 = new Students("Лобышев Юрий Сергеевич", "1.8");
    Students students19 = new Students("Молоток Данила Святославович", "1.9");
    Students students20 = new Students("Мусаев Рауф Надир оглы", "2.0");
    Students students21 = new Students("Самойлов Савелий Дмитриевич", "2.1");
    Students students22 = new Students("Самойлов-Журавлёв Вячеслав Максимович", "2.2");
    Students students23 = new Students("Сахно Илья Павлович", "2.3");
    Students students24 = new Students("Соловьёв Артём Евгеньевич", "2.4");
    Students students25 = new Students("Талыбов Никита Мехтиевич", "2.5");
    Students students26 = new Students("Ткачёв Михаил Валерьевич", "2.6");
    Students students27 = new Students("Шелейко Ян Алексеевич", "2.7");
    Teachers teachers = new Teachers("Кошкин Виталий Андреевич", "1");
    @FXML
    private Label welcomeText;

    @FXML
    private TextField TextName;

    @FXML
    private TextField TextID;

    @FXML
    protected void loginMessage() throws IOException {
        //checkId();

        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Journal.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 1400, 720);
        Stage stageSecond = new Stage();
        stageSecond.setScene(scene);
        stageSecond.show();

    }

    @FXML
    protected void checkId() {
        if (TextID.getText().equals("1")) {
            System.out.println("Здравстуйте, " + " " + teachers.fullNameTeachers);

        } else if (TextID.getText().equals("0.1")) {
            System.out.println("Здравствуйте, " + " " + students1.fullNameStudents);
        } else if (TextID.getText().equals("0.2")) {
            System.out.println("Здравствуйте, " + " " + students2.fullNameStudents);
        } else if (TextID.getText().equals("0.3")) {
            System.out.println("Здравствуйте, " + " " + students3.fullNameStudents);
        } else if (TextID.getText().equals("0.4")) {
            System.out.println("Здравствуйте, " + " " + students4.fullNameStudents);
        } else if (TextID.getText().equals("0.5")) {
            System.out.println("Здравствуйте, " + " " + students5.fullNameStudents);
        } else if (TextID.getText().equals("0.6")) {
            System.out.println("Здравствуйте, " + " " + students6.fullNameStudents);
        } else if (TextID.getText().equals("0.7")) {
            System.out.println("Здравствуйте, " + " " + students7.fullNameStudents);
        } else if (TextID.getText().equals("0.8")) {
            System.out.println("Здравствуйте, " + " " + students8.fullNameStudents);
        } else if (TextID.getText().equals("0.9")) {
            System.out.println("Здравствуйте, " + " " + students9.fullNameStudents);
        } else if (TextID.getText().equals("1.0")) {
            System.out.println("Здравствуйте, " + " " + students10.fullNameStudents);
        } else if (TextID.getText().equals("1.1")) {
            System.out.println("Здравствуйте, " + " " + students11.fullNameStudents);
        } else if (TextID.getText().equals("1.2")) {
            System.out.println("Здравствуйте, " + " " + students12.fullNameStudents);
        } else if (TextID.getText().equals("1.3")) {
            System.out.println("Здравствуйте, " + " " + students13.fullNameStudents);
        } else if (TextID.getText().equals("1.4")) {
            System.out.println("Здравствуйте, " + " " + students14.fullNameStudents);
        } else if (TextID.getText().equals("1.5")) {
            System.out.println("Здравствуйте, " + " " + students15.fullNameStudents);
        } else if (TextID.getText().equals("1.6")) {
            System.out.println("Здравствуйте, " + " " + students16.fullNameStudents);
        } else if (TextID.getText().equals("1.7")) {
            System.out.println("Здравствуйте, " + " " + students17.fullNameStudents);
        } else if (TextID.getText().equals("1.8")) {
            System.out.println("Здравствуйте, " + " " + students18.fullNameStudents);
        } else if (TextID.getText().equals("1.9")) {
            System.out.println("Здравствуйте, " + " " + students19.fullNameStudents);
        } else if (TextID.getText().equals("2.0")) {
            System.out.println("Здравствуйте, " + " " + students20.fullNameStudents);
        } else if (TextID.getText().equals("2.1")) {
            System.out.println("Здравствуйте, " + " " + students21.fullNameStudents);
        } else if (TextID.getText().equals("2.2")) {
            System.out.println("Здравствуйте, " + " " + students22.fullNameStudents);
        } else if (TextID.getText().equals("2.3")) {
            System.out.println("Здравствуйте, " + " " + students23.fullNameStudents);
        } else if (TextID.getText().equals("2.4")) {
            System.out.println("Здравствуйте, " + " " + students24.fullNameStudents);
        } else if (TextID.getText().equals("2.5")) {
            System.out.println("Здравствуйте, " + " " + students25.fullNameStudents);
        } else if (TextID.getText().equals("2.6")) {
            System.out.println("Здравствуйте, " + " " + students26.fullNameStudents);
        } else if (TextID.getText().equals("2.7")) {
            System.out.println("Здравствуйте, " + " " + students27.fullNameStudents);
        }
    }

    @FXML
    public String getID() {
        return students1.idStudents;
    }
}