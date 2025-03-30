package opening;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import main.MainWindow;

public class SignIn extends JPanel{
	
	private JPanel componentContainer; // The container that contains the fields and buttons
	private JButton signInButton; //The sign in button
	private JTextField userName; // userName field
	private JTextField passWord; // password field
	private JLabel userNamePrompt; // text Usernaem
	private JLabel passWordPrompt; // text password
	private MainWindow window; // the frame/window
	
	/**
	 * this initializes the objects, configs them and  add the items
	 * @param frame the frame which contains the screen
	 * @param width the width of the frame
	 * @param height the height of the frame
	 */
	public SignIn(MainWindow frame, int width, int height) {
		this.window = frame;
		//initializes the objects
		initializeObjects();
		this.setPreferredSize(new Dimension(width , height));
		this.setBackground(Color.DARK_GRAY);
		//This sets the layout to be items vertically in column like structure
		this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		
		this.containerConfig();
		
		this.addToContainer();
		
		this.add(Box.createVerticalGlue());
		this.add(componentContainer);
		this.add(Box.createVerticalGlue());
	}
	
	/**
	 * Initializes all the objects
	 */
	public void initializeObjects() {
		componentContainer = new JPanel();
		signInButton = new JButton("Sign In");
		userName = new JTextField();
		passWord = new JTextField();
		passWordPrompt = new JLabel("PassWord");
		userNamePrompt = new JLabel("UserName");
	}
	
	/**
	 * Adds the items to the container panel in order at which they are shown
	 */
	private void addToContainer() {
		componentContainer.setLayout(new BoxLayout(componentContainer, BoxLayout.Y_AXIS));
		componentContainer.add(userNamePrompt);
		componentContainer.add(Box.createRigidArea(new Dimension(0, 10)));
		componentContainer.add(userName);
		componentContainer.add(Box.createRigidArea(new Dimension(0, 20)));
		componentContainer.add(passWordPrompt);
		componentContainer.add(Box.createRigidArea(new Dimension(0, 10)));
		componentContainer.add(passWord);
		componentContainer.add(Box.createRigidArea(new Dimension(0, 20)));
		componentContainer.add(signInButton);
	}
	
	/**
	 * This sets the container' dimension, it's appearence and the appearence of the texts and fields in the container
	 */
	private void containerConfig() {
		int containerWidth = 400;
		int containerHeight = 300;

		componentContainer.setBounds(
				(this.window.getWidth() - containerWidth) / 2,
				(this.window.getHeight()-containerHeight) /2,
				containerWidth,
				containerHeight
			);
		componentContainer.setBackground(Color.DARK_GRAY);
		componentContainer.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
		
		userNamePrompt.setFont(new Font("Arial", Font.BOLD, 14));
		userNamePrompt.setForeground(Color.white);
		
		userName.setMaximumSize(new Dimension(300, 20));
		userName.setBorder(BorderFactory.createEmptyBorder());
		
		passWordPrompt.setFont(new Font("Arial", Font.BOLD, 14));
		passWordPrompt.setForeground(Color.white);
		
		passWord.setMaximumSize(new Dimension(300, 20));
		passWord.setBorder(BorderFactory.createEmptyBorder());
		
		signInButton.setMaximumSize(new Dimension(150, 20));
		signInButton.setBorder(BorderFactory.createEmptyBorder());
		//This calls the switch to method of the frame where it switches to the main panel when the user signsin
		signInButton.addActionListener(e -> this.window.switchTo("Main Panel"));
	}


}
