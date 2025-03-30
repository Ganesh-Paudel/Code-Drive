package main;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JPanel;

import components.LeftPanel;

public class MainPanel extends JPanel{
	
	private LeftPanel leftPanel; // leftPanel is one of the component in the panel 
	private int screenWidth; // width and height of the frame
	private int screenHeight; // height of the frame same as the frame
		
	/**
	 * This constructor initializes the mainPanel which is the home page where user can get once they get signed in
	 * @param frame the frame/window that will contain the panel(object)
	 * @param width the width of the frame
	 * @param height the height of the frame
	 */
	public MainPanel(MainWindow frame, int width, int height){
		this.screenWidth = width;
		this.screenHeight = height;
		
		initializeObjects();
		
		this.setBackground(Color.gray);
		//it makes so the it covers the given dimensions in the frame
		this.setPreferredSize(new Dimension(width, height));
		//so that we can place the components absolutely
		this.setLayout(null);
		
		addItems();
	}
	
	/**
	 * It initializes the leftPanel object 
	 */
	private void initializeObjects() {
		leftPanel = new LeftPanel();
	}
	
	/**
	 * Adds all the component to the panel
	 */
	private void addItems() {
		this.add(leftPanel);
	}
	
}
