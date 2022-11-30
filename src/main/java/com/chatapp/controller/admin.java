package com.chatapp.controller;

import com.chatapp.model.modelTaleViewTest;
import javafx.beans.Observable;
import javafx.beans.property.BooleanProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import  javafx.scene.control.Button;
import javafx.scene.Node;

import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class admin implements Initializable {

    @FXML
    private VBox addUser;
    @FXML
    private  VBox filterUser;
    @FXML
    private  Button cancelAddBtn;
    @FXML
    private  Button addBtn;
    @FXML
    private BorderPane borderPanelSub;
//    @FXML
//
//    private  Button filterBtn;
//    @FXML
//
//    private Button cancelFilterBtn;
    @FXML
    private TableView<modelTaleViewTest> tableView;
    @FXML
    private TableColumn<modelTaleViewTest,String> userNameTable;
    @FXML

    private TableColumn<modelTaleViewTest,String> nameTable;
    @FXML

    private TableColumn<modelTaleViewTest,String> addressTable;
    @FXML

    private TableColumn<modelTaleViewTest,String> dobTable;
    @FXML

    private TableColumn<modelTaleViewTest,String> sexTable;
    @FXML

    private TableColumn<modelTaleViewTest,String> emailTable;



    private BooleanProperty stateAdd= new SimpleBooleanProperty();
    @FXML
    private BooleanProperty stateFilter= new SimpleBooleanProperty();

    @FXML
    public  void cancelAddButtonOnAction(ActionEvent event)
    {
        stateAdd.set(false);

        System.out.println("false");

    }
    public void addButtonOnAction(ActionEvent event)
    {

        stateAdd.set(true);
        System.out.println("true");
    }

    public  void cancelFilterButtonOnAction(ActionEvent event)
    {
        stateFilter.set(false);
        System.out.println("false");

    }
    public void filterButtonOnAction(ActionEvent event)
    {
        stateFilter.set(true);
        System.out.println("true");
    }


    @Override
    public  void initialize(URL arg0, ResourceBundle arg1)
    {
        System.out.println("true");
        addUser.visibleProperty().bind(stateAdd);
        filterUser.visibleProperty().bind(stateFilter);

        userNameTable.setCellValueFactory(new PropertyValueFactory<>("UserName"));
        nameTable.setCellValueFactory(new PropertyValueFactory<>("name"));
        addressTable.setCellValueFactory(new PropertyValueFactory<>("address"));
        dobTable.setCellValueFactory(new PropertyValueFactory<>("dob"));
        sexTable.setCellValueFactory(new PropertyValueFactory<>("sex"));
        emailTable.setCellValueFactory(new PropertyValueFactory<>("email"));

        tableView.setItems(observableList);

    }

    ObservableList <modelTaleViewTest> observableList= FXCollections.observableArrayList(
            new modelTaleViewTest("nguyenhau2","hau","123fsadf","25/06","male","@123"),
            new modelTaleViewTest("nguyenhau23","hau3","123fsa3df","25/306","male","@1323")
    );


}
