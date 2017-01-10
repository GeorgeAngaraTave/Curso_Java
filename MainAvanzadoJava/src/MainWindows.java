import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.security.Principal;
import java.awt.event.ActionEvent;

public class MainWindows {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	int num1, num2, r;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainWindows window = new MainWindows();
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
	public MainWindows() {
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
		
		JLabel lblN = new JLabel("N =");
		lblN.setBounds(10, 21, 46, 14);
		frame.getContentPane().add(lblN);
		
		JLabel lblD = new JLabel("D =");
		lblD.setBounds(10, 46, 46, 14);
		frame.getContentPane().add(lblD);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(35, 102, -4, -18);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblR = new JLabel("R =");
		lblR.setBounds(10, 71, 46, 14);
		frame.getContentPane().add(lblR);
		
		textField = new JTextField();
		textField.setBounds(48, 18, 86, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(48, 43, 86, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(48, 71, 86, 20);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JButton btnNewButton = new JButton("Dividir");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					num1 = Integer.parseInt(textField.getText());
					num2 = Integer.parseInt(textField_1.getText());
					r = num1/num2;
					textField_2.setText(String.valueOf(r));
				} catch (NumberFormatException numberFormatException) {
					// TODO: handle exception
					System.out.println("Escrbe un nímero payor a 2");
				} catch (ArithmeticException arithmeticException) {
					// TODO: handle exception
					System.out.println(arithmeticException.getMessage());
				}
				
				
			}
		});
		btnNewButton.setBounds(22, 118, 89, 23);
		frame.getContentPane().add(btnNewButton);
	}
}
