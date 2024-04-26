package com.example.sudogu.view;

import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;

import java.io.IOException;
public class PaginaInicioStage extends Stage{
    public PaginaInicioStage() throws IOException{
        FXMLLoader mainme = new FXMLLoader(getClass().getResource("com/example/sudogu/pagina-inicio.fxml"));
        Parent menu = mainme.load();
        Scene menuScene = new Scene(menu);
        setTitle("Sudogu");
        setScene(menuScene);
        setResizable(false);
        show();
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
