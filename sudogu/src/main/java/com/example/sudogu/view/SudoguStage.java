package com.example.sudogu.view;

import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;

import java.io.IOException;
public class SudoguStage extends Stage{

    public SudoguStage() throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("com/example/sudogu/pagina-inicio.fxml"));
        Parent juego = loader.load();
        Scene gameScene = new Scene(juego);
        setTitle("Sudogu GAME");
        setScene(gameScene);
        setResizable(false);
        show();
    }

    public static  void deleteInstance (){
        SudoguStageHolder.INSTANCE.close();
        SudoguStageHolder.INSTANCE = null;
    }

    public static SudoguStage getInstance() throws IOException {
        return SudoguStageHolder.INSTANCE = new SudoguStage();
    }
    private static class SudoguStageHolder{
        private static SudoguStage INSTANCE;
    }

}
