package controlador;
import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;

import vista.VistaGestionarUsuarios;
import vista.VistaPrincipal;

public class Controlador implements ActionListener{
	
	private VistaPrincipal vistaPrincipal;
	
	public Controlador(VistaPrincipal vistaPrincipal) {
		this.vistaPrincipal = vistaPrincipal;
		
		this.vistaPrincipal.getBtnUsuario().addActionListener(this);
		this.vistaPrincipal.getBtnActividades().addActionListener(this);
		this.vistaPrincipal.getBtnInscripciones().addActionListener(this);
	}
	
	public void inicializar() {
		vistaPrincipal.setTitle("Ventana principal");
		vistaPrincipal.setLocationRelativeTo(null);
		vistaPrincipal.setVisible(false);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == vistaPrincipal.getBtnUsuario()) {
			VistaGestionarUsuarios vistaGestionarUsuarios = new VistaGestionarUsuarios();
			
			ControladorUsuarios controladorUsuarios = new ControladorUsuarios(vistaGestionarUsuarios);
			controladorUsuarios.inicializar();
			vistaGestionarUsuarios.setVisible(true);
		}
		
		if (e.getSource() == vistaPrincipal.getBtnActividades()) {
			System.out.println("Clickaste en Gestionar Actividades");
		}
		
		if (e.getSource() == vistaPrincipal.getBtnInscripciones()) {
			System.out.println("Clickaste en Gestionar Inscripciones");
		}
	}

}
