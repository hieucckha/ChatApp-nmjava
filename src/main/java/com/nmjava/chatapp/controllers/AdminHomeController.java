package com.nmjava.chatapp.controllers;

import com.nmjava.chatapp.DAO.userDAO;
import com.nmjava.chatapp.models.User;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.*;

import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.net.URL;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.ResourceBundle;
import java.util.Date;
import com.nmjava.chatapp.utils.SceneController;
public class AdminHomeController implements Initializable {

    @FXML
    private Button listUserBtn;
    @FXML
    private Button listLoginBtn;
    @FXML
    private Button listGroupBtn;
    @FXML
    private VBox addUser;
    @FXML
    private VBox filterUser;
    @FXML
    private Button cancelAddBtn;
    @FXML
    private Button addBtn;
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
    private TableView<User> tableView;
    @FXML
    private TableColumn<User, String> userNameTable;
    @FXML

    private TableColumn<User, String> nameTable;
    @FXML

    private TableColumn<User, String> addressTable;
    @FXML

    private TableColumn<User, String> dobTable;
    @FXML

    private TableColumn<User, String> sexTable;
    @FXML

    private TableColumn<User, String> emailTable;


    @FXML
    protected void handleBtn(ActionEvent actionEvent) {
        Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();

        if (actionEvent.getSource() == listUserBtn) {
            listUserClick(stage);
        } else if (actionEvent.getSource() == listGroupBtn) {
            listGroupClick(stage);
        } else if (actionEvent.getSource() == listLoginBtn) {
            listLoginClick(stage);
        }
    }

    private void listUserClick(Stage stage) {
        stage.setScene(SceneController.staticGetScene("AdminHome"));
        stage.show();
    }


    private void listGroupClick(Stage stage) {
        stage.setScene(SceneController.staticGetScene("AdminGroup"));
        stage.show();
    }

    private void listLoginClick(Stage stage) {
        stage.setScene(SceneController.staticGetScene("AdminLogin"));
        stage.show();
    }


    @FXML
    public void cancelAddButtonOnAction(ActionEvent event) {

        tableView.toFront();

        addUser.setVisible(false);
        System.out.println("false");

    }

    public void addButtonOnAction(ActionEvent event) {
        borderPanelSub.toFront();
        addUser.setVisible(true);
//        stateAdd.set(true);
        System.out.println("true");
    }

    public void cancelFilterButtonOnAction(ActionEvent event) {
        tableView.toFront();
        filterUser.setVisible(false);

        System.out.println("false");

    }

    public void filterButtonOnAction(ActionEvent event) {
        borderPanelSub1.toFront();
        filterUser.setVisible(true);
//        stateFilter.set(true);
        System.out.println("true");

    }
    public void AddDataOnAction(ActionEvent e) throws SQLException, ParseException {
        userDAO UserDao=new userDAO();
        User user =new User();
        if(userNameTextField.getText().isBlank()&& nameTextField.getText().isBlank()&& dobTextField.getText().isBlank()&&
        sexTextField.getText().isBlank()&& addressTextField.getText().isBlank()&& emailTextField.getText().isBlank())

        {
            Alert fail= new Alert(Alert.AlertType.INFORMATION);
            fail.setHeaderText("failure");
            fail.setContentText("you haven't typed something");
            fail.showAndWait();
        }
        else {
                user.setUser_id(new userDAO().MaxUserId());
                user.setUsername(userNameTextField.getText());
                user.setName( nameTextField.getText());
                user.setDob(new SimpleDateFormat("dd/mm/yyyy").parse((dobTextField.getText())));
                user.setGender(sexTextField.getText());
                user.setAddress(addressTextField.getText());
                user.setCreat_at(LocalDateTime.now());
                user.setUpdate_at(LocalDateTime.now());
                user.setEmail(emailTextField.getText());


                UserDao.insertUser(user);

                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setHeaderText("Success");
                alert.setContentText("Account succesfully created!");
                alert.showAndWait();
        }

        tableView.getItems().clear();
        tableView.setItems(FXCollections.observableArrayList(new userDAO().getUsers()));

    }


    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        System.out.println("true");

        filterUser.setVisible(false);
        userNameTable.setCellValueFactory(new PropertyValueFactory<>("username"));
        nameTable.setCellValueFactory(new PropertyValueFactory<>("name"));
        addressTable.setCellValueFactory(new PropertyValueFactory<>("address"));
        dobTable.setCellValueFactory(new PropertyValueFactory<>("dob"));
        sexTable.setCellValueFactory(new PropertyValueFactory<>("gender"));
        emailTable.setCellValueFactory(new PropertyValueFactory<>("email"));

        tableView.toFront();
//       tableView.setItems(observableList);
        tableView.setItems(observableList);


    }


    ObservableList<User> observableList = FXCollections.observableArrayList(new userDAO().getUsers());


}
