package HomeworkComplete;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class Exam2 {

	public static void main(String[] args) {
		JFrame frame = new JFrame(); 
		
		frame.setTitle("Number of Coffees");
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(365,185);
		frame.setVisible(true); 
	
		ImageIcon coffeePic = new ImageIcon("coffee_icon.jpg");
		frame.setIconImage(coffeePic.getImage());
	}
}