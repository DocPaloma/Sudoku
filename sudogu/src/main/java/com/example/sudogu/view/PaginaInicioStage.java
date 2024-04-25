package com.example.sudogu.view;

public class PaginaInicioStage extends Stage{
    public SudokuMainStage() throws IOException{
        FMXLLoader loader = new FMXLLoader(getClass().getResource("com/example/sudogu/pagina-inicio.fxml"));
        Parent root = loader.load();
        Scene scene = new Scene(root);
        setTitle("Sudoku");
        setScene(scene);
        setResizable(false);
        show();
    };

    public static void borrarInstancia(){
        SudokuMainStageHolder.INSTANCE.close();
        SudokuMainStageHolder.INSTANCE = null;
    }

    public static SudokuMainStage getInstancia() throws IOException{
        return SudokuMainStageHolder.INSTANCE = new SudokuMainStage();
    }

    private static class SudokuMainStageHolder{
        private static SudokuMainStage INSTANCE;
    }

}
