import org.eclipse.swt.SWT;
import java.awt.color.*;

import javax.swing.JFrame;

import java.awt.Color;
import java.awt.Graphics;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Button;
import org.eclipse.wb.swt.SWTResourceManager;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.MenuItem;
import org.eclipse.swt.widgets.Monitor;

public class App {
	public static void main(String[] args) {

		new Paint(Graphics g);
	}

	/**
	 * Launch the application.
	 * @param args
	 */
	public void Paint(Graphics g) {

		JFrame f = new JFrame("Title");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Shell shell = new Shell();

		
		Display display = Display.getDefault();
		Monitor primary = display.getPrimaryMonitor();
		Rectangle bounds = primary.getBounds();
		int screenWidth = bounds.width;
		int screenHeight = bounds.height;
		
		/** Black border lines
		 *  gc.drawline(int x, int y);
		 *  */

		/** full screen rectangle */
		g.drawLine(60,60,60,screenHeight-120);
		g.drawLine(60,60,screenWidth-60,60);
		g.drawLine(screenWidth-60,60,screenWidth-60,screenHeight-120);
		g.drawLine(screenWidth-60, screenHeight-120, 60, screenHeight-120);
		g.setColor(Color.black);
		/** Top three lines */
		int proportionalHeight = screenWidth/10;
		int proportionalWidth = screenHeight/16;
		
		g.drawLine(60, proportionalHeight, (screenWidth-60), proportionalHeight);
	//	g.drawLine((proportionalWidth*2.5), proportionalHeight, (proportionalWidth*2.5), 60);
	//  g.drawLine((screenWidth-(proportionalWidth*2.5)), proportionalHeight, (screenWidth-(proportionalWidth*2.5)), 60);
	
		g.setColor(Color.black);
		
		
		/** size of screen  */
	//	Monitor primary = display.getPrimaryMonitor();
		//Rectangle bounds = primary.getBounds();
		/** size of window */
		Rectangle rect = shell.getBounds();
		
		System.out.println(bounds.width);
		System.out.println(bounds.height);	
		System.out.println(rect.width);
		System.out.println(rect.height);
		
		shell.setSize(bounds.width, bounds.height);
		shell.setText("Revision Log");

		//setScreen(Graphics g);
		/** Add a field Button */
		Button btnAddAField = new Button(shell, SWT.NONE);
		btnAddAField.setForeground(SWTResourceManager.getColor(0, 0, 0));
		btnAddAField.setBounds(174, 186, 75, 25);
		btnAddAField.setText("Add A Field");
		
		/** Revision Button */
		Button btnRevision = new Button(shell, SWT.FLAT);
		btnRevision.setBounds(174, 232, 75, 25);
		btnRevision.setText("Revision");
		
		
		/** menu bar */
		Menu menuBar = new Menu(shell, SWT.BAR);
		/** create the file items in the bar men */
		Menu fileMenu = new Menu(menuBar);
		MenuItem fileItem = new MenuItem(menuBar, SWT.CASCADE);
		fileItem.setText("CTOS");
		fileItem.setMenu(fileMenu);
		
		/** Create all the items in the File dropbox */
		MenuItem revisionLogItem = new MenuItem(fileMenu, SWT.NONE);
		revisionLogItem.setText("Revision Log");
		MenuItem revisionLogSecuritySetupItem = new MenuItem(fileMenu, SWT.NONE);
		revisionLogSecuritySetupItem.setText("Revision Log Security Setup");
		MenuItem revisionUpdateItem = new MenuItem(fileMenu, SWT.NONE);
		revisionUpdateItem.setText("Revision Update");
		
		
		
		shell.setMenuBar(menuBar);
		
		text_1 = new Text(shell, SWT.BORDER);
		text_1.setBounds(174, 263, 76, 21);
	}

		
	}