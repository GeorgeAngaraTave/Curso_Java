import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class Ventana {

	private JFrame frame;
	private JTextField textField;
	JLabel lblNewLabel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana window = new Ventana();
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
	public Ventana() {
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
		
		lblNewLabel = new JLabel("New label");
		
		textField = new JTextField();
		textField.setBounds(10, 32, 191, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("Entrar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String dato = textField.getText();
				
				if(dato.equals("jorge")){
					lblNewLabel.setText(dato);
				}else if(!dato.equals("jorge")){
					lblNewLabel.setText("");
				}
			}
		});
		btnNewButton.setBounds(90, 63, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		
		lblNewLabel.setBounds(39, 113, 162, 20);
		frame.getContentPane().add(lblNewLabel);
	}
}
