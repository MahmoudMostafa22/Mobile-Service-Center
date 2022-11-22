package com.example.themobile_servicecenter;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import java.sql.*;
import java.io.IOException;
import java.text.DateFormat;
import java.util.Date;

public class SignCustomer {



    private Stage stage;
    private Scene scene;
    private Parent root;
        @FXML
    private TextField NameField;
    @FXML
    private TextField BirthDatefield;
   @FXML
    private TextField phnofield;
    @FXML
    private Label ErrorLabel ;
    //Code for traversing
    //fire from the sender to a method in the recevier always in the triggiring function
//    public void login(ActionEvent event) throws IOException {
//        String username = nameTextField.getText();
//        FXMLLoader loader = new FXMLLoader(getClass().getResource("Scene2.fxml"));
//        root = loader.load();
//        Scene2Controller scene2Controller = loader.getController();
//        scene2Controller.displayName(username);
//        //root = FXMLLoader.load(getClass().getResource("Scene2.fxml"));
//        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
//        scene = new Scene(root);
//        stage.setScene(scene);
//        stage.show();
//    }



    @FXML

    public void Proceed(ActionEvent event) throws IOException {
        //save into database
        String name = NameField.getText();
        String birth = BirthDatefield.getText();
        String PhNo = phnofield.getText();
       if (name == null||birth == null ||PhNo == null){
            ErrorLabel.setText("please enter correct data forms");
        }else{
           Customer A = new Customer("jchj",12,1252,0,"cdsjbh","sdhcsdb");
           Parent root= FXMLLoader.load(getClass().getResource("Service.fxml"));

           stage = (Stage)((Node)event.getSource()).getScene().getWindow();
           scene = new Scene(root);
           stage.setScene(scene);
           stage.show();

        }
    }

    @FXML

    public void back(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("StartProgram.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}
