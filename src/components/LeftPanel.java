package components;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagLayout;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class LeftPanel extends JPanel{
	
	String[] fields = {"Code", "DSA", "Visualized", "Solved"};
	
	JPanel topPanel, middlePanel, bottomPanel;
	JLabel appTitleText, settingText;
	JLabel[] fieldLabels;
	
	private int widthOfLabel = 200;
	private int heightOfLabel = 700;
	
	
	
	
	public LeftPanel() {
		initializeObjects();
		this.setBounds(0, 0, widthOfLabel, heightOfLabel);
		this.setBackground(Color.blue);
//		this.setBorder(new RoundBorder(20));
		this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		
		
		topPanelConfig();
		middlePanelConfig();
		bottomPanelConfig();
		

		
		
		addObjects();
	}
	
	private void initializeObjects() {
		topPanel = new JPanel();
		middlePanel = new JPanel();
		bottomPanel = new JPanel();
		
		
		textConfigs();
		fieldLabelsConfigs();
	}
	
	private void addObjects() {
		this.add(topPanel);
		this.add(middlePanel);
		this.add(bottomPanel);
	}
	
	private void topPanelConfig() {
		topPanel.setBackground(Color.LIGHT_GRAY);
		topPanel.setPreferredSize(new Dimension(this.widthOfLabel, 120)); // 80% of 600
        topPanel.setMaximumSize(new Dimension(this.widthOfLabel, 120));
        topPanel.setMinimumSize(new Dimension(this.widthOfLabel, 120));
        topPanel.setLayout(new GridBagLayout());
        topPanel.setAlignmentX(LEFT_ALIGNMENT);
		topPanel.add(appTitleText);
	}
	
	private void middlePanelConfig() {
		middlePanel.setBackground(Color.LIGHT_GRAY);
		middlePanel.setPreferredSize(new Dimension(this.widthOfLabel, 460)); // 80% of 600
        middlePanel.setMaximumSize(new Dimension(this.widthOfLabel, 460));
        middlePanel.setMinimumSize(new Dimension(this.widthOfLabel, 460));
		middlePanel.setLayout(new BoxLayout(middlePanel, BoxLayout.Y_AXIS));
		middlePanel.setAlignmentX(LEFT_ALIGNMENT);
		
		for(JLabel label: fieldLabels) {
			label.setAlignmentX(CENTER_ALIGNMENT);
			middlePanel.add(Box.createRigidArea(new Dimension(0, 50)));
			middlePanel.add(label);
			
		}
	}
	private void bottomPanelConfig() {		
		bottomPanel.setBackground(Color.LIGHT_GRAY);
		bottomPanel.setPreferredSize(new Dimension(this.widthOfLabel, 120)); // 80% of 600
        bottomPanel.setMaximumSize(new Dimension(this.widthOfLabel, 120));
        bottomPanel.setMinimumSize(new Dimension(this.widthOfLabel, 120));
        bottomPanel.setAlignmentX(LEFT_ALIGNMENT);
        bottomPanel.setAlignmentY(BOTTOM_ALIGNMENT);
		bottomPanel.add(Box.createRigidArea(new Dimension(0,100)));
		bottomPanel.add(settingText);
	}
	
	private void textConfigs() {
		appTitleText = new JLabel("Code-Drive");
		appTitleText.setFont(new Font("Arial", Font.BOLD, 30));
//		appTitleText.setForeground(Color.white);
		
		settingText = new JLabel("Settings");
		settingText.setFont(new Font("Arial", Font.BOLD, 20));
//		settingText.setForeground(Color.white);
	}
	
	private void fieldLabelsConfigs() {
		fieldLabels = new JLabel[4];
		
		for(int i = 0; i < fields.length; i++) {
			fieldLabels[i] = new JLabel(fields[i]);
			fieldLabels[i].setFont(new Font("Arial", Font.BOLD, 15));
//			fieldLabels[i].setForeground(Color.white);
		}
	}

}
