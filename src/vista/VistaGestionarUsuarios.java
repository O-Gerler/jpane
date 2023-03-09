package vista;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JToggleButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VistaGestionarUsuarios extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField txtId;
	private JTextField txtNombreApellido;
	private JTextField txtDni;
	private JTextField txtCodigo;
	private JButton btnBuscar;
	private JButton btnEliminar;
	private JButton btnModificar;
	private JButton btnInsertar;
	private JButton btnLimpiar;
	private JButton btnVer;

	
	
	/**
	 * Launch the application.
	 */

	public JPanel getContentPanel() {
		return contentPanel;
	}



	public JTextField getTxtId() {
		return txtId;
	}



	public JTextField getTxtNombreApellido() {
		return txtNombreApellido;
	}



	public JTextField getTxtDni() {
		return txtDni;
	}



	public JTextField getTxtCodigo() {
		return txtCodigo;
	}



	public JButton getBtnBuscar() {
		return btnBuscar;
	}



	public JButton getBtnEliminar() {
		return btnEliminar;
	}



	public JButton getBtnModificar() {
		return btnModificar;
	}



	public JButton getBtnInsertar() {
		return btnInsertar;
	}



	public JButton getBtnLimpiar() {
		return btnLimpiar;
	}

	public JButton getBtnVer() {
		return btnVer;
	}

	/**
	 * Create the dialog.
	 */
	public VistaGestionarUsuarios() {
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		contentPanel.setBounds(0, 0, 434, 228);
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel);
		contentPanel.setLayout(null);
		
		JLabel lblId = new JLabel("ID");
		lblId.setHorizontalAlignment(SwingConstants.CENTER);
		lblId.setBounds(10, 38, 46, 14);
		contentPanel.add(lblId);
		
		JLabel lblNombreApellido = new JLabel("Nombre_Apellido");
		lblNombreApellido.setHorizontalAlignment(SwingConstants.CENTER);
		lblNombreApellido.setBounds(10, 63, 88, 14);
		contentPanel.add(lblNombreApellido);
		
		JLabel lblDni = new JLabel("DNI");
		lblDni.setHorizontalAlignment(SwingConstants.CENTER);
		lblDni.setBounds(10, 88, 46, 14);
		contentPanel.add(lblDni);
		
		JLabel lblCodigo = new JLabel("Codigo");
		lblCodigo.setHorizontalAlignment(SwingConstants.CENTER);
		lblCodigo.setBounds(10, 113, 46, 14);
		contentPanel.add(lblCodigo);
		
		txtId = new JTextField();
		txtId.setBounds(116, 35, 134, 20);
		contentPanel.add(txtId);
		txtId.setColumns(10);
		
		txtNombreApellido = new JTextField();
		txtNombreApellido.setColumns(10);
		txtNombreApellido.setBounds(116, 60, 134, 20);
		contentPanel.add(txtNombreApellido);
		
		txtDni = new JTextField();
		txtDni.setColumns(10);
		txtDni.setBounds(116, 85, 134, 20);
		contentPanel.add(txtDni);
		
		txtCodigo = new JTextField();
		txtCodigo.setColumns(10);
		txtCodigo.setBounds(116, 110, 134, 20);
		contentPanel.add(txtCodigo);
		
		btnBuscar = new JButton("Buscar");
		btnBuscar.setBounds(260, 34, 89, 23);
		contentPanel.add(btnBuscar);
		
		btnEliminar = new JButton("Eliminar");
		btnEliminar.setBounds(10, 162, 89, 23);
		contentPanel.add(btnEliminar);
		
		btnModificar = new JButton("Modificar");
		btnModificar.setBounds(109, 162, 89, 23);
		contentPanel.add(btnModificar);
		
		btnInsertar = new JButton("Insertar");
		btnInsertar.setBounds(208, 162, 89, 23);
		contentPanel.add(btnInsertar);
		
		btnLimpiar = new JButton("Limpiar");
		btnLimpiar.setBounds(260, 59, 89, 23);
		contentPanel.add(btnLimpiar);
		
		btnVer = new JButton("Ver");
		btnVer.setBounds(307, 162, 89, 23);
		contentPanel.add(btnVer);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setBounds(0, 228, 434, 33);
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane);
			{
				JButton okButton = new JButton("OK");
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}
}
