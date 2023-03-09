package ejecutables;

import modelo.bean.Usuario;
import modelo.dao.*;
import java.util.Scanner;

public class InsertarUsuario {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Introduce el nombre y apellido:");
		String nombreApellido = scan.nextLine();
		
		System.out.println("Introduce el DNI del usuario");
		String dni = scan.nextLine();
		
		System.out.println("Introduce el codigo de usuario");
		String codigo = scan.nextLine();
		
		AccesoBBDD accesoBBDD = new AccesoBBDD();
		
//		if (accesoBBDD.getUsuario(codigo).equals(codigo)) {
//			System.out.println("Codigo duplicado");
//			
//		}else {
//			Usuario usuario = new Usuario();
//			
//			usuario.setNombreApellido(nombreApellido);
//			usuario.setDni(dni);
//			usuario.setCodigo(codigo);
//			
//			accesoBBDD.insertarUsuario(usuario);
//		}
//		
//		scan.close();
		
		//TODO crear aqui la aplicacion pricipal
	}

}
