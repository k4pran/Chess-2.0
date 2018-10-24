package com.neueda13.controllers;

import javafx.fxml.FXML;
import javafx.geometry.Pos;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;

public class GameBoardController {

    @FXML
    GridPane chessBoard;

    double cellWidth = 20; // todo customize cell dimensions
    double cellHeight = 20;
    int rows = 8; // todo customize board size
    int cols = 8;

    @FXML
    public void initialize() {
        System.out.println("Initializing board");
        chessBoard.setAlignment(Pos.CENTER);

        boolean isWhiteSquare = true;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                Canvas boardSquare = new Canvas(cellWidth, cellHeight);
                GraphicsContext gfx = boardSquare.getGraphicsContext2D();
                Color color = isWhiteSquare ? Color.WHITE : Color.BLACK;
                gfx.setFill(color);
                gfx.fillRect(0, 0, cellWidth, cellHeight);
                chessBoard.add(boardSquare, j, i);
                isWhiteSquare = !isWhiteSquare;
            }
            isWhiteSquare = !isWhiteSquare;
        }
    }

}
