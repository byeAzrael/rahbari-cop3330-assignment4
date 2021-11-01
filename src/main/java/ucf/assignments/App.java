/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Ryan Rahbari
 */

package ucf.assignments;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class App extends Application {
    @Override
    public void start(Stage stage) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/app.fxml"));

            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.setTitle("To Do List");
            stage.show();
        } catch (IOException error) {
            error.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}