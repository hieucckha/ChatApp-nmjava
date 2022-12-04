package com.nmjava.chatapp.Controllers;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class avatarStatusControll implements Initializable {
    @FXML
    private ImageView img;

    @FXML
    private Circle status;
    public void setData(String imageSrc,boolean sta){
        Rectangle clip=new Rectangle(58, 58);
        clip.setArcHeight(50);
        clip.setArcWidth(50);
        Image imgAvatar = new Image(getClass().getResourceAsStream(imageSrc));

        img.setImage(imgAvatar);
        img.setClip(clip);
        status.setFill(Color.LIGHTGRAY);
        if(sta) status.setFill(Color.LIGHTGREEN);
    }
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}
