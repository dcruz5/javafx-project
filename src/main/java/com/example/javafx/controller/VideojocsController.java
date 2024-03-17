package com.example.javafx.controller;

import com.example.javafx.model.FactoryVideojoc;
import com.example.javafx.model.Videojoc;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.ImageView;

import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ResourceBundle;

public class VideojocsController implements Initializable {
    @FXML
    private ImageView logotip;
    @FXML
    private Button filtrarBtn;
    @FXML
    private TextField anyVideojoc;
    @FXML
    private Button resetBtn;
    @FXML
    private TableView<Videojoc> videojocsTable;
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
    public static FactoryVideojoc fv = new FactoryVideojoc();
    public static Videojoc[] videojocsAleatoris = fv.crearLlistatVideojocs(30);

    public void filtrarVideojocsPerAny() {
        String anyTxt = anyVideojoc.getText().trim();
        if (!anyTxt.isEmpty()) {
            int any = Integer.parseInt(anyTxt);
            List<Videojoc> videojocsFiltrats = new ArrayList<>();

            for (Videojoc videojoc : videojocsAleatoris) {
                if (videojoc.getAnyLlançament() >= any) {
                    videojocsFiltrats.add(videojoc);
                }
            }

            ObservableList<Videojoc> videojocs = FXCollections.observableList(videojocsFiltrats);

            videojocsTable.setItems(videojocs);
            videojocsTable.refresh();
            anyVideojoc.clear();
        }
    }

    public void resetVideojocs() {
        ObservableList<Videojoc> videojocs = FXCollections.observableList(List.of(videojocsAleatoris));
        videojocsTable.setItems(videojocs);
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        ObservableList<Videojoc> videojocs = FXCollections.observableList(List.of(videojocsAleatoris));

        Nom.setCellValueFactory(new PropertyValueFactory<>("nom"));
        Plataforma.setCellValueFactory(new PropertyValueFactory<>("plataforma"));
        AnyLlançament.setCellValueFactory(new PropertyValueFactory<>("anyLlançament"));
        Desenvolupador.setCellValueFactory(new PropertyValueFactory<>("desenvolupador"));
        Puntuacio.setCellValueFactory(new PropertyValueFactory<>("puntuacio"));

        videojocsTable.setItems(videojocs);
    }
}
