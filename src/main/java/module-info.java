module com.nmjava.chatapp {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    requires org.kordamp.ikonli.core;
    requires org.kordamp.ikonli.javafx;

    exports com.nmjava.chatapp;
    opens com.nmjava.chatapp to javafx.fxml;

    exports com.nmjava.chatapp.Controllers;
    opens com.nmjava.chatapp.Controllers to javafx.fxml;

    exports com.nmjava.chatapp.Models;
    opens com.nmjava.chatapp.Models to javafx.fxml;

    exports com.nmjava.chatapp.Utils;
    opens com.nmjava.chatapp.Utils to javafx.fxml;
}