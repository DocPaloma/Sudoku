package com.example.sudogu.controller;
import com.example.sudogu.view.InstructionsStage;
import com.example.sudogu.view.PaginaInicioStage;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.image.ImageView;
import javafx.scene.control.Button;

import java.io.IOException;

public class InstructionsController {


    @FXML
    private Button returnMenuButton;

    @FXML
    private void handleReturnButtonAction(ActionEvent event) throws IOException {
        InstructionsStage.deleteInstruct();
        PaginaInicioStage.getMenu();
    }

}
