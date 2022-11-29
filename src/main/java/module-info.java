module com.chatapp.chatappnmjava {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.chatapp to javafx.fxml;
    exports com.chatapp;
    exports com.chatapp.Controller;
    opens com.chatapp.Controller to javafx.fxml;
}