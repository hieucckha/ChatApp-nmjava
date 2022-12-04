package com.nmjava.chatapp;

import com.nmjava.chatapp.utils.SceneController;
import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application {
    private void registerScene() {
        SceneController sc = new SceneController();
        sc.addScene("Login", "/com/nmjava/chatapp/views/Login.fxml");
        sc.addScene("Signup", "/com/nmjava/chatapp/views/Signup.fxml");
        sc.addScene("ForgotPw", "/com/nmjava/chatapp/views/ForgotPw.fxml");
        sc.addScene("AdminHome", "/com/nmjava/chatapp/views/AdminHome.fxml");
        sc.addScene("UserHome", "/com/nmjava/chatapp/views/UserHome.fxml");
    }

    @Override
    public void start(Stage primaryStage) {
        registerScene();

        primaryStage.setTitle("Hello!");
        primaryStage.setScene(SceneController.staticGetScene("UserHome"));
        primaryStage.setWidth(800);
        primaryStage.setHeight(400);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}