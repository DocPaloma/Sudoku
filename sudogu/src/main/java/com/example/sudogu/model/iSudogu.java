package com.example.sudogu.model;

public interface iSudogu {
    Boolean isNumberHorizontal(int number, int row);
    Boolean isNumberVertical(int number, int col);
    Boolean isNumberInGroupCell(int number, int row, int col);
    void setNumberInTableSodoku(int number, int row, int col);
}
