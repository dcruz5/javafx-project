module com.example.javafx {
    requires javafx.controls;
    requires javafx.fxml;
    requires cn.hutool.captcha;
    requires java.desktop;

    opens com.example.javafx to javafx.fxml;
    exports com.example.javafx;
    exports com.example.javafx.controller;
    opens com.example.javafx.controller to javafx.fxml;
    exports com.example.javafx.model;
    opens com.example.javafx.model to javafx.fxml;
}