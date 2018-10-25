package com.neueda13.controllers;

import com.neueda13.Chess;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Button;

import java.io.IOException;

public class MainMenuController {

    @FXML
    void onExit(){
        Platform.exit();
    }

    @FXML
    void onOptions() throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/com/neueda13/layouts/options.fxml"));
        Chess.stage.getScene().setRoot(root);
    }

    @FXML
    void onGenerateGrid() throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/com/neueda13/layouts/game_layout.fxml"));
        Chess.stage.getScene().setRoot(root);
    }
}
