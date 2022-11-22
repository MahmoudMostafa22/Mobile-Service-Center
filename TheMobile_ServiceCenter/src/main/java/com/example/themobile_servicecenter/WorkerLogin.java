package com.example.themobile_servicecenter;
import java.io.IOException;
import java.util.Objects;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
public class WorkerLogin {
    private Stage stage;
    private Scene scene;
    private Parent root;
    @FXML
    private TextField ID_TextField;
    @FXML
    private TextField Password_TextField;
    String ID ="0";
    String Pass ="123456";


    @FXML
    public void Input1(ActionEvent event) throws IOException {
        ID = ID_TextField.getText();
    }
    public void input2(ActionEvent event) throws IOException {
        Pass = Password_TextField.getText();
    }

    @FXML
    public void Login(ActionEvent event) throws IOException {
        ID = ID_TextField.getText();
        Pass = Password_TextField.getText();
        if ((Objects.equals(ID, "2")) && (Objects.equals(Pass, "123"))) {
            root = FXMLLoader.load(getClass().getResource("Manager.fxml"));
            stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        } else if ((Objects.equals(ID, "1")) && (Objects.equals(Pass, "123"))) {
            root = FXMLLoader.load(getClass().getResource("Sales.fxml"));
            stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        } else if ((Objects.equals(ID, "3")) && (Objects.equals(Pass, "123"))) {
            root = FXMLLoader.load(getClass().getResource("Maintenance.fxml"));
            stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        }
    }

    @FXML
    public void BackToMain(ActionEvent event) throws IOException {
            Parent root = FXMLLoader.load(getClass().getResource("StartProgram.fxml"));
            stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
    }
}
