

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.geometry.Rectangle2D;
import javafx.scene.Group;

import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.stage.Screen;
import javafx.stage.Stage;

import javafx.scene.control.Button;
import javafx.event.ActionEvent;

/** 
 * 
 * extends application which is an import
 *
 */
public class HelloWorld extends Application implements  EventHandler<ActionEvent>{
	
	Button btnAddaField;
	Button btnRevision;
	Button btnDate;
	Button btnInitial;
	Button btnDescription;
	Button btnCode;
	Button btnDraft;
	Button btnFinal;
	Button btnRelease;
	Button btnPrint;
	Button btnDNAPlot;
	Button btnHelp;
	Button btnAdd1;
	Button btnAdd2;
	Button btnSaveDraft;
	Button btnSaveRelease;
	Button btnConfirm;
	
	public double numberOfFields = 2.5;
	
	
	public static void main(String[] args) {
		/** launches are javaFx */
		launch(args);
		
	}

	/**
	 *  To create Javafx app -> stage inside screen inside layout where we find widget
	 */
	@Override
	public void start(Stage stage) throws Exception {

		Group root = new Group();
		Rectangle2D primaryScreenBounds = Screen.getPrimary().getVisualBounds();
		
		int screenWidth=(int) primaryScreenBounds.getWidth();
		int screenHeight = (int) primaryScreenBounds.getHeight();
		
		Scene scene = new Scene(root, screenWidth, screenHeight, Color.WHITE);
		stage.setScene(scene);
		stage.setTitle("Revision Log");
		
		Line line = new Line(60,60,60,screenHeight-80);
		line.setStroke(Color.BLACK);
		root.getChildren().add(line);
		Line line1 = new Line(60,60,screenWidth-60,60);
		line1.setStroke(Color.BLACK);
		root.getChildren().add(line1);
		Line line2 = new Line(screenWidth-60,60,screenWidth-60,screenHeight-80);
		line2.setStroke(Color.BLACK);
		root.getChildren().add(line2);
		Line line3 = new Line(screenWidth-60, screenHeight-80, 60, screenHeight-80);
		line3.setStroke(Color.BLACK);
		root.getChildren().add(line3);
		
		int proportionalWidth = screenWidth/16;
		int proportionalHeight = screenHeight/10;
		
		Line line4 = new Line(60, proportionalHeight, (screenWidth-60), proportionalHeight);
		line4.setStroke(Color.BLACK);
		root.getChildren().add(line4);
		
		Line line5 = new Line((proportionalWidth*2.5), proportionalHeight, (proportionalWidth*2.5), 60);
		line5.setStroke(Color.BLACK);
		root.getChildren().add(line5);
		Line line6 = new Line ((screenWidth-(proportionalWidth*2.5)), proportionalHeight, (screenWidth-(proportionalWidth*2.5)), 60);
		line6.setStroke(Color.BLACK);
		root.getChildren().add(line6);
		
		int fieldWidthAlignment = screenWidth/10;
		
		btnAddaField = new Button();
		btnAddaField.setText("Add a Field");
		btnAddaField.setOnAction(this);
		btnAddaField.setLayoutX(fieldWidthAlignment);
		btnAddaField.setLayoutY(proportionalHeight *1.5);
		btnAddaField.setStyle(" -fx-background-color: \r\n" + 
				"        #000000,\r\n" + 
				"        linear-gradient(#FFDAB9, #FFDAB9),\r\n" + 
				"        linear-gradient(#FFDAB9 0%, #FFDAB9 49%, #FFDAB9 50%, #FFDAB9 100%);\r\n" + 
				"    -fx-background-insets: 0,1,2;\r\n" + 
				"    -fx-background-radius: 3,2,1;\r\n" + 
				"    -fx-padding: 3 10 3 10;\r\n" + 
				"    -fx-text-fill: black;\r\n" + 
				"    -fx-font-size: 12px; \r\n" + 
				"    -fx-font-weight: bold;");
		root.getChildren().add(btnAddaField);
		
		btnRevision = new Button();
		btnRevision.setText("Revision");
		btnRevision.setLayoutX(fieldWidthAlignment);
		btnRevision.setLayoutY(proportionalHeight *2);
		btnRevision.setStyle(" -fx-background-color: \r\n" + 
				"        #000000,\r\n" + 
				"        linear-gradient(#f49541, #f49541),\r\n" + 
				"        linear-gradient(#f49541 0%, #f49541 49%, #f49541 50%, #f49541 100%);\r\n" + 
				"    -fx-background-insets: 0,1,2;\r\n" + 
				"    -fx-background-radius: 3,2,1;\r\n" + 
				"    -fx-padding: 3 10 3 10;\r\n" + 
				"    -fx-text-fill: black;\r\n" + 
				"    -fx-font-size: 12px; \r\n" + 
				"    -fx-font-weight: bold;");
		root.getChildren().add(btnRevision);
		
		btnDate = new Button();
		btnDate.setText("Date");
		btnDate.setLayoutX(fieldWidthAlignment*2);
		btnDate.setLayoutY(proportionalHeight *2);
		btnDate.setStyle(" -fx-background-color: \r\n" + 
				"        #000000,\r\n" + 
				"        linear-gradient(#f49541, #f49541),\r\n" + 
				"        linear-gradient(#f49541 0%, #f49541 49%, #f49541 50%, #f49541 100%);\r\n" + 
				"    -fx-background-insets: 0,1,2;\r\n" + 
				"    -fx-background-radius: 3,2,1;\r\n" + 
				"    -fx-padding: 3 10 3 10;\r\n" + 
				"    -fx-text-fill: black;\r\n" + 
				"    -fx-font-size: 12px; \r\n" + 
				"    -fx-font-weight: bold;");
		root.getChildren().add(btnDate);
		
		btnInitial = new Button();
		btnInitial.setText("Initial");
		btnInitial.setLayoutX(fieldWidthAlignment*3);
		btnInitial.setLayoutY(proportionalHeight *2);
		btnInitial.setStyle(" -fx-background-color: \r\n" + 
				"        #000000,\r\n" + 
				"        linear-gradient(#f49541, #f49541),\r\n" + 
				"        linear-gradient(#f49541 0%, #f49541 49%, #f49541 50%, #f49541 100%);\r\n" + 
				"    -fx-background-insets: 0,1,2;\r\n" + 
				"    -fx-background-radius: 3,2,1;\r\n" + 
				"    -fx-padding: 3 10 3 10;\r\n" + 
				"    -fx-text-fill: black;\r\n" + 
				"    -fx-font-size: 12px; \r\n" + 
				"    -fx-font-weight: bold;");
		root.getChildren().add(btnInitial);
		
		btnDescription = new Button();
		btnDescription.setText("Description");
		btnDescription.setLayoutX(fieldWidthAlignment*4);
		btnDescription.setLayoutY(proportionalHeight *2);
		btnDescription.setStyle(" -fx-background-color: \r\n" + 
				"        #000000,\r\n" + 
				"        linear-gradient(#f49541, #f49541),\r\n" + 
				"        linear-gradient(#f49541 0%, #f49541 49%, #f49541 50%, #f49541 100%);\r\n" + 
				"    -fx-background-insets: 0,1,2;\r\n" + 
				"    -fx-background-radius: 3,2,1;\r\n" + 
				"    -fx-padding: 3 10 3 10;\r\n" + 
				"    -fx-text-fill: black;\r\n" + 
				"    -fx-font-size: 12px; \r\n" + 
				"    -fx-font-weight: bold;");
		root.getChildren().add(btnDescription);
		
		btnCode = new Button();
		btnCode.setText("Code");
		btnCode.setLayoutX(fieldWidthAlignment*6);
		btnCode.setLayoutY(proportionalHeight *2);
		btnCode.setStyle(" -fx-background-color: \r\n" + 
				"        #000000,\r\n" + 
				"        linear-gradient(#f49541, #f49541),\r\n" + 
				"        linear-gradient(#f49541 0%, #f49541 49%, #f49541 50%, #f49541 100%);\r\n" + 
				"    -fx-background-insets: 0,1,2;\r\n" + 
				"    -fx-background-radius: 3,2,1;\r\n" + 
				"    -fx-padding: 3 10 3 10;\r\n" + 
				"    -fx-text-fill: black;\r\n" + 
				"    -fx-font-size: 12px; \r\n" + 
				"    -fx-font-weight: bold;");
		root.getChildren().add(btnCode);
		

		
		
		
		btnDraft = new Button();
		btnDraft.setText("Draft");
		btnDraft.setLayoutX(fieldWidthAlignment*7);
		btnDraft.setLayoutY(proportionalHeight *2);
		btnDraft.setStyle(" -fx-background-color: \r\n" + 
				"        #000000,\r\n" + 
				"        linear-gradient(#f49541, #f49541),\r\n" + 
				"        linear-gradient(#f49541 0%, #f49541 49%, #f49541 50%, #f49541 100%);\r\n" + 
				"    -fx-background-insets: 0,1,2;\r\n" + 
				"    -fx-background-radius: 3,2,1;\r\n" + 
				"    -fx-padding: 3 10 3 10;\r\n" + 
				"    -fx-text-fill: black;\r\n" + 
				"    -fx-font-size: 12px; \r\n" + 
				"    -fx-font-weight: bold;");
		root.getChildren().add(btnDraft);
		
		btnFinal = new Button();
		btnFinal.setText("Final");
		btnFinal.setLayoutX(fieldWidthAlignment*8);
		btnFinal.setLayoutY(proportionalHeight *2);
		btnFinal.setStyle(" -fx-background-color: \r\n" + 
				"        #000000,\r\n" + 
				"        linear-gradient(#f49541, #f49541),\r\n" + 
				"        linear-gradient(#f49541 0%, #f49541 49%, #f49541 50%, #f49541 100%);\r\n" + 
				"    -fx-background-insets: 0,1,2;\r\n" + 
				"    -fx-background-radius: 3,2,1;\r\n" + 
				"    -fx-padding: 3 10 3 10;\r\n" + 
				"    -fx-text-fill: black;\r\n" + 
				"    -fx-font-size: 12px; \r\n" + 
				"    -fx-font-weight: bold;");
		root.getChildren().add(btnFinal);
		
		btnRelease = new Button();
		btnRelease.setText("Release");
		btnRelease.setLayoutX(fieldWidthAlignment*9);
		btnRelease.setLayoutY(proportionalHeight *2);
		btnRelease.setStyle(" -fx-background-color: \r\n" + 
				"        #000000,\r\n" + 
				"        linear-gradient(#f49541, #f49541),\r\n" + 
				"        linear-gradient(#f49541 0%, #f49541 49%, #f49541 50%, #f49541 100%);\r\n" + 
				"    -fx-background-insets: 0,1,2;\r\n" + 
				"    -fx-background-radius: 3,2,1;\r\n" + 
				"    -fx-padding: 3 10 3 10;\r\n" + 
				"    -fx-text-fill: black;\r\n" + 
				"    -fx-font-size: 12px; \r\n" +
				"    -fx-font-weight: bold;");
		root.getChildren().add(btnRelease);
		
		btnPrint = new Button();
		btnPrint.setText("Print");
		btnPrint.setLayoutX(120);
		btnPrint.setLayoutY(screenHeight-75);
		btnPrint.setStyle(" -fx-background-color: \r\n" + 
				"        #000000,\r\n" + 
				"        linear-gradient(#FFDAB9, #FFDAB9),\r\n" + 
				"        linear-gradient(#FFDAB9 0%, #FFDAB9 49%, #FFDAB9 50%, #FFDAB9 100%);\r\n" + 
				"    -fx-background-insets: 0,1,2;\r\n" + 
				"    -fx-background-radius: 3,2,1;\r\n" + 
				"    -fx-padding: 3 10 3 10;\r\n" + 
				"    -fx-text-fill: black;\r\n" + 
				"    -fx-font-size: 12px; \r\n" + 
				"    -fx-font-weight: bold;");
		root.getChildren().add(btnPrint);
		
		btnDNAPlot = new Button();
		btnDNAPlot.setText("DNA Plot");
		btnDNAPlot.setLayoutX(220);
		btnDNAPlot.setLayoutY(screenHeight-75);
		btnDNAPlot.setStyle(" -fx-background-color: \r\n" + 
				"        #000000,\r\n" + 
				"        linear-gradient(#FFDAB9, #FFDAB9),\r\n" + 
				"        linear-gradient(#FFDAB9 0%, #FFDAB9 49%, #FFDAB9 50%, #FFDAB9 100%);\r\n" + 
				"    -fx-background-insets: 0,1,2;\r\n" + 
				"    -fx-background-radius: 3,2,1;\r\n" + 
				"    -fx-padding: 3 10 3 10;\r\n" + 
				"    -fx-text-fill: black;\r\n" + 
				"    -fx-font-size: 12px; \r\n" + 
				"    -fx-font-weight: bold;");
		root.getChildren().add(btnDNAPlot);
		
		btnHelp = new Button();
		btnHelp.setText("Help");
		btnHelp.setLayoutX(screenWidth-180);
		btnHelp.setLayoutY(screenHeight-75);
		btnHelp.setStyle(" -fx-background-color: \r\n" + 
				"        #000000,\r\n" + 
				"        linear-gradient(#FFDAB9, #FFDAB9),\r\n" + 
				"        linear-gradient(#FFDAB9 0%, #FFDAB9 49%, #FFDAB9 50%, #FFDAB9 100%);\r\n" + 
				"    -fx-background-insets: 0,1,2;\r\n" + 
				"    -fx-background-radius: 3,2,1;\r\n" + 
				"    -fx-padding: 3 10 3 10;\r\n" + 
				"    -fx-text-fill: black;\r\n" + 
				"    -fx-font-size: 12px; \r\n" + 
				"    -fx-font-weight: bold;");
		root.getChildren().add(btnHelp);
		
		btnAdd1 = new Button();
		btnAdd1.setText("1");
		btnAdd1.setLayoutX(64);
		btnAdd1.setLayoutY(proportionalHeight+4);
		btnAdd1.setStyle(" -fx-background-color: \r\n" + 
				"        #000000,\r\n" + 
				"        linear-gradient(#FFDAB9, #FFDAB9),\r\n" + 
				"        linear-gradient(#FFDAB9 0%, #FFDAB9 49%, #FFDAB9 50%, #FFDAB9 100%);\r\n" + 
				"    -fx-background-insets: 0,1,2;\r\n" + 
				"    -fx-background-radius: 3,2,1;\r\n" + 
				"    -fx-padding: 3 10 3 10;\r\n" + 
				"    -fx-text-fill: black;\r\n" + 
				"    -fx-font-size: 12px; \r\n" + 
				"    -fx-font-weight: bold;");
		root.getChildren().add(btnAdd1);
		
		btnAdd2 = new Button();
		btnAdd2.setText("+");
		btnAdd2.setLayoutX(94);
		btnAdd2.setLayoutY(proportionalHeight+4);
		btnAdd2.setStyle(" -fx-background-color: \r\n" + 
				"        #000000,\r\n" + 
				"        linear-gradient(#FFDAB9, #FFDAB9),\r\n" + 
				"        linear-gradient(#FFDAB9 0%, #FFDAB9 49%, #FFDAB9 50%, #FFDAB9 100%);\r\n" + 
				"    -fx-background-insets: 0,1,2;\r\n" + 
				"    -fx-background-radius: 3,2,1;\r\n" + 
				"    -fx-padding: 3 10 3 10;\r\n" + 
				"    -fx-text-fill: black;\r\n" + 
				"    -fx-font-size: 12px; \r\n" + 
				"    -fx-font-weight: bold;");
		root.getChildren().add(btnAdd2);
		
		btnSaveDraft = new Button();
		btnSaveDraft.setText("Save as Draft");
		btnSaveDraft.setLayoutX(fieldWidthAlignment*7);
		btnSaveDraft.setLayoutY(proportionalHeight*numberOfFields);
		btnSaveDraft.setStyle(" -fx-background-color: \r\n" + 
				"        #000000,\r\n" + 
				"        linear-gradient(#FFDAB9, #FFDAB9),\r\n" + 
				"        linear-gradient(#FFDAB9 0%, #FFDAB9 49%, #FFDAB9 50%, #FFDAB9 100%);\r\n" + 
				"    -fx-background-insets: 0,1,2;\r\n" + 
				"    -fx-background-radius: 3,2,1;\r\n" + 
				"    -fx-padding: 3 10 3 10;\r\n" + 
				"    -fx-text-fill: black;\r\n" + 
				"    -fx-font-size: 12px; \r\n" + 
				"    -fx-font-weight: bold;");
		root.getChildren().add(btnSaveDraft);
		
		btnSaveRelease = new Button();
		btnSaveRelease.setText("Save & Release");
		btnSaveRelease.setLayoutX(fieldWidthAlignment*8);
		btnSaveRelease.setLayoutY(proportionalHeight*numberOfFields);
		btnSaveRelease.setStyle(" -fx-background-color: \r\n" + 
				"        #000000,\r\n" + 
				"        linear-gradient(#FFDAB9, #FFDAB9),\r\n" + 
				"        linear-gradient(#FFDAB9 0%, #FFDAB9 49%, #FFDAB9 50%, #FFDAB9 100%);\r\n" + 
				"    -fx-background-insets: 0,1,2;\r\n" + 
				"    -fx-background-radius: 3,2,1;\r\n" + 
				"    -fx-padding: 3 10 3 10;\r\n" + 
				"    -fx-text-fill: black;\r\n" + 
				"    -fx-font-size: 12px; \r\n" + 
				"    -fx-font-weight: bold;");
		root.getChildren().add(btnSaveRelease);
		
		btnConfirm = new Button();
		btnConfirm.setText("Confirm");
		btnConfirm.setLayoutX(fieldWidthAlignment*9);
		btnConfirm.setLayoutY(proportionalHeight*numberOfFields);
		btnConfirm.setStyle(" -fx-background-color: \r\n" + 
				"        #000000,\r\n" + 
				"        linear-gradient(#FFDAB9, #FFDAB9),\r\n" + 
				"        linear-gradient(#FFDAB9 0%, #FFDAB9 49%, #FFDAB9 50%, #FFDAB9 100%);\r\n" + 
				"    -fx-background-insets: 0,1,2;\r\n" + 
				"    -fx-background-radius: 3,2,1;\r\n" + 
				"    -fx-padding: 3 10 3 10;\r\n" + 
				"    -fx-text-fill: black;\r\n" + 
				"    -fx-font-size: 12px; \r\n" + 
				"    -fx-font-weight: bold;");
		root.getChildren().add(btnConfirm);
		
		stage.setScene(scene);
		stage.show();

		stage.setX(primaryScreenBounds.getMinX());
		stage.setY(primaryScreenBounds.getMinY());
		stage.setWidth(primaryScreenBounds.getWidth());
		stage.setHeight(primaryScreenBounds.getHeight());

		
		
	}
	@Override
	public void handle(ActionEvent event) {
		if(event.getSource() == btnAddaField) {
			System.out.println("Add a field button was clicked :)");
		}
		if(event.getSource() == btnHelp) {
			System.out.println("Display new help menu with exit button");
		}
	}


}
