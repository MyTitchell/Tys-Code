package YoutubePractice;
import javax.swing.JOptionPane;

public class guiINTRO {

	public static void main(String[] args) {
		
		String name = JOptionPane.showInputDialog("Enter your name");
		JOptionPane.showMessageDialog(null, "Hello " + name);
		
		int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));
		JOptionPane.showMessageDialog(null, "You are "+age+" years old");
		
		double height = Integer.parseInt(JOptionPane.showInputDialog("Enter your Height"));
		JOptionPane.showMessageDialog(null, "You are "+height+" in tall");
	}
}
