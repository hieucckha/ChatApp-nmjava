package com.nmjava.chatapp.Utils;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

import java.io.IOException;
import java.util.HashMap;

public final class SceneController {
    private static final HashMap<String, Scene> map = new HashMap<>();

    public void addScene(String name, String path) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource(path));
            map.put(name, new Scene(root));
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public Scene getScene(String fxml) {
        return map.get(fxml);
    }

    public static Scene staticGetScene(String fxml) {
        return map.get(fxml);
    }
}
