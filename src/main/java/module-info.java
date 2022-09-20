module com.example.atividade_22_09_20 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.atividade_22_09_20 to javafx.fxml;
    exports com.example.atividade_22_09_20;
}