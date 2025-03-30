package main;

import java.awt.CardLayout;
import java.awt.Dimension;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

import opening.SignIn;

public class MainWindow extends JFrame{
	
	/*
	 * The class extends JFrame class. It is a frame which contains the whole of the app components
	 */
	
	
	private final String windowName = "Code Drive"; // name of the app
	private final int windowHeight = 700; //height of the frame
	private final int windowWidth = 1000; //width of the frame
	/*
	 * panel is the main panel inside the frame that will contain the elements
	 * cardLayout is a layout that this frame will apply to switch between the screens
	 * cardPanel are panels that is going to be the active panel in the frame
	 */
	SignIn signIn;
	MainPanel panel;
	CardLayout cardLayout;
	JPanel cardPanel;
	
	
	/**
	 * calls the initializeObjects method which initializes all the objects and variables that needs initialization
	 * few calls after that set some configuration for the frame
	 * =>sets the window name, makes it so that the window closes when the user clicks the exit button, sets the size of the window frame
	 * => sets the logo
	 * 
	 * then it calls the addItems() method this method adds all the items i.e the current panel to the frame which is to be shown
	 * 
	 * the rest of the line after
	 * packs the panel so it will be in the frame, it will show up at the middle , it can't be resized and it will be visible
	 */
	MainWindow(){
		
		initializeObjects();
		this.setTitle(windowName);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(windowWidth, windowHeight);
		
		ImageIcon logo = new ImageIcon("AddIconStar.png");
		this.setIconImage(logo.getImage());
		
		addItems();
		
		this.pack();
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		this.setVisible(true);
		
	}
	
	/**
	 * This method initializes all teh objects and variables
	 */
	private void initializeObjects() {
		cardLayout = new CardLayout();
		cardPanel = new JPanel(cardLayout);
		panel = new MainPanel(this ,windowWidth, windowHeight);
		signIn = new SignIn(this, windowWidth, windowHeight);
//		
		cardPanel.add(signIn, "signIn Page");
		cardPanel.add(panel, "Main Panel");
	}
	
	/**
	 * This adds the current panel to the frame
	 */
	private void addItems() {
//		this.add(signIn);
		this.add(cardPanel);
	}
	
	/**
	 * This method switches the screens, this is called by the SignIn class when the user signs in
	 * @param screenName the screen we want to switch to
	 */
	public void switchTo(String screenName) {
		cardLayout.show(cardPanel, screenName);
	}
	
	/**
	 * Returns the width of the frame
	 */
	public int getWidth() {
		return this.windowWidth;
	}
	/**
	 * Returns the height of the frame
	 */
	public int getHeight() {
		return this.windowHeight;
	}
}
