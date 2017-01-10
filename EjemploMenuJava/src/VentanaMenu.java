import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class VentanaMenu implements ActionListener{
	JFrame ventana;
	JMenu op1, op2, Sop1, Sop2, Sop3, Sop4;
	JMenuItem sub1, sub2;
	JMenuBar menubar;
	
	public void CrearMenu(){
		menubar = new JMenuBar();
		
		op1 = new JMenu("1");
		op2 = new JMenu("2");
		
		Sop1 = new JMenu("A");
		Sop2 = new JMenu("B");
		Sop3 = new JMenu("C");
		Sop4 = new JMenu("D");
		
		sub1 = new JMenuItem("X");
		sub2 = new JMenuItem("Y");
		
		menubar.add(op1);
		menubar.add(op2);
		
		op1.add(Sop1);
		op1.add(Sop2);
		
		op2.add(Sop3);
		op2.add(Sop4);
		
		Sop2.add(sub1);
		Sop2.add(sub2);
		
		Sop1.addActionListener(this);
		Sop2.addActionListener(this);
		Sop3.addActionListener(this);
		Sop4.addActionListener(this);
		
		sub1.addActionListener(this);
		sub2.addActionListener(this);
		
		
	}
	
	public void Crearventana(){
		ventana = new JFrame("Ventana con menú");
		ventana.setLayout(new BoxLayout(ventana.getContentPane(), BoxLayout.Y_AXIS));
		ventana.setSize(300, 300);
		ventana.setJMenuBar(menubar);
		ventana.setVisible(true);
		ventana.setDefaultCloseOperation(ventana.EXIT_ON_CLOSE);
	}
	
	public VentanaMenu(){
		CrearMenu();
		Crearventana();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==sub1){
			//System.out.println("Es X");
			ventana.setSize(500, 500);
		}
		
	}
}
