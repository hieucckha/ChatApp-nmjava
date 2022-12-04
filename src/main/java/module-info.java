module com.nmjava.chatapp {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    requires org.kordamp.ikonli.core;
    requires org.kordamp.ikonli.javafx;

    exports com.nmjava.chatapp;
    opens com.nmjava.chatapp to javafx.fxml;

    exports com.nmjava.chatapp.components;
    opens com.nmjava.chatapp.components to javafx.fxml;

    exports com.nmjava.chatapp.controllers;
    opens com.nmjava.chatapp.controllers to javafx.fxml;

    exports com.nmjava.chatapp.models;
    opens com.nmjava.chatapp.models to javafx.fxml;

    exports com.nmjava.chatapp.utils;
    opens com.nmjava.chatapp.utils to javafx.fxml;
}