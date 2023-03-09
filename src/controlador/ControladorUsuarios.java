package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.EventListener;

import javax.swing.JOptionPane;

import modelo.bean.*;

import modelo.dao.AccesoBBDD;
import vista.VistaGestionarUsuarios;

public class ControladorUsuarios implements ActionListener{
	private VistaGestionarUsuarios vistaGestionarUsuarios;
	private AccesoBBDD accesoBBDD = new AccesoBBDD();
	
	public ControladorUsuarios(VistaGestionarUsuarios vistaGestionarUsuarios) {
		this.vistaGestionarUsuarios = vistaGestionarUsuarios;
		
		this.vistaGestionarUsuarios.getBtnBuscar().addActionListener(this);
		this.vistaGestionarUsuarios.getBtnLimpiar().addActionListener(this);
		this.vistaGestionarUsuarios.getBtnInsertar().addActionListener(this);
		this.vistaGestionarUsuarios.getBtnEliminar().addActionListener(this);
		this.vistaGestionarUsuarios.getBtnModificar().addActionListener(this);
		this.vistaGestionarUsuarios.getBtnVer().addActionListener(this);
	}

	public void inicializar() {
		vistaGestionarUsuarios.setTitle("Ventana principal");
		vistaGestionarUsuarios.setLocationRelativeTo(null);
		vistaGestionarUsuarios.setVisible(false);
	}
	
	public boolean idVacio() {
		if (vistaGestionarUsuarios.getTxtId().getText().trim().equals("")) {
			JOptionPane.showMessageDialog(null, "Rellene el id correctamente");
			return true;
		}
		
		return false;
	}
	
	public boolean algunCampoVacio() {
		
		if (vistaGestionarUsuarios.getTxtDni().getText().trim().equals("")) {
			JOptionPane.showMessageDialog(null, "Rellene los campos correctamente");
			return true;
		}
		
		if (vistaGestionarUsuarios.getTxtNombreApellido().getText().trim().equals("")) {
			JOptionPane.showMessageDialog(null, "Rellene los campos correctamente");
			return true;
		}
		
		if (vistaGestionarUsuarios.getTxtCodigo().getText().trim().equals("")) {
			JOptionPane.showMessageDialog(null, "Rellene los campos correctamente");
			return true;
		}
		
		return false;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == vistaGestionarUsuarios.getBtnBuscar()) {
			if (!idVacio()) {
				Usuario usuario = accesoBBDD.getUsuario(Integer.parseInt(vistaGestionarUsuarios.getTxtId().getText()));
				
				if (usuario != null) {
					vistaGestionarUsuarios.getTxtId().setText(String.valueOf(usuario.getIdUsuario()));
					vistaGestionarUsuarios.getTxtDni().setText(usuario.getDni());
					vistaGestionarUsuarios.getTxtNombreApellido().setText(usuario.getNombreApellido());
					vistaGestionarUsuarios.getTxtCodigo().setText(usuario.getCodigo());
				}
			}
			
		}
		
		if (e.getSource() == vistaGestionarUsuarios.getBtnLimpiar()) {
			vistaGestionarUsuarios.getTxtId().setText("");
			vistaGestionarUsuarios.getTxtDni().setText("");
			vistaGestionarUsuarios.getTxtNombreApellido().setText("");
			vistaGestionarUsuarios.getTxtCodigo().setText("");
		}
		
		if (e.getSource() == vistaGestionarUsuarios.getBtnInsertar()) {
			if (!algunCampoVacio()) {
				Usuario usuario = new Usuario();
				
				usuario.setDni(vistaGestionarUsuarios.getTxtDni().getText());
				usuario.setNombreApellido(vistaGestionarUsuarios.getTxtNombreApellido().getText());
				usuario.setCodigo(vistaGestionarUsuarios.getTxtCodigo().getText());
				
				if(accesoBBDD.insertarUsuario(usuario))
					JOptionPane.showMessageDialog(null, "Correctamente introducido");
				else 
					JOptionPane.showMessageDialog(null, "ERROR!!!");
			}
		}
		
		if (e.getSource() == vistaGestionarUsuarios.getBtnEliminar()) {
			if(!idVacio()) {
				if(accesoBBDD.eliminarUsuario(Integer.parseInt(vistaGestionarUsuarios.getTxtId().getText())))
					JOptionPane.showMessageDialog(null, "Correctamente eliminado");
				else
					JOptionPane.showMessageDialog(null, "ERROR!!!");
			}
		}
		
		if (e.getSource() == vistaGestionarUsuarios.getBtnModificar()) {
			if (!algunCampoVacio() && !idVacio()) {
				Usuario usuario = new Usuario();
				
				usuario.setIdUsuario(Integer.parseInt(vistaGestionarUsuarios.getTxtId().getText()));
				usuario.setDni(vistaGestionarUsuarios.getTxtDni().getText());
				usuario.setNombreApellido(vistaGestionarUsuarios.getTxtNombreApellido().getText());
				usuario.setCodigo(vistaGestionarUsuarios.getTxtCodigo().getText());
				
				if (accesoBBDD.modificarUsuario(usuario))
					JOptionPane.showMessageDialog(null, "Correctamente modificado");
				else
					JOptionPane.showMessageDialog(null, "ERROR!!!");
			}
		}
	}
	
	
}
