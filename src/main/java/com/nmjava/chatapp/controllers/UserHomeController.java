package com.nmjava.chatapp.controllers;

import com.nmjava.chatapp.components.*;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

import java.net.URL;
import java.util.ResourceBundle;

public class UserHomeController implements Initializable {
    @FXML
    public GridPane utilsContainer;
    @FXML
    public HBox titleChatContainer;

    @FXML
    public GridPane listInfoContainer;
    @FXML
    public GridPane chatContainer;
    @FXML
    private ScrollPane chatListSP;
    @FXML
    private VBox chatList;
    @FXML
    private Label nameContacting;
    @FXML
    private Label statusContacting;

    public UserHomeController() {

    }

    @Override
    public void initialize(URL arg0, ResourceBundle agr1) {
        UserTitleChat utc = new UserTitleChat("Something is the long long long long long long long long long long text", 10);
        this.titleChatContainer.getChildren().add(utc);

        chatListSP.setHbarPolicy(ScrollPane.ScrollBarPolicy.NEVER);
        chatListSP.setVbarPolicy(ScrollPane.ScrollBarPolicy.NEVER);

        chatList.getChildren().add(new ContactMessageCard("Nguyen hieu", 10, "Day la tin nhan cuoi cung cua ban"));
        chatList.getChildren().add(new ContactMessageCard("Nguyen hieu", 10, "Day la tin nhan cuoi cung cua ban"));
        chatList.getChildren().add(new ContactMessageCard("Nguyen hieu", 10, "Day la tin nhan cuoi cung cua ban"));
        chatList.getChildren().add(new ContactMessageCard("Nguyen hieu", 10, "Day la tin nhan cuoi cung cua ban"));
        chatList.getChildren().add(new ContactMessageCard("Nguyen hieu", 10, "Day la tin nhan cuoi cung cua ban"));
        chatList.getChildren().add(new ContactMessageCard("Nguyen hieu", 10, "Day la tin nhan cuoi cung cua ban"));
        chatList.getChildren().add(new ContactMessageCard("Nguyen hieu", 10, "Day la tin nhan cuoi cung cua ban"));
        chatList.getChildren().add(new ContactMessageCard("Nguyen hieu", 10, "Day la tin nhan cuoi cung cua ban"));
        chatList.getChildren().add(new ContactMessageCard("Nguyen hieu", 10, "Day la tin nhan cuoi cung cua ban"));
        chatList.getChildren().add(new ContactMessageCard("Nguyen hieu", 10, "Day la tin nhan cuoi cung cua ban"));
        chatList.getChildren().add(new ContactMessageCard("Nguyen hieu", 10, "Day la tin nhan cuoi cung cua ban"));
        chatList.getChildren().add(new ContactMessageCard("Nguyen hieu", 10, "Day la tin nhan cuoi cung cua ban"));
        chatList.getChildren().add(new ContactMessageCard("Nguyen hieu", 10, "Day la tin nhan cuoi cung cua ban"));
        chatList.getChildren().add(new ContactMessageCard("Nguyen hieu", 10, "Day la tin nhan cuoi cung cua ban"));
        chatList.getChildren().add(new ContactMessageCard("Nguyen hieu", 10, "Day la tin nhan cuoi cung cua ban"));
        chatList.getChildren().add(new ContactMessageCard("Nguyen hieu", 10, "Day la tin nhan cuoi cung cua ban"));
        chatList.getChildren().add(new ContactMessageCard("Nguyen hieu", 10, "Day la tin nhan cuoi cung cua ban"));
        chatList.getChildren().add(new ContactMessageCard("Nguyen hieu", 10, "Day la tin nhan cuoi cung cua ban"));
        chatList.getChildren().add(new ContactMessageCard("Nguyen hieu", 10, "Day la tin nhan cuoi cung cua ban"));
        chatList.getChildren().add(new ContactMessageCard("Nguyen hieu", 10, "Day la tin nhan cuoi cung cua ban"));
        chatList.getChildren().add(new ContactMessageCard("Nguyen hieu", 10, "Day la tin nhan cuoi cung cua ban"));
        chatList.getChildren().add(new ContactMessageCard("Nguyen hieu", 10, "Day la tin nhan cuoi cung cua ban"));
        chatList.getChildren().add(new ContactMessageCard("Nguyen hieu", 10, "Day la tin nhan cuoi cung cua ban"));
        chatList.getChildren().add(new ContactMessageCard("Nguyen hieu", 10, "Day la tin nhan cuoi cung cua ban"));
        chatList.getChildren().add(new ContactMessageCard("Nguyen hieu", 10, "Day la tin nhan cuoi cung cua ban"));
        chatList.getChildren().add(new ContactMessageCard("Nguyen hieu", 10, "Day la tin nhan cuoi cung cua ban"));
        chatList.getChildren().add(new ContactMessageCard("Nguyen hieu", 10, "Day la tin nhan cuoi cung cua ban"));
        chatList.getChildren().add(new ContactMessageCard("Nguyen hieu", 10, "Day la tin nhan cuoi cung cua ban"));
        chatList.getChildren().add(new ContactMessageCard("Nguyen hieu", 10, "Day la tin nhan cuoi cung cua ban"));
    }
}
