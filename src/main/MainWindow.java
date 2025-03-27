package main;

import java.awt.Dimension;

import javax.swing.JFrame;

public class MainWindow extends JFrame{
	
	private final String windowName = "Code Drive";
	private final int windowHeight = 700;
	private final int windowWidth = 1000;
	
	
	MainWindow(){
		this.setTitle(windowName);
		this.setSize(new Dimension(windowWidth, windowHeight));
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		this.setVisible(true);
	}
}
