package Projects;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Coffee extends JFrame implements ActionListener
{
    public static final int WIDTH = 365;
    public static final int HEIGHT = 185;

    private JLabel lblValue;

    public static void main(String[] args)
    {

        Coffee counter1 = new Coffee( );
        counter1.setVisible(true);

    }

	// This is the constructor.  It is called automatically when
	// the object is created.
    public Coffee( )
    {
        setTitle("How Many Coffees?");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(365, 185);
        setLayout(new FlowLayout( ));

		// Create a label to display the counter
        lblValue = new JLabel("0");
        add(lblValue);
        // Create a button to add 1 to the counter
        JButton addButton = new JButton("Add");
        addButton.addActionListener(this);
        add(addButton);
        // Create a button to refresh the counter
        JButton refreshButton = new JButton("Refresh");
        refreshButton.addActionListener(this);
        add(refreshButton);
    }


    public void actionPerformed(ActionEvent e)
    {
		String actionCommand = e.getActionCommand();
		int count = 0;
		
			
        if (actionCommand.equals("Add"))
        {
        lblValue.setText(Integer.toString(++count));
	
        }
        }
    }
	