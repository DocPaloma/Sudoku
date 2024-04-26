package com.example.sudogu.view;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;

import java.io.IOException;
public class SudoguStage extends Stage{
    @FXML
    private ImageView dogeInGame;


    public SudoguStage() throws IOException {
        Image normalDog = new Image("com/example/sudogu/normal-dog");

        FXMLLoader loader = new FXMLLoader(getClass().getResource("com/example/sudogu/pagina-inicio.fxml"));
        Parent juego = loader.load();
        Scene gameScene = new Scene(juego);
        setTitle("Sudogu GAME");
        setScene(gameScene);
        setResizable(false);
        show();
        dogeInGame.setImage(normalDog);
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
