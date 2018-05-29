package ctos;

import java.util.ArrayList;
import javafx.event.EventHandler;



import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.effect.DropShadow;
import javafx.scene.input.MouseEvent;
import javafx.scene.shape.Line;

public class ButtonClass {
	
        
        
	public static ArrayList<Button> revisionLogButtons(){       
            
            int screenWidth = ScreenResolution.resolutionWidth();
            int screenHeight = ScreenResolution.resolutionHeight();
            int fieldWidthAlignment = (int) ScreenResolution.fieldWidthAlignment(screenWidth);
            int proportionalHeight = ScreenResolution.propotionalHeight(screenHeight);
            double proportionalWidth = ScreenResolution.proportionalWidth(screenWidth);
            double numberOfFields = 2.1;
                
		ArrayList<Button> buttons = new ArrayList<>();
		
		Button btnAddAField = button("Add A New Revision", fieldWidthAlignment, (proportionalHeight * 1.5), "functionalButton" ,true);
		buttons.add(btnAddAField);
	
		Button btnSaveDraft = button("Save as PDF", fieldWidthAlignment*7, proportionalHeight*1.5, "functionalButton", true);
		buttons.add(btnSaveDraft);
		Button btnRelease = button("Revision", fieldWidthAlignment*8, proportionalHeight*1.5, "functionalButton", true);
		buttons.add(btnRelease);
				
		return buttons;
	}
	

			
	public static Button button(String text, double positionX, double positionY, String style, Boolean shadow) {
		
		Button button1 = new Button();
		button1.setText(text);
		button1.setLayoutX(positionX);
		button1.setLayoutY(positionY);
		button1.setId(style);
		
		if(shadow == true) {
			DropShadow shadowDrop = new DropShadow();
			// Adding the shadow when the mouse cursor is on
			button1.addEventHandler(MouseEvent.MOUSE_ENTERED, new EventHandler<MouseEvent>() {
				@Override public void handle(MouseEvent e) {
					button1.setEffect(shadowDrop);
				}
			});
			//Removing the shadow when the mouse cursor is off
			button1.addEventHandler(MouseEvent.MOUSE_EXITED, new EventHandler<MouseEvent>() {
				@Override public void handle(MouseEvent e) {
					button1.setEffect(null);
				}
			});
		}	
		return button1;
		
	}
}