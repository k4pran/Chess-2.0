package com.neueda13.controllers;

import com.neueda13.Chess;
import javafx.fxml.FXML;
import javafx.geometry.Rectangle2D;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;
import javafx.stage.Screen;

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
    // TODO list of resos could be abstracted and/or made dynamic by splitting chbResolution.getValue() at
    // TODO x and then parsing width and height i.e not need for magic numbers
    // TODO abstraction could be done with parsing and res setting function for/if lots of resos get added

    @FXML
    void onChbResolution() {
        System.out.println(chbResolution.getValue());
        switch (chbResolution.getValue()){
            case "1920x1080":
                Chess.stage.setWidth(1920.0);
                Chess.stage.setHeight(1080.0);
                break;
            case "1366x768":
                Chess.stage.setWidth(1366.0);
                Chess.stage.setHeight(768.0);
                break;
            case "600x400":
                Chess.stage.setWidth(600.0);
                Chess.stage.setHeight(400.0);
                break;
        }
        reCenterStage();
    }

    private void reCenterStage() {
        Rectangle2D primScreenBounds = Screen.getPrimary().getVisualBounds();
        Chess.stage.setX((primScreenBounds.getWidth() - Chess.stage.getWidth()) / 2);
        Chess.stage.setY((primScreenBounds.getHeight() - Chess.stage.getHeight()) / 2);
    }
}
