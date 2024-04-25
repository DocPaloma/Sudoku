package com.example.sudogu.view;

import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;

import java.io.IOException;

public class InstructionsStage extends Stage{
    public InstructionsStage() throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("com/example/sudogu/instructions-view"));
        Parent instruc = loader.load();
        Scene instruScen = new Scene(instruc);
        setTitle("Instrucciones");
        setScene(instruScen);
        setResizable(false);
        show();
    }

    public static void deleteInstruct () {
        InstructionsStageHolder.INSTANCE.close();
        InstructionsStageHolder.INSTANCE = null;
    }

    public static InstructionsStage getInstance() throws IOException {
        return InstructionsStageHolder.INSTANCE = new InstructionsStage();
    }

    public static class InstructionsStageHolder{
        private static InstructionsStage INSTANCE;
    }
}
