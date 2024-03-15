package com.example.javafx;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;

public class VideojocsController extends BorderPane {


    @FXML
    private Button filtrarBtn;
    @FXML
    private TextField anyVideojoc;
    @FXML
    private Button resetBtn;
    @FXML
    private TextArea llistatVideojocsTxt;


    public void initialize(){

        System.out.println("hola");


    }


}
