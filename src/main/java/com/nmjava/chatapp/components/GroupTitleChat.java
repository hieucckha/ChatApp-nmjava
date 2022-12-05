package com.nmjava.chatapp.components;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class GroupTitleChat extends HBox implements Initializable {
    private static final int IS_ONLINE = -1;
    private Avatar avatar;
    @FXML
    private VBox infoContainer;
    @FXML
    private Label userNameLb;
    @FXML
    private Label memberCountsLb;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

    public GroupTitleChat(double height, String userName, int memberCounts) {
        loadFXML();
        this.setHeight(height);

        avatar = new Avatar(50, 50);
        this.getChildren().add(0, avatar);

        this.userNameLb = new Label();
        setUserName(userName);
        this.userNameLb.setPadding(new Insets(0, 0, 5, 0));
        this.infoContainer.getChildren().add(this.userNameLb);

        this.memberCountsLb = new Label();
        setMemberCount(memberCounts);
        this.memberCountsLb.setPadding(new Insets(5, 0, 0, 0));
        this.infoContainer.getChildren().add(this.memberCountsLb);
    }

    private void loadFXML() {
        URL url = UserTitleChat.class.getResource("UserTitleChat.fxml");

        FXMLLoader loader = new FXMLLoader(url);
        loader.setRoot(this);
        loader.setController(this);

        try {
            loader.load();

            this.prefHeightProperty().bind(this.heightProperty());
            this.prefWidthProperty().bind(this.widthProperty());

            this.infoContainer.prefHeightProperty().bind(this.heightProperty());
            this.infoContainer.prefWidthProperty().bind(this.widthProperty());
        } catch (IOException ioEx) {
            throw new RuntimeException(ioEx);
        }
    }

    public void setUserName(String userName) {
        this.userNameLb.setText(userName);
    }

    public void setMemberCount(int memberCounts) {
        this.memberCountsLb.setText(memberCounts + " users");
    }

    public void setAvatarImage(String path) {
        avatar.setImage(path);
    }

    public void setAvatarImage(Image image) {
        avatar.setImage(image);
    }
}
