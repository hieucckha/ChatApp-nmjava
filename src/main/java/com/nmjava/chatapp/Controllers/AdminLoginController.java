package com.nmjava.chatapp.Controllers;

import com.nmjava.chatapp.Models.modelGroupID;
import com.nmjava.chatapp.Models.modelLoginList;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;

import java.net.URL;
import java.util.EventListener;
import java.util.ResourceBundle;
import java.util.Vector;

public class AdminLoginController implements Initializable {

    @FXML
    private TableColumn <modelLoginList,String> tableLoginUserName;
    @FXML
    private TableColumn <modelLoginList,String> tableLoginName;
    @FXML
    private TableView <modelLoginList> tableView;
    @FXML
    private TextArea textAreaLoginTimes;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        tableLoginUserName.setCellValueFactory(new PropertyValueFactory<>("userName"));
        tableLoginName.setCellValueFactory(new PropertyValueFactory<>("name"));
        tableView.setItems(list);
    }
    @FXML
    public void onClickCollumn(MouseEvent e)
    {
        TablePosition tablePosition = tableView.getSelectionModel().getSelectedCells().get(0);
        int row =tablePosition.getRow();
        modelLoginList timeList=tableView.getItems().get(row);
//        System.out.println(timeList.getTimes());
        textAreaLoginTimes.setText(timeList.getTimes());


    }

    private ObservableList<modelLoginList> list = FXCollections.observableArrayList(

            new modelLoginList("nguyenhau","Chicken game","ngày 1\nngày 2\nngày 3\n"),
            new modelLoginList("nguyehn hung","Chicken game","ngày 1\nngày 2\n ")

    );

}
