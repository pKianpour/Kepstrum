/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ctos;

import static ctos.RevisionLog.group;
import java.util.ArrayList;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.geometry.Rectangle2D;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.stage.Screen;
import javafx.stage.Stage;

/**
 *
 * @author mzhao
 */
public class CTOS extends Application {
     public static void main(String[] args) {
    /** launches our javaFx */
		
        launch(args);
    }
	
     
    Stage window;
    static Group group;
 //   @Override
    public void start(Stage stage) throws Exception {
		
	RevisionLog.createScreen(stage);
        
        RevisionLog.scene.getStylesheets().add(getClass().getResource("ctos.css").toExternalForm());
		
    }
}
