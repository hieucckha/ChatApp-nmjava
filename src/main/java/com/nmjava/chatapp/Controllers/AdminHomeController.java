//package com.nmjava.chatapp.Controllers;
package com.nmjava.chatapp.Controllers;
import com.nmjava.chatapp.Models.modelTaleViewTest;

import javafx.beans.property.BooleanProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import  javafx.scene.control.Button;

import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;

import java.net.URL;
import java.util.ResourceBundle;

public class AdminHomeController implements Initializable {

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
    @FXML
    private BorderPane borderPanelSub1;
    @FXML
    private TextField userNameTextField;
    @FXML
    private TextField nameTextField;
    @FXML
    private TextField addressTextField;
    @FXML
    private TextField dobTextField;
    @FXML
    private TextField sexTextField;
    @FXML
    private TextField emailTextField;
    @FXML
    private StackPane stackPane;
    @FXML
    private TableView<com.nmjava.chatapp.Models.modelTaleViewTest> tableView;
    @FXML
    private TableColumn<com.nmjava.chatapp.Models.modelTaleViewTest,String> userNameTable;
    @FXML

    private TableColumn<com.nmjava.chatapp.Models.modelTaleViewTest,String> nameTable;
    @FXML

    private TableColumn<com.nmjava.chatapp.Models.modelTaleViewTest,String> addressTable;
    @FXML

    private TableColumn<com.nmjava.chatapp.Models.modelTaleViewTest,String> dobTable;
    @FXML

    private TableColumn<com.nmjava.chatapp.Models.modelTaleViewTest,String> sexTable;
    @FXML

    private TableColumn<com.nmjava.chatapp.Models.modelTaleViewTest,String> emailTable;



    private BooleanProperty stateAdd= new SimpleBooleanProperty();
    @FXML
    private BooleanProperty stateFilter= new SimpleBooleanProperty();

    @FXML
    public  void cancelAddButtonOnAction(ActionEvent event)
    {
//        stateAdd.set(false);
//        stackPane.setAlignment(addUser, Pos.BOTTOM_LEFT);
        tableView.toFront();

        addUser.setVisible(false);
        System.out.println("false");

    }
    public void addButtonOnAction(ActionEvent event)
    {
        borderPanelSub.toFront();
        addUser.setVisible(true);
        stateAdd.set(true);
        System.out.println("true");
    }

    public  void cancelFilterButtonOnAction(ActionEvent event)
    {
        tableView.toFront();
        filterUser.setVisible(false);

        System.out.println("false");

    }
    public void filterButtonOnAction(ActionEvent event)
    {
        borderPanelSub1.toFront();
        filterUser.setVisible(true);
        stateFilter.set(true);
        System.out.println("true");
    }


    @Override
    public  void initialize(URL arg0, ResourceBundle arg1)
    {
        System.out.println("true");
//        addUser.visibleProperty().bind(stateAdd);
//        filterUser.visibleProperty().bind(stateFilter);
        filterUser.setVisible(false);

        userNameTable.setCellValueFactory(new PropertyValueFactory<>("UserName"));
        nameTable.setCellValueFactory(new PropertyValueFactory<>("name"));
        addressTable.setCellValueFactory(new PropertyValueFactory<>("address"));
        dobTable.setCellValueFactory(new PropertyValueFactory<>("dob"));
        sexTable.setCellValueFactory(new PropertyValueFactory<>("sex"));
        emailTable.setCellValueFactory(new PropertyValueFactory<>("email"));

        tableView.toFront();
        tableView.setItems(observableList);

    }

    ObservableList <com.nmjava.chatapp.Models.modelTaleViewTest> observableList= FXCollections.observableArrayList(
            new com.nmjava.chatapp.Models.modelTaleViewTest("nguyenhau2","hau","123fsadf","25/06","male","@123"),
            new modelTaleViewTest("nguyenhau23","hau3","123fsa3df","25/306","male","@1323")


    );


}
