
package ctos;


import java.util.ArrayList;

import javafx.application.Application;
import javafx.geometry.Rectangle2D;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Line;
import javafx.stage.Screen;
import javafx.stage.Stage;

/**
 *
 * @author mzhao
 */
public class RevisionLog{
    	
    Stage window;
    static Scene scene;
    static Group group;
    public static double numberOfFields = 2.1;
    public static int StartAtOne = 1;
    
    static Rectangle2D primaryScreenBounds = ScreenResolution.screenBounds();
	
	
    public static void createScreen(Stage stage){
        
        Group root = new Group();
	group = root;
        
        /**
         * 
         * Retrieves the screen resolution of the primary monitor/screen
         * getPrimary() = primary monitor
         * getVisualBounds() = screen resolution
         */

		
	ArrayList<Line> DrawingBorderLines = BorderClass.border1();
		
	for(int i=0; i < DrawingBorderLines.size(); i = i+1) {
            root.getChildren().add(DrawingBorderLines.get(i));	
	}
	ArrayList<Button> buttons = ButtonClass.revisionLogButtons();
	
        for(int i = 0; i <buttons.size(); i++) {
            root.getChildren().add(buttons.get(i));
	}
        
        ArrayList<Label> labels = LabelClass.revisionLogLabels();
        for(int i = 0; i < labels.size(); i++){
            root.getChildren().add(labels.get(i));
        }
	
        ArrayList<TextField> textfields = TextfieldClass.revisionLogTextFields();
        System.out.println(textfields.size());
        for(int i = 0; i < textfields.size(); i++){
            System.out.println(i);
            root.getChildren().add(textfields.get(i));
        }

	scene = new Scene(root, Color.WHITE);

	stage.setScene(scene);
	stage.setTitle("Revision Log");
		
	stage.setScene(scene);
	stage.show();

	stage.setX(primaryScreenBounds.getMinX());
	stage.setY(primaryScreenBounds.getMinY());
	stage.setWidth(primaryScreenBounds.getWidth());
	stage.setHeight(primaryScreenBounds.getHeight());	
        
    }
    
}
