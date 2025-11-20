package Actividad;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;

import javax.swing.JRadioButtonMenuItem;
import javax.swing.JTextArea;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class AgregarEmpleados extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel ventana;
	private JTextField SeguridadSocialTxt, IRPFTxt, SalarioTxt, ApellidosTxt, NombreTxt;
	private JTextArea IngresosTxt;
	private JButton Limpiar, Agregar;
	private JLabel Nombre, Apellidos, Pueblo, Genero, Salario, PagoSeguridadSocial, IRPF, OtrosIngresos;
	private ButtonGroup GeneroRadio;
	private JRadioButtonMenuItem Hombre, Mujer, Otros;
	private JComboBox<String> Localidad;
	private ArrayList<Empleado> GrupoEmpleados = new ArrayList<Empleado>();
	private JMenuItem agregarEmpleados = new JMenuItem("Agregar Empleados"),
			visualizarEmpleados = new JMenuItem("Visualizar Empleados"),
			guardarEnArchivo = new JMenuItem("Guardar Empleados"), menuEmpleados = new JMenuItem("Menu");
	private JMenu elMenu;
	private JMenuBar laBarraDelMenu;

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

		elMenu = new JMenu("Menu");
		laBarraDelMenu = new JMenuBar();
		laBarraDelMenu.add(elMenu);
		laBarraDelMenu.setBounds(195, 10, 43, 22);
		elMenu.add(menuEmpleados);
		elMenu.add(agregarEmpleados);
		elMenu.add(visualizarEmpleados);
		elMenu.add(guardarEnArchivo);
		ventana.add(laBarraDelMenu);
		agregarEmpleados.addActionListener(agregar);
		visualizarEmpleados.addActionListener(visualizar);
		menuEmpleados.addActionListener(menu);

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

		Hombre = new JRadioButtonMenuItem("Hombre");
		Hombre.setBackground(new Color(254, 214, 235));
		Hombre.setBorder(new LineBorder(new Color(255, 0, 255), 1, true));
		Hombre.setBounds(28, 225, 109, 23);
		ventana.add(Hombre);

		Mujer = new JRadioButtonMenuItem("Mujer");
		Mujer.setBackground(new Color(254, 214, 235));
		Mujer.setBorder(new LineBorder(new Color(255, 0, 255), 1, true));
		Mujer.setBounds(28, 251, 109, 23);
		ventana.add(Mujer);

		Otros = new JRadioButtonMenuItem("Otros");
		Otros.setBackground(new Color(254, 214, 235));
		Otros.setBorder(new LineBorder(new Color(255, 0, 255), 1, true));
		Otros.setBounds(28, 277, 109, 23);
		ventana.add(Otros);

		GeneroRadio = new ButtonGroup();
		GeneroRadio.add(Hombre);
		GeneroRadio.add(Mujer);
		GeneroRadio.add(Otros);

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
		NombreTxt.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		NombreTxt.setBounds(124, 36, 316, 20);
		ventana.add(NombreTxt);
		NombreTxt.setColumns(10);

		NombreTxt.addKeyListener(new KeyAdapter() {
			public void keyTyped(KeyEvent e) {
				if (NombreTxt.getText().length() >= 15) {
					e.consume();
				}
			}
		});

		ApellidosTxt = new JTextField();
		ApellidosTxt.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		ApellidosTxt.setColumns(10);
		ApellidosTxt.setBounds(124, 90, 316, 20);
		ventana.add(ApellidosTxt);

		Agregar = new JButton("AGREGAR");
		Agregar.setBorder(new LineBorder(new Color(255, 128, 255), 3));
		Agregar.setBackground(new Color(255, 193, 255));
		Agregar.setForeground(new Color(255, 0, 255));
		Agregar.setFont(new Font("Comic Sans MS", Font.PLAIN, 18));
		Agregar.setBounds(28, 345, 264, 91);
		ventana.add(Agregar);
		Agregar.addActionListener(crearEmpleado);

		Limpiar = new JButton("LIMPIAR");
		Limpiar.setBorder(new LineBorder(new Color(255, 128, 255), 3));
		Limpiar.setForeground(Color.MAGENTA);
		Limpiar.setFont(new Font("Comic Sans MS", Font.PLAIN, 18));
		Limpiar.setBackground(new Color(255, 193, 255));
		Limpiar.setBounds(663, 345, 264, 91);
		ventana.add(Limpiar);
		Limpiar.addActionListener(limpiarVentana);

		SalarioTxt = new JTextField();
		SalarioTxt.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		SalarioTxt.setBounds(530, 38, 397, 20);
		ventana.add(SalarioTxt);
		SalarioTxt.setColumns(10);

		SeguridadSocialTxt = new JTextField();
		SeguridadSocialTxt.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		SeguridadSocialTxt.setBounds(648, 92, 279, 20);
		ventana.add(SeguridadSocialTxt);
		SeguridadSocialTxt.setColumns(10);

		IRPFTxt = new JTextField();
		IRPFTxt.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		IRPFTxt.setColumns(10);
		IRPFTxt.setBounds(512, 144, 417, 20);
		ventana.add(IRPFTxt);

		Localidad = new JComboBox<String>();
		Localidad.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		Localidad.setModel(new DefaultComboBoxModel<String>(
				new String[] { "Collado Villalba", "Matalpino", "DespeñaPerros", "Galapagar/La Navata" }));
		Localidad.setBackground(new Color(255, 128, 192));
		Localidad.setBounds(124, 145, 316, 22);
		ventana.add(Localidad);
	}

	ActionListener crearEmpleado = new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			if (e.getSource() == Agregar) {
				Empleado emp = new Empleado(NombreTxt.getText(), ApellidosTxt.getText(),
						Localidad.getSelectedItem().toString(), textoGenero(), SalarioTxt.getText(),
						SeguridadSocialTxt.getText(), IRPFTxt.getText(), IngresosTxt.getText());
				JOptionPane.showMessageDialog(null, "Empleado añadido: " + "\n" + emp.toString());
				GrupoEmpleados.add(emp);
				limpiar();
				GestorEmpleados.addEmpleado(emp);
			}
		}

	};
	ActionListener limpiarVentana = new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			if (e.getSource() == Limpiar) {
				limpiar();
			}
		}
	};
	ActionListener agregar = new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			if (e.getSource() == agregarEmpleados) {
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
			if (e.getSource() == visualizarEmpleados) {
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
			if (e.getSource() == menuEmpleados) {
				Menu m = new Menu();
				m.setVisible(true);
				dispose();
			}
		}
	};

	public void limpiar() {
		NombreTxt.setText("");
		ApellidosTxt.setText("");
		SeguridadSocialTxt.setText("");
		IRPFTxt.setText("");
		SalarioTxt.setText("");
		IngresosTxt.setText("");
		Hombre.setSelected(false);
		Mujer.setSelected(false);
		Otros.setSelected(false);

	}

	public String textoGenero() {
		if (Hombre.isSelected()) {
			return (Hombre.getText());
		} else if (Mujer.isSelected()) {
			return (Mujer.getText());
		} else if (Otros.isSelected()) {
			return (Otros.getText());
		}
		return ("");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}
}
