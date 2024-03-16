package com.example.javafx.controller;

import cn.hutool.captcha.*;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class CaptchaController implements Initializable {
    @FXML
    private TextField userCaptcha;

    @FXML
    private ImageView captchaImage;

    @FXML
    private Label estat;

    static LineCaptcha captcha;

    private static final int IMAGE_WIDTH = 200;
    private static final int IMAGE_HEIGHT = 80;

    @FXML
    public void verificarCaptcha() throws IOException {
        estat.setText("");
        String inputCaptcha = userCaptcha.getText();
        if (captcha.verify(inputCaptcha)) {
            System.out.println("Captcha es correcto!");
            mostrarVentanaLListat();
        } else {
            System.out.println("Captcha es incorrecto. Intenta de nuevo.");
            estat.setText("Captcha es incorrecto. Intenta de nuevo.");
            userCaptcha.setText("");
            captcha.createCode();
            Image image = crearCaptchaImage();
            captchaImage.setImage(image);
        }
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        Image image = crearCaptchaImage();
        captchaImage.setImage(image);
    }


    private Image crearCaptchaImage() {
        captcha = CaptchaUtil.createLineCaptcha(IMAGE_WIDTH, IMAGE_HEIGHT);
        return new Image("https://via.placeholder.com/200x80.png?text=" + captcha.getCode());
    }


    private void mostrarVentanaLListat() throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("videojocs.fxml"));
        Parent root = loader.load();
        Scene scene = new Scene(root);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();

        Stage currentStage = (Stage) captchaImage.getScene().getWindow();
        currentStage.close();
    }
}