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
	
	private JPanel componentContainer;
	private JButton signInButton;
	private JTextField userName;
	private JTextField passWord;
	private JLabel userNamePrompt;
	private JLabel passWordPrompt;
	private MainWindow window;
	
	public SignIn(MainWindow frame, int width, int height) {
		this.window = frame;
		initializeObjects();
		this.setPreferredSize(new Dimension(width , height));
		this.setBackground(Color.DARK_GRAY);
		this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		
		this.containerConfig();
		
		this.addToContainer();
		
		this.add(Box.createVerticalGlue());
		this.add(componentContainer);
		this.add(Box.createVerticalGlue());
	}
	
	public void initializeObjects() {
		componentContainer = new JPanel();
		signInButton = new JButton("Sign In");
		userName = new JTextField();
		passWord = new JTextField();
		passWordPrompt = new JLabel("PassWord");
		userNamePrompt = new JLabel("UserName");
	}
	
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
		signInButton.addActionListener(e -> this.window.switchTo("Main Panel"));
	}


}
