package Actividad;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;

public class Menu extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JMenu elMenu;
	private JMenuBar laBarraDelMenu;
	private JMenuItem agregarEmpleados = new JMenuItem("Agregar Empleados"), 
			visualizarEmpleados = new JMenuItem("Visualizar Empleados"), 
			guardarEnArchivo = new JMenuItem("Guardar Empleados"),
			menuEmpleados = new JMenuItem("Menu");
	
	/**
	 * Launch the application.
	 */
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu frame = new Menu();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Menu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 128, 192));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		elMenu = new JMenu("Menu");
		laBarraDelMenu = new JMenuBar();
		laBarraDelMenu.add(elMenu);
		laBarraDelMenu.setBounds(195, 10, 43, 22);
		elMenu.add(menuEmpleados);
		elMenu.add(agregarEmpleados);
		elMenu.add(visualizarEmpleados);
		elMenu.add(guardarEnArchivo);
		contentPane.add(laBarraDelMenu);
		agregarEmpleados.addActionListener(agregar);
		visualizarEmpleados.addActionListener(visualizar);
		menuEmpleados.addActionListener(menu);
	}
	ActionListener agregar = new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			if(e.getSource()== agregarEmpleados) {
				AgregarEmpleados ag = new AgregarEmpleados();
				ag.setVisible(true);
				dispose();
			}
		}
	};
	
	ActionListener visualizar = new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			if(e.getSource()== visualizarEmpleados) {
				VisualizarEmpleados ve = new VisualizarEmpleados();
				ve.setVisible(true);
				dispose();
			}
		}
	};
	ActionListener menu = new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			if(e.getSource() == menuEmpleados) {
				Menu m = new Menu();
				m.setVisible(true);
				dispose();
			}
		}
	};

}