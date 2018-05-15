
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.geometry.Rectangle2D;
import javafx.scene.Group;

import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.stage.Screen;
import javafx.stage.Stage;

import javafx.scene.control.TextField;
import javafx.scene.control.Tooltip;
import javafx.scene.effect.DropShadow;
import javafx.scene.input.MouseEvent;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;

/** 
 * extends application which is an import
 */
public class revisionLog extends Application{
	/**  fix buttons tomorrow using hover and CSS import*/
	
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
	
	TextField txtRevision;
	TextField txtDate;
	TextField txtInitial;
	TextField txtDescription;
	TextField txtCode;
	
	ChoiceBox<Integer> pageNum;
	
	public double numberOfFields = 2.5;
	static Group group;
	
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
		group = root;
		Rectangle2D primaryScreenBounds = Screen.getPrimary().getVisualBounds();
		
		int screenWidth=(int) primaryScreenBounds.getWidth();
		int screenHeight = (int) primaryScreenBounds.getHeight();
		

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
		
		pageNum = new ChoiceBox<>();
		pageNum.getItems().add(1);
		pageNum.setValue(1);
		pageNum.setTooltip(new Tooltip("Select a page"));
		pageNum.setLayoutX(fieldWidthAlignment * 0.5);
		pageNum.setLayoutY(proportionalHeight * 1.5);
		
		/** Add a field button
		 * Positioned proportionally
		 * CSS setStyle of button with on Button shadow
		 * Functionality iteratively prints out TextFields: Revision, Date, Initial, Description, code 
		 * and Buttons Save as Draft, Save & Release, confirm
		 */
		btnAddaField = new Button();
		btnAddaField.setText("Add a Field");
		btnAddaField.setLayoutX(fieldWidthAlignment);
		btnAddaField.setLayoutY(proportionalHeight *1.5);
		btnAddaField.setStyle(" -fx-background-color: \r\n" + 
				"        #000000,\r\n" + 
				"        linear-gradient(#FFDAB9, #FFDAB9),\r\n" + 
				"        linear-gradient(#FFDAB9 0%, #FFDAB9 49%, #FFDAB9 50%, #FFDAB9 100%);\r\n" + 
				
				"    -fx-background-insets: 0,1,2;\r\n" + 
				"    -fx-background-radius: 3,2,1;\r\n" + 
				"    -fx-padding: 5 10 5 10;\r\n" + 
				"    -fx-text-fill: black;\r\n" + 
				"    -fx-font-size: 12px; \r\n" + 
				"    -fx-font-weight: bold; \r\n");
		
		DropShadow shadowDrop = new DropShadow();
		// Adding the shadow when the mouse cursor is on
		btnAddaField.addEventHandler(MouseEvent.MOUSE_ENTERED, new EventHandler<MouseEvent>() {
			@Override public void handle(MouseEvent e) {
				btnAddaField.setEffect(shadowDrop);
			}
		});
		//Removing the shadow when the mouse cursor is off
		btnAddaField.addEventHandler(MouseEvent.MOUSE_EXITED, new EventHandler<MouseEvent>() {
			@Override public void handle(MouseEvent e) {
				btnAddaField.setEffect(null);
			}
		});
		
		/**
		 * Set's functionality to Add a field button
		 */
		btnAddaField.setOnAction(e -> {
			if (numberOfFields < 8.5) {
				numberOfFields += 0.4;
				
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
						"    -fx-padding: 5 10 5 10;\r\n" + 
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
						"    -fx-padding: 5 10 5 10;\r\n" + 
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
						"    -fx-padding: 5 10 5 10;\r\n" + 
						"    -fx-text-fill: black;\r\n" + 
						"    -fx-font-size: 12px; \r\n" + 
						"    -fx-font-weight: bold;");
				root.getChildren().add(btnConfirm);
				
				txtRevision = new TextField();
				txtRevision.setPrefWidth(100);
				txtRevision.setPromptText("1234567890");
				txtRevision.setAlignment(Pos.CENTER);
				txtRevision.setLayoutX(fieldWidthAlignment);
				txtRevision.setLayoutY(proportionalHeight*numberOfFields);
				txtRevision.setStyle("-fx-background-color: #d4ffd4;");
				root.getChildren().add(txtRevision);
				
				txtDate = new TextField();
				txtDate.setPrefWidth(90);
				txtDate.setPromptText("yy/mm/dd");
				txtDate.setAlignment(Pos.CENTER);
				txtDate.setLayoutX(fieldWidthAlignment*2);
				txtDate.setLayoutY(proportionalHeight*numberOfFields);
				txtDate.setStyle("-fx-background-color: #d4ffd4;");
				root.getChildren().add(txtDate);
				
				txtInitial = new TextField();
				txtInitial.setPrefWidth(100);
				txtInitial.setPromptText("1234567890");
				txtInitial.setAlignment(Pos.CENTER);
				txtInitial.setLayoutX(fieldWidthAlignment*3);
				txtInitial.setLayoutY(proportionalHeight*numberOfFields);
				txtInitial.setStyle("-fx-background-color: #d4ffd4;");
				root.getChildren().add(txtInitial);
				
				txtDescription = new TextField();
				txtDescription.setPrefWidth(260);
				txtDescription.setPromptText("1234567890123456789012345678901234567890");
				txtDescription.setAlignment(Pos.BASELINE_LEFT);
				txtDescription.setLayoutX(fieldWidthAlignment*4);
				txtDescription.setLayoutY(proportionalHeight*numberOfFields);
				txtDescription.setStyle("-fx-background-color: #d4ffd4;");
				root.getChildren().add(txtDescription);
				
				txtCode = new TextField();
				txtCode.setPrefWidth(100);
				txtCode.setPromptText("1234567890");
				txtCode.setAlignment(Pos.CENTER);
				txtCode.setLayoutX(fieldWidthAlignment*6);
				txtCode.setLayoutY(proportionalHeight*numberOfFields);
				txtCode.setStyle("-fx-background-color: #d4ffd4;");
				root.getChildren().add(txtCode);
			}
			/**
			 * Determines how many fields per page
			 */
			else if(numberOfFields > 8.5) {
				Group root2 = new Group();
				root2.getChildren().addAll(btnRevision, pageNum);
				Scene page2 = new Scene(root2, screenWidth, screenHeight, Color.WHITE);
				pageNum.getItems().add(2);
				pageNum.setValue(2);
				stage.setScene(page2);
			}
			
		});
		
		/**
		 * Revision disabled button label
		 */
		btnRevision = new Button();
		btnRevision.setText("Revision");
		btnRevision.setLayoutX(fieldWidthAlignment);
		btnRevision.setLayoutY(proportionalHeight *2);
		btnRevision.setStyle(" -fx-background-color: \r\n" +  
				"        linear-gradient(#f49541, #f49541),\r\n" + 
				"        linear-gradient(#f49541 0%, #f49541 49%, #f49541 50%, #f49541 100%);\r\n" + 
				"    -fx-background-insets: 0,1,2;\r\n" + 
				"    -fx-background-radius: 3,2,1;\r\n" + 
				"    -fx-padding: 5 10 5 10;\r\n" + 
				"    -fx-text-fill: black;\r\n" + 
				"    -fx-font-size: 12px; \r\n" + 
				"    -fx-font-weight: bold;");
		
		/**
		 * Revision textField 1
		 */
		txtRevision = new TextField();
		txtRevision.setPrefWidth(100);
		txtRevision.setPromptText("1234567890");
		txtRevision.setAlignment(Pos.CENTER);
		txtRevision.setLayoutX(fieldWidthAlignment);
		txtRevision.setLayoutY(proportionalHeight*2.5);
		txtRevision.setStyle("-fx-background-color: #d4ffd4;");
		
		/**
		 * Date disabled button
		 */
		btnDate = new Button();
		btnDate.setText("Date");
		btnDate.setLayoutX(fieldWidthAlignment*2);
		btnDate.setLayoutY(proportionalHeight *2);
		btnDate.setStyle(" -fx-background-color: \r\n" + 
				"        linear-gradient(#f49541, #f49541),\r\n" + 
				"        linear-gradient(#f49541 0%, #f49541 49%, #f49541 50%, #f49541 100%);\r\n" + 
				"    -fx-background-insets: 0,1,2;\r\n" + 
				"    -fx-background-radius: 3,2,1;\r\n" + 
				"    -fx-padding: 5 10 5 10;\r\n" + 
				"    -fx-text-fill: black;\r\n" + 
				"    -fx-font-size: 12px; \r\n" + 
				"    -fx-font-weight: bold;");
		/**
		 * Date Textfield 1
		 */
		txtDate = new TextField();
		txtDate.setPrefWidth(90);
		txtDate.setPromptText("yy/mm/dd");
		txtDate.setAlignment(Pos.CENTER);
		txtDate.setLayoutX(fieldWidthAlignment*2);
		txtDate.setLayoutY(proportionalHeight*2.5);
		txtDate.setStyle("-fx-background-color: #d4ffd4;");
		
		/**
		 * Initial disabled button
		 */
		btnInitial = new Button();
		btnInitial.setText("Initial");
		btnInitial.setLayoutX(fieldWidthAlignment*3);
		btnInitial.setLayoutY(proportionalHeight *2);
		btnInitial.setStyle(" -fx-background-color: \r\n" + 
				"        linear-gradient(#f49541, #f49541),\r\n" + 
				"        linear-gradient(#f49541 0%, #f49541 49%, #f49541 50%, #f49541 100%);\r\n" + 
				"    -fx-background-insets: 0,1,2;\r\n" + 
				"    -fx-background-radius: 3,2,1;\r\n" + 
				"    -fx-padding: 5 10 5 10;\r\n" + 
				"    -fx-text-fill: black;\r\n" + 
				"    -fx-font-size: 12px; \r\n" + 
				"    -fx-font-weight: bold;");
		/**
		 * Initial Textfield 1
		 */
		txtInitial = new TextField();
		txtInitial.setPrefWidth(100);
		txtInitial.setPromptText("1234567890");
		txtInitial.setAlignment(Pos.CENTER);
		txtInitial.setLayoutX(fieldWidthAlignment*3);
		txtInitial.setLayoutY(proportionalHeight*2.5);
		txtInitial.setStyle("-fx-background-color: #d4ffd4;");
		
		/**
		 * Description disabled button label
		 */
		btnDescription = new Button();
		btnDescription.setText("Description");
		btnDescription.setLayoutX(fieldWidthAlignment*4);
		btnDescription.setLayoutY(proportionalHeight *2);
		btnDescription.setStyle(" -fx-background-color: \r\n" + 
				"        linear-gradient(#f49541, #f49541),\r\n" + 
				"        linear-gradient(#f49541 0%, #f49541 49%, #f49541 50%, #f49541 100%);\r\n" + 
				"    -fx-background-insets: 0,1,2;\r\n" + 
				"    -fx-background-radius: 3,2,1;\r\n" + 
				"    -fx-padding: 5 10 5 10;\r\n" + 
				"    -fx-text-fill: black;\r\n" + 
				"    -fx-font-size: 12px; \r\n" + 
				"    -fx-font-weight: bold;");
		/**
		 * Description Textfield 1
		 */
		txtDescription = new TextField();
		txtDescription.setPrefWidth(260);
		txtDescription.setPromptText("1234567890123456789012345678901234567890");
		txtDescription.setAlignment(Pos.BASELINE_LEFT);
		txtDescription.setLayoutX(fieldWidthAlignment*4);
		txtDescription.setLayoutY(proportionalHeight*2.5);
		txtDescription.setStyle("-fx-background-color: #d4ffd4;");
		
		/**
		 * Code disabled Button
		 */
		btnCode = new Button();
		btnCode.setText("Code");
		btnCode.setLayoutX(fieldWidthAlignment*6);
		btnCode.setLayoutY(proportionalHeight *2);
		btnCode.setStyle(" -fx-background-color: \r\n" + 
				"        linear-gradient(#f49541, #f49541),\r\n" + 
				"        linear-gradient(#f49541 0%, #f49541 49%, #f49541 50%, #f49541 100%);\r\n" + 
				"    -fx-background-insets: 0,1,2;\r\n" + 
				"    -fx-background-radius: 3,2,1;\r\n" + 
				"    -fx-padding: 5 10 5 10;\r\n" + 
				"    -fx-text-fill: black;\r\n" + 
				"    -fx-font-size: 12px; \r\n" + 
				"    -fx-font-weight: bold;");
		/**
		 * 
		 * Code TextField 1
		 */
		txtCode = new TextField();
		txtCode.setPrefWidth(100);
		txtCode.setPromptText("1234567890");
		txtCode.setAlignment(Pos.CENTER);
		txtCode.setLayoutX(fieldWidthAlignment*6);
		txtCode.setLayoutY(proportionalHeight*2.5);
		txtCode.setStyle("-fx-background-color: #d4ffd4;");
		
		/**
		 * Draft Disabled Button
		 */
		btnDraft = new Button();
		btnDraft.setText("Draft");
		btnDraft.setLayoutX(fieldWidthAlignment*7);
		btnDraft.setLayoutY(proportionalHeight *2);
		btnDraft.setStyle(" -fx-background-color: \r\n" + 
				"        linear-gradient(#f49541, #f49541),\r\n" + 
				"        linear-gradient(#f49541 0%, #f49541 49%, #f49541 50%, #f49541 100%);\r\n" + 
				"    -fx-background-insets: 0,1,2;\r\n" + 
				"    -fx-background-radius: 3,2,1;\r\n" + 
				"    -fx-padding: 5 10 5 10;\r\n" + 
				"    -fx-text-fill: black;\r\n" + 
				"    -fx-font-size: 12px; \r\n" + 
				"    -fx-font-weight: bold;");
		
		/**
		 * Final Disabled Button
		 */
		btnFinal = new Button();
		btnFinal.setText("Final");
		btnFinal.setLayoutX(fieldWidthAlignment*8);
		btnFinal.setLayoutY(proportionalHeight *2);
		btnFinal.setStyle(" -fx-background-color: \r\n" + 
				"        linear-gradient(#f49541, #f49541),\r\n" + 
				"        linear-gradient(#f49541 0%, #f49541 49%, #f49541 50%, #f49541 100%);\r\n" + 
				"    -fx-background-insets: 0,1,2;\r\n" + 
				"    -fx-background-radius: 3,2,1;\r\n" + 
				"    -fx-padding: 5 10 5 10;\r\n" + 
				"    -fx-text-fill: black;\r\n" + 
				"    -fx-font-size: 12px; \r\n" + 
				"    -fx-font-weight: bold;");
		
		/**
		 * Release Disabled Button
		 */
		btnRelease = new Button();
		btnRelease.setText("Release");
		btnRelease.setLayoutX(fieldWidthAlignment*9);
		btnRelease.setLayoutY(proportionalHeight *2);
		btnRelease.setStyle(" -fx-background-color: \r\n" +  
				"        linear-gradient(#f49541, #f49541),\r\n" + 
				"        linear-gradient(#f49541 0%, #f49541 49%, #f49541 50%, #f49541 100%);\r\n" + 
				"    -fx-background-insets: 0,1,2;\r\n" + 
				"    -fx-background-radius: 3,2,1;\r\n" + 
				"    -fx-padding: 5 10 5 10;\r\n" + 
				"    -fx-text-fill: black;\r\n" + 
				"    -fx-font-size: 12px; \r\n" +
				"    -fx-font-weight: bold;");
		
		/**
		 * Print directs to separate print class
		 */
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
				"    -fx-padding: 5 10 5 10;\r\n" + 
				"    -fx-text-fill: black;\r\n" + 
				"    -fx-font-size: 12px; \r\n" + 
				"    -fx-font-weight: bold;");
		DropShadow shadowPrint = new DropShadow();
		// Adding the shadow when the mouse cursor is on
		btnPrint.addEventHandler(MouseEvent.MOUSE_ENTERED, new EventHandler<MouseEvent>() {
			@Override public void handle(MouseEvent e) {
				btnPrint.setEffect(shadowPrint);
			}
		});
		//Removing the shadow when the mouse cursor is off
		btnPrint.addEventHandler(MouseEvent.MOUSE_EXITED, new EventHandler<MouseEvent>() {
			@Override public void handle(MouseEvent e) {
				btnPrint.setEffect(null);
			}
		});
		btnPrint.setOnAction(e -> Print.start());
		
		/**
		 * Directs to DNA Plot page
		 */
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
				"    -fx-padding: 5 10 5 10;\r\n" + 
				"    -fx-text-fill: black;\r\n" + 
				"    -fx-font-size: 12px; \r\n" + 
				"    -fx-font-weight: bold;");
		
		/**
		 * For DNAPlot Button
		 * When mouse goes over active buttons, display a shadow
		 */
		DropShadow shadowDNAPlot = new DropShadow();
		// Adding the shadow when the mouse cursor is on
		btnDNAPlot.addEventHandler(MouseEvent.MOUSE_ENTERED, new EventHandler<MouseEvent>() {
			@Override public void handle(MouseEvent e) {
				btnDNAPlot.setEffect(shadowDNAPlot);
			}
		});
		/**
		 * For DNAPlot Button
		 * When mouse goes away from active button, remove shadow
		 */
		//Removing the shadow when the mouse cursor is off
		btnDNAPlot.addEventHandler(MouseEvent.MOUSE_EXITED, new EventHandler<MouseEvent>() {
			@Override public void handle(MouseEvent e) {
				btnDNAPlot.setEffect(null);
			}
		});
		/**
		 * Help button redirects to help class which 
		 * describes every button/field on page
		 */
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
				"    -fx-padding: 5 10 5 10;\r\n" + 
				"    -fx-text-fill: black;\r\n" + 
				"    -fx-font-size: 12px; \r\n" + 
				"    -fx-font-weight: bold;");
		
		/**
		 * For Help Button
		 * Display a shadow when mouse goes over button
		 */
		DropShadow shadowHelp = new DropShadow();
		// Adding the shadow when the mouse cursor is on
		btnHelp.addEventHandler(MouseEvent.MOUSE_ENTERED, new EventHandler<MouseEvent>() {
			@Override public void handle(MouseEvent e) {
				btnHelp.setEffect(shadowHelp);
			}
		});
		/**
		 * For Help Button
		 * Remove a shadow when mouse leaves button
		 * 
		 */
		//Removing the shadow when the mouse cursor is off
		btnHelp.addEventHandler(MouseEvent.MOUSE_EXITED, new EventHandler<MouseEvent>() {
			@Override public void handle(MouseEvent e) {
				btnHelp.setEffect(null);
			}
		});
		btnHelp.setOnAction(e -> Help.help());
		
		/**
		 * Save as draft functional button
		 */
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
				"    -fx-padding: 5 10 5 10;\r\n" + 
				"    -fx-text-fill: black;\r\n" + 
				"    -fx-font-size: 12px; \r\n" + 
				"    -fx-font-weight: bold;");
		/**
		 * Save & Release functional Button
		 */
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
				"    -fx-padding: 5 10 5 10;\r\n" + 
				"    -fx-text-fill: black;\r\n" + 
				"    -fx-font-size: 12px; \r\n" + 
				"    -fx-font-weight: bold;");
		/**
		 * Release functional Button
		 */
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
				"    -fx-padding: 5 10 5 10;\r\n" + 
				"    -fx-text-fill: black;\r\n" + 
				"    -fx-font-size: 12px; \r\n" + 
				"    -fx-font-weight: bold;");	
		/**
		 * Add everything to scene
		 */
		root.getChildren().addAll(pageNum, btnAddaField,btnRevision,btnDate, btnInitial,btnDescription, btnCode, 
				btnDraft,btnFinal, btnRelease, btnPrint, btnDNAPlot,btnHelp,btnSaveDraft,
				btnSaveRelease,btnConfirm,txtRevision,txtDate,txtInitial,txtDescription, txtCode);
		
		/**
		 * Setting up the scene
		 */
		Scene scene = new Scene(root, screenWidth, screenHeight, Color.WHITE);
		stage.setScene(scene);
		stage.setTitle("Revision Log");
		
		stage.setScene(scene);
		stage.show();

		stage.setX(primaryScreenBounds.getMinX());
		stage.setY(primaryScreenBounds.getMinY());
		stage.setWidth(primaryScreenBounds.getWidth());
		stage.setHeight(primaryScreenBounds.getHeight());	
	}
	
	
	public static Group currentLayout() {
		return group;
	}
	



}

