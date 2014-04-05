import javax.swing.*;
import java.awt.*;
import java.util.*;

public class BMI extends JFrame{
	
	private int age;
	private int height;
	private int weight;
	private String name;
	private JTextField name0 = new JTextField();
	private JTextField age0 = new JTextField();
	private JTextField height0 = new JTextField();
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
		p1.add(new JLabel("Height"));
		p1.add(height0);
		p1.add(new JLabel("Weight"));
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



