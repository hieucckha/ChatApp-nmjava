package com.nmjava.chatapp.Controllers;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

import java.net.URL;
import java.util.ResourceBundle;

import com.nmjava.chatapp.Models.modelAdminList;

import javafx.scene.control.cell.PropertyValueFactory;


public class AdminListController implements Initializable {

    @FXML
    private TableColumn<modelAdminList, Integer> tableAdId;

    @FXML
    private TableColumn<modelAdminList, String> tableAdName;

    @FXML
    private TableColumn<modelAdminList, Integer> tableGroupAdID;

    @FXML
    private TableColumn<modelAdminList, String> tableGroupAdName;

    @FXML
    private TableView<modelAdminList> tableViewListAd;

    private ObservableList<modelAdminList> list = FXCollections.observableArrayList(
            new modelAdminList(1,"Minh",001,"Music and Chill"),
            new modelAdminList(2,"Hậu",003,"Friends and Chill"),
            new modelAdminList(3,"Thông",002,"Netflix and Chill"),
            new modelAdminList(5,"Hiếu",007,"Ipins and Upins")
    );

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        System.out.println("true");
        tableAdId.setCellValueFactory(new PropertyValueFactory<>("AdminID"));
        tableAdName.setCellValueFactory(new PropertyValueFactory<>("AdminName"));
        tableGroupAdID.setCellValueFactory(new PropertyValueFactory<>("GroupAdID"));
        tableGroupAdName.setCellValueFactory(new PropertyValueFactory<>("GroupAdName"));

        tableViewListAd.setItems(list);
    }


}
