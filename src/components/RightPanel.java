package components;

import java.awt.Color;

import javax.swing.JPanel;

public class RightPanel extends JPanel{
	
	private RightTopPanel topBarPanel;
	private RightScrollListPanel scrollListPanel;
	
	public RightPanel() {
		initializeObjects();
		this.setBackground(Color.gray);
		this.setLayout(null);
		this.setBounds(200 , 0 , 800, 700);
		addObjects();
	}
	
	private void initializeObjects() {
		topBarPanel = new RightTopPanel();
		scrollListPanel = new RightScrollListPanel();
	}
	
	private void addObjects() {
		this.add(topBarPanel);
		this.add(scrollListPanel);
	}
	
}
