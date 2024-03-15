package com.example.javafx;

import com.example.javafx.model.Videojoc;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;

public class VideojocsController extends BorderPane {


    @FXML
    private Button filtrarBtn;
    @FXML
    private TextField anyVideojoc;
    @FXML
    private Button resetBtn;
    @FXML
    private TableView llistatVideojocsTable;
    @FXML
    private TableColumn<Videojoc, String> Nom;
    @FXML
    private TableColumn<Videojoc, String> Plataforma;
    @FXML
    private TableColumn<Videojoc, Integer> AnyLlançament;
    @FXML
    private TableColumn<Videojoc, String> Desenvolupador;
    @FXML
    private TableColumn<Videojoc, Integer> Puntuacio;

    public void initialize(){

        System.out.println("hola");


    }


}
