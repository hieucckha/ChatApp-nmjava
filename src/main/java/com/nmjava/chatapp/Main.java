package com.nmjava.chatapp;

import com.nmjava.chatapp.Utils.SceneController;
import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application {
    private void registerScene() {
        SceneController sc = new SceneController();
        sc.addScene("Login", "/com/nmjava/chatapp/views/Login.fxml");
        sc.addScene("Signup", "/com/nmjava/chatapp/views/Signup.fxml");
        sc.addScene("ForgotPw", "/com/nmjava/chatapp/views/ForgotPw.fxml");
        sc.addScene("AdminHome", "/com/nmjava/chatapp/views/AdminHome.fxml");
        sc.addScene("Users", "/com/nmjava/chatapp/views/Chatuser.fxml");
        sc.addScene("Test", "/com/nmjava/chatapp/views/Test.fxml");
    }
    @Override
    public void start(Stage primaryStage) {
        registerScene();

        primaryStage.setTitle("Hello!");
        primaryStage.setScene(SceneController.staticGetScene("Users"));
        primaryStage.setWidth(1200);
        primaryStage.setHeight(800);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}