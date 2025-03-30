package main;

import java.awt.CardLayout;
import java.awt.Dimension;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

import opening.SignIn;

public class MainWindow extends JFrame{
	
	private final String windowName = "Code Drive";
	private final int windowHeight = 700;
	private final int windowWidth = 1000;
	MainPanel panel;
	private SignIn signIn;
	private boolean signedIn = false;
	CardLayout cardLayout;
	JPanel cardPanel;
	
	
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
	
	private void initializeObjects() {
		cardLayout = new CardLayout();
		cardPanel = new JPanel(cardLayout);
		panel = new MainPanel(this ,windowWidth, windowHeight);
		signIn = new SignIn(this, windowWidth, windowHeight);
//		
		cardPanel.add(signIn, "signIn Page");
		cardPanel.add(panel, "Main Panel");
	}
	
	private void addItems() {
//		this.add(signIn);
		this.add(cardPanel);
	}
	
	public void switchTo(String screenName) {
		cardLayout.show(cardPanel, screenName);
	}
	
	public int getWidth() {
		return this.windowWidth;
	}
	public int getHeight() {
		return this.windowHeight;
	}
}
