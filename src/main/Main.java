package main;

import javax.swing.SwingUtilities;

public class Main {

	public static void main(String[] args) {
		SwingUtilities.invokeLater(() -> {
			
			MainWindow window = new MainWindow();
		});
		//Calls the main Window class
		

	}

}
