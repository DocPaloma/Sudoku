package com.example.sudogu.view;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;

import java.io.IOException;

public class InstructionsStage extends Stage{
    @FXML
    private ImageView InstructionImage;

    public InstructionsStage() throws IOException {
        Image InstructorImage = new Image("com/example/sudogu/instructor-doge");
        FXMLLoader inst = new FXMLLoader(getClass().getResource("com/example/sudogu/instructions-view"));
        Parent instruc = inst.load();
        Scene instruScen = new Scene(instruc);
        setTitle("Instrucciones");
        setScene(instruScen);
        setResizable(false);
        show();
        InstructionImage.setImage(InstructorImage);
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
