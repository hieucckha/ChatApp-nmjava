package com.chatapp.controller;

import com.chatapp.model.modelGroupID;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class admin_group implements Initializable{

    @FXML
    private TableColumn<modelGroupID, Integer> tableGroupID;

    public TableColumn<modelGroupID, String> tableGroupName;
    @FXML
    private TableColumn<modelGroupID, String> tableUserName;

    @FXML
    private TableView<modelGroupID> tableView;

    @Override
    public void initialize(URL arg0, ResourceBundle agr1) {
        System.out.println("true");
        tableGroupID.setCellValueFactory(new PropertyValueFactory<>("GroupID"));
        tableGroupName.setCellValueFactory(new PropertyValueFactory<>("GroupName"));
        tableUserName.setCellValueFactory(new PropertyValueFactory<>("GroupUserName"));

        tableView.setItems(list);

    }
    private ObservableList <modelGroupID> list = FXCollections.observableArrayList(
            new modelGroupID(3,"Chicken gang","Minh"),
            new modelGroupID(2, "Best","Thông"),
            new modelGroupID(3, "Chicken gang","Hiếu"),
            new modelGroupID(2, "Best","Hậu"),
            new modelGroupID(5, "Master","Khánh"),
            new modelGroupID(10, "Smurf","Bảo"),
            new modelGroupID(7, "Pro vip","Vinh"),
            new modelGroupID(1, "Zac","Quân")
    );
}
