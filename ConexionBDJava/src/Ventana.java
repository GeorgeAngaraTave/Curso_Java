import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class Ventana {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	java.sql.Connection conexion;
	Statement statement;
	private String Query;

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

	public void connect(){
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/universidad", "root", "");
			
			 statement=conexion.createStatement();
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
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
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(31, 42, 46, 14);
		frame.getContentPane().add(lblNombre);
		
		final JLabel lblMat_1 = new JLabel("Mat");
		lblMat_1.setBounds(31, 79, 46, 14);
		frame.getContentPane().add(lblMat_1);
		
		textField = new JTextField();
		textField.setBounds(101, 39, 140, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(98, 76, 143, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		final JLabel label = new JLabel("");
		label.setBounds(20, 182, 299, 14);
		frame.getContentPane().add(label);
		
		JButton btnAgregar = new JButton("Agregar");
		btnAgregar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
					String nombre =  textField.getText();
					
					try {
						connect();
						Query = "insert into alumnos(nombre) value('"+nombre+"')";
						((java.sql.Statement)statement).executeUpdate(Query);
						
						Query = "select max(matricula) as id from alumnos";
						ResultSet resulid = statement.executeQuery(Query);
						
						if(resulid.next() == true){
							Query = "select nombre from alumnos where matricula="+resulid.getString("id");
							ResultSet resultSet = statement.executeQuery(Query);
							if(resultSet.next() == true){
								label.setText("Se inserto el registro: "+resultSet.getString("nombre"));
							}
							
						}
						
						
						
						conexion.close();	
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
									
					
				
			}
		});
		btnAgregar.setBounds(10, 148, 89, 23);
		frame.getContentPane().add(btnAgregar);
		
		JButton btnBuscar = new JButton("buscar");
		btnBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int id = Integer.parseInt(textField_1.getText());
				try{
					connect();
					Query = "select nombre from alumnos where matricula="+id;
					ResultSet resultSet = statement.executeQuery(Query);
					
					if(resultSet.next() == true){
						textField_2.setText(resultSet.getString("nombre"));
					}
					
					conexion.close();
					
				}catch (SQLException s) {
					// TODO: handle exception
					s.printStackTrace();
				}
			}
		});
		btnBuscar.setBounds(115, 148, 89, 23);
		frame.getContentPane().add(btnBuscar);
		
		JButton btnBorrar = new JButton("Borrar");
		btnBorrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int id = Integer.parseInt(textField_1.getText());
				try{
					
					connect();
					Query = "Delete from alumnos where matricula="+id;
					statement.executeUpdate(Query);
					
					conexion.close();
					
				}catch (SQLException s) {
					// TODO: handle exception
					s.printStackTrace();
				}
			}
		});
		btnBorrar.setBounds(233, 148, 89, 23);
		frame.getContentPane().add(btnBorrar);
		
		textField_2 = new JTextField();
		textField_2.setBounds(101, 117, 140, 20);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblResult = new JLabel("Result");
		lblResult.setBounds(31, 120, 46, 14);
		frame.getContentPane().add(lblResult);
		
	}
}
