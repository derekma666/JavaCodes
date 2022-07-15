module com.example.fxpractice {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.fxpractice to javafx.fxml;
    exports com.example.fxpractice;
}