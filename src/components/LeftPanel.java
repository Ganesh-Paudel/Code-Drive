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
	
	//fields that are on the left side
	String[] fields = {"Code", "DSA", "Visualized", "Solved"};
	//three panels 
	/*
	 * top: App name
	 * middle: The fields
	 * bottom: Settings, account
	 */
	JPanel topPanel, middlePanel, bottomPanel;
	JLabel appTitleText, settingText;
	JLabel[] fieldLabels;
	
	
	private int widthOfLabel = 200;
	private int heightOfLabel = 700;
	
	
	
	/**
	 * Initializes objects, configures the panel and adds the items
	 */
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
	
	/**
	 * initializes all the objects
	 */
	private void initializeObjects() {
		topPanel = new JPanel();
		middlePanel = new JPanel();
		bottomPanel = new JPanel();
		
		
		textConfigs();
		fieldLabelsConfigs();
	}
	
	/**
	 * adds all the panesl
	 */
	private void addObjects() {
		this.add(topPanel);
		this.add(middlePanel);
		this.add(bottomPanel);
	}
	
	/**
	 * configuring the topPanel, 
	 * minimum and max size are to make sure it covers that dimension
	 */
	private void topPanelConfig() {
		topPanel.setBackground(Color.LIGHT_GRAY);
		topPanel.setPreferredSize(new Dimension(this.widthOfLabel, 120));
        topPanel.setMaximumSize(new Dimension(this.widthOfLabel, 120));
        topPanel.setMinimumSize(new Dimension(this.widthOfLabel, 120));
        topPanel.setLayout(new GridBagLayout());
        topPanel.setAlignmentX(LEFT_ALIGNMENT);
		topPanel.add(appTitleText);
	}
	
	/**
	 * configures the middle panel, 
	 */
	private void middlePanelConfig() {
		middlePanel.setBackground(Color.LIGHT_GRAY);
		middlePanel.setPreferredSize(new Dimension(this.widthOfLabel, 460));
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
	/**
	 * congifures teh bottom panel 
	 */
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
	
	/**
	 * The texts that appears name and settings, it styles them and 
	 * Settings:
	 * 		It adds a mouseListener when a cursor is hovering over the element it changes the cursor to pointer(hand cursor)
	 */
	private void textConfigs() {
		appTitleText = new JLabel("Code-Drive");
		appTitleText.setFont(new Font("Arial", Font.BOLD, 30));
//		appTitleText.setForeground(Color.white);
		
		settingText = new JLabel("Settings");
		settingText.setFont(new Font("Arial", Font.BOLD, 20));
//		settingText.setForeground(Color.white);
		settingText.addMouseListener(new java.awt.event.MouseAdapter() {
			@Override
			public void mouseEntered(java.awt.event.MouseEvent e) {
				settingText.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
			}
			@Override
		    public void mouseExited(java.awt.event.MouseEvent e) {
		        settingText.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
		    }
		});
	}
	
	/**
	 * This customizes the fields and also adds mouse listener for the hover effect
	 */
	
	private void fieldLabelsConfigs() {
		fieldLabels = new JLabel[4];
		
		for(int i = 0; i < fields.length; i++) {
			fieldLabels[i] = new JLabel(fields[i]);
			JLabel label = fieldLabels[i];
			label.setFont(new Font("Arial", Font.BOLD, 15));
//			fieldLabels[i].setForeground(Color.white);
			label.addMouseListener(new java.awt.event.MouseAdapter() {
				@Override
				public void mouseEntered(java.awt.event.MouseEvent e) {
					label.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
				}
				@Override
				public void mouseExited(java.awt.event.MouseEvent e) {
					label.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
				}
			});
		}
	}

}
