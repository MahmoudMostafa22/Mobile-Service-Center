package com.example.themobile_servicecenter;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class Service {
    private Customer A;

    private Stage stage;
    private Scene scene;
    private Parent root;
    @FXML
    private TextField TypeDeviceTextField;
    @FXML
    private TextField ErrorNameTextField;
    @FXML
    private TextField NewDevicetextfield;
    @FXML
    public void replace(ActionEvent event) throws IOException {
        TypeDeviceTextField.setDisable(false);
        NewDevicetextfield.setDisable(false);
    }
    @FXML
    public void sell(ActionEvent event) throws IOException {
        TypeDeviceTextField.setDisable(false);
    }
    @FXML
    public void repair(ActionEvent event) throws IOException {
        TypeDeviceTextField.setDisable(false);
        ErrorNameTextField.setDisable(false);

    }

    @FXML
    public void proceed(ActionEvent event) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("WaitForOperation.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    @FXML
    public void BackToMain(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("SignCustomer.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}
