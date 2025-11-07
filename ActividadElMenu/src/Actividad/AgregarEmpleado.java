package Actividad;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;

public class AgregarEmpleado extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AgregarEmpleado frame = new AgregarEmpleado();
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
	public AgregarEmpleado() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 661, 672);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(110, 11, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Nombre");
		lblNewLabel.setBounds(10, 14, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Apellidos");
		lblNewLabel_1.setBounds(10, 60, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(110, 57, 86, 20);
		contentPane.add(textField_1);

	}
}
