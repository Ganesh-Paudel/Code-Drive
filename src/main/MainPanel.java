package main;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JPanel;

import components.LeftPanel;
import opening.SignIn;

public class MainPanel extends JPanel{
	
	private LeftPanel leftPanel;
	private int screenWidth;
	private int screenHeight;
		
	public MainPanel(MainWindow frame, int width, int height){
		this.screenWidth = width;
		this.screenHeight = height;
		
		initializeObjects();
		
		this.setBackground(Color.gray);
		this.setPreferredSize(new Dimension(width, height));
		this.setLayout(null);
		
		addItems();
	}
	
	private void initializeObjects() {
		leftPanel = new LeftPanel();
	}
	
	private void addItems() {
		this.add(leftPanel);
	}
	
}
