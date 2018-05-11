import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.geometry.*;

public class Help {
	
	public static void help() {
		Stage window = new Stage();
		window.initModality(Modality.APPLICATION_MODAL);
		window.setTitle("Help");
		window.setHeight(400);
		window.setWidth(600);
		window.setMinWidth(250);
		
		Label lblRevision = new Label();
		lblRevision.setText("Revision");
		lblRevision.setMinWidth(85);
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
		
		Label lblRevisionDef = new Label();
		lblRevisionDef.setText("Revision number of test.");
		
		Label lblDate = new Label();
		lblDate.setText("Date");
		lblDate.setMinWidth(85);
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
		
		Label lblDateDef = new Label();
		lblDateDef.setText("The date the test took place.");
		
		Label lblInitial = new Label();
		lblInitial.setText("Initial");
		lblInitial.setMinWidth(85);
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
		
		Label lblInitialDef = new Label();
		lblInitialDef.setText("Initial definition???");
		
		Label lblDescription = new Label();
		lblDescription.setText("Description");
		lblDescription.setMinWidth(85);
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
		
	//	Label lblDescription = new Label();
		
		
		Label lblCode = new Label();
		lblCode.setText("Code");
		lblCode.setMinWidth(85);
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
		
		BorderPane layout = new BorderPane();
		
		VBox words = new VBox();
		words.setPadding(new Insets(10));
		words.setSpacing(10);
		words.getChildren().addAll(lblRevision, lblDate, lblInitial, lblDescription);
		layout.setLeft(words);
		
		VBox definitions = new VBox();
		definitions.setPadding(new Insets(10));
		definitions.setSpacing(10);
		definitions.getChildren().addAll(lblRevisionDef);
		layout.setCenter(definitions);
		
		//layout.getChildren().addAll(lblRevision);
		//layout.setAlignment(Pos.CENTER);
		Scene scene = new Scene(layout);
		window.setScene(scene);
		window.showAndWait();
		
		
	} //end help
	
}
