package com.neueda13;

import javafx.application.Platform;
import javafx.fxml.FXML;

public class MainMenuController {

    @FXML
    void onExit(){
        Platform.exit();
    }
}
