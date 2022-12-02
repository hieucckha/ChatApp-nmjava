package com.nmjava.chatapp.Controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import com.nmjava.chatapp.Utils.SceneController;
import javafx.stage.Stage;

public class LoginController {

    public TextField fdPassword;
    public TextField fdEmail;
    public Button btnLogin;
    public Button btnForgotPw;
    public Button btnSignup;

    @FXML
    protected void handleButtonClicks(ActionEvent actionEvent) {
        Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();

        if (actionEvent.getSource() == btnLogin) {
            onLoginBtnClick(stage);
        } else if (actionEvent.getSource() == btnSignup) {
            onSignupBtnClick(stage);
        } else if (actionEvent.getSource() == btnForgotPw) {
            onForgotPwBtnClick(stage);
        }
    }

    private void onLoginBtnClick(Stage stage) {
//        stage.setScene(SceneController.staticGetScene(""));
    }

    private void onSignupBtnClick(Stage stage) {
        System.out.println("Signup");
        stage.setScene(SceneController.staticGetScene("Signup"));
        stage.show();
    }
    private void onForgotPwBtnClick(Stage stage) {
        System.out.println("Forgot");
        stage.setScene(SceneController.staticGetScene("ForgotPw"));
        stage.show();
    }
}
