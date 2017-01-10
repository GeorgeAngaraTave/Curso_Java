import java.awt.EventQueue;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;

public class VentanaW implements ChangeListener{

	private JFrame frame;
	private JTextField textField;
	
	JRadioButton r1,r2,r3;
	ButtonGroup grupo;
	JCheckBox c1,c2,c3;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaW window = new VentanaW();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public VentanaW() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		grupo = new ButtonGroup();
		
		r1 = new JRadioButton("1");
		r1.setBounds(27, 30, 109, 23);
		r1.addChangeListener(this);
		frame.getContentPane().add(r1);
		
		r2 = new JRadioButton("2");
		r2.setBounds(27, 66, 109, 23);
		r2.addChangeListener(this);
		frame.getContentPane().add(r2);
		
		r3 = new JRadioButton("3");
		r3.setBounds(27, 103, 109, 23);
		r3.addChangeListener(this);
		frame.getContentPane().add(r3);
		
		grupo.add(r1);
		grupo.add(r2);
		grupo.add(r3);
		
		/* Checbox*/
		
		textField = new JTextField();
		textField.setBounds(142, 31, 86, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		c1 = new JCheckBox("2");
		c1.setBounds(138, 78, 97, 23);
		c1.addChangeListener(this);
		frame.getContentPane().add(c1);
		
		c2 = new JCheckBox("3");
		c2.setBounds(138, 103, 97, 23);
		c2.addChangeListener(this);
		frame.getContentPane().add(c2);
		
		c3 = new JCheckBox("1");
		c3.setBounds(138, 56, 97, 23);
		c3.addChangeListener(this);
		frame.getContentPane().add(c3);
		
		/* TexArea */
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(258, 31, 166, 120);
		frame.getContentPane().add(scrollPane);
		
		JTextArea textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
	}

	@Override
	public void stateChanged(ChangeEvent e) {
		// TODO Auto-generated method stub
		if(r1.isSelected()){
			System.out.println("Uno");
		}
		
		if(r2.isSelected()){
			System.out.println("dos");
		}
		
		if(r3.isSelected()){
			System.out.println("Tres");
		}
		
		if(c1.isSelected()==true){
			textField.setText("C1 Uno");
		}else if(c2.isSelected()==true){
			textField.setText("C2 dos");
		}else if(c3.isSelected()==true){
			textField.setText("C3 tres");
		}
		
	}
}
