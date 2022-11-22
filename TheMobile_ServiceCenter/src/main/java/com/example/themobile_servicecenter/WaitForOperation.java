package com.example.themobile_servicecenter;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import static com.example.themobile_servicecenter.Product.price;

public class WaitForOperation implements Initializable {
    Customer A;
    private Stage stage;
    private Scene scene;
    private Parent root;
    @FXML
    private Label FixedLabel;
    @FXML
    public ComboBox COMBO_BOX;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        ObservableList<String> list = FXCollections.observableArrayList("battery", "screen", "headphone");
        COMBO_BOX.setItems(list);
    }


    @FXML
    public void back(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Service.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    public void ProceedToReciept(ActionEvent event) throws IOException {
        if (COMBO_BOX.getValue() == "battery") {
            price = price + 100;

        } else if (COMBO_BOX.getValue() == "screen") {
            price = price + 100;

        } else if (COMBO_BOX.getValue() == "headphone") {
            price = price + 100;

        }
            Parent root = FXMLLoader.load(getClass().getResource("Reciept.fxml"));
            stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        }
        @FXML
        public void CheckFixed (ActionEvent event) throws IOException {
            Software x = new Software();
            boolean s = x.IsFixed();
            if (s) {
                FixedLabel.setText("Now Fixed");
            }
        }


    }


