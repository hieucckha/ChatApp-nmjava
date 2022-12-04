package com.nmjava.chatapp.Controllers;

import com.nmjava.chatapp.Models.modelGroupID;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class AdminGroupController implements Initializable{
    @FXML
    private TableColumn<modelGroupID, Integer> tableGroupID;
    @FXML
    public TableColumn<modelGroupID, String> tableGroupName;
    @FXML
    private TableColumn<modelGroupID, String> tableUserName;
    @FXML
    private TableColumn<modelGroupID, String> tableRole;
    @FXML
    private TableView<modelGroupID> tableView;

    @Override
    public void initialize(URL arg0, ResourceBundle agr1) {
        System.out.println("true");
        tableGroupID.setCellValueFactory(new PropertyValueFactory<>("GroupID"));
        tableGroupName.setCellValueFactory(new PropertyValueFactory<>("GroupName"));
        tableUserName.setCellValueFactory(new PropertyValueFactory<>("GroupUserName"));
        tableRole.setCellValueFactory(new PropertyValueFactory<>("GroupRole"));

        tableView.setItems(list);

    }
    private ObservableList <modelGroupID> list = FXCollections.observableArrayList(
            new modelGroupID(3,"Chicken gang","Minh","User"),
            new modelGroupID(2, "Best","Thông","User"),
            new modelGroupID(3, "Chicken gang","Hiếu","Admin"),
            new modelGroupID(2, "Best","Hậu","Admin"),
            new modelGroupID(5, "Master","Khánh","User"),
            new modelGroupID(10, "Smurf","Bảo","User"),
            new modelGroupID(7, "Pro vip","Vinh","User"),
            new modelGroupID(1, "Zac","Quân","User")
    );
}

