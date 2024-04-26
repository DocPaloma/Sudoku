package com.example.sudogu.view;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;

import java.io.IOException;
public class PaginaInicioStage extends Stage{
    @FXML
    private ImageView mainImage1;

    @FXML
    private ImageView mainImage2;
    public PaginaInicioStage() throws IOException{
        Image imagen1 = new Image("com/example/sudogu/main-doge1");
        Image imagen2 = new Image("com/example/sudogu/main-doge2");
        FXMLLoader mainme = new FXMLLoader(getClass().getResource("com/example/sudogu/pagina-inicio.fxml"));
        Parent menu = mainme.load();
        Scene menuScene = new Scene(menu);
        setTitle("Sudogu");
        setScene(menuScene);
        setResizable(false);
        show();
        mainImage1.setImage(imagen1);
        mainImage2.setImage(imagen2);
    };

    public static void borrarMain(){
        PaginaInicioHolder.INSTANCE.close();
        PaginaInicioHolder.INSTANCE = null;
    }

    public static PaginaInicioStage getMenu() throws IOException{
        return PaginaInicioHolder.INSTANCE = new PaginaInicioStage();
    }

    private static class PaginaInicioHolder{
        private static PaginaInicioStage INSTANCE;
    }

}
