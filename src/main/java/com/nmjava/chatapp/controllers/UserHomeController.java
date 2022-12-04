package com.nmjava.chatapp.controllers;

import com.nmjava.chatapp.components.Avatar;
import com.nmjava.chatapp.components.ContactMessageCard;
import com.nmjava.chatapp.components.UserTitleChat;
import javafx.event.EventHandler;
import javafx.event.EventType;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.VBox;

import java.net.URL;
import java.util.ResourceBundle;

public class UserHomeController implements Initializable {

    @FXML
    private VBox vboxRoot;
    @FXML
    private Button addBtn;

    public UserHomeController() {

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        addBtn.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                System.out.println("addBtn is clicked");
                ContactMessageCard cmc = new ContactMessageCard(300, "Hieu Nguyen", 10, "Day la loi nhan cuoi cung");
                UserTitleChat utc = new UserTitleChat(50, "Hieu Nguyen", 10);
                vboxRoot.getChildren().add(cmc);
            }
        });
    }
}
