package com.example.sudogu;

import javafx.application.Application;
import javafx.stage.Stage;
import com.example.sudogu.view.PaginaInicioStage;

import java.io.IOException;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        PaginaInicioStage.getMenu();
    }
}
