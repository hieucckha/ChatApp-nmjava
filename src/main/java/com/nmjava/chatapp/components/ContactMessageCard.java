package com.nmjava.chatapp.components;

import javafx.beans.binding.Bindings;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.layout.HBox;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class ContactMessageCard extends HBox implements Initializable {
    private static final int IS_ONLINE = -1;
    Avatar avatar;
    @FXML
    private Label userNameLb;
    @FXML
    private Label lastOnlineLb;
    @FXML
    private Label lastMessageLb;

    public ContactMessageCard(double width, String userName, int lastOnlineHour, String lastMessage) {
        loadFXML();

        this.setWidth(width);

        this.avatar = new Avatar(50, 50);
        this.getChildren().add(0, avatar);

        setUserName(userName);
        setLastOnlineHour(lastOnlineHour);
        setLastMessage(lastMessage);
    }

    public void loadFXML() {
        URL url = Avatar.class.getResource("ContactMessageCard.fxml");

        FXMLLoader loader = new FXMLLoader(url);
        loader.setRoot(this);
        loader.setController(this);

        try {
            loader.load();

            this.prefHeightProperty().bind(this.heightProperty());
            this.prefWidthProperty().bind(this.widthProperty());
        } catch (IOException ioEx) {
            throw new RuntimeException(ioEx);
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

    public void setAvatarImage(String path) {
        avatar.setImage(path);
    }

    public void setAvatarImage(Image image) {
        avatar.setImage(image);
    }

    public void setUserName(String userName) {
        this.userNameLb.setText(userName);
    }

    public void setLastOnlineHour(int lastOnlineHour) {
        String status = lastOnlineHour == IS_ONLINE ? "Online" : (lastOnlineHour + " hours ago");
        this.lastOnlineLb.setText(status);
    }

    public void setLastMessage(String message) {
        this.lastMessageLb.setText(message);
    }

}
