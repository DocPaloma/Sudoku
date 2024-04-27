package com.example.sudogu.controller;

import com.example.sudogu.model.Sudogu;
import com.example.sudogu.view.InstructionsStage;
import com.example.sudogu.view.PaginaInicioStage;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.geometry.Pos;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.image.ImageView;
import javafx.scene.control.Button;
import javafx.util.Duration;

import java.io.IOException;
public class SudoguController {
    @FXML
    private GridPane tableSudoguGridPane;
    private Sudogu sudoku;

    @FXML
    private ImageView dogeInGame;

    @FXML
    private TextArea dogeSay;

    @FXML
    public void initialize(){
        sudoku = new Sudogu();

        for(int i=0; i<9; i++){
            for (int j=0; j<9; j++){
                TextField txt = new TextField();
                txt.setAlignment(Pos.CENTER);
                txt.setBorder(new Border(new BorderStroke(Color.BLACK, BorderStrokeStyle.DOTTED, CornerRadii.EMPTY, new BorderWidths(1))));
                txt.setText(String.valueOf(sudoku.getTableSudoku()[i][j]));
                if(sudoku.getTableSudoku()[i][j] > 0){
                    txt.setEditable(false);
                    txt.setBackground(new Background(new BackgroundFill(Color.rgb(240, 240, 240), null, null)));
                } else {
                    txt.setText("");
                    txt.setBackground(new Background(new BackgroundFill(Color.rgb(255, 255, 255), null, null)));
                }
                tableSudoguGridPane.add(txt, j, i);
                onKeyPressed(txt, i, j);
            }
        }
    }

    private void onKeyPressed(TextField txt, int row, int col){
        txt.setOnKeyPressed(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent keyEvent) {
                System.out.println(row + " : " + col);
                Integer number = Integer.valueOf(txt.getText());

                if(!sudoku.isNumberHorizontal(number, row)){
                    sudoku.setNumberInTableSodoku(number, row, col);
                }else{

                    // Retornaria un alertbox
                }

                if(!sudoku.isNumberVertical(number, col)){
                    sudoku.setNumberInTableSodoku(number, row, col);
                }else{
                    Image failDog = new Image("com/example/sudogu/fail-dog");
                    // Duración para mostrar la nueva imagen en milisegundos
                    Duration duration = Duration.seconds(2);
                    Timeline timeline = new Timeline(

                            new KeyFrame(duration, e -> {
                                // Cambiar la imagen al ImageView después de la duración especificada
                                dogeInGame.setImage(failDog);
                            }));
                    timeline.play();
                    // Retornaria un alertbox
                }
            }
        });
    }

}
