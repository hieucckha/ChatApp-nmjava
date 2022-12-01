module ChatApp.nmjava {
    requires javafx.controls;
    requires javafx.fxml;
    requires org.kordamp.ikonli.javafx;

    opens com.chatapp to javafx.fxml;
    exports com.chatapp;
    opens com.chatapp.controller to javafx.base, javafx.fxml;
    opens com.chatapp.model to javafx.base, javafx.fxml;
}