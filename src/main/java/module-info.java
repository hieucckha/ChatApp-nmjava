module ChatApp.nmjava {
    requires javafx.controls;
    requires javafx.fxml;
    requires org.kordamp.ikonli.javafx;

    opens com.chatapp.controller to javafx.fxml;
    opens com.chatapp to javafx.fxml;
    opens com.chatapp.model to javafx.base;
    exports com.chatapp;
}