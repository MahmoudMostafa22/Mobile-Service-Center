package com.example.themobile_servicecenter;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class StartProgram {
    private Stage stage;
    private Scene scene;
    private Parent root;
    @FXML
    public void Log_to_Worker(ActionEvent Event)throws IOException {
        root = FXMLLoader.load(getClass().getResource("Worker_Login.fxml"));
        stage = (Stage)((Node)Event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    @FXML
    public void Sign_Up_Customer(ActionEvent Event)throws IOException {
        root = FXMLLoader.load(getClass().getResource("SignCustomer.fxml"));
        stage = (Stage)((Node)Event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}
