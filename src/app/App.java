package app;

import controlador.Controlador;
import vista.VistaPrincipal;

public class App {
	public static void main(String[] args) {
		VistaPrincipal vistaPrincipal = new VistaPrincipal();
		
		Controlador controlador = new Controlador(vistaPrincipal);
		controlador.inicializar();
		vistaPrincipal.setVisible(true);
	}
}
