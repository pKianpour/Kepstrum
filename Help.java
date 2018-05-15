import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.control.*;
import javafx.scene.effect.DropShadow;
import javafx.scene.input.MouseEvent;
import javafx.event.EventHandler;
import javafx.geometry.*;

public class Help {
	
	public static void help() {
		Stage window = new Stage();
		window.initModality(Modality.APPLICATION_MODAL);
		window.setTitle("Help");
		window.setHeight(500);
		window.setWidth(600);
		window.setMinWidth(250);

		
		Label lblHelpDef = new Label("Scroll Over For Button/Label Definition");
		lblHelpDef.setTextFill(Color.BLACK);
		lblHelpDef.setFont(new Font("Arial", 24));
		
		
		Label lblRevision = new Label();
		lblRevision.setText("Revision");
		lblRevision.setMinWidth(85);
		lblRevision.setMinHeight(20);
		lblRevision.setTooltip(new Tooltip("Revision number of test."));
		lblRevision.setAlignment(Pos.CENTER);
		lblRevision.setStyle(" -fx-background-color: \r\n" +  
				"        linear-gradient(#f49541, #f49541),\r\n" + 
				"        linear-gradient(#f49541 0%, #f49541 49%, #f49541 50%, #f49541 100%);\r\n" + 
				"    -fx-background-insets: 0,1,2;\r\n" + 
				"    -fx-background-radius: 3,2,1;\r\n" + 
				"    -fx-padding: 3 10 3 10;\r\n" + 
				"    -fx-text-fill: black;\r\n" + 
				"    -fx-font-size: 12px; \r\n" + 
				"    -fx-font-weight: bold;");
		
		Label lblDate = new Label();
		lblDate.setText("Date");
		lblDate.setMinWidth(85);
		lblDate.setMinHeight(20);
		lblDate.setTooltip(new Tooltip("The date the test took place."));
		lblDate.setAlignment(Pos.CENTER);
		lblDate.setStyle(" -fx-background-color: \r\n" + 
				"        linear-gradient(#f49541, #f49541),\r\n" + 
				"        linear-gradient(#f49541 0%, #f49541 49%, #f49541 50%, #f49541 100%);\r\n" + 
				"    -fx-background-insets: 0,1,2;\r\n" + 
				"    -fx-background-radius: 3,2,1;\r\n" + 
				"    -fx-padding: 3 10 3 10;\r\n" + 
				"    -fx-text-fill: black;\r\n" + 
				"    -fx-font-size: 12px; \r\n" + 
				"    -fx-font-weight: bold;");
		
		Label lblInitial = new Label();
		lblInitial.setText("Initial");
		lblInitial.setMinWidth(85);
		lblInitial.setTooltip(new Tooltip("What does this do????."));
		lblInitial.setAlignment(Pos.CENTER);
		lblInitial.setStyle(" -fx-background-color: \r\n" + 
				"        linear-gradient(#f49541, #f49541),\r\n" + 
				"        linear-gradient(#f49541 0%, #f49541 49%, #f49541 50%, #f49541 100%);\r\n" + 
				"    -fx-background-insets: 0,1,2;\r\n" + 
				"    -fx-background-radius: 3,2,1;\r\n" + 
				"    -fx-padding: 3 10 3 10;\r\n" + 
				"    -fx-text-fill: black;\r\n" + 
				"    -fx-font-size: 12px; \r\n" + 
				"    -fx-font-weight: bold;");
			
		Label lblDescription = new Label();
		lblDescription.setText("Description");
		lblDescription.setMinWidth(85);
		lblDescription.setMinHeight(20);
		lblDescription.setTooltip(new Tooltip("A brief description of the associated revision"));
		lblDescription.setAlignment(Pos.CENTER);
		lblDescription.setStyle(" -fx-background-color: \r\n" + 
				"        linear-gradient(#f49541, #f49541),\r\n" + 
				"        linear-gradient(#f49541 0%, #f49541 49%, #f49541 50%, #f49541 100%);\r\n" + 
				"    -fx-background-insets: 0,1,2;\r\n" + 
				"    -fx-background-radius: 3,2,1;\r\n" + 
				"    -fx-padding: 3 10 3 10;\r\n" + 
				"    -fx-text-fill: black;\r\n" + 
				"    -fx-font-size: 12px; \r\n" + 
				"    -fx-font-weight: bold;");
		
		Label lblCode = new Label();
		lblCode.setText("Code");
		lblCode.setMinWidth(85);
		lblCode.setMinHeight(20);
		lblCode.setTooltip(new Tooltip("The code for the revision"));
		lblCode.setAlignment(Pos.CENTER);
		lblCode.setStyle(" -fx-background-color: \r\n" + 
				"        linear-gradient(#f49541, #f49541),\r\n" + 
				"        linear-gradient(#f49541 0%, #f49541 49%, #f49541 50%, #f49541 100%);\r\n" + 
				"    -fx-background-insets: 0,1,2;\r\n" + 
				"    -fx-background-radius: 3,2,1;\r\n" + 
				"    -fx-padding: 3 10 3 10;\r\n" + 
				"    -fx-text-fill: black;\r\n" + 
				"    -fx-font-size: 12px; \r\n" + 
				"    -fx-font-weight: bold;");
		
		Button addAFieldBtn = new Button();
		addAFieldBtn.setText("Add a Field");
		addAFieldBtn.setMinWidth(85);
		addAFieldBtn.setMinHeight(20);
		addAFieldBtn.setTooltip(new Tooltip("Adds a new revision line. "));
		addAFieldBtn.setAlignment(Pos.CENTER);
		addAFieldBtn.setStyle(" -fx-background-color: \r\n" + 
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
		addAFieldBtn.addEventHandler(MouseEvent.MOUSE_ENTERED, new EventHandler<MouseEvent>() {
			@Override public void handle(MouseEvent e) {
				addAFieldBtn.setEffect(shadowDrop);
			}
		});
		//Removing the shadow when the mouse cursor is off
		addAFieldBtn.addEventHandler(MouseEvent.MOUSE_EXITED, new EventHandler<MouseEvent>() {
			@Override public void handle(MouseEvent e) {
				addAFieldBtn.setEffect(null);
			}
		});
		
		Button btnSaveDraft = new Button();
		btnSaveDraft.setText("Save as Draft");
		btnSaveDraft.setMinWidth(85);
		btnSaveDraft.setMinHeight(20);
		btnSaveDraft.setTooltip(new Tooltip("Save Revision line as a Draft. "));
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
		
		// Adding the shadow when the mouse cursor is on
		btnSaveDraft.addEventHandler(MouseEvent.MOUSE_ENTERED, new EventHandler<MouseEvent>() {
			@Override public void handle(MouseEvent e) {
				btnSaveDraft.setEffect(shadowDrop);
			}
		});
		//Removing the shadow when the mouse cursor is off
		btnSaveDraft.addEventHandler(MouseEvent.MOUSE_EXITED, new EventHandler<MouseEvent>() {
			@Override public void handle(MouseEvent e) {
				btnSaveDraft.setEffect(null);
			}
		});
		
		Button btnSaveRelease = new Button();
		btnSaveRelease.setText("Save & Release");
		btnSaveRelease.setMinWidth(85);
		btnSaveRelease.setMinHeight(20);
		btnSaveRelease.setTooltip(new Tooltip("Save & release??"));
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
		// Adding the shadow when the mouse cursor is on
		btnSaveRelease.addEventHandler(MouseEvent.MOUSE_ENTERED, new EventHandler<MouseEvent>() {
			@Override public void handle(MouseEvent e) {
				btnSaveRelease.setEffect(shadowDrop);
			}
		});
		//Removing the shadow when the mouse cursor is off
		btnSaveRelease.addEventHandler(MouseEvent.MOUSE_EXITED, new EventHandler<MouseEvent>() {
			@Override public void handle(MouseEvent e) {
				btnSaveRelease.setEffect(null);
			}
		});
		
		Button btnConfirm = new Button();
		btnConfirm.setText("Confirm");
		btnConfirm.setMinWidth(85);
		btnConfirm.setMinHeight(20);
		btnConfirm.setTooltip(new Tooltip("Confirm Save & Release."));
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
		// Adding the shadow when the mouse cursor is on
		btnConfirm.addEventHandler(MouseEvent.MOUSE_ENTERED, new EventHandler<MouseEvent>() {
			@Override public void handle(MouseEvent e) {
				btnConfirm.setEffect(shadowDrop);
			}
		});
		//Removing the shadow when the mouse cursor is off
		btnConfirm.addEventHandler(MouseEvent.MOUSE_EXITED, new EventHandler<MouseEvent>() {
			@Override public void handle(MouseEvent e) {
				btnConfirm.setEffect(null);
			}
		});
	
		
		/**
		 * Print directs to separate print class
		 */
		Button btnPrint = new Button();
		btnPrint.setText("Print");
		btnPrint.setMinWidth(85);
		btnPrint.setMinHeight(20);
		btnPrint.setTooltip(new Tooltip("Print current page."));
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
		Button btnDNAPlot = new Button();
		btnDNAPlot.setText("DNA Plot");
		btnDNAPlot.setMinWidth(85);
		btnDNAPlot.setMinHeight(20);
		btnDNAPlot.setTooltip(new Tooltip("Directs user to DNA Plot."));
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
		
		
		BorderPane layout = new BorderPane();
		
		VBox words = new VBox();
		words.setPadding(new Insets(10));
		words.setSpacing(10);
		words.getChildren().addAll(lblHelpDef, lblRevision, lblDate, lblInitial, lblDescription, lblCode, addAFieldBtn, btnSaveDraft, btnSaveRelease, btnConfirm, btnDNAPlot, btnPrint);
		layout.setLeft(words);
		
		//layout.getChildren().addAll(lblRevision);
		//layout.setAlignment(Pos.CENTER);

		Scene scene = new Scene(layout);
		window.setScene(scene);
		window.showAndWait();
		
		
	} //end help
	
}
