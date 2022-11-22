module com.example.themobile_servicecenter {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.example.themobile_servicecenter to javafx.fxml;
    exports com.example.themobile_servicecenter;
}