package com.example;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class App extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/interface.fxml"));
        VBox root = loader.load();

        Label messageLabel = (Label) root.lookup("#messageLabel");
        Button clickButton = (Button) root.lookup("#clickButton");
        clickButton.setOnAction(event -> {
            System.out.println("Bouton cliqué !");
            messageLabel.setText("Bouton cliqué !");
        });

        // Création de la scène
        Scene scene = new Scene(root, 300, 200);
        primaryStage.setTitle("Ma Première Application JavaFX");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
