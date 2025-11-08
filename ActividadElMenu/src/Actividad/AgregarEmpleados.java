package Actividad;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JTextField;

public class AgregarEmpleados extends JFrame implements ActionListener{

	private static final long serialVersionUID = 1L;
	private JPanel ventana;
	private JTextField SeguridadSocialTxt, IRPFTxt, SalarioTxt, ApellidosTxt, NombreTxt;
	private JTextArea IngresosTxt;
	private JButton Limpiar, Agregar;
	private JLabel Nombre, Apellidos, Pueblo, Genero, Salario, PagoSeguridadSocial, IRPF, OtrosIngresos;
	private JRadioButton Hombre, Mujer, Otros;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AgregarEmpleados frame = new AgregarEmpleados();
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
	public AgregarEmpleados() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1061, 958);
		ventana = new JPanel();
		ventana.setBackground(new Color(254, 214, 235));
		ventana.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(ventana);
		ventana.setLayout(null);
		
		Nombre = new JLabel("Nombre: ");
		Nombre.setFont(new Font("Comic Sans MS", Font.PLAIN, 17));
		Nombre.setBounds(28, 24, 86, 43);
		ventana.add(Nombre);
		
		Apellidos = new JLabel("Apellidos: ");
		Apellidos.setFont(new Font("Comic Sans MS", Font.PLAIN, 17));
		Apellidos.setBounds(28, 78, 86, 43);
		ventana.add(Apellidos);
		
		Pueblo = new JLabel("Pueblo: ");
		Pueblo.setFont(new Font("Comic Sans MS", Font.PLAIN, 17));
		Pueblo.setBounds(28, 132, 86, 43);
		ventana.add(Pueblo);
		
		Genero = new JLabel("Genero: ");
		Genero.setFont(new Font("Comic Sans MS", Font.PLAIN, 17));
		Genero.setBounds(28, 186, 86, 43);
		ventana.add(Genero);
		
		Salario = new JLabel("Salario: ");
		Salario.setFont(new Font("Comic Sans MS", Font.PLAIN, 17));
		Salario.setBounds(450, 24, 86, 43);
		ventana.add(Salario);
		
		Hombre = new JRadioButton("Hombre");
		Hombre.setBackground(new Color(254, 214, 235));
		Hombre.setBorder(new LineBorder(new Color(255, 0, 255), 1, true));
		Hombre.setBounds(28, 225, 109, 23);
		ventana.add(Hombre);
		
		Mujer = new JRadioButton("Mujer");
		Mujer.setBackground(new Color(254, 214, 235));
		Mujer.setBorder(new LineBorder(new Color(255, 0, 255), 1, true));
		Mujer.setBounds(28, 251, 109, 23);
		ventana.add(Mujer);
		
		Otros = new JRadioButton("Otros");
		Otros.setBackground(new Color(254, 214, 235));
		Otros.setBorder(new LineBorder(new Color(255, 0, 255), 1, true));
		Otros.setBounds(28, 277, 109, 23);
		ventana.add(Otros);
		
		PagoSeguridadSocial = new JLabel("Pago Seguridad Social:");
		PagoSeguridadSocial.setFont(new Font("Comic Sans MS", Font.PLAIN, 17));
		PagoSeguridadSocial.setBounds(450, 78, 188, 43);
		ventana.add(PagoSeguridadSocial);
		
		IRPF = new JLabel("IRPF: ");
		IRPF.setFont(new Font("Comic Sans MS", Font.PLAIN, 17));
		IRPF.setBounds(450, 132, 86, 43);
		ventana.add(IRPF);
		
		OtrosIngresos = new JLabel("Otros Ingresos: ");
		OtrosIngresos.setFont(new Font("Comic Sans MS", Font.PLAIN, 17));
		OtrosIngresos.setBounds(450, 186, 134, 43);
		ventana.add(OtrosIngresos);
		
		IngresosTxt = new JTextArea();
		IngresosTxt.setBorder(new LineBorder(new Color(255, 0, 255), 3));
		IngresosTxt.setBounds(450, 225, 477, 75);
		ventana.add(IngresosTxt);
		
		NombreTxt = new JTextField();
		NombreTxt.setBounds(124, 38, 316, 20);
		ventana.add(NombreTxt);
		NombreTxt.setColumns(10);
		
		ApellidosTxt = new JTextField();
		ApellidosTxt.setColumns(10);
		ApellidosTxt.setBounds(124, 92, 316, 20);
		ventana.add(ApellidosTxt);
		
		Agregar = new JButton("AGREGAR");
		Agregar.setBorder(new LineBorder(new Color(255, 128, 255), 3));
		Agregar.setBackground(new Color(255, 193, 255));
		Agregar.setForeground(new Color(255, 0, 255));
		Agregar.setFont(new Font("Comic Sans MS", Font.PLAIN, 18));
		Agregar.setBounds(28, 345, 264, 91);
		ventana.add(Agregar);
		
		Limpiar = new JButton("LIMPIAR");
		Limpiar.setBorder(new LineBorder(new Color(255, 128, 255), 3));
		Limpiar.setForeground(Color.MAGENTA);
		Limpiar.setFont(new Font("Comic Sans MS", Font.PLAIN, 18));
		Limpiar.setBackground(new Color(255, 193, 255));
		Limpiar.setBounds(663, 345, 264, 91);
		ventana.add(Limpiar);
		Limpiar.addActionListener(limpiarVentana);
		
		SalarioTxt = new JTextField();
		SalarioTxt.setBounds(530, 38, 397, 20);
		ventana.add(SalarioTxt);
		SalarioTxt.setColumns(10);
		
		SeguridadSocialTxt = new JTextField();
		SeguridadSocialTxt.setBounds(648, 92, 279, 20);
		ventana.add(SeguridadSocialTxt);
		SeguridadSocialTxt.setColumns(10);
		
		IRPFTxt = new JTextField();
		IRPFTxt.setColumns(10);
		IRPFTxt.setBounds(510, 146, 417, 20);
		ventana.add(IRPFTxt);
		
	}
	ActionListener limpiarVentana = new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			if(e.getSource() == Limpiar) {
				
			}
		}
	};
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}

