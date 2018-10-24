package com.neueda13.controllers;

import com.neueda13.Chess;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;

public class MainMenuController {

    @FXML
    void onExit(){
        Platform.exit();
    }

    @FXML
    void onOptions() throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("/com/neueda13/layouts/options.fxml"));
        Chess.stage.getScene().setRoot(root);
    }
}
