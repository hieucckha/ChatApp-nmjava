package com.nmjava.chatapp.Controllers;

import com.nmjava.chatapp.Models.contact;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.shape.Rectangle;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class contactItemControll implements Initializable {
    @FXML
    private ImageView img;

    @FXML
    private Label msg;

    @FXML
    private Label name;

    @FXML
    private Label time;
    public void setData(contact ct){

//        Image imgAvatar = new Image(getClass().getResourceAsStream(ct.getImageSrc()));
//
//        img.setImage(imgAvatar);

        name.setText(ct.getName());
        time.setText(ct.getTime());
        msg.setText(ct.getMessage());
    }
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {


    }
}
