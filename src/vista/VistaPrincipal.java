package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;

public class VistaPrincipal extends JFrame {

	private JPanel contentPane;
	private JButton btnUsuario;
	private JButton btnActividades;
	private JButton btnInscripciones;
	
	

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					VistaPrincipal frame = new VistaPrincipal();
//					frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}

	public JPanel getContentPane() {
		return contentPane;
	}



	public JButton getBtnUsuario() {
		return btnUsuario;
	}



	public JButton getBtnActividades() {
		return btnActividades;
	}



	public JButton getBtnInscripciones() {
		return btnInscripciones;
	}



	/**
	 * Create the frame.
	 */
	public VistaPrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		btnUsuario = new JButton("Gestionar Clientes");
		btnUsuario.setBounds(131, 40, 163, 23);
		contentPane.add(btnUsuario);
		
		btnActividades = new JButton("Gestionar Actividades");
		btnActividades.setBounds(131, 110, 163, 23);
		contentPane.add(btnActividades);
		
		btnInscripciones = new JButton("Gestionar Inscripciones");
		btnInscripciones.setBounds(131, 180, 163, 23);
		contentPane.add(btnInscripciones);
	}
	
	
}
