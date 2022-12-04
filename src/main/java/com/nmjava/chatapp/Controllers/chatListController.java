package com.nmjava.chatapp.Controllers;

import com.nmjava.chatapp.Models.contact;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import org.kordamp.bootstrapfx.scene.layout.Panel;


import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class chatListController implements Initializable {
    @FXML
    private VBox chatList;
    @FXML
    private ImageView avatarContacting;
    @FXML
    private Label nameContacting;

    @FXML
    private Label statusContacting;
    @Override
    public void initialize(URL arg0, ResourceBundle agr1) {
        Rectangle clip=new Rectangle(58, 58);
        clip.setArcHeight(50);
        clip.setArcWidth(50);
        avatarContacting.setClip(clip);
        List<contact> contacts = new ArrayList<>(contact());
        for(int i = 0;i<contacts.size();i++){
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(getClass().getResource("/com/components/contactItem.fxml"));
            FXMLLoader fxmlLoader2 = new FXMLLoader();
            fxmlLoader2.setLocation(getClass().getResource("/com/components/AvatarStatus.fxml"));
            try {
                HBox hbox = fxmlLoader.load();
                AnchorPane anchorPane = fxmlLoader2.load();
                hbox.getChildren().set(0,anchorPane);
                avatarStatusControll csc = fxmlLoader2.getController();
                csc.setData(contacts.get(i).getImageSrc(),contacts.get(i).isStatus());
                contactItemControll cic = fxmlLoader.getController();
                cic.setData(contacts.get(i));
                chatList.getChildren().add(hbox);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        }

    }

    private List<contact> contact(){
        List<contact> ls = new ArrayList<>();
        contact ct = new contact();
        ct.setName("Thông Võ");
        ct.setMessage("Một Hai Ba Bốn Năm Sáu Bảy CN chạy dl");
        ct.setTime("Đang onl");
        ct.setImageSrc("/com/assects/telegram.png");
        ct.setStatus(true);
        ls.add(ct);
        ct = new contact();
        ct.setName("Nguyễn Văn Hậu");
        ct.setMessage("Một Hai Ba Bốn Năm Sáu Bảy CN chạy dl");
        ct.setTime("20 giờ");
        ct.setImageSrc("/com/assects/telegram.png");
        ct.setStatus(false);
        ls.add(ct);
        ct = new contact();
        ct.setName("Dương Quang Vinh");
        ct.setMessage("Một Hai Ba Bốn Năm Sáu Bảy CN chạy dl");
        ct.setTime("20 phút");
        ct.setImageSrc("/com/assects/rimiru.jpg");
        ct.setStatus(false);
        ls.add(ct);
        ct = new contact();
        ct.setName("Trần Hồng Quân");
        ct.setMessage("Một Hai Ba Bốn Năm Sáu Bảy CN chạy dl");
        ct.setTime("2 phút");
        ct.setImageSrc("/com/assects/Tokyo_Ghoul_Anime.png");
        ct.setStatus(false);
        ls.add(ct);
        ct = new contact();
        ct.setName("Hoàng Quốc Bảo");
        ct.setMessage("Một Hai Ba Bốn Năm Sáu Bảy CN chạy dl");
        ct.setTime("Đang onl");
        ct.setImageSrc("/com/assects/telegram.png");
        ct.setStatus(true);
        ls.add(ct);
        return ls;
    }
    public void clickContact(ActionEvent e){
        System.out.println("up");
        // get hbox clicked
//        avatarContacting.setImage();
        nameContacting.setText("");
        statusContacting.setText("");
    }
}
