package ejecutables;

import java.util.Scanner;

import modelo.bean.Inscripcion;
import modelo.bean.Usuario;
import modelo.dao.AccesoBBDD;

public class ConsultarInscripciones {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		//TODO crear aqui la aplicacion pricipal
		
		System.out.println("Introduce el id de la actividad:");
		int idActividad = Integer.parseInt( scan.nextLine());
		
		AccesoBBDD accesoBBDD = new AccesoBBDD();
		
		for (Inscripcion inscripcion : accesoBBDD.getInscripciones(idActividad)) {
			for (Usuario usuario : accesoBBDD.getsUsuarios()) {
				if (inscripcion.getIdUsuario() == usuario.getIdUsuario()) {
					System.out.println(usuario);
				}
			}
		}
		
		scan.close();
	}

}
