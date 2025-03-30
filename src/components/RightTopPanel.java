package components;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.Insets;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class RightTopPanel extends JPanel{
	
	JTextField searchBar;
	JLabel searchIcon;
	JLabel filterIcon;
	ImageIcon searchImageIcon, filterImageIcon;
	
	public RightTopPanel() {
		initializeObjects();
		this.setBounds(0,0, 800,150);
		this.setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
		this.setBorder(new EmptyBorder(20, 30, 20, 30));
		this.setBackground(Color.gray);
		
		searchBarConfig();
		addMouseListenerToIcons();
		
		addObjects();
	}
	
	private void initializeObjects() {
		
		searchBar = new JTextField();
		searchImageIcon = new ImageIcon("./Resources/searchImageicon.png");
		searchIcon = new JLabel(resizedImage(searchImageIcon));
		filterImageIcon = new ImageIcon("./Resources/filterIconimage.png");
		filterIcon = new JLabel(resizedImage(filterImageIcon));
		
	}
	
	private ImageIcon resizedImage(ImageIcon icon) {
		Image newIcon = icon.getImage().getScaledInstance(30,  30, Image.SCALE_SMOOTH);
		return new ImageIcon(newIcon);
	}
	
	private void addMouseListenerToIcons() {
		searchIcon.addMouseListener(new java.awt.event.MouseAdapter(){
			@Override
			public void mouseEntered(java.awt.event.MouseEvent e) {
				searchIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
			}
			@Override
			public void mouseExited(java.awt.event.MouseEvent e) {
				searchIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
			}
		});
		
		filterIcon.addMouseListener(new java.awt.event.MouseAdapter(){
			@Override
			public void mouseEntered(java.awt.event.MouseEvent e) {
				filterIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
			}
			@Override
			public void mouseExited(java.awt.event.MouseEvent e) {
				filterIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
			}
		});
	}
	
	private void searchBarConfig() {
		
		searchBar.setBorder(BorderFactory.createEmptyBorder());
		searchBar.setMargin(new Insets(10, 10, 10, 10));
		searchBar.setMinimumSize(new Dimension(500, 30));
		searchBar.setMaximumSize(new Dimension(500, 30));
		searchBar.setFont(new Font("Arial", Font.BOLD, 15));
	}
	
	private void addObjects() {
		this.add(searchBar);
		this.add(Box.createRigidArea(new Dimension(20, 0)));
		this.add(searchIcon);
		this.add(Box.createRigidArea(new Dimension(30, 0)));
		this.add(filterIcon);
	}
}
