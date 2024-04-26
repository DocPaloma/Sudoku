package com.example.sudogu.controller;
import com.example.sudogu.view.InstructionsStage;
import com.example.sudogu.view.PaginaInicioStage;
import com.example.sudogu.view.SudoguStage;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.image.ImageView;
import javafx.scene.control.Button;

import java.io.IOException;
public class PaginaInicioController {

    @FXML
    private Button closeButton;

    @FXML
    private Button instrucButton;

    @FXML
    private ImageView mainImage1;

    @FXML
    private ImageView mainImage2;

    @FXML
    private Button startGameButton;



    @FXML
    void handleCloseButton(ActionEvent event) {
        PaginaInicioStage.borrarMain();

    }

    @FXML
    void handleInstructButton(ActionEvent event) throws IOException {
        InstructionsStage.getInstance();
        PaginaInicioStage.borrarMain();

    }

    @FXML
    void handleStartButton(ActionEvent event) throws IOException {
        SudoguStage.getInstance();
        PaginaInicioStage.borrarMain();

    }

}