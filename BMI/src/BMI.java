
import javax.swing.*;
import javax.swing.text.JTextComponent;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;

public class BMI extends JFrame{
	
// New six text field
	private JTextField name0 = new JTextField();
	private JTextField age0 = new JTextField();
	private JTextField oheight = new JTextField();
	private JTextField weight0 = new JTextField();
	private JTextField bmi = new JTextField();
	private JTextField status = new JTextField();
// New a button
	private JButton button = new JButton("OK");
	
// The Construct
	public BMI() {
		// Panel1 of label and textField(name, age, height, weight) 
		JPanel p1 =  new JPanel(new GridLayout(4 , 2)); // Panel1 has 4 rows and 2 columns
		p1.add(new JLabel("Name"));
		p1.add(name0);
		p1.add(new JLabel("Age        (years)"));
		p1.add(age0);
		p1.add(new JLabel("Height    (cm)"));
		p1.add(oheight);
		p1.add(new JLabel("Weight   (kg)"));
		p1.add(weight0);	
		
		//Panel2 of button
		JPanel p2 = new JPanel(new FlowLayout(FlowLayout.RIGHT));
		p2.add(button);
		
		//Panel3 of label and textField(BMI, Status)
		JPanel p3 = new JPanel(new GridLayout(2 , 2));//Panel3 has 2 rows and 2 columns
		p3.add(new JLabel("BMI"));
		p3.add(bmi);
		p3.add(new JLabel("Status"));
		p3.add(status);
		
		// Add Panel1, Panel2 and Panel3 to the location of the Frame 
		add(p1, BorderLayout.NORTH);
		add(p2, BorderLayout.CENTER);
		add(p3, BorderLayout.SOUTH);
		
		// Active the method to compute BMI when the button is clicked
		button.addActionListener((ActionListener) new ButtonListener());
	}
	

	class ButtonListener implements ActionListener{
		public void actionPerformed(ActionEvent e){
			double height = Double.parseDouble(oheight.getText()); // get the height
			double weight = Double.parseDouble(weight0.getText()); // get the weight
			
			double result = weight / ((height/100)*(height/100)); // Computer the BMI
			bmi.setText(String.format("%.1f", result)); // To show the BMI
			
			// Show the Status of your body
			if (result < 18.5)
				status.setText("Underweight");
			else if(result < 25)
				status.setText("Normal");
			else if (result < 30 )
				status.setText("Overweight");
			else 
				status.setText("Obese");
		}

		
		
	}

	
	
	/** Main method */
	public static void main(String[] args){
		BMI frame = new BMI();		
			frame.setTitle("BMI"); // The name of the frame
			frame.setSize(250,200); // The size of the frame
			frame.setLocationRelativeTo(null);// Center the frame
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setVisible(true); // Let the frame show out
		}
		
	
		
	}


