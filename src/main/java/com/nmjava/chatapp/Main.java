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
        sc.addScene("UserFriendOnline", "/com/nmjava/chatapp/views/UserFriendOnline.fxml");

        sc.addScene("Test", "/com/nmjava/chatapp/views/Test.fxml");
        sc.addScene("TestingComponent", "/com/nmjava/chatapp/views/TestingComponents.fxml");
    }

    @Override
    public void start(Stage primaryStage) {
        registerScene();

        primaryStage.setTitle("Hello!");
        primaryStage.setScene(SceneController.staticGetScene("UserFriendOnline"));
        primaryStage.setWidth(1200);
        primaryStage.setHeight(800);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}