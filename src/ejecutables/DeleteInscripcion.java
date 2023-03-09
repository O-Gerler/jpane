package ejecutables;

import java.util.Scanner;

import modelo.dao.AccesoBBDD;

public class DeleteInscripcion {

	public static void main(String[] args) {

		//TODO crear aqui la aplicacion pricipal
		Scanner scan = new Scanner(System.in);
		AccesoBBDD accesoBBDD = new AccesoBBDD();
		
		System.out.println("Introduce el nombre de la actividad");
		String nombre = scan.nextLine().toLowerCase();
		
		int idActividad = accesoBBDD.getIdActividad(nombre);
		
		System.out.println("Introduce el codigo de usuario");
		String codUsuario = scan.nextLine().toLowerCase();
		
		int idUsuario = accesoBBDD.getIdUsuario(codUsuario);
		
		if (!(idUsuario == -1 || idActividad == -1)) {
			System.out.println(accesoBBDD.eliminarInscripcion(idActividad, idUsuario));
		}else {
			System.out.println("ERROR!!!!");
		}
		
		scan.close();
		
	}
	
	

}
