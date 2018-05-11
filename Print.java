
import javafx.application.Application;
import javafx.collections.ObservableSet;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.print.Printer;
import javafx.print.PrinterJob;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.effect.DropShadow;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Print {
	
	private int ONE = 1;
	
	private static Label jobStatus = new Label();
	
	public static void start()
	{
		// Create the TextArea
		final TextArea textArea = new TextArea();
		// Create the Button
		Button button = new Button("Get all Printers");
		button.setStyle(" -fx-background-color: \r\n" + 
				"        #000000,\r\n" + 
				"        linear-gradient(#FFDAB9, #FFDAB9),\r\n" + 
				"        linear-gradient(#FFDAB9 0%, #FFDAB9 49%, #FFDAB9 50%, #FFDAB9 100%);\r\n" + 
				
				"    -fx-background-insets: 0,1,2;\r\n" + 
				"    -fx-background-radius: 3,2,1;\r\n" + 
				"    -fx-padding: 3 10 3 10;\r\n" + 
				"    -fx-text-fill: black;\r\n" + 
				"    -fx-font-size: 12px; \r\n" + 
				"    -fx-font-weight: bold; \r\n");
		
		Button printSceneButton = new Button("Print Scene");
		printSceneButton.setOnAction(e -> print(revisionLog.currentLayout()));
		
		// Create the Status Box
				HBox jobStatusBox = new HBox(5, new Label("Job Status: "), jobStatus);
				// Create the Button Box
				HBox buttonBox = new HBox(5, printSceneButton);
		
		DropShadow shadowDrop = new DropShadow();
		// Adding the shadow when the mouse cursor is on
		button.addEventHandler(MouseEvent.MOUSE_ENTERED, new EventHandler<MouseEvent>() {
			@Override public void handle(MouseEvent e) {
				button.setEffect(shadowDrop);
			}
		});
		//Removing the shadow when the mouse cursor is off
		button.addEventHandler(MouseEvent.MOUSE_EXITED, new EventHandler<MouseEvent>() {
			@Override public void handle(MouseEvent e) {
				button.setEffect(null);
			}
		});

		// Create the Event-Handlers for the Buttons
		button.setOnAction(new EventHandler <ActionEvent>() 
		{
            public void handle(ActionEvent event) 
            {
            	//Get all Printers
        		ObservableSet<Printer> orinters = Printer.getAllPrinters();
        		Printer defaultprinter = Printer.getDefaultPrinter();
        		for(Printer printer : orinters) 
        		{
        			if(printer == defaultprinter) {
        				textArea.appendText(printer.getName() + " (Default)\n");
        			}	
        			else {
        				textArea.appendText(printer.getName()+"\n");
        			}
        		}		
            }
        });
		
		Stage stage = new Stage();
		
		// Create the VBox with a 10px spacing
		VBox root = new VBox(10);	
		// Add the Children to the VBox
		root.getChildren().addAll(button,textArea, buttonBox, jobStatusBox);	
		// Set the Size of the VBox
		root.setPrefSize(500, 350);		
		// Set the Style-properties of the VBox
		root.setStyle("-fx-padding: 10;" +
				"-fx-border-style: solid inside;" +
				"-fx-border-width: 2;" +
				"-fx-border-insets: 5;" +
				"-fx-border-radius: 5;" +
				"-fx-border-color: #f49541;");
		
		// Create the Scene
		Scene scene = new Scene(root);
		// Add the scene to the Stage
		stage.setScene(scene);
		// Set the title of the Stage
		stage.setTitle("Showing all Printers");
		// Display the Stage
		stage.show();		
	}
	
	private static void print(Node node) 
	{
		// Define the Job Status Message
		jobStatus.textProperty().unbind();
		jobStatus.setText("Creating a printer job...");
		
		// Create a printer job for the default printer
		PrinterJob job = PrinterJob.createPrinterJob();
		
		if (job != null) 
		{
			// Show the printer job status
			jobStatus.textProperty().bind(job.jobStatusProperty().asString());
			
			// Print the node
			boolean printed = job.printPage(node);

			if (printed) 
			{
				// End the printer job
				job.endJob();
			} 
			else 
			{
				// Write Error Message
				jobStatus.textProperty().unbind();
				jobStatus.setText("Printing failed.");
			}
		} 
		else 
		{
			// Write Error Message
			jobStatus.setText("Could not create a printer job.");
		}
	}
}
