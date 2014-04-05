import javax.swing.*;
import javax.swing.text.JTextComponent;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;

public class BMI extends JFrame{
	

	private JTextField name0 = new JTextField();
	private JTextField age0 = new JTextField();
	private JTextField oheight = new JTextField();
	private JTextField weight0 = new JTextField();
	private JTextField bmi = new JTextField();
	private JTextField status = new JTextField();
	
	private JButton button = new JButton("OK");
	
	
	public BMI() {
		JPanel p1 =  new JPanel(new GridLayout(4 , 2));
		p1.add(new JLabel("Name"));
		p1.add(name0);
		p1.add(new JLabel("Age"));
		p1.add(age0);
		p1.add(new JLabel("Height(cm)"));
		p1.add(oheight);
		p1.add(new JLabel("Weight(kg)"));
		p1.add(weight0);	
		
		JPanel p2 = new JPanel(new FlowLayout(FlowLayout.RIGHT));
		p2.add(button);
		
		JPanel p3 = new JPanel(new GridLayout(2 , 2));
		p3.add(new JLabel("BMI"));
		p3.add(bmi);
		p3.add(new JLabel("Status"));
		p3.add(status);
		
		add(p1, BorderLayout.NORTH);
		add(p2, BorderLayout.CENTER);
		add(p3, BorderLayout.SOUTH);
		
		button.addActionListener((ActionListener) new ButtonListener());
	}
	

	class ButtonListener implements ActionListener{
		public void actionPerformed(ActionEvent e){
			double height = Double.parseDouble(oheight.getText());
			double weight = Double.parseDouble(weight0.getText());
			
			double result = weight / ((height/100)*(height/100));
			bmi.setText(String.format("%.1f", result));
			
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

	
	
	public static void main(String[] args){
		BMI frame = new BMI();		
			frame.setTitle("BMI");
			frame.setSize(200,200);
			frame.setLocationRelativeTo(null);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setVisible(true);
		}
		
	
		
	}


