package com.example.javafx.controller;

import cn.hutool.captcha.*;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.image.PixelWriter;
import javafx.scene.image.WritableImage;
import javafx.stage.Stage;
import java.awt.image.BufferedImage;

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
    private static final int IMAGE_WIDTH = 200;
    private static final int IMAGE_HEIGHT = 80;
    static LineCaptcha captcha =  CaptchaUtil.createLineCaptcha(IMAGE_WIDTH, IMAGE_HEIGHT);


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
            crearCaptchaImage();
        }
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        crearCaptchaImage();
    }


    private void crearCaptchaImage() {
        captcha.createCode();
        Image javafxImage = convertToJavaFXImage(captcha.getImage());
        captchaImage.setImage(javafxImage);
    }

    private Image convertToJavaFXImage(BufferedImage bufferedImage) {
        WritableImage writableImage = new WritableImage(bufferedImage.getWidth(), bufferedImage.getHeight());
        PixelWriter pw = writableImage.getPixelWriter();
        for (int x = 0; x < bufferedImage.getWidth(); x++) {
            for (int y = 0; y < bufferedImage.getHeight(); y++) {
                pw.setArgb(x, y, bufferedImage.getRGB(x, y));
            }
        }
        return writableImage;
    }


    private void mostrarVentanaLListat() throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/example/javafx/videojocs.fxml"));
        Scene scene = new Scene(loader.load());
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.setTitle("Videojocs");
        stage.show();

        Stage currentStage = (Stage) captchaImage.getScene().getWindow();
        currentStage.close();
    }
}