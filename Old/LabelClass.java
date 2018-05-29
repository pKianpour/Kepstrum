
package ctos;

import static ctos.ScreenResolution.fieldWidthAlignment;
import javafx.scene.control.Label;
import java.util.ArrayList;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.shape.Line;

public class LabelClass {
    
    
    public static ArrayList<Label> revisionLogLabels(){

        int screenWidth = ScreenResolution.resolutionWidth();
        int screenHeight = ScreenResolution.resolutionHeight();
        int fieldWidthAlignment = (int) ScreenResolution.fieldWidthAlignment(screenWidth);
        int proportionalHeight = ScreenResolution.propotionalHeight(screenHeight);
        double proportionalWidth = ScreenResolution.proportionalWidth(screenWidth);
        double numberOfFields = 2.1;
        
        ArrayList<Label> labels = new ArrayList<>();
		
        Label lblRevision = label("Revision", 100, 25, fieldWidthAlignment, (proportionalHeight*numberOfFields), "label");
        labels.add(lblRevision);
        Label lblDate = label("Date", 100, 25, fieldWidthAlignment*2, proportionalHeight*numberOfFields, "label");
        labels.add(lblDate);
        Label lblDescription = label("Description", 100, 25, fieldWidthAlignment*3, proportionalHeight*numberOfFields, "label");
        labels.add(lblDescription);  
        Label lblCode = label("Code", 100, 25, fieldWidthAlignment*5, proportionalHeight*1.5, "label");
        labels.add(lblCode); 
        
        return labels;
    }
    public static Label label(String text, int boxWidth, int boxHeight, int x, double y, String style) {
       
        Label label1 = new Label();
        label1.setText(text);
        label1.setAlignment(Pos.CENTER);
        label1.setMinWidth(boxWidth);
        label1.setMinHeight(boxHeight);
        label1.setLayoutX(x);
        label1.setLayoutY(y);
        label1.setId(style);
        
        
        return label1;
    }
    	
}
