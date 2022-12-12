package com.nmjava.chatapp.controllers;

import com.nmjava.chatapp.components.*;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
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
    private Button contactBtn;
    @FXML
    private Button friendOnlineBtn;
    @FXML
    private Button friendBtn;
    @FXML
    private ScrollPane spContainer;
    @FXML
    private ScrollPane conservationContainer;
    @FXML
    public GridPane chatContainer;
    @FXML
    public VBox containerChat;
    private UserTitleChat utc;

    public UserHomeController() {
        this.utc = new UserTitleChat("", 0);
        this.utc.setAvatarImage(String.valueOf(getClass().getResource("/com/nmjava/chatapp/assects/images/avatar2.png")));
    }

    @Override
    public void initialize(URL arg0, ResourceBundle agr1) {
        this.titleChatContainer.getChildren().add(this.utc);

        spContainer.setHbarPolicy(ScrollPane.ScrollBarPolicy.NEVER);
        spContainer.setVbarPolicy(ScrollPane.ScrollBarPolicy.NEVER);

        this.spContainer.setContent(createContactMessageList());

        contactBtn.setOnMouseClicked(e -> {
            System.out.println("contactBtn is clicks");
            this.spContainer.setContent(createContactMessageList());
        });
        friendOnlineBtn.setOnMouseClicked(e -> {
            System.out.println("friendOnlineBtn is clicks");
            this.spContainer.setContent(createFriendOnlineList());
        });
        this.conservationContainer.setContent(createConservationList());

//        this.CreateChatList();
    }

    private VBox createContactMessageList() {
        VBox contactMessageList = new ContactMessageList();

        for (int i = 0; i < 20; ++i) {
            String name = i%2==0? "Nguyen Hieu":"Thong Vo";
            String ImageSrc = i%2==0? "/com/nmjava/chatapp/assects/images/avatar.png":"/com/nmjava/chatapp/assects/images/avatar2.png";
            ContactMessageCard newChild = new ContactMessageCard(name, 10, "Day la tin nhan cuoi cung",ImageSrc);
            newChild.setOnMouseClicked(e -> {
                System.out.println("Contact message is clicks");
                int timeOnline = Integer.parseInt(newChild.getLastOnlineLb().getText().split(" ")[0]);
                this.utc = new UserTitleChat(newChild.getUserNameLb().getText(),timeOnline);
                Avatar tempAvater = new Avatar(50,50);
                tempAvater.setImage(newChild.getAvatar().getImage());
                utc.getChildren().set(0,tempAvater);
                this.titleChatContainer.getChildren().set(0,utc);
            });
            contactMessageList.getChildren().add(newChild);
        }
        return contactMessageList;
    }

    private VBox createFriendOnlineList() {
        VBox friendOnlineList = new FriendOnlineList();

        for (int i = 0; i < 20; ++i) {
            friendOnlineList.getChildren().add(new FriendOnlineCard("Nguyen Hieu"));
        }

        return friendOnlineList;
    }
    private VBox createConservationList() {
        VBox Conservationlist = new ConservationList();

        for (int i = 0; i < 10; ++i) {
            conservationLine newChat = new conservationLine("Hallo may fen",true);
            Conservationlist.getChildren().add(newChat);
            conservationLine recieveChat = new conservationLine("lo CC sguydgyhifjndfguyhvinjfubhxkcrtggyfhbb sdfyughbkcrgdfsgygh sdtyugfchybjksdfhvb bmn",false);
            Conservationlist.getChildren().add(recieveChat);
        }
        return Conservationlist;
    }
}
