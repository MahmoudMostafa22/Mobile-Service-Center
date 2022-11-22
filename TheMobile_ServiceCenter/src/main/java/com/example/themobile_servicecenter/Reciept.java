package com.example.themobile_servicecenter;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;

public class Reciept {
    private Stage stage;
    private Scene scene;
    private Parent root;
    private Customer x;
    @FXML
    private Label LabelReciept;

    @FXML
    public void Print(ActionEvent event) throws IOException {
        LabelReciept.setText(x.getName() +"\n"+ x.getPhoneNumber()+"\n"+x.getOperation()+"\n"+x.getProblem()+"\n"+x.getDevice()+"\n");
        Parent root = FXMLLoader.load(getClass().getResource("Reciept.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    public void Back(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Service.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}
