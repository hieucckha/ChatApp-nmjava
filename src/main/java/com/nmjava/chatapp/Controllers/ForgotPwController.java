package com.nmjava.chatapp.Controllers;

import com.nmjava.chatapp.Utils.SceneController;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class ForgotPwController {
    public TextField fdEmail;
    public Button btnResetPw;
    public Button btnCancel;

    @FXML
    protected void handleButtonClicks(ActionEvent actionEvent) {
        Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();

        if (actionEvent.getSource() == btnResetPw) {
            onResetPwBtnClick(stage);
        } else if (actionEvent.getSource() == btnCancel) {
            onCancelBtnClick(stage);
        }
    }

    private void onResetPwBtnClick(Stage stage) {
        System.out.println("Reset Password");
        stage.setScene(SceneController.staticGetScene("Login"));
        stage.show();
    }

    private void onCancelBtnClick(Stage stage) {
        System.out.println("Signup");
        stage.setScene(SceneController.staticGetScene("Login"));
        stage.show();
    }
}
