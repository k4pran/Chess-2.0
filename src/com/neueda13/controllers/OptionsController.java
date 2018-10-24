package com.neueda13.controllers;

import com.neueda13.Chess;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;

public class OptionsController {
    //Globals correspond to elements in respective FXML file for this controller,
    //specifically the elements fx:id(identical name to global variable)
    //Globals will apparently work without the need for @FXML annotation if set to public
    //Will maintain private access for now until dozens of @FXML become unwieldy

    @FXML
    private CheckBox ckbFullscreen;

    @FXML
    private ChoiceBox<String> chbResolution;

    //onAction for ckbFullscreen ele
    //Sets stage fullscreen property
    @FXML
    void onCkbFullscreen() {
        Chess.stage.setFullScreen(ckbFullscreen.isSelected());
    }

    //onAction for chbResolution ele
    //Sets stage width and height based on choice
    @FXML
    void onChbResolution() {
        System.out.println(chbResolution.getValue());
        String[] resolution = chbResolution.getValue().split("x");
        Chess.stage.setWidth(Double.parseDouble(resolution[0]));
        Chess.stage.setHeight(Double.parseDouble(resolution[1]));
    }
    }
}
